import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ElevenPointSix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the File name:");
        String f1= in.next();
        try {
            Scanner sc=new Scanner(new File(f1));
            double sum1=0.0;
            double sum2=0.0;
            int count=0;
            while (sc.hasNextDouble())
            {
                sum1+= sc.nextDouble();
                sum2+= sc.nextDouble();
                count++;
            }
            System.out.println("Average of Column 1: "+sum1/count);
            System.out.println("Average of Column 2: "+sum2/count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
