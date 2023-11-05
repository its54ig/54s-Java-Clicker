import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateStats {
    private static final Timer timer = null;
    public static void main(JLabel title1, JLabel title2, JLabel title3){
        Timer timer = new Timer(1, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                title1.setText("You have $" + UserData.money);
                title2.setText("You get $" + UserData.moneyPerClick + " every click");
                title3.setText("You get $" + UserData.moneyPerSecond + " every second.");
                UserData.money += UserData.moneyPerSecond;
            }
        });
        timer.start();
    }
}
