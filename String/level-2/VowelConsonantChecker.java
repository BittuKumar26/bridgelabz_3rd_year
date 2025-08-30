import java.util.Scanner;

public class VowelConsonantChecker { 
    public static String checkCharType(char ch) { 
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);  
        } 
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } 
            else {
                return "Consonant";
            }
        } 
        else {
            return "Not a Letter";
        }
    } 
    public static String[][] analyzeString(String text) {
        int n = text.length();
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharType(c);
        }
        return result;
    } 
    public static void displayTable(String[][] data) { 
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String text = sc.nextLine(); 
        String[][] result = analyzeString(text); 
        displayTable(result);
    }
}
