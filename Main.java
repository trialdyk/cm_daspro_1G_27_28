
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihMenu;
        int indexPesanan = 0;
        String namaPelanggan[] = new String[100];
        int noMeja[] = new int[100];
        int menuPesanan[][] = new int[100][100];
        int jumlahItem[][] = new int[100][100];

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
                namaPelanggan[indexPesanan] = input.nextLine();
                System.out.print("Masukkan nomor meja : ");
                noMeja[indexPesanan] = input.nextInt();

                System.out.println("==== MENU KAFE ====");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println((i+1) + ". " + menu[i] + " - " + "Rp " + harga[i]);
                }
                System.out.println();
                
                int i = 0;
                int totalHarga = 0;
                while(true){

                    
                    System.out.print("Pilih Menu,(Masukkan Nomer Menu,Masukkan 0 untuk selesai) : ");
                    int menuYangDipilih = input.nextInt();

                    if(menuYangDipilih < 0 || menuYangDipilih > menu.length){
                        System.out.println("Nomer Menu tidak tersedia");
                        break;
                    }

                    if(menuYangDipilih == 0){
                        break;
                    }

                    System.out.print("Masukkan Jumlah Item Untuk "+menu[menuYangDipilih-1]+" : ");
                    int jumlahItemMenu = input.nextInt();
                    if(jumlahItemMenu < 0){
                        System.out.println("Jumlah Item tidak boleh negatif");
                        jumlahItemMenu = 0;
                        break;
                    }

                    int hargaPesanan = harga[menuYangDipilih-1] * jumlahItemMenu;
                    totalHarga += hargaPesanan;

                    menuPesanan[indexPesanan][i] = menuYangDipilih;
                    jumlahItem[indexPesanan][i] = jumlahItemMenu;
                    i++;
                }
                System.out.println("Pesanan Berhasil Ditambahkan");
                System.out.println("Total Harga Pesanan : " + totalHarga);
                indexPesanan++;
           }
           else if (pilihMenu == 2) {
            System.out.println("===== MENU UTAMA =====");
            for (int i = 0; i < indexPesanan; i++) {
                System.out.println("Nama Pelanggan: " + namaPelanggan[i]);
                System.out.println("Nomor Meja: " + noMeja[i]);
                System.out.println("Detail Pesanan: ");
                
                int totalHargaSemua = 0;

                for (int j = 0; j < menuPesanan[i].length; j++) {
                    if (menuPesanan[i][j] != 0) {
                        int menuPilihan = menuPesanan[i][j] - 1;
                        int jumlahPilihan = jumlahItem[i][j];
                        int hargaPesanan = harga[menuPilihan] * jumlahPilihan;
                        
                        totalHargaSemua += hargaPesanan;

                        System.out.println("- " + menu[menuPilihan] + " X " + jumlahPilihan + " = Rp " + hargaPesanan);
                        
                    }
                }
                System.out.println("Total Harga Pesanan : Rp. " + totalHargaSemua);
                System.out.println("----------------------------------");
            }
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