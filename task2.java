// Task 2
/*
Name: Maddie Gee  
Description: This program that will generate random numbers, display them, find the sum, average and total number of files.
Date: 01/11/2024  
Location: Edinburgh College - Sighthill   
Version: 1.0  
Notes: <if any updates or changes we note them here>  
 */
package programmingfoundationsa2;

import java.util.Random;
import java.util.Arrays;

public class ProgrammingFoundationsA2 
{
    public static void DisplayArray(int[] array){
        // displays array
        for (int i:array) {
           System.out.println(i + "MB"); 
        }
        System.out.println("All file sizes: " + Arrays.toString(array));
    }
    
    public static void SumArray(int[] array){
        // initialise variable sum
        int sum = 0;
        for (int i:array) {
           sum = sum + i;
        }
        System.out.println("All file sizes total: " + sum + "MB");
    }
    
    public static void AverageArray(int[] array)
    {
        // initialise variable sum
        int sum = 0;
        int average;
        for (int i:array) {
           sum = sum + i;
        }
        average = sum/(array.length);
        System.out.println("The average of all file sizes is " + average);
    }
    public static void TotalArray(int[] array){
        System.out.println("There is a total of " + array.length + " files");
    
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
        
        DisplayArray(files);
        SumArray(files);
        AverageArray(files);
        TotalArray(files);
        
        System.exit(0);
    }
    
}