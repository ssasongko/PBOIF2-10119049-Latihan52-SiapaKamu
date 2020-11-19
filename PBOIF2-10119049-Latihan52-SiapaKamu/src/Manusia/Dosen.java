package Manusia;
public class Dosen extends Manusia {
    private String nip;
    private String matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }
    
    public void mengajarApa(){
        System.out.printf("Saya %s umur %d tahun sedang mengajar %s\n",getNama(),getUmur(),getMataKuliah());
    }
    
    @Override
    public void siapaKamu(){
        System.out.printf("Saya Dosen\n");
    }
}
