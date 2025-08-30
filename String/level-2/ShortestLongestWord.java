import java.util.Scanner;

public class ShortestLongestWord { 
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    } 
    public static String[] splitWords(String text) {
        int length = findLength(text);
        String[] temp = new String[length]; // maximum possible words
        int wordCount = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                sb.append(c);
            } 
            else {
                if (findLength(sb.toString()) > 0) {
                    temp[wordCount++] = sb.toString();
                    sb.setLength(0);
                }
            }
        } 
        if (findLength(sb.toString()) > 0) {
            temp[wordCount++] = sb.toString();
        } 
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = temp[i];
        }
        return words;
    } 
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    } 
    public static String[] findShortestLongest(String[][] wordsWithLen) {
        String shortest = wordsWithLen[0][0];
        String longest = wordsWithLen[0][0];

        for (int i = 1; i < wordsWithLen.length; i++) {
            int len = Integer.valueOf(wordsWithLen[i][1]);

            if (len < findLength(shortest)) {
                shortest = wordsWithLen[i][0];
            }
            if (len > findLength(longest)) {
                longest = wordsWithLen[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String text = sc.nextLine(); 
        String[] words = splitWords(text); 
        String[][] result = wordsWithLength(words); 
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + Integer.valueOf(result[i][1]));
        } 
        String[] extremes = findShortestLongest(result);

        System.out.println("\nShortest word: " + extremes[0] + " (Length = " + findLength(extremes[0]) + ")");
        System.out.println("Longest word : " + extremes[1] + " (Length = " + findLength(extremes[1]) + ")");
    }
}
