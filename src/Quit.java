import java.util.Scanner;

public class Quit implements Command{
    @Override
    public String name() {
        return "Quit";
    }

    @Override
    public boolean run(Scanner console) {
        return false;
    }
}
