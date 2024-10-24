import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ElevenPointFive2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String f1="";
        if(args.length==1)
        {
          f1=args[0]  ;
        }
        else{
            System.out.println("Enter a name for input File:");
            f1= sc.next();
        }
        System.out.println("Enter name for Output File:");

            String f2=sc.next();

       try(Scanner in=new Scanner(new File(f1));
        PrintWriter w=new PrintWriter(f2)){
           while (in.hasNext()){
               int count=1;
               w.println("*/"+count+"*/"+in.nextLine());
               count++;
           }

       }
       catch (FileNotFoundException e){
           System.out.println("File not Found!");

       }
    }
}
