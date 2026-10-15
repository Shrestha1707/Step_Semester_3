package DSAFundamentals.classproblems;

public public class WordReverser {
    static void check(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(reversed + (word.equals(reversed) ? " - palindrome" : " - not a palindrome"));
    }

    public static void main(String[] args) {
        check("level");
        check("java");
    }
} {
    
}
