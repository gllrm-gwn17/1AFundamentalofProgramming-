import javax.swing.JOptionPane;
public class LoopingActivityJOptionpane {
    public static void main(String[]args){

        double number, highest = 0, lowest = 0; // I use double as datatype

        for( int i = 1; i <= 10; i++ ){
            number = Double.parseDouble(JOptionPane.showInputDialog( " Enter number "+ i + ":"));  // This line will ask to input a number

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
            JOptionPane.showMessageDialog(null, "Highest Number: "+ highest +
                    "\nLowest Number: " + lowest); // here, it will print the highest and lowest number input
        }
    }
}
