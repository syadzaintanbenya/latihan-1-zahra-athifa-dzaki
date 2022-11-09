package Latihan;

public class VirtualDemo {
    public static void main(String[] args) {
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00); //upcasting
        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00); //polymorphism
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai --");
        e.mailCheck();
    }
}
//output menyusun pegawai 2 karna method baris 5 dan 6 yg menghasilkan output yang sama
