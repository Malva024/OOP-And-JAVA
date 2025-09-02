package concepts;

import java.util.Scanner;

public class Solution {
    public char[] newWord;

    public String mergeAlternately(String word1, String word2) {
        int totalLength = word1.length() + word2.length();
        newWord = new char[totalLength];

        int i = 0, j = 0, k = 0;

        // Alternate characters from both words
        while (i < word1.length() && j < word2.length()) {
            newWord[k++] = word1.charAt(i++);
            newWord[k++] = word2.charAt(j++);
        }

        // Append remaining characters from word1
        while (i < word1.length()) {
            newWord[k++] = word1.charAt(i++);
        }

        // Append remaining characters from word2
        while (j < word2.length()) {
            newWord[k++] = word2.charAt(j++);
        }

        return new String(newWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        Solution s = new Solution();
        String result = s.mergeAlternately(word1, word2);

        System.out.println("Merged string: " + result);
    }
}
