package classes;
import classes.Info;
import javax.swing.*;
public class normal extends salas {
    private String disciplina;
    private int datashow;
    private int quadro;
    public normal(String id, int capacidade, boolean tipoEvento, String responsavel,String disciplina, 
    		int datashow, int quadro) {
        super(id, capacidade, tipoEvento, responsavel, disciplina);
        this.disciplina = disciplina;
        this.datashow = datashow;
        this.quadro = quadro;
    }

    // getters e setters
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getDatashow() {
        return datashow;
    }
    public void setDatashow(int datashow) {
        this.datashow = datashow;
    }

    public int getQuadro() {
        return quadro;
    }
    public void setQuadro(int quadro) {
        this.quadro = quadro;
    }


	@Override
	public void reservar() {
		Info I = new Info();
	    JPanel panelhoras = Info.criarPainelHora();
	    JPanel paneldatas = Info.criarPainelData();

	    JComboBox<String> horasInicioBox = (JComboBox<String>) panelhoras.getComponent(1);
		JComboBox<String> minutosInicioBox = (JComboBox<String>) panelhoras.getComponent(3);
		JComboBox<String> horasFimBox = (JComboBox<String>) panelhoras.getComponent(5);
		JComboBox<String> minutosFimBox = (JComboBox<String>) panelhoras.getComponent(7);
		JComboBox<String> diasBox = (JComboBox<String>) paneldatas.getComponent(1);
	    JComboBox<String> mesesBox = (JComboBox<String>) paneldatas.getComponent(3);

		Object[] numsala = I.numsalanorm;
		Object[] materias = I.materias;
		
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
            "Português");
		
		this.setDisciplina(sDS);
		
		 int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da sala normal:"));
		 this.setCapacidade(capacidade);
		 int datashow = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos datashow você quer na sala normal:"));
		 this.setDatashow(datashow);
		 int quadro = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos quadros você quer na sala normal:"));
		 this.setQuadro(quadro);
		 String responsavel = JOptionPane.showInputDialog("Digite o nome do responsável pela reserva da sala:");
		 this.setResponsavel(responsavel);
		 

	        // Exibe um JOptionPane com o JPanel e espera pelo input do usuário
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

    	JOptionPane.showMessageDialog(null, "A sala "+this.getId()+" foi reservada entre as "
    									+horaInicio+":"+minutosInicio+ " as "+horaFim+":"+minutosFim+". \n"+
    	    	"Será ministrada por "+ this.getResponsavel()+" e terá capacidade para "+this.getCapacidade()+" Alunos. \n"+
    	    			"A sala possui "+this.getDatashow()+" datashow e "+this.getQuadro()+" Quadro para uso.");
    	
    	System.out.println("------------------------------------------\n"+
 			   			   " TeleSalas200 - Reservas de salas online\n"+
 			   			   "------------------------------------------\n"+
 			   			   "Identificação:                      "+this.getId()+"\n"+
 			   			   "Disciplina:                 "+this.getDisciplina()+"\n"+
 			   			   "Capacidade:                           "+this.getCapacidade()+"\n"+
 			   			   "-------------- - - - - - - - - -----------\n"+
 			   			   "Data:                         "+diaSelecionada+"/"+mesSelecionada+"/2023\n"+
 			   			   "Início:                            "+horaInicio+":"+minutosInicio+"\n"+
 			   			   "Términio:                          "+horaInicio+":"+minutosInicio+"\n"+
 			   			   "Datashows:                              "+this.getDatashow()+"\n"+
 			   			   "Quadros:                              "+this.getQuadro()+"\n"+
 			   			   "-------------- - - - - - - - - -----------\n"+
 			   			   "Responsável:            "+this.getResponsavel()+"\n"+
 			   			   "------------------------------------------");
    	
		}
	}
}