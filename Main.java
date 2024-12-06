
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihMenu, nomorMeja;
        String namaPelanggan;
        do {
           System.out.println("==== MENU UTAMA ====");
           System.out.println("1. Tambahkan Pesanan"); 
           System.out.println("2. Tampilkan Daftar Pesanan");
           System.out.println("3. Keluar");
           System.out.print("Pilih menu : ");
           pilihMenu = input.nextInt();
           
           if (pilihMenu == 1) {
            System.out.print("Masukkan nama pelanggan : ");
            namaPelanggan = input.nextLine();
            System.out.print("Masukkan nomor meja : ");
            nomorMeja = input.nextInt();
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