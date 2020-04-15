package fr.abp.cours;

public class Main {

    public static void main(String[] args) {
        char c;
        for (c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
            System.out.println();
        }
        for (c = 'z'; c >='a'; c--) {
            System.out.print(c + " ");
            System.out.println();
        }
    }
}
