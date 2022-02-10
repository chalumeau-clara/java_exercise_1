import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Freq implements Command{
    @Override
    public String name() {
        return "freq";
    }

    @Override
    public boolean run(Scanner console) {
        System.out.printf("Enter a path");
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
        return true;
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
}
