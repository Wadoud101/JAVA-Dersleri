package Subject13_MethodCreation;

public class C04_CorrectTheName {
    public static void main(String[] args) {

        System.out.println(correctTheName("wadOUD", "MUkhLIs"));

        System.out.println(writingTextInReverseReturn("Wadoud Mukhlis"));

        palindromText("Madam");
    }

    public static String correctTheName(String name, String surName){

        String correctedName;
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        surName = surName.substring(0,1).toUpperCase() + surName.substring(1).toLowerCase();

        correctedName = name + " " + surName;
        return correctedName;
    }

    public static String writingTextInReverseReturn(String text){

        String reverseText = "";
        for (int i = text.length()-1; i >= 0; i--) {
            reverseText += text.charAt(i);

        }

        return reverseText;

    }

    public static void palindromText(String palindrom){

        String revPalindrom = C04_CorrectTheName.writingTextInReverseReturn(palindrom);
        System.out.println(revPalindrom + " " +  palindrom);
        if (palindrom.equalsIgnoreCase(revPalindrom)){
            System.out.println(palindrom + " is a PALINDROM");
        }else System.out.println(palindrom + " is NOT a palindrom.");
    }
}
