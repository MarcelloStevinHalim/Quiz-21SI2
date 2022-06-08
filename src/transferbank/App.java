package transferbank;

import java.util.Scanner ;
import java.util.ArrayList;

public class App {
    public static void clearScreen () {
        System.out.print ("\033[H\033[2J");
        System.out.flush();
    }
        public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in) ;
        clearScreen();

        ArrayList <buat_akun> Buat_akun = new ArrayList<buat_akun>() ;
	ArrayList <String> transaksi = new ArrayList<String>() ;
        Buat_akun.add (new buat_akun("Susi", "12345678910" , 5000000));
        Buat_akun.add (new buat_akun("Budi", "10987654321" , 8000000));

        int opsi = 0 ;
        while (opsi != 3) {
            System.out.println("Welcome to Aplikasi Perbankan");
            System.out.println("-----------------------------");
            System.out.println("1. Transfer ");
            System.out.println("2. Cek Mutasi ");
            System.out.println("3. Keluar ");
            System.out.print("Tentukan pilihan Anda (1,2,3) :") ;
            opsi = keyboard.nextInt() ;
        
        if (opsi == 1){
            Scanner no_Rek = new Scanner(System.in);
            System.out.println("1.Transfer");
            System.out.println("-------------------");
            System.out.print ("Masukan nomor rekening yang ingin Anda tuju : ");
            String rektuj = no_Rek.nextLine();

            boolean ada = false ;
            int x = 0 ;
            for (buat_akun buat_akun2 : Buat_akun) {
                if  (rektuj.equals(buat_akun2.no_rek)){
                    ada = true ;
                    break ;
                }
                x = x + 1;
            }

            if (ada == true ) {
                Scanner total_uang = new Scanner(System.in) ;
                System.out.print("Masukan jumlah norminal yang ingin dikirim :") ;
                int uang = total_uang.nextInt();
                
                if (Buat_akun.get(x).cek_saldo(uang)) {
                    Buat_akun.get(x).transfer(uang);
		            transaksi.add(Buat_akun.get(x).no_rek + "\t\t" + Buat_akun.get(x).nama_pemilik + String.valueOf(uang)) ;
                    System.out.println("Anda telah melakukan pengiriman sebesar Rp " + uang +" kepada " 
                    + Buat_akun.get(x));
                }
            }
            else {
                System.out.println("Nomor rekening yang ingin dituju TIDAK ADA ");
            }
        }
        if (opsi == 2 ) {
            System.out.println("Cek Mutasi ");
            System.out.println("-------------------");
            System.out.print (" Masukan nomor rekening : ") ;
                
		    for (String t : transaksi) {
		        System.out.println(t);
		    }

            
        }
        else if (opsi == 3 ) {
            break ;
        }
        else {
            System.out.println("Nomor yang Anda input tidak valid ");
            }

        }
        
    } 
}  