# Como funciona o código?
---
### Main.java
Primeiramente, no main java usei estes imports:
``` java
import javax.swing.*;
import classes.remota;
import classes.normal;
import classes.laboratorio;
import classes.servidor;
```
Basicamente, importei todas as classes, exceto a classe "sala", pois ela é
abstrada, então não vou usar elas no código, apenas suas filha.
##### Funções usadas
- JOption Pane
  Usado para criar as janelas de input, onde se atribui a uma variável o valor
  que o usuário digitou.
- JOption com array
  Basicamente eu declarei uma array, depois especifiquei essa array como respostas 
  pré-selecionada do painel.
  
  Exemplo de criação da array:
  ``` java
  Object[] ExemploArray = {"Opção1", "Opção2", "Opção3"};
  ```
  Exemplo de implementação da array em JOption:
  ```java
  String ExemploVariavel = (String)JOptionPane.showInputDialog(
			                    null, 
			                    "Olá servidor "+Y+",\n" //Mensagem no painel
			                    + "Escolha uma sala para reservar", 
			                    "Escolha", // Mensagem do hub
			                    JOptionPane.QUESTION_MESSAGE, // tipo de painel
			                    null,
			                    tiposdesala,
			                    null);
  ```
  
- If's:
O único if usado foi para ver qual tipo de sala o usuário quer agendar.


### Sala.java
