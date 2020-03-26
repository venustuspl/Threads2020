import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Set;
import java.util.TreeSet;

public class Otodom {

    public static void main(String[] args) throws IOException {


        Set<String> setOfLinks = new TreeSet<>();
        String content = stringBuilder.toString();

        for (int i = 0; i < content.length(); i++) {
            i = content.indexOf("https://www.otodom.pl/oferta/", i);
            if (i < 0)
                break;
            String substring = content.substring(i);
            String link = substring.split(".html")[0];
            setOfLinks.add(link);

        }

        setOfLinks.forEach(System.out::println);
        System.out.println(setOfLinks.size());
    }

    public static void readWebside(String link) throws IOException {

        URL otodom = new URL(link);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(otodom.openStream()));

        String inputLine;
        StringBuilder stringBuilder = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            stringBuilder.append(inputLine);
            stringBuilder.append(System.lineSeparator());
        }

        in.close();
    }
}
