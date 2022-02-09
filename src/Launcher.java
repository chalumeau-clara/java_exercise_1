import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        if (!name.equals("quit")) {
            System.out.println("Unknown command");
        }
    }
}
