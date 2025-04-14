import java.io.*;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fileLocation = "C:\\Users\\user\\OneDrive\\Desktop\\WriteNameToFile\\src\\Myname.txt";
        String name = " 1. Uwineza Florence \n Student at university of Rwanda \n Year 3 Computer science";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation))) {
            writer.write(name);
            System.out.println("Name written to file successfully!");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Error in reading file! " + ex.getMessage());
        }

    }
}
