import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dizi[] = new int[10];
        int min = 0;
        int max = 0;


        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = scanner.nextInt();
        }
        max = dizi[0];
        min = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (max <= dizi[i]) max = dizi[i];
            if (min >= dizi[i]) min = dizi[i];
        }
        System.out.println("Dizinin elemanlari");
        for (int j = 0; j < dizi.length; j++) System.out.print(dizi[j] + " ");
        System.out.println("\nmax = " + max);
        System.out.println("min = " + min);


    }
}