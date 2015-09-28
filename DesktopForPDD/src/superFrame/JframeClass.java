package superFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JframeClass extends Logic {

	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JTextArea text1 = new JTextArea();

	public void go() {
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1.setBackground(Color.blue);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button10 = new JButton("10");
		JButton button11 = new JButton("11");
		JButton button12 = new JButton("12");
		JButton button13 = new JButton("13");
		JButton button14 = new JButton("14");
		JButton button15 = new JButton("15");
		JButton button16 = new JButton("16");
		JButton button17 = new JButton("17");
		JButton button18 = new JButton("18");
		JButton button19 = new JButton("19");
		JButton button20 = new JButton("20");
		JButton button1V = new JButton();
		button1V.setLayout(new BorderLayout());
	JLabel label6 = new JLabel("button 1.");
	button1V.add(BorderLayout.CENTER, label6);

		JButton button2V = new JButton("<html>Hello<p>World</html>");
		JButton button3V = new JButton("3.");
		JButton button4V = new JButton("4.");
		JButton button5V = new JButton("5.");

		button1V.addMouseListener(new ButtonListener1V());
		// button2V.addKeyListener(new ButtonKeyListener2V());
		// button3V.addActionListener(new ButtonListener3V());
		// button4V.addActionListener(new ButtonListener4V());
		// button5V.addActionListener(new ButtonListener5V());

		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		panel1.add(button6);
		panel1.add(button7);
		panel1.add(button8);
		panel1.add(button9);
		panel1.add(button10);
		panel1.add(button11);
		panel1.add(button12);
		panel1.add(button13);
		panel1.add(button14);
		panel1.add(button15);
		panel1.add(button16);
		panel1.add(button17);
		panel1.add(button18);
		panel1.add(button19);
		panel1.add(button20);

		panel2.add(button1V);
		panel2.add(button2V);
		panel2.add(button3V);
		panel2.add(button4V);
		panel2.add(button5V);
		panel2.setBackground(Color.pink);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

		panel4.add(panel1);
		// panel2.add(panel5);
		JLabel imageLabel3 = new JLabel(new ImageIcon("\res\000788.jpg"));
		panel3.add(imageLabel3);
		// panel3.setBackground(Color.black);
		// panel3.paintComponents(getGraphics());
		// panel3.paintComponents(getGraphics());
		// GraphikImajeAdd gr = new GraphikImajeAdd();
		//panel2.add(new GraphikImajeAdd());
		
		frame.getContentPane().add(BorderLayout.SOUTH, panel4);
		frame.getContentPane().add(BorderLayout.CENTER, panel2);
		frame.getContentPane().add(BorderLayout.NORTH, panel3);

		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.pack();

	}

	public class ButtonListener1V implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

			// new SuperFrame().go();
		

			panel3.setBackground(Color.black);
			new Logic().going();
			frame.setVisible(false);

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		new JframeClass().go();
		// new Logic().go();
	}
}
