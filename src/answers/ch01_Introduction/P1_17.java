package answers.ch01_Introduction;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Type in and run the following program: Then modify it to show a different greeting and image.
 */

public class P1_17
{
  public static void main(String[] args) throws Exception
  {
    URL imageLocation = new URL(
        "https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/A_small_cup_of_coffee.JPG/1200px-A_small_cup_of_coffee.JPG");
    JOptionPane.showMessageDialog(null, "coffee", "Title", JOptionPane.PLAIN_MESSAGE,
        new ImageIcon(imageLocation));
  }
}
