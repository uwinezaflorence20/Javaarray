import java.io.*;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fileLocation = "C:\\Users\\user\\OneDrive\\Desktop\\WriteNameToFile\\src\\Myname.txt";

        System.out.println("Enter the words:");
        String nam = in.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation))) {
            writer.write(nam);
            System.out.println("Name written to file successfully!");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Error in reading file!   " + ex.getMessage());
        }
try {
    File file1 = new File(fileLocation);

        System.out.println("File exists!  " + file1.getAbsolutePath());
        FileReader fr = new FileReader(file1);


//       file reader character one character at time
//        int character;
//        while ((character = fr.read()) != -1) {
//            System.out.print((char) character);
//        }



    System.out.println(fr.read());
    BufferedReader br = new BufferedReader(fr);
    String line2;
    while( (line2 = br.readLine()) != null) {
        System.out.println(line2);
    }
br.close();

} catch (IOException e) {
    System.out.println("Error in reading file!   " + e.getMessage());
}




                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a sentence: ");
                String sentence = sc.nextLine();

                System.out.println("You entered: " + sentence);



    }
}
