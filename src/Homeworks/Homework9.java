package Homeworks;

public class Homework9 {


    public static void main(String[] args) {
    System.out.println(fac(8));
        System.out.println(fac1(15));
    }

    private static int fac(int n){
        if (n==1)
        return 1;

        return n * fac(n - 1);
    }

    private static long fac1(long n){
        if (n==1)
            return 1;

        return n + fac1(n - 1);
    }


}
