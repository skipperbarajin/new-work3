import java.math.*;
import javax.swing.*;

import static java.lang.Math.pow;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        int m= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter m:"));
        int n= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter n:"));
        Math math;
        double side1=abs(pow(m,2)-pow(n,2));
        double side2=m*n*2;
        double hypotenuse=pow(m,2)+pow(n,2);
        JOptionPane.showMessageDialog(null,"side1:"+side1+"\n"+"side2:"+side2+"\n"+"hypotenuse:"+hypotenuse);
    }
}