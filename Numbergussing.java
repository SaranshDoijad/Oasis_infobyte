import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

class Game {
    int compno, no,count=1;
    Scanner sc = new Scanner(System.in);

    public void generated_no() {
        Random rand = new Random();
        compno = rand.nextInt(100);
    }

    public void diaglogbox()
    {
        JFrame frame = new JFrame("Main Window");
      
       JOptionPane.showMessageDialog(frame, "Enter the number","Number Guessing Game", JOptionPane.ERROR_MESSAGE);
 
       frame.setSize(600,600);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }

    public void input() {
        System.out.println("Guess the number");
        no = sc.nextInt();
    }

    boolean condition() {
        if (no == compno) {
            System.out.println("Number you guess is correct");
            System.out.println("Number of guesses are: "+count);
            return true;
        } else if (no < compno) {
            System.out.println("Number is to Low !!!!");
            System.out.println("Number of attempts are: "+count);
            count++;
        } else if (no > compno) {
            System.out.println("Number is to High !!!!");
            System.out.println("Number of attempts are: "+count);
            count++;
        }

        return false;
    }
}

class Numbergussing {

    public static void main(String args[]) {

        Game g = new Game();
        g.generated_no();
        g.diaglogbox();
        boolean b = false;
        while (!b) {
            g.input();
            b = g.condition();

        }

    }

}