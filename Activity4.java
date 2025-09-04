import javax.swing.JOptionPane;
public class Activity4 {
    public static void main(String[] args) {
         String first_name,last_name,mid_initial;
         double unit_amount = 0, down_payment=0, misc=0, lab_fee=0, tuition=0, total=0, discount, total_disc,installment;
        
        int yr_lvl = Integer.parseInt(JOptionPane.showInputDialog("Year Level: "));
        last_name = JOptionPane.showInputDialog("Last Name: ");
        first_name = JOptionPane.showInputDialog("First Name: ");
        mid_initial = JOptionPane.showInputDialog("Middle Initial: ");
        int units = Integer.parseInt(JOptionPane.showInputDialog("Units Enrolled: "));
        int lab_subs = Integer.parseInt(JOptionPane.showInputDialog("Number of Subject with Laboratory"));
        int pay_mode = Integer.parseInt(JOptionPane.showInputDialog("Mode of Payment\n1. Cash\n2.Installment"));
        
      
         if (yr_lvl == 1){
                unit_amount = 800;
                down_payment = 8000;
               
            }else if(yr_lvl == 2){
                unit_amount = 600;
                down_payment = 6000;
            }else if(yr_lvl == 3){
                unit_amount = 500;
                down_payment = 5000;
            }else if(yr_lvl == 4){
                unit_amount = 400;
                down_payment = 4000;
            }
            
                misc = 3000;
                lab_fee = lab_subs *800;
                tuition = units * unit_amount;
                total = misc + lab_fee + tuition;
                discount = total * .1;
                total_disc = total - discount;
                
            if (pay_mode == 1){
            JOptionPane.showMessageDialog(null, "NAME: " + last_name + ", "+first_name +" " + mid_initial+"."
                + "\nCourse: BSIT" 
                + "\nYear Level: " + yr_lvl
                +"\n\n" + "Units Enrolled: " + units
                +"\nAmount Per Unit: " + String.format("%.2f", unit_amount)
                + "\nSubject with Laboratory: " + lab_subs
                + "\n\nMODE OF PAYMENT: CASH"
                + "\nMISCELLANEOUS: " + String.format("%.2f", misc)
                + "\nLABORATORY FEE: " + String.format("%.2f", lab_fee)
                + "\nTUITION FEE: " + String.format("%.2f", tuition)
                + "\nTOTAL FEE: " + String.format("%.2f", total)
                + "\nDISCOUNT: " + String.format("%.2f", discount) 
                + "\nTOTAL PAYMENT: " + String.format("%.2f", total_disc)
                ,"Message", JOptionPane.INFORMATION_MESSAGE);
        }else if(pay_mode == 2){
            installment = (total - down_payment)/3;
            JOptionPane.showMessageDialog(null, "NAME: " + last_name + ", "+first_name +" " + mid_initial+"."
                + "\nCourse: BSIT" 
                + "\nYear Level: " + yr_lvl
                +"\n\n" + "Units Enrolled: " + units
                +"\nAmount Per Unit: " + String.format("%.2f", unit_amount)
                + "\nSubject with Laboratory: " + lab_subs
                + "\n\nMODE OF PAYMENT: INSTALLMENT"
                + "\nMISCELLANEOUS: " + String.format("%.2f", misc)
                + "\nLABORATORY FEE: " + String.format("%.2f", lab_fee)
                + "\nTUITION FEE: " + String.format("%.2f", tuition)
                + "\nTOTAL FEE: " + String.format("%.2f", total)
                + "\nDOWN PAYMENT: " + String.format("%.2f", down_payment)
                + "\nPRELIM: " + String.format("%.2f", installment)
                + "\nMIDTERM: " + String.format("%.2f", installment)
                + "\nFINAL: " + String.format("%.2f", installment)
                ,"Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }   
}      