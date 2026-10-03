import javax.swing.JOptionPane;


public class bsixthJava{
    public static void main (String[] args){

        String name = "";
        name = JOptionPane.showInputDialog("Please Enter Your Name");

        String msg = "Hello " +name+ "!";
        JOptionPane.showMessageDialog(null,msg);
    }
}