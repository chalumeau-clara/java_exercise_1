import java.util.Scanner;

public class Launcher {

    public static int fibo(int nb) {
        int pres = 0;
        int actual = 1;
        while (nb != 0) {
            nb--;
            int tmp = actual;
            actual = pres + actual;
            pres = tmp;
        }
        return pres;
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner console = new Scanner(System.in);
        while (true)
        {
            String name = console.nextLine();
            if (name.equals("quit")) {
                break;
            }
            else if (name.equals("fibo")) {
                int nb = console.nextInt();
                int res = fibo(nb);
                System.out.println(res);
                String i = console.nextLine();
            }
            else {
                System.out.println("Unknown command");
            }
        }

    }
}
