package mahasiswa;

public class Mahasiswa {
    //atribut nim, nama,kelas
    String nim, nama , kelas ;
    
    public static void main(String[] args) {
        //membuat objek
        Mahasiswa mhs = new Mahasiswa();
        
        // memberi nilai atau value
        mhs.nama = "Zulfa Rohmawati Mayasari";
        mhs.kelas = "4A";
        mhs.nim = "18090053";
        
        //memanggil data
        System.out.println("Nama : " +mhs.nama);
        System.out.println("kelas : " +mhs.kelas);
        System.out.println("Nim : " +mhs.nim);
    }
}
