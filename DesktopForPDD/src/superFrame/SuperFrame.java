package superFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SuperFrame {
	JFrame frame;
	JPanel panel;
	

	public static void main(String[] args) {
		SuperFrame sFrame = new SuperFrame();
		sFrame.go();
	}

	public void go() {
		frame = new JFrame("DesktopForPDD");
		panel = new JPanel();

		JButton buttonA = new JButton("A");
		JButton buttonB = new JButton("B");
		JButton buttonC = new JButton("C");
		JButton buttonD = new JButton("D");
		JButton buttonE = new JButton("E");
		
		frame.add(panel);
		panel.add(buttonA);
		panel.add(buttonB);
		panel.add(buttonC);
		panel.add(buttonD);
		panel.add(buttonE);
		
	}

	public class ButtonListenerA implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}

	public class ButtonListenerB implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}

	public class ButtonListenerC implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}

	public class ButtonListenerD implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}

	public class ButtonListenerE implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}
}
