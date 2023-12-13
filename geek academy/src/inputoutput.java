import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama: ");
        String input = scanner.nextLine();

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("output.txt"))))
        {
            writer.println("Teks yang akan ditulis ke file,");
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
