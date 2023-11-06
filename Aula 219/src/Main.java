import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName = " + path.getName());
        System.out.println("path.getPath() = " + path.getPath());
        System.out.println("path.getParent() = " + path.getParent());
        System.out.println("new Date(path.lastModified()) = " + new Date(path.lastModified()));
        System.out.println("path.getAbsolutePath() = " + path.getAbsolutePath());

        sc.close();

    }
}