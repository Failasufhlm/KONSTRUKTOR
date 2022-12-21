package konstruktor;
public class HitungPersegiPanjang {
    public static void main(String[] args) {
        class PersegiPanjang{
    //mendeklarasikan variable dari class diatas 
    private int Panjang;
    private int Lebar;
    //construktor class tanpa parameter
    public PersegiPanjang(){
        //output judul program
        System.out.println("---------------------Belajar Konstruktor--------------------\n");
        System.out.println("                   Program Persegi Panjang                           \n");
        System.out.println("============================================================");
    }
//construktor class dengan parameter
public void nilai (int Panjang, int Lebar) {
this.Panjang = Panjang;
this.Lebar =Lebar;
}
//method getLuas
double getLuas(){
    return this.Panjang*this.Lebar;
}
//method getKeliling
double getKeliling(){
    return 2*(this.Panjang +this.Lebar);
}
}   
        // mendekklarasikanvariable panjang dan lebar secara singkat
        int Panjang = 8, Lebar = 9;
        //memanggil class dari persegiPanjang
       PersegiPanjang persegipanjang= new PersegiPanjang();
       //pengggunaan konstruktor nilai
        persegipanjang.nilai(8,9);
        //output dari program
      System.out.println("Panjang Dari Persegi Panjang = "+Panjang+"\n");
      System.out.println("Lebar Dari Persegi Panjang= "+ Lebar+"\n");
      System.out.println("Luas Persegi Panjang = "+persegipanjang.getLuas()+"\n");
      System.out.println("Keliling Persegi Panjang = "+ persegipanjang.getKeliling()+"\n");
      
    }
    
}
