public class granta_pica{
public static void main(String[] args) {  

do {
		
    		JOptionPane.showMessageDialog(null, "Edienu karte");
		picasIzvele = JOptionPane.showInputDialog("1-Klienta info | 2-apskatit klienta info | 3-pasutit| x-close");
		picasIzvele = picasIzvele.toLowerCase();
}while(!picasIzvele.equals("x"));
}
}