package si_regpagi_22166020_lat17_ptunjangan;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class SI_Regpagi_22166020_lat17_Ptunjangan {
    public static void main(String[] args) {
        // Deklarasi variabel
        String golongan;
        int gajiPokok;
        float tunjangan;

        // Membuat scanner untuk input data dari user
        Scanner scanner = new Scanner(System.in);

        // Menerima input golongan dari user
        System.out.print("Masukkan golongan: ");
        golongan = scanner.nextLine();

        // Menerima input gaji pokok dari user
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = scanner.nextInt();

        // Menghitung tunjangan
        switch (golongan) {
            case "A":
                tunjangan = (float) (0.1 * gajiPokok);
                break;
            case "B":
                tunjangan = (float) (0.15 * gajiPokok);
                break;
            case "C":
                tunjangan = (float) (0.2 * gajiPokok);
                break;
            case "D":
                tunjangan = (float) (0.25 * gajiPokok);
                break;
            case "E":
                tunjangan = (float) (0.3 * gajiPokok);
                break;
            default:
                tunjangan = 0;
        }

        // Menampilkan tunjangan
        System.out.println("Tunjangan sebesar: " + tunjangan);
    }
}
        // TODO code application logic here
    }
    
}
