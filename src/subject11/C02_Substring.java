package subject11;

public class C02_Substring {
    public static void main(String[] args) {

        // Substring
        String str = "Java is Perfecting day by day";

        System.out.println(str.substring(8));
        System.out.println(str.substring(8, 15));           // 8th character is included but 15th character is not included
        System.out.println(str.substring(str.length()-5));


    }
}
