package concepts;

import java.util.Scanner;

public class Reverse_Vowels_of_a_String {


    public String reverseVowels(String s) {
        char [] a = s.toCharArray();
        int left =0;
        int right= a.length-1;

        while(left< right)
        {       if (!isVowel(a[left])){left++;}
            else if(!isVowel(a[right])){right--;}
            else
            {
                char temp = a[left];
                a[left] =a[right];
                a[right] =temp;
                left++; right--;
            }

        }
        return new String(a);
    }
    private boolean isVowel(char x)
    {x = Character.toLowerCase(x); return x=='a' || x=='e' ||x=='i'||x=='o'||x=='u';}




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.next();

        Reverse_Vowels_of_a_String r = new Reverse_Vowels_of_a_String();
        System.out.println(r.reverseVowels(s));


    }




}




