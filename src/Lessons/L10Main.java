package Lessons;

public class L10Main {

    public static void main(String[] args) {
    }
        private static void recursionPrint(int n ){
        if (n<=1){
            return;
        }
            recursionPrint(--n);
        }




    private static void cyclePrint(int n){
        do {
            System.out.print(n+ " ");
            n--;
        }while ( 1<= n);
    }





}
