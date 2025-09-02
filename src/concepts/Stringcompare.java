package concepts;

import java.util.Scanner;

public class Stringcompare {

    int gcd(int a, int b)
    {
        while(b!=0){
        int temp =b;
         b = a%b;
         a =temp;
        }
        return a;}


        public String gcdOfStrings(String word1, String word2) {

            if(!(word1+word2).equals(word2+word1))
            {return "";}
            int gcdLength = gcd(word1.length(),word2.length());

            return word1.substring(0, gcdLength);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first word: ");
            String word1 = scanner.nextLine();

            System.out.print("Enter second word: ");
            String word2 = scanner.nextLine();

            Stringcompare s = new Stringcompare();
            String result = s.gcdOfStrings(word1,word2);

            System.out.println("GCD of Strings: " + result);
        }
    }


