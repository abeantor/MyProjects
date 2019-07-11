
package lab1;

import java.io.IOException;
import java.util.Scanner;

public class LAB1 {

    public static void main(String[] args) {
try{
        //System.out.println(" " + TestNumbers.txt);
        
       //NumberAnalysisClass scanner = new NumberAnalysisClass ("Numbers.txt");

        Scanner sc1=new Scanner("TestNumbers.txt");
        String filename=sc1.nextLine();                             //takes in the user input for the filename
        System.out.println("\n");
        
        Array1 arr=new Array1(filename);}
        catch(IOException e){                                          
//Exception if file name entered is wrong , i.e. file does not exists
            System.out.println("File Not Found.\nPlease check the filename entered");
        }
    }
  
}