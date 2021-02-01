package Homeworks;

public class Homework8 {

        public void Words() {
        String[] words = {"amanda", "amarat", "azbuka", "boll",  "hello", "wolf", };
        char q;
        for (int i = 0; i < words.length; i++) {
            for (char j = 'a'; j <= 'z'; j++){
                q = words[i].charAt(0);
                if (q == j) {
                    System.out.println(j + ": " + words[i] + " - " + (i + 1));
                }
            }
        }
        }
}
