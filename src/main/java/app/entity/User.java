package app.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    private int id;
    private String name;
    private String surname;
    private int password;
    private String gmail;
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
