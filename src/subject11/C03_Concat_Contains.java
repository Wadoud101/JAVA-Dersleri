package subject11;

import java.util.Scanner;

public class C03_Concat_Contains {
    public static void main(String[] args) {

        // startWith, endsWith, indexOf

    /*
    Get a String from user, check whether it has Home print "I like Home"
    if it has the word Work in it, print "I like working" if it has Home and Work
    print "I like working from Home", if it doest have any of this two work, print
    "You have to start working".
     */

    Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a paragraph: ");
        String paragraph = scan.nextLine().toLowerCase();

        if(paragraph.contains("home") && paragraph.contains("work")){
            System.out.println("I like working from Home");

        }else  if(paragraph.contains("home")){
            System.out.println("I like Home");

        } else if (paragraph.contains("work")) {
            System.out.println("I like working");

        }else System.out.println("You have to start working as early as you can!!!!");


    }
}
