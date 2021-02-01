package lessons;

import model.Point;
import model.Triangle;

public class L10Main {
    public static void main(String[] args) {
        String pool = "To string pool";
        String pool1 = "To string pool";

        String heap = new String("To heap");
        String heap1 = new String("To heap");

        boolean poolComp = pool == pool1;
        Boolean heapComp = heap == heap1;

        //poolComp  = null;
        heapComp = null;


        String heapX = new String("To heap");
        String heapY = new String("To heap");
        boolean poolCompXY = heapX.equals(heapY);

        Point a = new Point(5, 6);
        Point b = new Point(10, 10);
        Point c = new Point(5, 10);
        System.out.println("a == b -> " + (a == b));
        System.out.println("a.equals(a) -> " + a.equals(a));
        System.out.println("a.equals(b) -> " + a.equals(b));
        System.out.println("a.equals(c) -> " + a.equals(c));
        System.out.println("a.equals(?) -> " + a.equals("String"));

        Triangle triangle1 = new Triangle(a, b, c);
        Triangle triangle2 = new Triangle(a, b, c);
        System.out.println("triangle1.equals(triangle2)) -> " + triangle1.equals(triangle2));

        String hello = new String("Hello");
        String helloReplaced = hello.replace('H', 'x');
        System.out.println("hello -> " + hello);
        System.out.println("helloReplaced -> " + helloReplaced);

        hello = hello.concat(" world!");
        System.out.println("hello after concat  -> " + hello);


        // String s = "0";

        StringBuilder stringBuilder = new StringBuilder();

       /* for (int i = 0; i < 10_000_000; i++) {
            stringBuilder.append(i);
            System.out.println(i);
        }
        System.out.println(stringBuilder.toString());*/

        //Input a sentence from console.
        // Calculate amount of words in the sentence;
        //Print out to console unique words
        String sentence = "Hello, my; my - my friend!";


        // String h = "Hello,".replace(',', ' ').trim();

        //"Hello " -> "Hello"

        printUniqueWords(sentence);
        printWordsCount(sentence);
        String sentenceNew = "Hello, my friend! How Are you?";
        String longest = getLongestWord(sentenceNew);
        System.out.println("Longest: " + longest);


    }


    boolean b = "HellO".equalsIgnoreCase("hello");

    /*
           Assume we have a method processString(String sentence) {...},
           you need to implement logic for:
           - Print out words which start from "a"  //.startsFrom('..')
           - Print out words which end from "j"//.endsWith('..')
           - Convert all words that start from "L" to upper case and //.toUpperCase()
           to lower case that contains "T" //    .contains("T")    .toLowerCase()
           */
    static void processString(String sentence) {
        String[] words = sentence.split(" ");
        for (String rawWord : words) {
            rawWord = clearWord(rawWord);
        }
        for (String word : words) {
            if (word.startsWith("a")) {
                System.out.println("Starts with a: " + word);
            }
            if (word.endsWith("j")) {
                System.out.println("End with j: " + word);
            }
            if (word.startsWith("L")) {
                word = word.toUpperCase();
            }
            if (word.contains("T")) {
                word = word.toLowerCase();
            }
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }


    public static String clearWord(String rawWord) {
        return rawWord.replace('.', ' ')
                .replace(',', ' ')
                .replace('!', ' ')
                .replace('?', ' ')
                .replace(':', ' ')
                .replace(';', ' ')
                .trim();
    }

    static void printWordsCount(String sentence) {
        String[] words = sentence.split(" ");
        System.out.println("Words count: " + words.length);
    }

    static String getLongestWord(String sentence) {
        final String[] words = sentence.split(" ");
        String maxLengthWord = clearWord(words[0]);
        for (String rawWord : words) {
            String word = clearWord(rawWord);
            if (word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
            }
        }
        return maxLengthWord;

    }


    static void printUniqueWords(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            int counter = 0;
            for (String wordInner : words) {
                if (word.equalsIgnoreCase(wordInner)) {
                    counter++;
                }
            }
            if (counter == 1) {
                System.out.println("Unique word: " + word);
            }
        }
    }
}
