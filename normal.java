package classes;
import javax.swing.JOptionPane;

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
    public void CheckSala() {
   
	}
    
	@Override
	public void reservar() {
		
		Object[] numsala = {"NM01", "NM02", "NM03", "NM04", "NM05", 
							"NM06", "NM07", "NM08", "NM09", "NM10"};
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

		 int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da sala normal:"));
		 this.setCapacidade(capacidade);
		 String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina ministrada:");
		 this.setDisciplina(disciplina);
		 int datashow = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos datashow você quer na sala normal:"));
		 this.setDatashow(datashow);
		 int quadro = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos quadros você quer na sala normal:"));
		 this.setQuadro(quadro);
		 String responsavel = JOptionPane.showInputDialog("Digite o nome do responsável pela reserva da sala:");
		 this.setResponsavel(responsavel);
		 
		 
		String dataInicio = JOptionPane.showInputDialog("Digite a data de inicio da reserva: ");
    	String dataFim = JOptionPane.showInputDialog("Digite a data de fim da reserva: "); 
    	String horaInicio = JOptionPane.showInputDialog("Digite a hora de inicio da reserva: ");
    	String horaFim = JOptionPane.showInputDialog("Digite a hora de término da reserva: "); 

    	
    	// código para reservar a sala
    	// ...
    	
    	JOptionPane.showMessageDialog(null, "Sala normal reservada com sucesso para as datas " + dataInicio + " a " + dataFim+", das "+horaInicio+" as "+horaFim+". \n");
    	JOptionPane.showMessageDialog(null, "A sala "+this.getId()+" foi reservada entre as "+ dataInicio+" e "+dataFim+". \n"+
    	    	"Será ministrada por "+ this.getResponsavel()+" e terá capacidade para "+this.getCapacidade()+" Alunos. \n"+
    	    			"A sala possui "+this.getDatashow()+" datashow e "+this.getQuadro()+" Quadro para uso.");
    	
    	System.out.println("A sala "+this.getId()+" foi reservada entre as "+ dataInicio+" e "+dataFim+", das "+horaInicio+" as "+horaFim+". \n"+
    	"Será ministrada por "+ this.getResponsavel()+" e terá capacidade para "+this.getCapacidade()+" Alunos. \n"+
    			"A sala possui "+this.getDatashow()+" datashow e "+this.getQuadro()+" Quadro para uso.");
		}
	}
}