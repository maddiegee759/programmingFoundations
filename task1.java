// Assessment for programming foundations 1

// Task 1
/*
Name: Maddie Gee  
Description: This program that will generate random numbers, display them and find the largest number.
Date: 01/11/2024  
Location: Edinburgh College - Sighthill   
Version: 1.0  
Notes: <if any updates or changes we note them here>  
 */
package programmingfoundationsa1;


import java.util.Random;
import java.util.Arrays;

public class ProgrammingFoundationsA1 
{
    public static void DisplayArray(int[] array){
        // displays array
        for (int i:array) {
           System.out.println(i + "MB"); 
        }
        System.out.println("All file sizes: " + Arrays.toString(array));
    }
    
    
    public static void MaxArray(int[] array){
        // initialise variables count and maxValue
        int count = 0;
        int maxValue = 0;
        while (count < 15) {
            // if the number in the array is greater than the current maximum value it will replace it
            if (array[count] > maxValue) {
                maxValue = array[count];
            }
            // increment counter
            count++;
        }
        // displays max file size in MB
        System.out.println("Maximum file size: " + maxValue + "MB");
        
        
    }
    public static void main(String[] args) 
    {
        // open random
        Random random = new Random();
        // initialise files array with 15 empty spaces
        int[] files = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        // initialise count
        int count = 0;
        
        while (count < 15) {
            // generate random number 0-255
            int num = random.nextInt(255);
            // store random number in the array 
            files[count] = num;
            // increment counter
            count++;
        }
        
        // calling the method to display the file sizes
        DisplayArray(files);
        
        // calling the method to find the maximum file size
        MaxArray(files);

        // clears program from memory
        System.exit(0);
                
    }
    
}