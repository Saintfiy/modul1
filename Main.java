import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //deklarasi objek
        Mahasiswa datamahasiswa = new Mahasiswa();
        Scanner input = new Scanner(System.in);

        //inisialisasi value
        int pilihan = 0;
        while (pilihan != 3) {
            System.out.println(" 1. Tambahkan data mahasiswaa");
            System.out.println(" 2. Tampilkan nama mahasiswa");
            System.out.println(" 3. keluar program");
            System.out.println("masukkan pilihan (1-3) : ");
            Scanner objInput = new Scanner(System.in);

            pilihan = objInput.nextInt();
            switch (pilihan){
                case 1:
                    Mahasiswa.inputdata();
                    break;
                case 2:
                    System.out.print("data mahasiswa\n");
                    System.out.println(Mahasiswa.tampiluniversitas());
                    System.out.println(Mahasiswa.tampildataMahasiswa());
                    break;
                case 3:
                    System.out.println("data mahasiswa berhasil ditambahkan");
                default:
                    break;

            }
        }
    }
}