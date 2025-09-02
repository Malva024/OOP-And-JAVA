package concepts;

import java.util.Scanner;

public class AdjacentPlots {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;

            for(int i=0; i<flowerbed.length;i++){
                if(flowerbed[i] == 0) {
                    boolean emptyleft = (i==0 || flowerbed[i-1] == 0);
                    boolean emptyright = (i == flowerbed.length - 1 || flowerbed[i+1] == 0);


                if(emptyright && emptyleft)
                {flowerbed[i] =1; count++;

                    if(count >=n)
                    {return true;}
                }
                }
    }

            return count >=n;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] flowerbed1 = new int[5];

        System.out.println("Enter the values 0's and 1's:");
        for(int i=0; i<flowerbed1.length;i++){
           flowerbed1[i] = sc.nextInt();}

        AdjacentPlots a = new AdjacentPlots();

        boolean Check1 = a.canPlaceFlowers(flowerbed1,1);
        System.out.println(Check1);

        boolean Check2 = a.canPlaceFlowers(flowerbed1,2);
        System.out.println(Check2);

    }


}
