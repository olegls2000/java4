package lessons;

public class MyFirstMain {
    public static void main(String[] args) {
        System.out.println("|--------|");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|--------|");

        boolean b = true;//false
        byte myFirstByteVariable = 127;
        short sh = 222;
        int i = 999_999_999;
        long l = 888_888_888_888_888_8888l;
        double d = 9999999999.878787878787878d;
        float f = 9999999999.878787878787878f;
        char ch = '\n';
        String str = "String value";
        l = i;
        //i = (int) l;
        System.out.println("i = " + i);
        System.out.println("l = " + l);


        //System.out.println("i = " + i);
        i = sh;
        System.out.println("i = " + i);
        System.out.println("sh = " + sh);

//Create a program that calculate and print out next state:
// 121 * ⅓ +388^3   Output example: 121 * ⅓ +388^3 = ...
//388*388*388
        double result = 121 * (1 / 3) + Math.pow(388, 3);
        System.out.println("121 * ⅓ +388^3 = " + result);

        int remaining = 15 % 6;
        System.out.println("15 % 6 = " + remaining);
        //Create a program that calculate and print out next state:
        // (int) (((double)7 / 3 )*10 ) % 31
        // Output example:   (int) (((double)7 / 3 )*10 ) % 31 = ...

        int result2 = (int) (((double) 7 / 3) * 10) % 31;
        System.out.println("(int) (((double)7 / 3 )*10 ) % 31 = " + result2);


        //Create a program that calculate and print out next state:  14/209+14*(29-13²+14/3).

        int var = 99999;
        double result3 = var / 209 + var * (29 - Math.pow(var, 2) + var / 3);
        System.out.println(var + "/209+" + var + "*(29-" + var + "²+" + var + "/3) = " + result3);

        System.out.println(9 / 5);
        System.out.println(9.0 / 5); //-> 9.0/5.0
        System.out.println(9 / 5.0);
        System.out.println(9 / 5d);
        System.out.println(9 / 5f);
        System.out.println(9 / (float) 5);
        System.out.println(9 / (double) 5);

        int p = 1;
        p = p + 1;
        p += 1;
        p++; // -> 4
        p = p + 2; //-> 6
        p += 2; // -> 8
        System.out.println("p = " + p);

        int m = 10;
        m -= 9; //  ->   m = m - 9;
        System.out.println("m = " + m);

        int mult = 2;
        mult *= 8;//mult = mult * 8;
        System.out.println("mult = " + mult);

        int div = 15;
        div /= 3;
        System.out.println("div = " + div);

        int k = 100;
        k++;//101
        k++;//102
        k *= 10;//1020
        k--;//1019
        System.out.println("k = " + k);

        System.out.println(Math.round(0.519999999999999999999999999999999d));

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);

        boolean resOfComparison = 100 > 120;
        System.out.println(resOfComparison);

        boolean resOfComparison1 = 100 >= 100;
        System.out.println(resOfComparison1);

        boolean resOfComparison2 = (990 == 990);
        System.out.println(resOfComparison2);

        boolean resOfComparison3 = 990 != 990;
        System.out.println(resOfComparison3);

        boolean resOfNegation = !b1;
        System.out.println(resOfNegation);

        boolean result33 = (5 + 6) > (120 / 10);
        System.out.println(result33);

        boolean result34 = (5 + 6) != (110 / 10);
        System.out.println(result34);

        boolean result35 = ! ( (5 * 6) <= (90 / 3) );
        System.out.println(result35);
    }
}