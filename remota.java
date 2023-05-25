package classes;
import javax.swing.*;
import classes.info;
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
	public void reservar() {
		info I = new info();
	    JPanel panelhoras = info.criarPainelHora();
	    JPanel paneldatas = info.criarPainelData();

	    JComboBox<String> horasInicioBox = (JComboBox<String>) panelhoras.getComponent(1);
		JComboBox<String> minutosInicioBox = (JComboBox<String>) panelhoras.getComponent(3);
		JComboBox<String> horasFimBox = (JComboBox<String>) panelhoras.getComponent(5);
		JComboBox<String> minutosFimBox = (JComboBox<String>) panelhoras.getComponent(7);
		JComboBox<String> diasBox = (JComboBox<String>) paneldatas.getComponent(1);
	    JComboBox<String> mesesBox = (JComboBox<String>) paneldatas.getComponent(3);

		Object[] numsala = I.numsalarem;
		Object[] materias = I.materias;
		
		int i = JOptionPane.showConfirmDialog(
		        null, 
		        "O evento é repetitivo?"
		        );
		if(i == JOptionPane.YES_OPTION) {
		    System.out.println("A sala remota pode, apenas, ser usado por eventos NÂO repetitivos");
		      
		} else if(i == JOptionPane.NO_OPTION) {
		    System.out.println("Setando tipoEvento para false...");
		    this.setTipoEvento(false);

		    	String sID = (String)JOptionPane.showInputDialog(
                    null,
                    "Escolha qual sala deseja reservar",
                    "Escolha",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    numsala,
                    null);

//If a string was returned, say so.
if ((sID != null) && (sID.length() > 0)) {
    System.out.println("Retornando o valor " + sID);   
    this.setId(sID);
    
	String sDS = (String)JOptionPane.showInputDialog(
        null,
        "Escolha qual sala deseja reservar",
        "Escolha",
        JOptionPane.QUESTION_MESSAGE,
        null,
        materias,
        "APS");
		this.setDisciplina(sDS);
		
		if (sDS != null){
			int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da sala remota:"));
		 	this.setCapacidade(capacidade);
		if (capacidade != 0){
			int computadores = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de computadores disponíveis na sala remota:"));
		 	this.setComputadores(computadores);
		if (computadores != 0){
			String responsavel = JOptionPane.showInputDialog("Digite o nome do responsável pela reserva da sala:");
		 	this.setResponsavel(responsavel);
		if (responsavel != null){
			 int horarioselecionado = JOptionPane.showConfirmDialog(null, panelhoras, "Selecione o horário", JOptionPane.OK_CANCEL_OPTION);
			 int dataselecionado = JOptionPane.showConfirmDialog(null, paneldatas, "Selecione o dia", JOptionPane.OK_CANCEL_OPTION);
			        
		     String horaInicio = (String) horasInicioBox.getSelectedItem();
		     String minutosInicio = (String) minutosInicioBox.getSelectedItem();
		     String horaFim = (String) horasFimBox.getSelectedItem();
		     String minutosFim = (String) minutosFimBox.getSelectedItem();
		     String diaSelecionada = (String) diasBox.getSelectedItem();
		     String mesSelecionada = (String) mesesBox.getSelectedItem();

		     JOptionPane.showMessageDialog(null,"Reservado para o dia: "+diaSelecionada+"/"+mesSelecionada+"/2023.\n"+
									"Será ocupado entre: "+horaInicio+":"+minutosInicio+ " as "+horaFim+":"+minutosFim);

		     System.out.println("------------------------------------------\n"+
		  			   " TeleSalas200 - Reservas de salas online\n"+
		  			   "------------------------------------------\n"+
		  			   "Identificação:                      "+this.getId()+"\n"+
		  			   "Disciplina:                 "+this.getDisciplina()+"\n"+
		  			   "Capacidade:                           "+this.getCapacidade()+"\n"+
		  			   "-------------- - - - - - - - - -----------\n"+
		  			   "Data:                         "+diaSelecionada+"/"+mesSelecionada+"/2023\n"+
		  			   "Início:                            "+horaInicio+":"+minutosInicio+"\n"+
		  			   "Términio:                          "+horaFim+":"+minutosFim+"\n"+
		  			   "Computadores:                       "+this.getComputadores()+"\n"+
		  			   "-------------- - - - - - - - - -----------\n"+
		  			   "Responsável:            "+this.getResponsavel()+"\n"+
		  			   "------------------------------------------");
		} else{System.exit(0);}
		} else{System.exit(0);}
		} else{System.exit(0);}
		} else{System.exit(0);}   
		} else if(i == JOptionPane.CANCEL_OPTION) {
		    System.out.println("Ta bom, vou fazer mais nada também.");}
	}
}

	@Override
	public void CheckSala() {
		// TODO Auto-generated method stub
		
	}
}