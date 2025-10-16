// Task 3
/*
Name: Maddie Gee  
Description: This program that will generate a username
Date: 01/11/2024  
Location: Edinburgh College - Sighthill   
Version: 1.0  
Notes: <if any updates or changes we note them here>  
 */
package programmingfoundationsa3;

import java.util.Scanner;

public class ProgrammingFoundationsA3 
{

    public static void username() 
    {
        
        // create scanner
        Scanner sc = new Scanner(System.in);
            
        // get details for full name 
        String initName;
        System.out.println("What is your first name? ");
        String firstName = sc.next();     
        System.out.println("What is your last name? ");
        String lastName = sc.next();
        // take the first letter of the first name and add it to the last name
        initName = firstName.charAt(0) + lastName;
        System.out.println("Username: " + initName);
    }
    
    public static void main(String[] args) {
        // call method to generate username
        username();
        
        System.exit(0);

    }
    
}