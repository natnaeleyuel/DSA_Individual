package LinkedList.ToDoList;

public class Task {
    private String title;
    private String description;
    private boolean completed;

    // Constructor
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false; // Initially, the task is not completed
    }

    // Getter for title
    public String getTitle() {
        return this.title;
    }

    // Getter for description
    public String getDescription() {
        return this.description;
    }

    // Getter to check if the task is completed
    public boolean isCompleted() {
        return completed;
    }

    // Method to mark the task as completed
    public void markCompleted() {
        this.completed = true;
    }

    // ToString method for easy display of task information
    @Override
    public String toString() {
        return STR."\tTitle: \{title} \n\t\tDescription: \{description} \n\t\tCompleted: \{completed}";
    }
}
