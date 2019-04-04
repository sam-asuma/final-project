package nurse.pals;

import java.util.Date;

public class MedAdmin {
	
	private Date date;
	private String Administrator;
	private Drug drug;
	private double dropRate;
	
	public double dropRate() {
		return dropRate;
		
	}
	
	public String txt = "1 T get Q.D.";
	NursePalsGui gui = new NursePalsGui();


	
	//public String[] words = txt.split(" ");
	public String[] words = gui.getTxtSigText().getText().split(" ");

	

	
	public void display() {
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}

	public String translate() {
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].toLowerCase();
			words[i] = words[i].replaceAll("\\bt\\b", "Tablet");
			words[i] = words[i].replace("po", "by mouth");
			words[i] = words[i].replace("qd", "every day");
			System.out.print( words[i] + " ");
			String translate = words[i] + " ";
		}
		
		return translate();	

	}
	


	public static void main(String[] args) {

		MedAdmin obj = new MedAdmin();
		obj.display();
		System.out.println();
		obj.translate();
		NursePalsGui guiOutput = new NursePalsGui();
		guiOutput.txtSigText.setText(obj.translate());

		

	}
	
	

}
