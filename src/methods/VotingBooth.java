package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String input= JOptionPane.showInputDialog("How old are you?");
		int age= Integer.parseInt(input);
		
		if(age<18) {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Who do you think the next president should be?");
		}	
	}
	
}
