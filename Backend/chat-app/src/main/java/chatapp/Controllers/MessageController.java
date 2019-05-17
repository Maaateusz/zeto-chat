package chatapp.Controllers;

import chatapp.Models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/message")
@CrossOrigin
public class MessageController
{
    //@Autowired
    //private Message message;

    @PostMapping("/add")
    public String addPostMessage(/*@Valid*/ @RequestBody Message message) throws IOException
    {
        String fileName = "C:\\Users\\Mateusz\\Desktop\\zesp\\zeto-chat_old\\Rooms\\room1.html";

        String str = "Hello";

        Path path = Paths.get(fileName);
        byte[] strToBytes = str.getBytes();

        Files.write(path, strToBytes);

        String read = Files.readAllLines(path).get(0);
        //assertEquals(str, read);

        return "Zapisano"+ read;
    }

    @GetMapping("/{id}")
    public @ResponseBody List<Message> getMessages(@PathVariable(value = "id") Integer roomId)
    {
        //return roomRepository.findRoomById(roomId);
        return null;
    }

    /*@GetMapping("/test")
    public void givenWritingStringToFile_whenUsingPrintWriter_thenCorrect() throws IOException
    {
        String fileName = "C:\\Users\\Mateusz\\Desktop\\zesp\\zeto-chat\\Rooms\\room1.html";
        FileWriter fileWriter = new FileWriter(fileName);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print("Some String");
        printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);
        printWriter.close();
    }*/

}
