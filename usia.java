public class usia {
    private String nama;
    private int usia;
    private double nilai;

    public usia(String nama, int usia, double nilai) {
        this.nama = nama;
        this.usia = usia;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        if (usia > 0) {
            this.usia = usia;
        } else {
            System.out.println("Usia harus lebih dari 0.");
        }
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai harus berada antara 0 dan 100.");
        }
    }
}
