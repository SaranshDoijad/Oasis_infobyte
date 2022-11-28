import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

class Game {
    int no;
    static int compno, count = 1;

    Scanner sc = new Scanner(System.in);

    public void generated_no() {
        Random rand = new Random();
        compno = rand.nextInt(100);
    }

    public void diaglogbox() {
        try {
            while (no != compno) {

                JFrame frame = new JFrame("Main Window");
                frame.setSize(600, 600);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                String no1 = JOptionPane.showInputDialog(frame, "Enter the number");
                no = Integer.parseInt(no1);

                JOptionPane.showMessageDialog(null, " " + condition(no));
                count++;
            }
        } catch (Exception e) {

        }
    }

    public static String condition(int no2) {
        if (no2 == compno) {
            return "Number you guess is correct \n Number of guesses are: " + count;

        } else if (no2 < compno) {
            return "Number is to Low !!!! \n Number of attempts are: " + count;

        } else if (no2 > compno) {
            return "Number is to High !!!! \n Number of attempts are: " + count;

        }
        return null;

    }
}

class Numberguessing {

    public static void main(String args[]) {

        Game g = new Game();
        g.generated_no();
        g.diaglogbox();

    }
}
