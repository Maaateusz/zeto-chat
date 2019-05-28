package chatapp.DataBase;

import chatapp.Models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>
{
    //List<Room> findRoomById(Integer id);
    Room findRoomById(Integer id);
    Room findRoomByName(String name);
}