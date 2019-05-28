package chatapp.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_Room
{
    @Id
    private Integer user_id;
    private Integer room_id;

    public User_Room(Integer user_id, Integer room_id) {
        this.user_id = user_id;
        this.room_id = room_id;
    }

    public User_Room() {
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }
}
