package concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfArray {

        public int[] intersection (int[] nums1, int[] nums2) {
            List<Integer> list = new ArrayList<>();


            for(int i= 0; i<nums1.length; i++)
            {
                for(int j=0; j<nums2.length; j++)
                {
                    if(nums1[i] == nums2[j] && !list.contains(nums1[i])){
                        list.add(nums1[i]); // Add only unique matches
                        break;
                    }
                }}

            if (list.isEmpty()) {
                return new int[]{};
            }

            int[] result = new int [list.size()];

            for(int i =0; i<list.size();i++)
            {
                result [i] =list.get(i);
            }

            return result;
        }



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the length of array 1;");
            int length1 = sc.nextInt();

            System.out.println("nums1: ");
            int[] nums1 = new int [length1];

            for(int i=0; i<length1; i++){nums1[i] = sc.nextInt();}

            System.out.println("Enter the length of array2 ;");
            int length2 = sc.nextInt();

            System.out.println("nums2: ");
            int[] nums2 = new int [length2];

            for(int i=0; i<length2; i++){nums2[i] = sc.nextInt();}

            IntersectionOfArray e = new IntersectionOfArray();

            System.out.println("Result"+Arrays.toString(e.intersection(nums1,nums2)));

        }
}




