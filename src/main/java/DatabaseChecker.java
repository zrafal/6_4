import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatabaseChecker {
    public static void checkDatabase(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}