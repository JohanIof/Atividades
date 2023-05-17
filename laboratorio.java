package classes;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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

		Object[] numsala = I.numsalalab;
		Object[] materias = I.materias;
		
		Object[] tiposdesala = {"APS", "Física", "Química"};
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
		    
		    String sID = (String)JOptionPane.showInputDialog(
                    null,
                    "Escolha qual sala deseja reservar",
                    "Escolha",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    numsala,
                    null);
		    this.setId(sID);   
		    if (sID != null){
		    	int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da sala "+this.getDisciplina()+":"));
				this.setCapacidade(capacidade);
			if (capacidade != 0){
				int equipamentos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de equipamentos para a aula de "+this.getDisciplina()+":"));
				this.setEquipamentos(equipamentos);
			if (equipamentos != 0){
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
			  			   "Equipamentos:                       "+this.getEquipamentos()+"\n"+
			  			   "-------------- - - - - - - - - -----------\n"+
			  			   "Responsável:            "+this.getResponsavel()+"\n"+
			  			   "------------------------------------------");  

		} else{System.exit(0);}
		} else{System.exit(0);}
		} else{System.exit(0);}
		} else{System.exit(0);}	 
		} else{System.exit(0);}
}

	@Override
	public void CheckSala() {
		// TODO Auto-generated method stub
		
	}
}