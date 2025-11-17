public class SentenceAnalysis {
    public static void main(String[] args) {
        String sentence = "Java Programming is FUN and Powerful!";

        int length = sentence.length();
        String lowerCase = sentence.toLowerCase();
        String replaced = sentence.replace(" ", "_");
        boolean containsJava = sentence.contains("Java");
        String funWord = sentence.substring(19, 22).toLowerCase();

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Number of characters: " + length);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Replaced spaces: " + replaced);
        System.out.println("Contains 'Java': " + containsJava);
        System.out.println("Word 'FUN' in lowercase: " + funWord);
    }
}
