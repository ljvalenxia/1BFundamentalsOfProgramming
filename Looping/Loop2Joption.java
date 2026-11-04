import javax.swing.*;

public class Loop2Joption {
    public static void main(String [] args){
        JOptionPane.showMessageDialog(null, "Looping 2: Display even numbers from 1 to 100");

        String output = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                output += i + " ";
            }

            if (i == 20 || i == 40 || i == 60 || i == 80 ) {
                output += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}

