import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Predict implements Command{

    public static void predict(String content){

    }

    @Override
    public String name() {
        return "predict";
    }

    @Override
    public boolean run(Scanner console) {
        System.out.printf("Enter a path");
        String path = console.nextLine();
        Path filepath = Paths.get(path);

        try {
            String content = Files.readString(filepath);
            predict(content);
        }
        catch (IOException e) {
            System.out.printf("Unreadable file: ");
            e.printStackTrace();
        }
        return true;
    }
}
