package Lessons;

import Model.GeoShapes.Point;
import Model.GeoShapes.Triangle;

public class L10Main {
    public static void main(String[] args) {
        /*String pool = "To string pool";
        String heap = new String("To heap");*/

        /*Point a = new Point(5,6);
        Point b = new Point(5,6);
        Point c = new Point(5, 6);

        System.out.println(a == b);
        System.out.println(a.equals(b));

        Triangle tria1 = new Triangle(a, b, c);
        Triangle trial2 = new Triangle(a, b, c);
        System.out.println(tria1);

        String hello = new String("Hello");
        hello = hello.concat(" world;");

        System.out.println(hello);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++)
        {
            builder.append(i);
            System.out.println(i);
        }
        System.out.println(builder.toString());*/

        String sentence = "Hello hello hello my friend from all jjj Estonia, like Tallinn!";
        /*printWordsCount(sentence);
        printUniqueWordsCount(sentence);*//*
        System.out.println(getLongestWord(sentence));*/
        System.out.println(sentence);
        processString(sentence);
    }

    static void processString(String sentence)
    {
        final String[] words = sentence.split(" ");
        for (String rawWord : words)
        {
            rawWord = clearWord(rawWord);
        }
        for (String word : words)
        {
            if (word.startsWith("a"))
            {
                System.out.println("Starts with \"a\": " + word);
            }
            if (word.endsWith("j"))
            {
                System.out.println("Ends with \"j\": " + word);
            }
            if (word.startsWith("L"))
            {
                word = word.toUpperCase();
                System.out.println(word);
            }
            if (word.contains("T"))
            {
                word = word.toLowerCase();
                System.out.println("Word lower cased: " + word);
            }
        }
    }

    static String getLongestWord(String sentence)
    {
        final String[] words = sentence.split(" ");
        String longestWord = clearWord(words[0]);
        for (String rawWord : words)
        {
            String word = clearWord(rawWord);
            if (word.length() > longestWord.length())
            {
                longestWord = word;
            }
        }
        return longestWord;
    }

    static String clearWord(String rawWord)
    {
        return rawWord.replace(',', ' ')
                .replace('.', ' ')
                .replace('!', ' ')
                .replace('?', ' ')
                .replace(':', ' ')
                .replace(';', ' ')
                .trim();
    }

    static void printWordsCount(String sentence)
    {
        int wordCount = 0;
        String[] words = sentence.split(" ");
        for (String word : words)
        {
            wordCount++;
        }
        System.out.println("Word count: " + wordCount + " words");
    }

    static void printUniqueWordsCount(String sentence)
    {
        String[] words = sentence.split(" ");
        for (String word : words)
        {
            int uniqueWordCount = 0;
            for (String wordInner : words)
            {
                if (word.equals(wordInner))
                {
                    uniqueWordCount++;
                }
            }
            if (uniqueWordCount == 1)
            {
                System.out.println("Unique words: " + word);
            }
        }
    }
}