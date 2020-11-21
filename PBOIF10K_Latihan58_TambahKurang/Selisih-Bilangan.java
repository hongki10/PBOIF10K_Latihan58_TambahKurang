/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Bilangan
 */

 public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        int hasilSelisih = this.getX() - this.getY();
        System.out.println("Hasil Selisih " + this.getX() + " - "
                + this.getY() + " = " + hasilSelisih);
    }
}