import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class loopingactbufferedreader2 {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        for( int i = 2; i <= 100; i += 2){ // here, it will count from 2 up to 100

            System.out.print(i + " "); // it prints or display the even numbers

            if( i % 20 == 0){ // here, it will start a new line after every 20
                System.out.println();
            }
        }
    }
}
