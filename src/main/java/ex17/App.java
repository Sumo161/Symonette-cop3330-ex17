package ex17;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args){

        // stating the struct and introducing variables
        int a, w, h, g;
        float r;
        Double BAC;
        Scanner sc = new Scanner(System.in);


        // concat
        System.out.print("Enter a 1 is you are male or a 2 if you are female:");
        g = sc.nextInt();

        System.out.print("How many ounces of alchol did you have? ");
        a = sc.nextInt();

        System.out.print("What is your weight, in pounds? ");
        w = sc.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        h = sc.nextInt();

        sc.close();

        //establish if/else statement ot determine output to user
        if ( g==1 ){
            r = (float) 0.73;
        }
        else{
            r = (float) 0.66;
        }
        BAC = (a * 5.14/ w * r) - (0.015 * h);

        System.out.println("Your BAC is " +BAC);
        if(BAC<0.08){
            System.out.println("It's legal for you to drive. ");
        }
        else{
            System.out.println("It's illegal to drive. ");
        }



    }
}
