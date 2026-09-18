/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author tefy
 */
import java.util.Scanner;

// The Login class 
public class Login {
   
    Scanner input = new Scanner(System.in);
      String password = "...";
      String username = "...";
      String name = "...";
      String  surname = ".."; 
      
    
    // Get the Username method and validate Username
    public String user(){
        
        System.out.println("Please can you enter your firstname: ");
        name = input.nextLine();
        System.out.println("Please can you enter your surname: ");
         surname = input.nextLine();
    
        
        System.out.println("Please enter a Username that contains an inderscore and is less than 5 characters long: ");
         username = input.nextLine();
        
           int num1 = username.length();
         
         if(username.contains("_") && num1 <= 5){
           System.out.println("username successfuly Captured");
            
           
                
            }else{
             
           System.out.println("Username is not correctly formatted;please ensure the your username contains an underscore is nomore than 5 characters in length");
         }
           
          return username; 
        
        
        
   }  
    
    //Get the Password Method and validate the password 
   public String strPassword(){
       
    
       
       System.out.println("Please enter a Password that is altleast 8 caharacters long,contains a capital letter a number and special character: ");
       password = input.nextLine();
       
       
         boolean hasUppercase = false;
         boolean hasNumber = false;
         boolean hasSpecial = false;
         boolean longEnough = password.length() >= 8;

    for (int i = 0; i < password.length(); i++) {
      char c = password.charAt(i);

      if (c >= 'A' && c <= 'Z') {
          hasUppercase = true;
      } else if (c >= '0' && c <= '9') {
          hasNumber = true;
      } else if (!(c >= 'a' && c <= 'z')) {
          hasSpecial = true; // not a capital, not a digit, not lowercase
      }
        
        
     
    }
    
   

       if (longEnough && hasUppercase && hasNumber && hasSpecial) {
           System.out.println("Password successfully captured");
            
           
     } else{
        System.out.println("Incorrect format");
     
       
       }
  
         return password;
         
          
     
    } 
   
   //Get the user and validate the phone number
   public String checkCellPhoneNumber() {
         
        
         
          System.out.println("Please enter a number begining with (+27) : ");
           String phone = input.nextLine();
  
          
          
        if (phone.length() == 12 && phone.contains("+27")){
             System.out.println("Cell phone number successfully added.");
           
             
            
        }else{
            System.out.println("Cell phone number incorrectly formatted or does not contain an international code.");
        }

      return phone;
      }  
   
    // Cross Check the keys with the Username and Password to authenticate the user 
    public String authentication(){
        
        System.out.println("Please enter your username: ");
        String key = input.nextLine();
        
        System.out.println("Please enter your password: ");
        String key2 = input.nextLine();
           
         if (key2.equals(password) && key.equals(username)) {
            System.out.println("Welcome back "+  name  +" "+ surname  +" it is great to see you again");
            
         } else{
        
            System.out.println("Username or password is incorrect,please try again.");
           
        }
        return password;
         
        
    
  }
     
    
    
   
}   

    