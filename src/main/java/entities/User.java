package entities;

import org.springframework.stereotype.Component;

@Component("user")
public class User {
    private String name = "Dummy";

    public User() {

    }
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
