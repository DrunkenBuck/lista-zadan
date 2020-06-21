package projects.todolist.model;

import java.time.LocalDateTime;

public class Todos {
    private String name;
    private LocalDateTime createdOn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Todos{" +
                "name='" + name + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
