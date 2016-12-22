import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Tempify extends JFrame implements ActionListener{
    private Container pane;

    private JLabel intemp;
    private JLabel outtemp;
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

	intemp = new JLabel("Input Temperature:");
	outtemp = new JLabel("Output Temperature:");
	input = new JTextField(32);
	CtoF = new JButton("Celsius to Fahrenheit");
	CtoF.addActionListener(this);
	CtoF.setActionCommand("1");
	FtoC = new JButton("Fahrenheit to Celsius");
	FtoC.addActionListener(this);
	FtoC.setActionCommand("2");
	output = new JTextField(0);
	output.setEditable(false);
	pane.add(intemp);
	pane.add(input);
	pane.add(CtoF);
	pane.add(FtoC);
	pane.add(outtemp);
	pane.add(output);
    }

    public void actionPerformed(ActionEvent e){
	if(e.getActionCommand().equals("1"))
	    output.setText(CtooF(Double.parseDouble(input.getText())) + " Degrees Fahrenheit");
	else if(e.getActionCommand().equals("2"))
	    output.setText(FtooC(Double.parseDouble(input.getText())) + " Degrees Celcius");
    }

    public static double CtooF(double a){
	return a*(1.8)+32;
	    }
    public static double FtooC(double f){
	return (f-32)*(5.0/9);
	    }

		       
    
    //MAIN JUST INSTANTIATES + MAKE VISIBLE
    public static void main(String[] args) {
	Tempify g = new Tempify();
	g.setVisible(true);
    }
}
