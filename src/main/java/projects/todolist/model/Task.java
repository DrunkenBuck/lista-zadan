package projects.todolist.model;

import java.time.LocalDateTime;

public class Task {
    private String name;
    private LocalDateTime createdOn;
    private LocalDateTime expectedCompletedOn;
    private LocalDateTime completedOn;

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

    public LocalDateTime getExpectedCompletedOn() {
        return expectedCompletedOn;
    }

    public void setExpectedCompletedOn(LocalDateTime expectedCompletedOn) {
        this.expectedCompletedOn = expectedCompletedOn;
    }

    public LocalDateTime getCompletedOn() {
        return completedOn;
    }

    public void setCompletedOn(LocalDateTime completedOn) {
        this.completedOn = completedOn;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", createdOn=" + createdOn +
                ", expectedCompletedOn=" + expectedCompletedOn +
                ", completedOn=" + completedOn +
                '}';
    }
}
