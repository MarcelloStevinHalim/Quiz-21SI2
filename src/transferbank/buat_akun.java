package transferbank;

public class buat_akun {
    public int saldo = 5000000 ;
    public String nama_pemilik ;
    public String no_rek ;
    
    public buat_akun (String nama_pemilik , String no_rek , int saldo ){
        this.nama_pemilik = nama_pemilik ;
        this.no_rek = no_rek ;
        this.saldo = saldo ;
    }

    public boolean cek_saldo (int total_uang) {
        if ( saldo >= total_uang ){
            return true ;
        }
        else {
            return false ;
        }
    }

    public void transfer (int total_uang){
        if ( cek_saldo(total_uang) == true ){
            saldo = saldo - total_uang ; 
        }
    }
    

    @Override
    public String toString() {
        return "" +
            " Nama = '" + nama_pemilik  + "'" +
            ", dengan Nomor rekening ='" + no_rek + "'" +
            "";
    }

    
}
