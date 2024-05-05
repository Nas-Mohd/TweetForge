/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template/lxw
 */
package login.register;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register {
    private static final String passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";//minimum length: 8, at least 1 upper case,at least 1 lower case, at least 1 special character
    
    public static void main(String[] args){
        String userName,password,password1,email;
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter user name: ");//enter user name
        userName=scanner.nextLine();
        
        System.out.print("Enter your email: ");//enter the email
        email=scanner.nextLine();
        
        System.out.print("Enter your password: ");//enter the password
        password=scanner.nextLine();
            
        if(validatePassword(password)){//if the password is full-fill passwordPattern
            System.out.print("Enter one more time your password: ");//enter one more time to conform
            password1=scanner.nextLine();
                
            if(password1.equals(password)){//password is same with password1
                System.out.println("Your are register you account successfully!");
                User user=new User(userName,password,email);//create the user
                    
                DoubleLinkedList list=new DoubleLinkedList();
                list.addTail(user.toString());//add the user into the list
                String[] ptr=user.toString().split(",");
            }
        }
        else{//password is not strong
            System.out.println("Your password is weak. Please key in a strong password.");
            System.out.print("Enter your password: ");
            password=scanner.nextLine();
        }  
    }
    
    public static boolean validatePassword(String password) {   //use regex to check password is enought strong or not
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
}
