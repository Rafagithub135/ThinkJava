import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//  Enter text into the chapterOneOfATaleOfTwoCities string to count the number of words, letters, and vowels in the text.

public static void main(String[] args) {
    String varOne = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only.";

    HashMap<String, Integer> wordCount = countWords(varOne);
    HashMap<Character, Integer> letters = countLetters(varOne);
    for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    System.out.println(letters.size());
    for (HashMap.Entry<String, Integer> entry : wordCount.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    HashMap<Character, Integer> vowelCount = countVowels(varOne);
    for (Map.Entry<Character, Integer> entry : vowelCount.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    System.out.printf("The letter 'T' is in the first chapter of A Tale of Two Cities %d time(s).\n", countOfWord(varOne, "T"));
}

//public static void varOne() {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter text:");
//    String varOne = scanner.nextLine();
//}

public static HashMap<String, Integer> countWords(String str) {
    HashMap<String, Integer> wordCount = new HashMap<>();
    str = str.replaceAll("\\p{Punct}", "");
    str = str.toLowerCase();
    String[] words = str.split(" ");
    for (String word : words) {
        if (word.equalsIgnoreCase("")) {
            continue;
        } else if (wordCount.containsKey(word)) {
            wordCount.put(word, wordCount.get(word) + 1);
        } else {
            wordCount.put(word, 1);
        }
    }
    return wordCount;
}

public static HashMap<Character, Integer> countVowels(String str) {
    HashMap<Character, Integer> vowelCount = new HashMap<>();
    str = str.replaceAll("\\p{Punct}", "");
    str = str.toLowerCase();
    String[] words = str.split("");
    for (String letter : words) {
        if (letter.equalsIgnoreCase("")) {
            continue;
        } else if (vowelCount.containsKey(letter.charAt(0))) {
            vowelCount.put(letter.charAt(0), vowelCount.get(letter.charAt(0)) + 1);
        } else {
            if (containsVowel(letter)) {
                vowelCount.put(letter.charAt(0), 1);
            }
        }
    }
    return vowelCount;
}

public static HashMap<Character, Integer> countLetters(String str) {
    HashMap<Character, Integer> letterCount = new HashMap<>();
    str = str.replaceAll("\\p{Punct}", "");
    str = str.replaceAll(" ", "");
    str = str.toLowerCase();
    String[] words = str.split("");
    for (String letter : words) {
        if (letter.equalsIgnoreCase("")) {
            continue;
        } else if (letterCount.containsKey(letter.charAt(0))) {
            letterCount.put(letter.charAt(0), letterCount.get(letter.charAt(0)) + 1);
        } else {
            letterCount.put(letter.charAt(0), 1);
        }
    }
    return letterCount;
}

private static boolean containsVowel(String str) {
    str = str.toLowerCase();
    return str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u");
}

public static int countOfWord(String str, String word) {
    word = word.toLowerCase();
    if (word.length() > 1) {
        HashMap<String, Integer> wordsCounted = countWords(str);
        return wordsCounted.get(word);
    } else {
        HashMap<Character, Integer> lettersCounted = countLetters(str);
        return lettersCounted.get(word.charAt(0));
    }
}
