package classes;
import javax.swing.JOptionPane;
public class remota extends salas {
    private int computadores;
   
    public remota(String id, int capacidade, boolean tipoEvento, String responsavel, String disciplina,
    		int computadores) {
        super(id, capacidade, tipoEvento, responsavel, disciplina);
        this.computadores = computadores;
    }

    // getters e setters
    public int getComputadores() {
        return computadores;
    }
    public void setComputadores(int computadores) {
        this.computadores = computadores;
    }
    @Override
    public void CheckSala() {
   
	}
	@Override
	public void reservar() {
		int i = JOptionPane.showConfirmDialog(
		        null, 
		        "O evento é repetitivo?"
		        );
		if(i == JOptionPane.YES_OPTION) {
		    System.out.println("A sala remota pode, apenas, ser usado por eventos NÂO repetitivos");
		      
		} else if(i == JOptionPane.NO_OPTION) {
		    System.out.println("Setando tipoEvento para false...");
		    this.setTipoEvento(false);
		    
		    Object[] numsala = {"RM01", "RM02", "RM03", "RM04", "RM05", 
					"RM06", "RM07", "RM08", "RM09", "RM10"};
String s = (String)JOptionPane.showInputDialog(
                    null,
                    "Escolha qual sala deseja reservar",
                    "Escolha",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    numsala,
                    null);

//If a string was returned, say so.
if ((s != null) && (s.length() > 0)) {
    System.out.println("Retornando o valor " + s);   
    this.setId(s);
    
 
    int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da sala remota:"));
 	this.setCapacidade(capacidade);

 	String responsavel = JOptionPane.showInputDialog("Digite o nome do responsável pela reserva da sala:");
 	this.setResponsavel(responsavel);
 	int computadores = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de computadores disponíveis na sala remota:"));
 	this.setComputadores(computadores);
 
 	String dataInicio = JOptionPane.showInputDialog("Digite a data de inicio da reserva: ");
	String dataFim = JOptionPane.showInputDialog("Digite a data de fim da reserva: "); 
	String horaInicio = JOptionPane.showInputDialog("Digite a hora de inicio da reserva: ");
	String horaFim = JOptionPane.showInputDialog("Digite a hora de término da reserva: "); 


// código para reservar a sala
// ...

	JOptionPane.showMessageDialog(null, "Sala remota reservada com sucesso para as datas " + dataInicio + " a " + dataFim);
		   
	JOptionPane.showMessageDialog(null, "A sala "+this.getId()+" foi reservada entre as "+ dataInicio+" e "+dataFim+", das "+horaInicio+" as "+horaFim+". \n"+
	    	"Será ministrada por "+ this.getResponsavel()+" e terá capacidade para "+this.getCapacidade()+" Alunos. \n"+
	    			"A sala possui "+this.getComputadores()+" Computadores para uso.");
	
	System.out.println("A sala "+this.getId()+" foi reservada entre as "+ dataInicio+" e "+dataFim+", das "+horaInicio+" as "+horaFim+". \n"+
			"Será ministrada por "+ this.getResponsavel()+" e terá capacidade para "+this.getCapacidade()+" Alunos. \n"+
			"A sala possui "+this.getComputadores()+" Computadores para uso.");
	
	
		}
		else if(i == JOptionPane.CANCEL_OPTION) {
		    System.out.println("Ta bom, vou fazer mais nada também.");
			}
		}
	}
}