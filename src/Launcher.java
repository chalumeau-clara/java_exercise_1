import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner console = new Scanner(System.in);
        while (true)
        {
            String name = console.nextLine();
            if (name.equals("quit"))
                break;
            else {
                System.out.println("Unknown command");
            }
        }

    }
}
