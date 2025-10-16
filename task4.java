// Task 4
/*
Name: Maddie Gee  
Description: This program that will sort files in order of speed
Date: 01/11/2024  
Location: Edinburgh College - Sighthill   
Version: 1.0  
Notes: <if any updates or changes we note them here>  
 */
package programmingfoundationsa4;
import java.util.Random;
import java.util.Arrays;
public class ProgrammingFoundationsA4 
{

    public static void DisplayArray(double[] array){
        // displays array
        for (double i:array) {
           System.out.println(i + " milliseconds"); 
        }
        System.out.println("All calculation times: " + Arrays.toString(array));
    }
    
    
    public static void SortArray(double[] array) {
        // sorting the array
        Arrays.sort(array);
        System.out.println("\n------------------------------------------------------- \n------------------------------------------------------- \n" );
        // displaying the sorted array
        System.out.println("All times sorted from fastest to slowest");
        for (double i:array) {
           System.out.println(i + " milliseconds"); 
        }

    }
    public static void main(String[] args) 
    {
        // open random
        Random random = new Random();
        // initialise files array with 15 empty spaces
        double[] calcTime = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        // initialise count
        int count = 0;
        
        // total number in the array
        while (count < 15) {
            // minimum value for calcTime
            double min = 1;
            // maxiumum value for calcTime
            double max = 30;
            // generate random number 
            double randomNum = random.nextDouble();
            // make that number between 1 and 30
            double num = min + (max - min) * randomNum;
            // store random number in the array 
            calcTime[count] = num;
            // increment counter
            count++;
        }
        
        
        DisplayArray(calcTime);
        SortArray(calcTime);
    }


