package popcorn;

import javax.swing.JOptionPane;

public class popcorn_maker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("what flavor popcorn?");
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		String time_to_cook = JOptionPane.showInputDialog("how long to cook?");
		int time_toCook = Integer.parseInt(time_to_cook);
		microwave.setTime(time_toCook);
		microwave.startMicrowave();
	}
}
