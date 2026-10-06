import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment3Buffered {
    public static void main (String[]args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(" Enter NSAT score: ");
        double nsat = Double.parseDouble(rd.readLine());

        System.out.print(" Enter parent's salary: ");
        double salary = Double.parseDouble(rd.readLine());

        System.out.print(" Enter entrance exam score: ");
        double exam = Double.parseDouble(rd.readLine());

        double average = ( nsat + exam) / 2;

        if ( salary > 10000 || nsat < 90 || exam < 85){
            System.out.println( " Rejected ");
        }
        else if ( salary <=3500 && average >= 91) {
            System.out.println(" Accepted ");
        }
        else{
            System.out.println(" For Further Study ");
        }

    }
}
