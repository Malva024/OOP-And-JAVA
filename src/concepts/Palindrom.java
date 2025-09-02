package concepts;

import java.util.Scanner;

public class Palindrom {

    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int [] array = new int [str.length()];

        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i) != str.charAt(str.length()- 1- i))
            {
                return false;
            }
        } return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        Palindrom p = new Palindrom();
        boolean results = p.isPalindrome(x);
        System.out.println(results);
    }
}
