/*Kelompok 2 
 * Muhammad Handoko (101210089)
 * Hilmi Failasuf (101210053)
 *Shopiyatun (101210045)
*Lisa Indriani(101210043)
 */
package Konstruktor;
class Tabungan {
   private int saldo;
    public Tabungan(int saldo){
       saldo = saldo;
    }
    
    int simpanTabungan(){
        this.saldo=this.saldo+500000;
        return 500000;
    }
    
    int ambilTabungan(){
        this.saldo=this.saldo-600000;
        return 600000;
    }
    
    int sisaSaldo(){
        return this.saldo;
    }
}
public class HitungTabungan{
        public static void main(String[] args) {
            Tabungan tabungan = new Tabungan(2000000);
            System.out.println("---------------------------------------------------");
            System.out.println("             Selamat Datang di Bank ABS             ");
            System.out.println("---------------------------------------------------");
            System.out.println("Sisa saldo Anda saat ini adalah : Rp. " + tabungan.sisaSaldo());
            System.out.println("Jumlah tabungan yang ditambahkan : Rp. " + tabungan.simpanTabungan());
            System.out.println("---------------------------------------------------");
            System.out.println("Sisa saldo Anda saat ini adalah : Rp. "+ tabungan.sisaSaldo());
            System.out.println("Jumlah tabungan yang diambil : Rp. " + tabungan.ambilTabungan() );
            System.out.println("---------------------------------------------------");
            System.out.println("Sisa saldo Anda : Rp. " + tabungan.sisaSaldo());  
    }
}
