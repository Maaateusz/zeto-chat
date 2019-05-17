package chatapp.Models;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class User
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String password;

    /*@Transient
    private String passwordConfirm;*/

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public User() {}

    public Integer getId() {
        return id;
    }

    /* String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }*/

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, name='%s', password='%s']",
                id, name, password);
    }
}
