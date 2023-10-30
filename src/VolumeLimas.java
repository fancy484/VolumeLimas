import java.util.Scanner;

public class VolumeLimas {
    static int panjang;
    static int lebar;
    static int tinggi;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Panjang Limas:");
        panjang = input.nextInt();

        System.out.println("Masukkan Lebar Limas:");
        lebar = input.nextInt();

        System.out.println("Masukkan Tinggi Limas:");
        tinggi = input.nextInt();

        // Rumus Volume Limas: 1/3 * (1/2 * panjang * lebar * tinggi)
        double volume = (panjang * lebar * tinggi) / 6.0;

        System.out.println("\nHasil dari volume limas = " + volume);
    }
}
