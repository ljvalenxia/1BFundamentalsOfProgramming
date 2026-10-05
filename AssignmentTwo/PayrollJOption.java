import javax.swing.JOptionPane;

public class PayrollJOption {
    public static void main (String[] args){ 
        String inputRate = JOptionPane.showInputDialog("Enter hourly pay rate: ");
        String inputHours = JOptionPane.showInputDialog("Enter hours worked: ");
        
        double rate = Double.parseDouble(inputRate);
        double hours = Double.parseDouble(inputHours);

         double grossPay = hours * rate;
            double taxRate;

            if ( grossPay <= 2000){
                taxRate = 0.10;
            }else if ( grossPay <= 4000){
                taxRate = 0.12;
            }else if ( grossPay <= 10000){
                taxRate = 0.15;
            }else{
                taxRate = 0.20;
            }

            double withholdingTax = grossPay * taxRate;
            double netPay = grossPay - withholdingTax;

            JOptionPane.showMessageDialog(null, "Gross Pay: Php " + String.format("%.2f", grossPay));
            JOptionPane.showMessageDialog(null, "Withholding Tax: Php " + String.format("%.2f", withholdingTax));
            JOptionPane.showMessageDialog(null, "Net Pay: Php " + String.format("%.2f", netPay));

   }
}
