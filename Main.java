
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihMenu;
        String namaPelanggan[] = new String[10];
        int noMeja[] = new int[10];

        String menu[] = {
            "Kopi Hitam",
            "Latte",
            "Teh Tarik",
            "Mie Goreng"
        };

        int harga[] = {
            15000,
            22000,
            12000,
            18000
        };

        int index = 0;
        do {
           System.out.println("==== MENU UTAMA ====");
           System.out.println("1. Tambahkan Pesanan"); 
           System.out.println("2. Tampilkan Daftar Pesanan");
           System.out.println("3. Keluar");
           System.out.print("Pilih menu : ");
           pilihMenu = input.nextInt();
           input.nextLine();
           
           if (pilihMenu == 1) {
                System.out.print("Masukkan nama pelanggan : ");
                namaPelanggan[index] = input.nextLine();
                System.out.print("Masukkan nomor meja : ");
                noMeja[index] = input.nextInt();

                System.out.println("==== MENU KAFE ====");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println((i+1) + ". " + menu[i] + " - " + "Rp " + harga[i]);
                }   
           }
           else if (pilihMenu == 2) {
            
           }
           else if (pilihMenu == 3) {
            break;
           }
           else{
            System.out.println("Inputan tidak tersedia");
           }
        } while (true);

    }
}