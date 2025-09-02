package concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidssWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        for(int i =0; i<candies.length;i++)
        {
            if(candies[i]+extraCandies>= maxCandies)
            {result.add(true);}
            else
            {result.add(false);}

        }
        return result;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of kids: ");
        int n = scanner.nextInt();

        int [] candies = new int[n];

        for(int i=0; i<n ; i++){
        System.out.print("Enter no of candies: ");
        candies[i]  = scanner.nextInt();}

        System.out.print("Enter no of extra candies: ");
        int ExtraCandies  = scanner.nextInt();

        KidssWithCandies k = new KidssWithCandies();
        System.out.println(k.kidsWithCandies(candies,ExtraCandies));
}
}
