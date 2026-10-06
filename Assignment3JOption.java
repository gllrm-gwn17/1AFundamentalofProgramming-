import javax.swing.JOptionPane;

public class Assignment3JOption {
    public static void main (String[]args){

        double nsat = Double.parseDouble(
                JOptionPane.showInputDialog(" Enter NSAT score: ")
        );

        double salary = Double.parseDouble(
                JOptionPane.showInputDialog(" Enter parent's salary: ")
        );

        double exam = Double.parseDouble(
                JOptionPane.showInputDialog(" Enter entrance exam score: ")
        );

        double average = ( nsat + exam) / 2;

        String result;

        if ( salary > 10000 || nsat < 90 || exam < 85){
            result = " Rejected ";
        }
        else if ( salary <=3500 && average >= 91) {
            result = " Accepted ";
        }
        else{
            result = " For Further Study ";
        }
        String all = "Nsat score: " + nsat + " \nParent's salary: " + salary +
                " \nEntrance exam score: " + exam + "\n" + result;

        JOptionPane.showMessageDialog(null,all);

    }
}
