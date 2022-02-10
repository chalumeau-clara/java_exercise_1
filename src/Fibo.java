import java.util.Scanner;

public class Fibo implements Command{
    @Override
    public String name() {
        return "fibo";
    }

    @Override
    public boolean run(Scanner console) {
        System.out.printf("Enter a integer");
        int nb = console.nextInt();
        int res = fibo(nb);
        System.out.println(res);
        String i = console.nextLine();
        return true;
    }

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
}
