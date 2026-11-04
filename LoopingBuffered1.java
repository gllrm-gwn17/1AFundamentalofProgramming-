import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LoopingActivityBufferedreader {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        double highest = 0; // I use double as datatype
        double lowest = 0; // also here, I use double as datatype

        for( int i = 1; i <= 10; i++ ){ // I use for loop, it will repeat 10 times to ask 10 numbers
            System.out.print(" Enter number "+ i + ":"); // This line will ask to input a number
            double number = Double.parseDouble(rd.readLine());

            if ( i == 1 ){
                highest = number;
                lowest = number;
            }
            if ( number > highest ){ // here, it checks if the number is higher
                highest = number;
            }
            if ( number < lowest ){ // here, it checks if the number is lower
                lowest = number;
            }
        }
        System.out.println( " Highest number: "+ highest ); // here, it will print the highest number input
        System.out.println( " Lowest number: "+ lowest ); // and here, it will print the lowest number input

        rd.close();
    }
}
