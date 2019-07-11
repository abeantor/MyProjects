package lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Array1 {
    Double[] array=new Double[200];                              //initializing the array of size 200
  
    public Array1(){                                            //constructor without filename
        System.out.println("TestNumbers.txt");
    }
  
    public Array1(String filename) throws FileNotFoundException, IOException{
      
        Scanner s = new Scanner(new File(filename));
        int i=0;
      
        while (s.hasNext()){                                    //till there are lines in the file keeps scanning
            array[i]=Double.parseDouble(s.next());              //s.next() returns the next string in the file, this string is parsed to a double array            i++;
        }
        computeArray();           
     }
  
    //Finds the highest,lowest,sum and average of all the elements in Double array
    private void computeArray(){
        double min,max,sum = 0;   
        min=array[0];                 //initializing the minimum element equal to the first element of the array
        max=array[0];                //initializing the maximum element equal to the first element of the array
        for(int i=0;i<array.length;i++){
            if(min>array[i])
                min=array[i];
            if(max<array[i])
                max=array[i];
            sum+=array[i];            //keeps adding array[i] to the sum as i keeps incrementing
        }
        System.out.println("The Lowest number in the array is: "+min);
        System.out.println("The Highest number in the array is: "+max);
        System.out.println("The total of the numbers in the array is: "+sum);
        System.out.println("The average of the numbers in the array is: "+sum/array.length);    //average = (sum of element)/no of elements
      
    }
  
}