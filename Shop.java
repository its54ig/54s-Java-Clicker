import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shop {
    static void shopButton(Integer y, String name, Integer cost, JFrame frame, JLabel title, Integer mpc, Integer mps){
        UserData.updateFiles(false);

        GridBagConstraints constraints = new GridBagConstraints();

        JButton shop_button = new JButton("Buy " + name + ", for $" + cost + " adds " + mpc + " money per a click and " + mps + " money per second.");
        constraints.gridx = 0;
        constraints.gridy = y+1;
        shop_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (UserData.money >= cost) {
                    UserData.money -= cost;
                    UserData.moneyPerClick += mpc;
                    UserData.moneyPerSecond += mps;
                    title.setText("Successfully bought " + name);
                } else {
                    title.setText("You don't have enough money");
                }

                UserData.updateFiles(true);
            }
        });
        frame.add(shop_button, constraints);
    }
    public static void shop(){
        JFrame frame = new JFrame("Shop");
        frame.setLayout(new GridBagLayout());
        frame.setSize(700, 400);

        GridBagConstraints constraints = new GridBagConstraints();

        JLabel title = new JLabel("");
        constraints.gridx = 0;
        constraints.gridy = 0;

        frame.add(title, constraints);

        shopButton(0, "a Lemonade stand", 100, frame, title, 1, 0);
        shopButton(1, "a Website and display ads", 1000, frame, title, 10, 0);
        shopButton(2, "Money Printer (level 1)", 1000, frame, title, 0, 1);
        shopButton(3, "Money Printer (level 2)", 5000, frame, title, 0, 65);
        shopButton(4, "Money Printer (level 3)", 10000, frame, title, 0, 120);
        shopButton(5, "a Restaurant", 100000, frame, title, 150, 0);
        shopButton(6, "Money Printer (level 4)", 200000, frame, title, 0, 1200);
        shopButton(7, "an Amusement Park", 5000000, frame, title, 1500, 0);
        shopButton(8, "Money Printer (level 5)", 9500000, frame, title, 0, 91200);

        frame.setVisible(true);
    }
}
