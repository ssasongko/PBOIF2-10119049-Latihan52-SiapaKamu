package Manusia;
public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa() {
        System.out.printf("Saya %s umur %d tahun sedang belajar di kelas %s\n",getNama(),getUmur(),getKelas());
    }
    
    @Override
    public void siapaKamu() {
        System.out.printf("Saya Mahasiswa\n");
    }
}
