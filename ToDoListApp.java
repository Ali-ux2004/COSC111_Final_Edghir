import java.util.Scanner;


public class ToDoListApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // the array here stores up to 20
        Task[] tasks = new Task[20];
        int taskCount = 0;

        System.out.println("Welcome to the To-Do List App!");

        int choice = 0;

        //menu loop (incomplete)
        while (choice != 4) {

            //menu
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Mark Task Done");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                // Add Task (incomplete)
                System.out.print("Enter task description: ");
                String desc = input.nextLine();

                //make new task
                tasks[taskCount] = new Task(desc);
                taskCount++;

                System.out.println("Task added!");

            } else if (choice == 2) {
                // show all tasks
                System.out.println("\nYour Tasks:");

                for (int i = 0; i < taskCount; i++) {
                    String status = tasks[i].isCompleted();
                    System.out.println((i + 1) + ". " + tasks[i].getDescription() + " [" + status + "]");
                }

            } else if (choice == 3) {
                // here marks a task complete
                System.out.print("Enter task number to mark done: ");
                int num = input.nextInt();

                if (num >= 1 && num <= taskCount) {
                    tasks[num - 1].markDone();
                    System.out.println("Task marked as completed!");
                } else {
                    System.out.println("Invalid task number!");
                }

            } else if (choice == 4) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid choice!");
            }
        }

        input.close();
    }
}
