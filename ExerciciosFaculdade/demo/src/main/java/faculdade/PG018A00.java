package main.java.faculdade;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class PG018A00 {
    public static void main(String[] args) {
        int num = 0;
        do { 
            num = Integer.parseInt(showInputDialog(null, "Digite um número inteiro: "));
            showMessageDialog(null, "1 * " + num + " = " + num * 1 + "\n" +
            "2 * " + num + " = " + num * 2 + "\n" + "3 * " + num + " = " + num * 3 + "\n" + 
            "4 * " + num + " = " + num * 4 + "\n" + "5 * " + num + " = " + num * 5);
        } while (num > 0);}
    }

