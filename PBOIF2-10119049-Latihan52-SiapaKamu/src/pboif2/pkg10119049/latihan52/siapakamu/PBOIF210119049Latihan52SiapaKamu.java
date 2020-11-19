package pboif2.pkg10119049.latihan52.siapakamu;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program Menampilkan Data Dosen dan Mahasiswa
**/
import Manusia.Mahasiswa;
import Manusia.Dosen;
public class PBOIF210119049Latihan52SiapaKamu {

    public static void main(String[] args) {
        Dosen ds1 = new Dosen();
        ds1.setNip("41227829930");
        ds1.setNama("Rizki Adam Kurniawan");
        ds1.setUmur(27);
        ds1.setMatakuliah("PBO2");
        System.out.printf("NIM MAHASISWA : %s\n",ds1.getNip());
        ds1.siapaKamu();
        ds1.mengajarApa();
        
                
        Mahasiswa mh1 = new Mahasiswa();
        mh1.setNama("Nindi");
        mh1.setNim("10110269");
        mh1.setUmur(17);
        mh1.setKelas("PBO2");
        
        System.out.printf("\nNIM MAHASISWA : %s\n",mh1.getNim());
        mh1.siapaKamu();
        mh1.kelasApa();
    }
    
}
