/**
 * Task Class
 * Ali Edghir
 */
public class Task {

    private String description;
    private boolean isDone;

    /**
     * here the constructor creates a new task with a description.
     * tasks will not becompleted by default.
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * here marks the task complete
     */
    public void markDone() {
        isDone = true;
    }

    /**
     * returns the description of the task.
     */
    public String getDescription() {
        return description;
    }

    /**
     * here if task is completed it returns true 
     */
    public boolean isCompleted() {
        return isDone;
    }
}
