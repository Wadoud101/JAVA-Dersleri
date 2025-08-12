package homework.stringManipulation;

import java.util.Scanner;

public class C01_Q1 {
    public static void main(String[] args) {

        // Ask user to enter a sentences
        // if the sentences has the word "home", print "Home sweet home".
        //  if the sentences has the word "work", print "That's good to work".
        // if the sentences has the words "home" and "work", print "Work from Home".
        //  if the sentences doesn't have the words "home" and "work", print "Start a job as soon as you can".

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentences: ");
        String sentences = scan.nextLine();

        if(sentences.contains("home") && sentences.contains("work")){
            System.out.println("Work from Home");
        } else if(sentences.contains("home")){
            System.out.println("Home sweet home");
        }else if(sentences.contains("work")){
            System.out.println("That's good to work");
        }else {
            System.out.println("Start a job as soon as you can");
        }


    }
}
