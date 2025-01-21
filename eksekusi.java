public class eksekusi {
    public static void main(String[] args) {
        usia person1 = new usia("Budi", 20, 85.5);

        System.out.println("Data Awal:");
        System.out.println("Nama: " + person1.getNama());
        System.out.println("Usia: " + person1.getUsia());
        System.out.println("Nilai: " + person1.getNilai());

        System.out.println("\nMengubah Data:");
        person1.setNama("Andi");
        person1.setUsia(25);
        person1.setNilai(92.0);

        System.out.println("\nData Setelah Perubahan:");
        System.out.println("Nama: " + person1.getNama());
        System.out.println("Usia: " + person1.getUsia());
        System.out.println("Nilai: " + person1.getNilai());

        System.out.println("\nPengujian Nilai Tidak Valid:");
        person1.setUsia(-5);
        person1.setNilai(105);

        System.out.println("\nData Akhir (Setelah Pengujian Validasi):");
        System.out.println("Nama: " + person1.getNama());
        System.out.println("Usia: " + person1.getUsia());
        System.out.println("Nilai: " + person1.getNilai());
    }
}
