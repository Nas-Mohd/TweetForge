/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license/lxw
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login.register;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class Login {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String email, password;
        DoubleLinkedList list=new DoubleLinkedList();//using double linked list ro store the email and password

        System.out.print("Email: ");//let user key in user email
        email=scanner.nextLine();
        System.out.print("Password: ");//key in password
        password=scanner.nextLine();

        if(password.equals(list.findPassword(email))){
            System.out.println("Welcome back!");
        }else
            System.out.println("Your password is wrong please enter again");
    }
}
