package chatapp.Controllers;

import chatapp.DataBase.RoomRepository;
import chatapp.DataBase.User_RoomRepository;
import chatapp.Models.Message;
import chatapp.Models.Room;
import chatapp.Models.User;
import chatapp.Models.User_Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@RestController
@RequestMapping("/room")
@CrossOrigin
public class RoomController
{
    String path = "C:\\Users\\Mateusz\\Desktop\\zesp\\zeto-chat\\Rooms\\";

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private User_RoomRepository user_roomRepository;

    @PostMapping("/add")
    public Room addPostRoom(@RequestBody Room room)  throws IOException
    {
        if (roomRepository.findRoomByName(room.getName()) != null)
        {
            return null;
        }
        room.setId(null);
        roomRepository.save(room);

        String roomName = room.getName();
        String fileName = path + roomName + ".json";
        String str = "[{\"user\":\"System\",\"message\":\"Witaj! Napisz coś.\"}, ";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        //writer.append(' ');
        writer.append(str);

        writer.close();
        return room;
    }

    @PostMapping("/user/add")
    public User_Room addPostUserRoom( @RequestBody User_Room user_room)
    {
        /*if(user_roomRepository.findById(user_room.getUser_id()))
        {

        }*/
        return user_roomRepository.save(user_room);
        //return user.toString();
    }

    /*@GetMapping("/user/{id}")
    public @ResponseBody Iterable<User_Room> getRoomUser(@PathVariable(value = "id") Integer id)
    {
        return null;//user_roomRepository.findRoomByUserId(id);
    }*/

    @GetMapping("/user/all")
    public @ResponseBody Iterable<User_Room> getAllUsersRooms()
    {
        return user_roomRepository.findAll();
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Room> getAllRooms()
    {
        return roomRepository.findAll();
    }

}
