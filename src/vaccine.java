import javax.swing.*;

public class vaccine {
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("Please input vaccine name (BNT, AZ, MVC, Moderna");
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("az"))
            System.out.println("AZ");
    }

}
