package projects.todolist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TodoListApp {
    private static final Logger log = LoggerFactory.getLogger(TodoListApp.class);

    public static void main(String[] args) {
        System.out.println("Witam w ciągle rozrastającej się liście");
        log.info("To do or not to do?");
    }
}
