package calcAwt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Calculator extends Frame implements ActionListener {
	Label lb1, lb2,lb3;

	public Calculator() {
		lb1 = new Label("Var 1");
		lb2 = new Label("Var 2");
		lb1 = new Label("Result");
		add lb1;
		add lb2;
		add lb3;

	}
	public static void main(String[] args) {
		Calculator calC = new Calculator();
		calC.setVisible(true);
		calC.setLocation(300,300);
	}
}
