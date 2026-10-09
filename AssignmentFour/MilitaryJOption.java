import javax.swing.JOptionPane;

public class MilitaryJOption {
    public static void main(String[] args) {
        
        String myheight = JOptionPane.showInputDialog("Enter your height: ");
        double height = Double.parseDouble(myheight);

        String myAge = JOptionPane.showInputDialog("Enter your age: " );
        int age = Integer.parseInt(myAge);

        String mycitizenship = JOptionPane.showInputDialog("Are you a citizen of planet endor? (C/N):");
        String citizenship = mycitizenship;

        String myrecommendee = JOptionPane.showInputDialog("Are you recommendee of Jedi Master Obi wan? (R/N):");
        boolean isRecommendee = myrecommendee.equalsIgnoreCase("R");

        if (height >= 200 && age > 21 && age < 25 && (citizenship.equalsIgnoreCase("C"))) {
            JOptionPane.showMessageDialog(null, "You are accepted for military service.");
        } else if (isRecommendee) {
            JOptionPane.showMessageDialog(null, "You are automatically accepted for military service.");
        } else {
            JOptionPane.showMessageDialog(null, "You are rejected for military service.");
        }

    }
}
