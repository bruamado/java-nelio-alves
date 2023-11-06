import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss - dd/MM/yyyy");
        String[] lines = new String[] {"LOG", "\tGood morning", "\tGood afternoon", "\tGood night"};

        String path = "C:\\temp\\out.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (int i=0; i<1000; i++){
                lines[0] = String.format("LOG: %s", sdf.format(new Date()));
                for (String line : lines) {
                    bw.write(line);
                    bw.newLine();
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}