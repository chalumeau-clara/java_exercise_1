import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Launcher {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome\n");
        Scanner console = new Scanner(System.in);
        List<Command> command = new ArrayList<Command>();
        command.add(new Fibo());
        command.add(new Freq());
        command.add(new Quit());

        Boolean find = false;
        Boolean again = true;
        while (again)
        {
            System.out.println("Enter a command:");
            find = false;
            String name = console.nextLine();
            for (Command com: command ){
                if (name.equals(com.name())){
                    again = com.run(console);
                    find = true;
                }
            }
            if (!find) {
                System.out.println("Unknown command");
            }
            //console.close();
        }

    }
}
