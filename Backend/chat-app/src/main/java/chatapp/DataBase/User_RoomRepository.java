package chatapp.DataBase;

import chatapp.Models.User_Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface User_RoomRepository extends JpaRepository<User_Room, Integer>
{
    //List<User_Room> findRoomByUserId(Integer id);
    //List<User> findRoomByRoomId(Integer room_id);
    //User_Room findRoomByUserId(Integer user_id);
    List<User_Room> findByid(Integer user_id);
    List<User_Room> findByUserId(Integer user_id);
    List<User_Room> findByUserName(String user_name);
}