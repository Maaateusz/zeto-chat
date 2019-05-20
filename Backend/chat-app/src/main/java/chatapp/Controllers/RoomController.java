package chatapp.Controllers;

import chatapp.DataBase.RoomRepository;
import chatapp.Models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room")
@CrossOrigin
public class RoomController
{
    @Autowired
    private RoomRepository roomRepository;

    @PostMapping("/add")
    public Room addPostRoom(/*@Valid*/ @RequestBody Room room)
    {
        room.setId(null);
        return roomRepository.save(room);
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Room> getAllRooms()
    {
        return roomRepository.findAll();
    }

}
