import javax.swing.JOptionPane;

public class Assignment4JOption {
    public static void main(String[] args) {

        double height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter height (cm):"));

        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age:"));

        char citizenship = JOptionPane.showInputDialog(
                "Enter citizenship code (C/N):").charAt(0);

        char recommendee = JOptionPane.showInputDialog(
                "Enter recommendee code (R/N):").charAt(0);

        String result;

        if (recommendee == 'R' ||
                (height >= 200 && age >= 21 && age <= 25
                        && citizenship == 'C')) {
            result = "Accepted";
        } else {
            result = "Rejected";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
