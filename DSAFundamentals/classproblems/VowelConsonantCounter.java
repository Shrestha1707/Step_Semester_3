public class VowelConsonantCounter {
    public static void main(String[] args) {
        String word = "Programming";
        int vowels = 0, consonants = 0;
        for (char ch : word.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) vowels++;
            else if (Character.isLetter(ch)) consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}