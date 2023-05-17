package classes;

import javax.swing.*;

public class info {
	public static String[] horas = new String[24];
	public static String[] minutos = new String[60];
	public static String[] dias = new String[31];
	public static String[] meses = new String[12];
	
	Object[] numsalanorm = {"NM01", "NM02", "NM03", "NM04", "NM05", 
			"NM06", "NM07", "NM08", "NM09", "NM10"};
	
	Object[] numsalarem = {"RM01", "RM02", "RM03", "RM04", "RM05", 
			"RM06", "RM07", "RM08", "RM09", "RM10"};
	
	Object[] numsalalab = {"LAB01", "LAB02", "LAB03", "LAB04", "LAB05", 
			"LAB06", "LAB07", "LAB08", "LAB09", "LAB10"};
	
	Object[] materias = {"Matemática", "Português", "Geografia", "História", "Química", 
			"APS", "Novas tecnologias", "POO", "Engenharia de Software", "Educação Física", 
			"Física", "Artes", "Filosofia", "Sociologia", "Biologia", "Espanhol"};
    
    public info() {
    	// Cria um array com as horas (0 a 23)
    	for (int i = 0; i < 24; i++) {
            horas[i] = String.format("%02d", i);
        }

        for (int i = 0; i < 60; i++) {
            minutos[i] = String.format("%02d", i);
        }

        for (int i = 0; i < 31; i++) {
            dias[i] = String.format("%02d", i + 1);
        }

        for (int i = 0; i < 12; i++) {
            meses[i] = String.format("%02d", i + 1);
        }
        
    }
    
    public static JPanel criarPainelHora() {
    	
        JComboBox<String> horasInicioBox = new JComboBox<>(horas);
        JComboBox<String> horasFimBox = new JComboBox<>(horas);
        JComboBox<String> minutosInicioBox = new JComboBox<>(minutos);
        JComboBox<String> minutosFimBox = new JComboBox<>(minutos);
    	 JPanel panelhoras = new JPanel();
    	 panelhoras.add(new JLabel("Começara em, Horas:"));
    	 panelhoras.add(horasInicioBox);
    	 panelhoras.add(new JLabel("Minutos:"));
    	 panelhoras.add(minutosInicioBox);   	 
    	 panelhoras.add(new JLabel("Terminará em, Horas:"));
    	 panelhoras.add(horasFimBox);
    	 panelhoras.add(new JLabel("Minutos:"));
    	 panelhoras.add(minutosFimBox);

         return panelhoras;
    }
    
    public static JPanel criarPainelData() {
    	// Cria um JComboBox para selecionar a hora
        JComboBox<String> diasBox = new JComboBox<>(dias);
        // Cria um JComboBox para selecionar os minutos
        JComboBox<String> mesesBox = new JComboBox<>(meses);

    	 JPanel paneldatas = new JPanel();
    	paneldatas.add(new JLabel("Dia:"));
    	paneldatas.add(diasBox);
    	paneldatas.add(new JLabel("Mês:"));
    	paneldatas.add(mesesBox);
    	paneldatas.add(new JLabel("de 2023."));
         return paneldatas;
    }
    
    /*
    
	        // Cria um JComboBox para selecionar a hora
	        JComboBox<String> horasBox = new JComboBox<>(horas);
	        // Cria um JComboBox para selecionar os minutos
	        JComboBox<String> minutosBox = new JComboBox<>(minutos);

	        // Cria um JPanel com os componentes JComboBox
	        JPanel panel = new JPanel();
	        panel.add(new JLabel("Hora:"));
	        panel.add(horasBox);
	        panel.add(new JLabel("Minutos:"));
	        panel.add(minutosBox);

	        // Exibe um JOptionPane com o JPanel e espera pelo input do usuário
	        int resultado = JOptionPane.showConfirmDialog(null, panel, "Selecione o horário", JOptionPane.OK_CANCEL_OPTION);
	        
	        // Se o usuário clicou em OK, exibe o horário selecionado
	        if (resultado == JOptionPane.OK_OPTION) {
	            String horaSelecionada = (String) horasBox.getSelectedItem();
	            String minutosSelecionados = (String) minutosBox.getSelectedItem();
	            JOptionPane.showMessageDialog(null, "Horário selecionado: " + horaSelecionada + ":" + minutosSelecionados);
	        }
		
	        String[] dias = new String[24];
	        String[] meses = new String[60];

	        // Cria um array com as horas (0 a 23)
	        for (int i = 0; i < 24; i++) {
	            horas[i] = String.format("%02d", i);
	        }

	        // Cria um array com os minutos (0 a 59)
	        for (int i = 0; i < 60; i++) {
	            minutos[i] = String.format("%02d", i);
	        }

	        // Cria um JComboBox para selecionar a hora
	        JComboBox<String> diasBox = new JComboBox<>(horas);
	        // Cria um JComboBox para selecionar os minutos
	        JComboBox<String> mesesBox = new JComboBox<>(minutos);

	        // Cria um JPanel com os componentes JComboBox
	        JPanel panel1 = new JPanel();
	        panel.add(new JLabel("Hora:"));
	        panel.add(horasBox);
	        panel.add(new JLabel("Minutos:"));
	        panel.add(minutosBox);

	        // Exibe um JOptionPane com o JPanel e espera pelo input do usuário
	        int resultado1 = JOptionPane.showConfirmDialog(null, panel, "Selecione o horário", JOptionPane.OK_CANCEL_OPTION);
	        
	        // Se o usuário clicou em OK, exibe o horário selecionado
	        if (resultado1 == JOptionPane.OK_OPTION) {
	            String horaSelecionada = (String) horasBox.getSelectedItem();
	            String minutosSelecionados = (String) minutosBox.getSelectedItem();
	            JOptionPane.showMessageDialog(null, "Horário selecionado: " + horaSelecionada + ":" + minutosSelecionados);
	        }
     
 if (sID != null){

		        

		    } else{System.exit(0);}


     */
    
}