package Tugas2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.print("Masukkan jumlah barang yang akan diinput = ");
        int jumlah = scan.nextInt();
        System.out.println("==============================================");

        String barang[] = new String[jumlah];
        double harga[] = new double[jumlah];

        for(int j=0; j<jumlah; j++) {
            System.out.println("\nBarang " + (j+1));
            System.out.print("Nama = ");
            barang[j] = scan.next();
            System.out.print("Harga = ");
            harga[j] = scan.nextDouble();
        }

        boolean status = true;
        while(status) {
            System.out.println("\n=========================================");
            System.out.println("| 1. Urutkan berdasarkan abjad (A-Z)    |");
            System.out.println("| 2. Urutkan berdasarkan harga termurah |");
            System.out.println("| 3. Keluar                             |");
            System.out.print(" Ketik (1 / 2 / 3) = ");
            int ketik = scan.nextInt();
            System.out.println("=========================================");
                boolean pilih = true;
                while(pilih) {
                if(ketik == 1) {
                    Insertion is = new Insertion();
                    is.insertionSortString(barang, harga); 

                    System.out.println("\n== List Nama Barang berdasarkan Abjad (A-Z) ==");
                    for(int j=0; j<jumlah; j++) {
                        System.out.println(); 
                        System.out.println("Nama = " + barang[j]);
                        System.out.println("Harga = " + harga[j]);
                    }
                    pilih = false;
                }
                else if(ketik == 2) {
                    Insertion is = new Insertion();
                    is.insertionSortDouble(harga, barang);

                    System.out.println("\n== List Harga Barang berdasarkan Harga Termurah ==");
                    for(int j=0; j<jumlah; j++) {
                        System.out.println();
                        System.out.println("Nama = " + barang[j]);
                        System.out.println("Harga = " + harga[j]);
                    }
                    pilih = false;
                }
                else if(ketik == 3) {
                    pilih = false;
                    status = false;
                }
                else {
                    System.out.println();
                    System.out.println("=================");
                    System.out.println("| Not Available |");
                    System.out.println("=================");
                    pilih = false;
                }
            }
        }       
    }
}
