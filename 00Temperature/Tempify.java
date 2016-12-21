import javax.swing.*;
import java.awt.*;
public class Tempify extends JFrame {
 private Container pane;

 private JTextField input;
 private JButton CtoF;
 private JButton FtoC;
 private JTextField output;
 
  //CONSTRUCTOR SETS EVERYTHING UP
  public Tempify() {
     this.setTitle("Convert Temperatures");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));  //NOTE!! THIS CAN BE CHANGED (see below)
    
     input = new JTextField(32);
     CtoF = new JButton("Celsius to Fahrenheit");
     FtoC = new JButton("Fahrenheit to Celsius");
     output = new JTextField(0);
     pane.add(input);
     pane.add(CtoF);
     pane.add(FtoC);
     pane.add(output);
 }

  //MAIN JUST INSTANTIATES + MAKE VISIBLE
  public static void main(String[] args) {
      Tempify g = new Tempify();
      g.setVisible(true);
  }
}
