/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex15;

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String userName = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        if(userName.equals("UserOne")){
            if(password.equals("123")){
                System.out.print("Welcome!");
            }
            else {
                System.out.print("I don't know you.");
            }
        }
        else if(userName.equals("UserTwo")){
            if(password.equals("321")){
                System.out.print("Welcome!");
            }
            else {
                System.out.print("I don't know you.");
            }
        }
        else {
            if(password.equals("000")){
                System.out.print("Welcome!");
            }
            else {
                System.out.print("I don't know you.");
            }

        }
    }
}