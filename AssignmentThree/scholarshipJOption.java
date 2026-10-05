import javax.swing.JOptionPane;

public class scholarshipJOption {
    public static void main (String[] args){
        try{
            String NSATscoreStr = JOptionPane.showInputDialog("Enter Your NSAT Score: ");
            int NSATscore = Integer.parseInt(NSATscoreStr);

            String salaryStr = JOptionPane.showInputDialog("Enter Your Family's Monthly Salary: ");
            int salary = Integer.parseInt(salaryStr);

            String examScoreStr = JOptionPane.showInputDialog("Enter Your Entrance Examination Score: ");
            int examScore = Integer.parseInt(examScoreStr);

            if (NSATscore < 90 || salary > 10000 || examScore < 85){
                JOptionPane.showMessageDialog(null, "You are rejected for the scholarship.");
            } else if (NSATscore > 91 || salary < 3500 || examScore > 91) {
                JOptionPane.showMessageDialog(null, "You are accepted for the scholarship.");
            } else {
                JOptionPane.showMessageDialog(null, "For further study.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers only.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input Error Occurred");
        }
    }
    
}