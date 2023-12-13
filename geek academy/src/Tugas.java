import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        simpanBiodata(nama, usia, alamat);

        System.out.println("Biodata telah disimpan ke dalam file.");
    }

    private static void simpanBiodata(String nama, int usia, String alamat) {
        try (FileWriter fileWriter = new FileWriter("biodata.txt")) {
            fileWriter.write("Nama: " + nama + "\n");
            fileWriter.write("Usia: " + usia + "\n");
            fileWriter.write("Alamat: " + alamat + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}