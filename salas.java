package classes;

public abstract class salas {
	protected String id;
	protected int capacidade;
	protected boolean tipoEvento;
	protected String responsavel;
	protected String disciplina;
	
	public salas(String id, int capacidade, boolean tipoEvento, 
			String responsavel, String disciplina) {
        this.id = id;
        this.capacidade = capacidade;
        this.tipoEvento = tipoEvento;
        this.responsavel = responsavel;
        this.disciplina = disciplina;
    }
 
 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
     public int getCapacidade() {
        return capacidade;
    }

   
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    
    
    public boolean setTipoEvento() {
        return tipoEvento;
    }

  
     
    public void setTipoEvento(boolean tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    
    public String getResponsavel() {
        return responsavel;
    }

   
     
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    public String getDisciplina() {
        return disciplina;
    }

     
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public abstract void reservar();
    
    public abstract void CheckSala();

    
}
