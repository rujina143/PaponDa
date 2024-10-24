import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ElevenPointSeven1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Input File Name:");
        String f= scan.next();

        int rowNumber=1;
        try {
            Scanner sc = new Scanner(new File(f));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Scanner scanner = new Scanner(line);

                double sum = 0.0;
                int count = 0;
                System.out.println("Row" + rowNumber + ":");
                while (scanner.hasNextDouble()) {

                    double n = sc.nextDouble();
                    sum = sum + n;
                    System.out.println(" " + n);
                    count++;

                    System.out.println(       "average is");
                    if (count == 0) {
                        System.out.println("0.0");
                    } else {
                        double average = sum / count;
                        System.out.printf("%5.1f\n", average);
                    }
                    rowNumber++;
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not Found");
        }

    }
}
