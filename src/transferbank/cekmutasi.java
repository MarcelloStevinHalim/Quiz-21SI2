package transferbank;

public class cekmutasi {
    public String no_rek ;
    public int total_uang ;

    public cekmutasi ( String no_rek ,  int total_uang  ) {
        this.total_uang = total_uang ;
        this.no_rek = no_rek ;

    }
    public void printmutasi () {
        System.out.println(no_rek + "\t \t " + total_uang + "\t \t " + "Debit" );
    }
}
