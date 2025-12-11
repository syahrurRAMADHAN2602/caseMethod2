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

    public static void tambahData() {
        System.out.println("\n=== TAMBAH DATA PENDAFTAR ===");

        System.out.print("Nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Program Studi: ");
        String prodi = input.nextLine();

        System.out.print("Perusahaan tujuan: ");
        String perusahaan = input.nextLine();

        String semester;
        while (true) {
            System.out.print("Semester (6 atau 7): ");
            semester = input.nextLine();

            if (semester.equals("6") || semester.equals("7")) break;

            System.out.println("ERROR! Semester hanya boleh 6 atau 7.");
        }

        String status;
        while (true) {
            System.out.print("Status (Diterima/Menunggu/Ditolak): ");
            status = input.nextLine();

            if (status.equalsIgnoreCase("Diterima") ||
                status.equalsIgnoreCase("Menunggu") ||
                status.equalsIgnoreCase("Ditolak")) {
                break;
            }
            System.out.println("ERROR! Input status tidak valid.");
        }

        data[jumlahData][0] = nama;
        data[jumlahData][1] = nim;
        data[jumlahData][2] = prodi;
        data[jumlahData][3] = perusahaan;
        data[jumlahData][4] = semester;
        data[jumlahData][5] = status;
        jumlahData++;

        System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar: " + jumlahData);
    }

    public static void tampilData() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        System.out.println("\n=== DATA PENDAFTAR MAGANG ===");
        System.out.printf("%-20s %-10s %-12s %-15s %-10s %-10s%n",
                "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");

        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-20s %-10s %-12s %-15s %-10s %-10s%n",
                    data[i][0], data[i][1], data[i][2], data[i][3], data[i][4], data[i][5]);
        }
    }

    public static void cariProdi() {
        System.out.print("\nMasukkan program studi yang dicari: ");
        String cari = input.nextLine();

        boolean ditemukan = false;
        System.out.printf("%-20s %-10s %-12s %-15s %-10s %-10s%n",
                "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");

        for (int i = 0; i < jumlahData; i++) {
            if (data[i][2].equalsIgnoreCase(cari)) {
                System.out.printf("%-20s %-10s %-12s %-15s %-10s %-10s%n",
                        data[i][0], data[i][1], data[i][2], data[i][3], data[i][4], data[i][5]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada pendaftar dengan prodi tersebut.");
        }
    }

     public static void hitungStatus() {
        int diterima = 0, menunggu = 0, ditolak = 0;

        for (int i = 0; i < jumlahData; i++) {
            String status = data[i][5].toLowerCase();
            if (status.equals("diterima")) diterima++;
            else if (status.equals("menunggu")) menunggu++;
            else if (status.equals("ditolak")) ditolak++;
        }

        System.out.println("\n=== JUMLAH PENDAFTAR BERDASARKAN STATUS ===");
        System.out.println("Diterima : " + diterima);
        System.out.println("Menunggu : " + menunggu);
        System.out.println("Ditolak  : " + ditolak);
    }
}