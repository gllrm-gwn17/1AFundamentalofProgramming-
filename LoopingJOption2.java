import javax.swing.JOptionPane;

public class loopingactJoption2 {
    public static void main(String[]args){

        String output = ""; // I use here String Datatype

        for( int i = 2; i <= 100; i += 2){
            output += i + " "; // it prints or display the even numbers

            if( i % 20 == 0){ // here, it will start a new line after every 20
                output += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }

}
