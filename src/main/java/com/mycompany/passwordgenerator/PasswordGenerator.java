package com.mycompany.passwordgenerator;

import javax.swing.JOptionPane;
import java.util.Random;

public class PasswordGenerator {

    static Random rand = new Random();

    public static void main(String[] args) {

        int lengthCounter = 0, random, length;
        String Generatedpassword = "";

        String lengthStr = JOptionPane.showInputDialog("How many characters do you want your password to be? (recommended 8+)");
        length = Integer.parseInt(lengthStr);

        while (length != lengthCounter) {
            if (length > 25) {
                JOptionPane.showMessageDialog(null, "Too many characters, try 25 or less", "", JOptionPane.ERROR_MESSAGE);
                lengthStr = JOptionPane.showInputDialog("How many characters do you want your password to be? (recommended 8+)");
                length = Integer.parseInt(lengthStr);
            } else {
                
                random = rand.nextInt(39, 123);
                if (random < 48) {
                    random += 10;
                }
                if ((random < 57 || random > 65) && (random < 90 || random > 97)) {
                    
                    Generatedpassword = Generatedpassword + (char) random;
                    lengthCounter++;
                }
            }
            
        }
        JOptionPane.showMessageDialog(null, "Your generated password is \n" + Generatedpassword);
    }
}
