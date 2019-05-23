package chatapp.Controllers;

import chatapp.DataBase.RoomRepository;
import chatapp.Models.Message;
import chatapp.Models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/message")
@CrossOrigin
public class MessageController
{
    @Autowired
    private RoomRepository roomRepository;

    String path = "C:\\Users\\Mateusz\\Desktop\\zesp\\zeto-chat\\Rooms\\";  //scierzka na serwerze do plików z wiadomościami

    @PostMapping("/add")
    public Void addPostMessage(@RequestBody Message message) throws IOException
    {
        Room room = roomRepository.findRoomById(message.getRoomId());
        String roomName = room.getName();
        String fileName = path + roomName + ".json";
        String str = ",{" + '"' + "user" + '"' + ':' + '"' + message.getUser() + '"' + ',' + '"' + "message" + '"' + ':' + '"' + message.getContent() + '"' + '}';
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.append(' ');
        writer.append(str);

        writer.close();
        return null;
    }

    @GetMapping("/{id}")
    private String readFromInputStream(@PathVariable(value = "id") Integer roomId) throws IOException
    {
        Room room = roomRepository.findRoomById(roomId);
        String roomName = room.getName();

        InputStream inputStream = new FileInputStream(new File(path + roomName + ".json"));;

        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString() + ']';
    }

    @GetMapping("/undefined")
    private String undefinied(){
        return "Wybierz pokój!";
    }

}
