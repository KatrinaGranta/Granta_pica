public class granta_pica{
public static void main(String[] args) {  

do {
		
    		JOptionPane.showMessageDialog(null, "Edienu karte");
		picasIzvele = JOptionPane.showInputDialog("1-Klienta info | 2-apskatit klienta info | 3-pasutit| x-close");
		picasIzvele = picasIzvele.toLowerCase();
switch(picasIzvele) {
	case "1":
break;
	case "2":
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