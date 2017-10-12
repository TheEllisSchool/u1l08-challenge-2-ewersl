import javax.swing.JOptionPane;

public class amazonchallenge {

	
	public static void main (String [] args) {
		int [] numbers1to10without1 = {5, 1, 9, 10, 4, 2, 7, 8, 6};
			
		
		
		int sumofnums = 0;
		for (int index = 0; index < numbers1to10without1 .length; index++) {
			sumofnums = sumofnums + numbers1to10without1 [index];
		}
		
		int numberMissing = 55 - sumofnums; 
		JOptionPane.showMessageDialog (null, "The number missing " + numberMissing);
		


	}
}

