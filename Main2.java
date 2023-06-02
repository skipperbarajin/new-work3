import javax.swing.*;

public class Main {
    private static Object House;

    public static void main(String[] args){
       float taxrate= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter tax rate: "));
       int fuelcost = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter fuel cost: "));
       int housecost = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter house cost: "));
       float cost=housecost+(fuelcost*5)+(taxrate*housecost*5);
        class House {
            public float allcost(String[] args){
                float cost;
                cost=housecost+(fuelcost*5)+(taxrate*housecost*5);
                return cost;
            }
        }
        JOptionPane.showMessageDialog(null,cost);

    }
}