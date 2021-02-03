package homework;

public class L10Homework {
    public static void main(String[] args) {
        String sentence = "Kitties are the most beautiful and charming creatures in the entire world!";
        System.out.println(sentence);
        getSentenceInAlphabeticOrder(sentence);
        String sentence2 = "Mom, please remember to check if the antenna. is working.";
        System.out.println(sentence2);
        getWordsWithSameStartEndChar(sentence2);
    }

    static void getSentenceInAlphabeticOrder(String sentence)
    {
        sentence = getCleanWord(sentence);
        String[] words = sentence.split("\\s+");
        int size = words.length;
        String temp = null;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (words[i].compareTo(words[j]) > 0)
                {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++)
        {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }

    static void getWordsWithSameStartEndChar(String sentence)
    {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split("\\s+");
        for (String word : words)
        {
            word = getCleanWord(word);
            if (word.charAt(0) == word.charAt(word.length() - 1))
            {
                sb.append(word + " ");
            }
        }
        System.out.println("Words with the same letter at the start and end: " + sb.toString().trim());
    }

    static String getCleanWord(String word)
    {
        return word.replaceAll("[^A-Za-z]+", " ").trim().toLowerCase();
    }
}