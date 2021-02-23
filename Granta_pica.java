import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class granta_pica{
static String failaNosaukums1;

public static void klientaInfo(){
		try{
			FileWriter ryt = new FileWriter("pasutijums");
			BufferedWriter out=new BufferedWriter(ryt);
			JTextField vards = new JTextField();
			JTextField adrese = new JTextField();
			JTextField telefons = new JTextField();
			Object[] message = {    "Klienta vards:", vards,"Klienta adrese:", adrese,"Klienta numurs:", telefons};
			int answer = JOptionPane.showConfirmDialog(    null, message, "Ieraksti informaciju: ", JOptionPane.OK_CANCEL_OPTION);
			if (answer == JOptionPane.OK_OPTION){    String klientaVards = vards.getText();
			String KlientaAdrese = adrese.getText();
			String TelNumurs = telefons.getText();
			out.write("Klienta vards: " +vards.getText()+"\n");
			out.write("Klienta adrese: " +adrese.getText()+"\n");
			out.write("Klienta numurs: " +telefons.getText()+"\n");
			out.close();
			JOptionPane.showMessageDialog(null, "Informacija ir ierakstita!");
			
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Klume ierakstot faila!", "Klume!", JOptionPane.ERROR_MESSAGE);
		}
	}
public static void apskatit (){
	
		String teksts;
		try{
			failaNosaukums1 = JOptionPane.showInputDialog("pasutijums: ");
			FileReader fr = new FileReader(failaNosaukums1);
			BufferedReader lasa = new BufferedReader(fr);
			while((teksts=lasa.readLine())!=null){
				System.out.println(teksts);
			}
			lasa.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Klume ierakstot faila!", "Klume!", JOptionPane.ERROR_MESSAGE);
		}
	}

public static void main(String[] args) {  

do {
		
    		JOptionPane.showMessageDialog(null, "Edienu karte");
		picasIzvele = JOptionPane.showInputDialog("1-Klienta info | 2-apskatit klienta info | 3-pasutit| x-close");
		picasIzvele = picasIzvele.toLowerCase();
switch(picasIzvele) {
	case "1":
	klientaInfo();
	break;
	case "2":
	apskatit();
	break;
	case "3":
	break;
	case "x":
		JOptionPane.showMessageDialog(null, "Programma aptureta!", "Bridinajums", JOptionPane.WARNING_MESSAGE);
		break;
	default: 
 		JOptionPane.showMessageDialog(null, "Tada izvele nepastav!", "Klume!", JOptionPane.ERROR_MESSAGE);
 	break;
	}
}while(!picasIzvele.equals("x"));
}
}