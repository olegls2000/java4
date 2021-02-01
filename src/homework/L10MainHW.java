package homework;

import static lessons.L10Main.clearWord;

public class L10MainHW {

    public static void main(String[] args) {
        String sentence = "Hello from Java. Lol.!!";  //lol

        String sameStartEndLetterWord = getSameStartEndLetterWord(sentence);
        System.out.println("SameStartEndLetterWord = " + sameStartEndLetterWord);
    }

    private static String getSameStartEndLetterWord(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            word = clearWord(word);
            word = word.toLowerCase();
            Character start = word.charAt(0);
            if (word.endsWith(start.toString())) {
                return word;
            }
        }
        return null;
    }

    //- Assume that we have sentence, print out words that start and end from the same letter;


}
