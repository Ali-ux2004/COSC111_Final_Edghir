public class Task {
    private String description;
    private boolean isDone;

    //constructor
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    //mark as complete
    public void markDone() {
        this.isDone = true;
    }

    //getter for the description
    public String getDescription() {
        return description;
    }

    //getter for status
    public boolean isCompleted() {
        return isDone;
    }
}
