/**
 * To do list app
 * Ali Edghir
 */
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store up to 20 tasks
        Task[] tasks = new Task[20];
        int taskCount = 0;

        System.out.println("Welcome to the To Do List App");

        int choice = 0;

        // Menu loop
        while (choice != 4) {

            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Mark Task Done");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Validate menu input
            if (!input.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                input.next();
                continue;
            }

            choice = input.nextInt();
            input.nextLine(); 

            //adding task
            if (choice == 1) {

                if (taskCount >= tasks.length) {
                    System.out.println("task list is full");
                } else {
                    System.out.print("enter task description: ");
                    String desc = input.nextLine();

                    if (desc.trim().isEmpty()) {
                        System.out.println("task description cannot be empty.");
                    } else {
                        tasks[taskCount] = new Task(desc);
                        taskCount++;
                        System.out.println("task added");
                    }
                }

            // show the tasks
            } else if (choice == 2) {

                if (taskCount == 0) {
                    System.out.println("No tasks to show.");
                } else {
                    System.out.println("\nYour Tasks:");

                    for (int i = 0; i < taskCount; i++) {

                        String status;

                        if (tasks[i].isCompleted()) {
                            status = "Done";
                        } else {
                            status = "Not Done";
                        }

                        System.out.println((i + 1) + ". " +
                                tasks[i].getDescription() +
                                " [" + status + "]");
                    }
                }

            // mark the task done
            } else if (choice == 3) {

                if (taskCount == 0) {
                    System.out.println("No tasks to mark.");
                } else {
                    System.out.print("Enter task number to mark done: ");

                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input.");
                        input.next();
                        continue;
                    }

                    int num = input.nextInt();

                    if (num >= 1 && num <= taskCount) {
                        tasks[num - 1].markDone();
                        System.out.println("Task marked as completed!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                }

            // exiting
            } else if (choice == 4) {
                System.out.println("Exiting program...");

            // invalid menu choice
            } else {
                System.out.println("Invalid choice!");
            }
        }

        input.close();
    }
}

