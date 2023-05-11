package classes;
import javax.swing.JOptionPane;

public  class laboratorio extends salas {
    private int equipamentos;
    
    public laboratorio(String id, int capacidade, boolean tipoEvento, String responsavel, String disciplina, 
    		int equipamentos) {
        super(id, capacidade, tipoEvento, responsavel, disciplina);
        this.equipamentos = equipamentos;
    }

    // getters e setters
    public int getEquipamentos() {
        return equipamentos;
    }
    public void setEquipamentos(int equipamentos) {
        this.equipamentos = equipamentos;
    }
    @Override
    public void CheckSala() {
   
	}
    
	@Override
	public void reservar() {
		Object[] tiposdesala = {"APS", "Física"};
		String s = (String)JOptionPane.showInputDialog(
		                    null,
		                    "Escolha qual disciplina para reservar o laboratório.",
		                    "Escolha",
		                    JOptionPane.QUESTION_MESSAGE,
		                    null,
		                    tiposdesala,
		                    null);

		//If a string was returned, say so.
		if ((s != null) && (s.length() > 0)) {
		    System.out.println("Retornando o valor " + s);   
		    this.setDisciplina(s);
		    
			 int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da sala de "+this.getDisciplina()+":"));
			 this.setCapacidade(capacidade);
			 int equipamentos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de equipamentos para a aula de "+this.getDisciplina()+":"));
			 this.setEquipamentos(equipamentos);
			 String responsavel = JOptionPane.showInputDialog("Digite o nome do responsável pela reserva da sala:");
			 this.setResponsavel(responsavel);
			 String dataInicio = JOptionPane.showInputDialog("Digite a data de inicio da reserva: ");
	    	 String dataFim = JOptionPane.showInputDialog("Digite a data de fim da reserva: "); 
	     	 String horaInicio = JOptionPane.showInputDialog("Digite a hora de inicio da reserva: ");
	    	 String horaFim = JOptionPane.showInputDialog("Digite a hora de término da reserva: "); 
	    	// código para reservar a sala
	    	// ...
	    	
	    	JOptionPane.showMessageDialog(null, "Sala Fisica reservada com sucesso para as datas " + dataInicio + " a " + dataFim);
	    	JOptionPane.showMessageDialog(null, "A sala "+this.getId()+" foi reservada entre as "+ dataInicio+" e "+dataFim+", das "+horaInicio+" as "+horaFim+". \n"+
	    	"Será ministrada por "+ this.getResponsavel()+" e terá capacidade para "+this.getCapacidade()+" Alunos. \n"+
	    			"A sala possui "+this.getEquipamentos()+" Equipamentos de Fisica para uso.");
	    	
	    	System.out.println("A sala "+this.getId()+" foi reservada entre as "+ dataInicio+" e "+dataFim+", das "+horaInicio+" as "+horaFim+". \n"+
	    	"Será ministrada por "+ this.getResponsavel()+" e terá capacidade para "+this.getCapacidade()+" Alunos. \n"+
	    			"A sala possui "+this.getEquipamentos()+" Equipamentos de Fisica para uso.");
		    
		}
	}
}