package Main;

import Entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        String fileType;
        File file;
        do {
            System.out.print("Enter the .csv file path: ");
            file = new File(scInput.nextLine());
            fileType = file.getName();
            fileType = fileType.substring(fileType.length()-4);
            System.out.println("fileType = " + fileType);
            if (!fileType.equals(".csv")) {
                System.out.println("Wrong file! Enter a .csv file!");
            }
        } while (!fileType.equals(".csv"));
        System.out.println("Success! Reading file..");
        
        try (FileReader fr = new FileReader(file)) {
            BufferedReader bf = new BufferedReader(fr);
            Scanner scReader = new Scanner(bf);

            List<Product> products = new ArrayList<>();
            while (scReader.hasNextLine()){
                String[] lineSplitted = scReader.nextLine().split(",");
                String name = lineSplitted[0];
                Double price = Double.valueOf(lineSplitted[1]);
                Integer qty = Integer.valueOf(lineSplitted[2]);
                
                products.add(new Product(name, price, qty));
            }

            String newFilePath = file.getParent() + "\\out";

            new File(newFilePath).mkdir();
            try (FileWriter fw = new FileWriter(newFilePath + "\\summary.csv")) {
                BufferedWriter newFile = new BufferedWriter(fw);
                for (Product product : products) {
                    String lineToWrite = String.format("%s,%s", product.getName(), product.getTotalPrice());
                    newFile.write(lineToWrite);
                    newFile.newLine();
                }
                newFile.close();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scInput.close();
    }
}