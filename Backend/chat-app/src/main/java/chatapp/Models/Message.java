package chatapp.Models;

import javax.persistence.Entity;

//@Entity
public class Message
{
    private String user;
    private String content;
    private Integer roomId;

    public Message() {}

    public Message(String user, String content, Integer roomId)
    {
        this.user = user;
        this.content = content;
        this.roomId = roomId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString()
    {
        return String.format("Message [user=%s, content='%s', roomId='%d']", user, content, roomId);
    }
}
