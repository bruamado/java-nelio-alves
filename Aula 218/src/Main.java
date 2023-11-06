import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //  Encontra e imprime todos os diretórios
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println("folder = " + folder);
        }

        //  Encontra e imprime todos os arquivos
        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println("file = " + file);
        }

        //  Cria um diretório
        boolean success = new File(strPath + "\\created_folder").mkdir();
        System.out.println("File created with success = " + success);
        
        sc.close();
        

    }
}