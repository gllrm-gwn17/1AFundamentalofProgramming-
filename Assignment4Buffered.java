import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment4Buffered {
    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter height (cm): ");
        double height = Double.parseDouble(rd.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(rd.readLine());

        System.out.print("Enter citizenship code (C/N): ");
        char citizenship = rd.readLine().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = rd.readLine().charAt(0);

        if (recommendee == 'R' ||
                (height >= 200 && age >= 21 && age <= 25
                        && citizenship == 'C')) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }
    }
}
