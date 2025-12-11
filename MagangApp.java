package caseMethod2;

import java.util.Scanner;

public class MagangApp {

    static Scanner input = new Scanner(System.in);
    static String[][] data = new String[100][6];
    static int jumlahData = 0;

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA SISTEM MAGANG ===");
            System.out.println("1. Tambah Data Pendaftar");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Cari Berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar Setiap Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

        } while();
    }

    
    
}