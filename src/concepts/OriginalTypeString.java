package concepts;

import java.util.Scanner;

public class OriginalTypeString {



    public int possibleStringCount(String word)
    {
        char [] arr =word.toCharArray();
        int count=0;int Length = word.length();

        for(int i=0; i< Length;i++)
        {
            StringBuilder compare = new StringBuilder();
            for(int j=0; j<Length;j++){
                if((i & (1<< j)) !=0)
                {
                    compare.append(arr[j]);
                    count++;
                }
            }
        System.out.println(compare);
        }

        return count;
    }


    public static void main(String[] args) {
        String word;
        Scanner sc = new Scanner(System.in);
        word= sc.next();

        OriginalTypeString s = new OriginalTypeString();
        System.out.println(s.possibleStringCount(word));


    }
}
