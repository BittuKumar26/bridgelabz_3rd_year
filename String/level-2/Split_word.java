 

public class Split_word {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }  
}
