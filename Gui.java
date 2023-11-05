import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    public static void gui(){
        JFrame frame = new JFrame("54's Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setSize(1400, 700);

        GridBagConstraints constraints = new GridBagConstraints();

        JLabel title1 = new JLabel("You have $" + UserData.money);
        constraints.gridx = 0;
        constraints.gridy = 0;
        frame.getContentPane().add(title1, constraints);

        JLabel title2 = new JLabel("You get $" + UserData.moneyPerClick + "every click");
        constraints.gridx = 0;
        constraints.gridy = 1;
        frame.getContentPane().add(title2, constraints);

        JLabel title3 = new JLabel("You get $" + UserData.moneyPerSecond + " every second.");
        constraints.gridx = 0;
        constraints.gridy = 2;
        frame.getContentPane().add(title3, constraints);

        JButton money_button = new JButton("Click for money");
        constraints.gridx = 0;
        constraints.gridy = 4;

        UpdateStats.main(title1, title2, title3);

        money_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserData.money += UserData.moneyPerClick;
                UserData.updateFiles(true);
            }
        });
        frame.getContentPane().add(money_button, constraints);

        JButton shop_button = new JButton("Open the shop");
        constraints.gridx = 0;
        constraints.gridy = 3;
        shop_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Shop.shop();
            }
        });
        frame.getContentPane().add(shop_button, constraints);

        frame.setVisible(true);
    }
}
