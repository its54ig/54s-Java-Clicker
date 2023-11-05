import java.io.*;
import java.util.Scanner;
public class UserData {
    public static Integer money = 0;
    public static Integer moneyPerSecond = 0;
    public static Integer moneyPerClick = 1;

    public static void updateFiles(Boolean ow){
        File m = new File("money");
        File mps = new File("mps");
        File mpc = new File("mpc");
        try {
            if (m.createNewFile()) {
                try {
                    FileWriter mw = new FileWriter("money");
                    mw.write(money.toString());
                    mw.close();
                } catch (IOException e){
                    System.out.println("An error occurred");
                }
            } else {
                if (ow){
                    try {
                        FileWriter mw = new FileWriter("money");
                        mw.write(money.toString());
                        mw.close();
                    } catch (IOException e){
                        System.out.println("An error occurred...");
                    }
                } else {
                    Scanner r_f = new Scanner(m);
                    while (r_f.hasNext()) {
                        String data = r_f.next();
                        money = Integer.valueOf(data);
                    }
                }
            }
            if (mps.createNewFile()) {
                try {
                    FileWriter mw = new FileWriter("mps");
                    mw.write(moneyPerSecond.toString());
                    mw.close();
                } catch (IOException e){
                    System.out.println("An error occurred");
                }
            } else {
                if (ow){
                    try {
                        FileWriter mw = new FileWriter("mps");
                        mw.write(moneyPerSecond.toString());
                        mw.close();
                    } catch (IOException e){
                        System.out.println("An error occurred...");
                    }
                } else {
                    Scanner r_f = new Scanner(mps);
                    while (r_f.hasNext()) {
                        String data = r_f.next();
                        moneyPerSecond = Integer.valueOf(data);
                    }
                }
            }
            if (mpc.createNewFile()) {
                try {
                    FileWriter mw = new FileWriter("mpc");
                    mw.write(moneyPerClick.toString());
                    mw.close();
                } catch (IOException e){
                    System.out.println("An error occurred");
                }
            } else {
                if (ow){
                    try {
                        FileWriter mw = new FileWriter("mpc");
                        mw.write(moneyPerClick.toString());
                        mw.close();
                    } catch (IOException e){
                        System.out.println("An error occurred...");
                    }
                } else {
                    Scanner r_f = new Scanner(mpc);
                    while (r_f.hasNext()) {
                        String data = r_f.next();
                        moneyPerClick = Integer.valueOf(data);
                    }
                }
            }
        } catch (IOException e){
            System.out.println("An error occurred");
        }


    }
}
