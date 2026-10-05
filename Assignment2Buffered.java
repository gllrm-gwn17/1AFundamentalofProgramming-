import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment2Buffered {
    public static void main (String[]args) throws IOException{

        BufferedReader rd = new BufferedReader( new InputStreamReader(System.in));

        System.out.print(" Enter hourly pay rate: ");
        double rate = Double.parseDouble(rd.readLine());

        System.out.print(" Enter hours worked: ");
        double hours = Double.parseDouble(rd.readLine());

        double grossPay = rate * hours;
        double taxRate;

        if (grossPay <= 2000){
            taxRate = 0.10;
        }else if (grossPay <= 4000){
            taxRate = 0.12;
        }else if (grossPay <= 10000){
            taxRate = 0.15;
        }else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.println(" Gross Pay: " + grossPay + "pesos");
        System.out.println(" Withholding Tax: " + withholdingTax + " pesos ");
        System.out.println(" Net Pay: " + netPay + "pesos");

    }
}
