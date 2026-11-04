import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MuchoBufferedreader {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        double balance = 20000;
        double amount;

        while( true ) {
            System.out.println( " Enter amount (0 to stop)" );
            amount = Double.parseDouble(rd.readLine());

            if( amount == 0){
                break;
            }
            if( amount > 0){
                balance = balance + amount;

                System.out.println( "Deposit succesful!" );
        }
            else{
            double withdrawal = - amount;

            if ( withdrawal <= balance){
                balance = balance - withdrawal;
            }else{
                System.out.println( "INSUFFICIENT FUNDS!");
            }
            }
            System.out.println( "Outstanding Balance: P" + balance);
            System.out.println();
        }
        System.out.println( " Program ended." );
        System.out.println( "Final Balance: P" + balance);

    }
}
