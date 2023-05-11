package principal;
//import java.util.Scanner;
//import java.util.ArrayList;
import javax.swing.JOptionPane;
import classes.remota;
import classes.normal;
import classes.laboratorio;
import classes.servidor;
public class Main {

	public static void main(String[] args) {
		//Scanner scanner= new Scanner(System.in);
		/*String[] ArrayRemotas = new String[2];
		
		ArrayList<String> salasnormais = new ArrayList<>();
		ArrayList<String> salasremotas = new ArrayList<>();
		ArrayList<String> salaslaboratorios = new ArrayList<>();
		int numRem = salasremotas.size(); */
		
		JOptionPane.showMessageDialog(null,
			    "Altos códigos passando.",
			    "Aviso",
			    JOptionPane.WARNING_MESSAGE);

		String Y = JOptionPane.showInputDialog(null,
			    "Olá servidor, por favor, digite seu nome",
			    null,
			    JOptionPane.PLAIN_MESSAGE);
		servidor res = new servidor();
		res.setNome(Y);
		
		String Z = JOptionPane.showInputDialog(null, Y+
			    " , digite sua matrícula.",
			    null,
			    JOptionPane.PLAIN_MESSAGE);
		res.setMatricula(Z);

		int i = JOptionPane.showConfirmDialog(
		        null, 
		        "Bem vindo "+Y+", gostaria de reservar uma sala?"
		        );
		if(i == JOptionPane.YES_OPTION) {
		    System.out.println("Processo iniciado...");
		    
		    Object[] tiposdesala = {"Normal", "Remota", "Laboratório"};
			String s = (String)JOptionPane.showInputDialog(
			                    null,
			                    "Olá servidor "+Y+",\n"
			                    + "Escolha uma sala para reservar",
			                    "Escolha",
			                    JOptionPane.QUESTION_MESSAGE,
			                    null,
			                    tiposdesala,
			                    null);

			//If a string was returned, say so.
			if ((s != null) && (s.length() > 0)) {
			    System.out.println("Retornando o valor " + s);   
			    
			}
			
			 
			 JOptionPane.showMessageDialog(null, s +
					    " foi escolhido",
					    "Aviso",
					    JOptionPane.WARNING_MESSAGE);
			 
			 if (s == "Remota") {
				  for (int l = 1; l <= 1; l++) {
				    remota rem = new remota(s, l, false, s, s, l);
				    rem.reservar();
				  						}
			 								}
				  
			 else if (s == "Normal") { 
				 for (int l = 1; l <= 1; l++) {
					    normal norm = new normal(s, l, false, s, s, l, l);
					    norm.reservar(); }
			 								}	
				 
				 
			  else { for (int l = 1; l <= 1; l++) {
					    laboratorio lab = new laboratorio(s, l, false, s, s, l);
					    lab.reservar(); }
			  								}
			 
			 
		}
		else if(i == JOptionPane.NO_OPTION) {
		    System.out.println("Então tá bom, tchau.");
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
		    System.out.println("Ta bom.");
		}

	}
}

// Site bom para JOption: https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html

