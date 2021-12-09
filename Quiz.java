import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String question = "What is the name of Pandemic?\n";
		question += "A. Sars \n";
		question += "B. The Plague \n";
		question += "C. Measels \n";
		question += "D. Covid-19 \n";
		question += "E. It's a Plandemic \n";
		while(true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();		
			if (answer.equals("A")) {
				JOptionPane.showMessageDialog(null,"Wrong!"); 
				}
			else if (answer.equals("B")) {
				JOptionPane.showMessageDialog(null,"Nope!"); 
				}
			else if (answer.equals("C")) {
				JOptionPane.showMessageDialog(null,"Not Quite!"); 
				}
			else if (answer.equals("D")) {
				JOptionPane.showMessageDialog(null,"Correct!"); 
				break;
				}			
			else if (answer.equals("E")) {
				JOptionPane.showMessageDialog(null,"Try Again!"); 
				}
			else {
				JOptionPane.showMessageDialog(null,"Please enter options A,B,C,D,E only!"); 
				
			}
		}
	}

}
