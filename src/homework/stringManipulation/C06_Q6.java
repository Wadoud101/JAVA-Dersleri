package homework.stringManipulation;

import java.util.Scanner;

public class C06_Q6 {
    public static void main(String[] args) {

        // Ask user to enter a word, if the length of the word is even add :) symbol at the middle of word
        // if the word length is odd delete the middle character and add :( instead

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();

        if(word.length()%2 == 0){
            String firstHalf = word.substring(0, (word.length()+1)/2);
            String secondHalf = word.substring((word.length()+1)/2);
            System.out.println(firstHalf + ":)" + secondHalf);
        }

        if(!(word.length()%2 == 0)){
            String firstHalf = word.substring(0, word.length()/2);
            String secondHalf = word.substring((word.length()+1)/2);
            System.out.println(firstHalf + ":(" + secondHalf);
        }


    }
}
