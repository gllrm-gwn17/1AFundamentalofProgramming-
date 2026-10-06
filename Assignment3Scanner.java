import java.util.Scanner;

public class Assignment3Scanner {
    public static void main (String[]args) {

    Scanner input = new Scanner(System.in);

    System.out.print(" Enter NSAT score: ");
    double nsat = input.nextDouble();

    System.out.print(" Enter parent's salary: ");
    double salary = input.nextDouble();

    System.out.print(" Enter entrance exam score: ");
    double exam = input.nextDouble();

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

        input.close();
    }

}
