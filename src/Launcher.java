import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public static void freq(String str){
        str = str.replaceAll("[^A-Za-z0-9]+", " ");
        str = str.toLowerCase(Locale.ROOT);
        List<String> arr = Arrays.asList(str.split(" "));

        if (str.isBlank()){
            return;
        }
        var freqMap = arr.stream()
                .collect(Collectors.groupingBy(s->s, Collectors.counting()));

        List<String> li = null;
        var max3 = freqMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(3);
        String l = max3.map(Map.Entry::getKey).collect(Collectors.joining(" "));
        System.out.printf(l + "\n");
    }

    public static void main(String[] args) throws IOException {
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
            else if (name.equals("freq")) {
                System.out.printf("Enter a path\n");
                String path = console.nextLine();
                Path filepath = Paths.get(path);

                try {
                    String content = Files.readString(filepath);
                    freq(content);
                }
                catch (IOException e) {
                    System.out.printf("Unreadable file: ");
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("Unknown command");
            }
            //console.close();
        }

    }
}
