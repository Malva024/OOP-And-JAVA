package concepts;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        int [] finalAns=new int[2];
        for(int i= 0; i<nums.length; i++)
        {
            for(int j= i+1; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target){
                return new int [] {i,j};
            }}
        }

        return new int [] {-1,-1};}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array;");
        int length = sc.nextInt();

        System.out.println("nums: ");
        int[] nums = new int [length];

        for(int i=0; i<length; i++){nums[i] = sc.nextInt();}

        System.out.println("target: ");
        int target = sc.nextInt();

        TwoSum a = new TwoSum();
        int[] result =a.twoSum(nums,target);

        if(result[0] ==-1)
        {
            System.out.println("No sum found!!");
        }
        else{
            System.out.println("Result found : " + Arrays.toString(result));
        }
    }


    }



