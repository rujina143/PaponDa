import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ElevenPointFive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String f1="";
        if(args.length==1){
            f1=args[0];
        }
        else {
            System.out.println("Please enter a Filename for input:");
            f1 = in.next();
        }
        System.out.println("Please enter a Filename for Output:");
        String f2=in.next();

       try(Scanner inFile=new Scanner(new File(f1));
    PrintWriter out=new PrintWriter(f2)){
           int count=1;
           while (inFile.hasNext())
           {
               out.println("/* "+count+"*/"+inFile.nextLine());
               count++;
           }

       }
       catch (FileNotFoundException e){
           System.out.println("File not Found!!");

       }
    }
}
