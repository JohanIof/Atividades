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
Basicamente, importei todas as classes, exceto a classe "sala", pois ela é<br />
abstrada, então não vou usar elas no código, apenas suas filhas.
##### Funções usadas
- JOption Pane
  Usado para criar as janelas de input, onde se atribui a uma variável o valor
  que o usuário digitou.
- JOption com array
  Basicamente se declara uma array e referencia ela no Pane. 
  
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
			                    null, // não lembro, deve ser null fds
			                    tiposdesala, //lugar da array
			                    null); // qual valor aparecerá primeiro? pode ser "Opção1", ou ExemploVariavel[0] ou só null
  ```
  
- If's:
O único if usado foi para ver qual tipo de sala o usuário quer agendar.
```java
 if (s == "Opção1") { 
 for (int l = 1; l <= 1; l++) {
 remota Opção1 = new Opção1(s, l, false, s, s, l);
 Opção1.reservar();
```
Se o valor escolhido em ` Object[] ExemploArray = {"Opção1", "Opção2", "Opção3"};` for <br />
igual a "Opção1", será instanciado um novo objeto: `Opção1 Variável = new Opção1(s, l, false, s, s, l);`. <br />
logo após, será "chamada" a função "reservar()", que será um pouco diferente em cada classe filhas, devido a polimorfismo e herança.

---
### Sala.java
Nesta classe, foram criados os atributos que serão comuns entre todas as classes. Estes sendo:
```java
public abstract class salas {
	protected String id;
	protected int capacidade;
	protected boolean tipoEvento;
	protected String responsavel;
	protected String disciplina; }
```
Os atributos estão "protegidos", pois, se estivessem "privados", não poderiam ser acessados pelas classes filhas. <br />
A classe é abstrata, afinal, não utilizemos ela, apenas suas filhas. Pense na classe "sala" como um "modelo".
#### Métodos
A classe sala é responsável por guardar métodos essencias, como o checksala e o reservar.
```java
public abstract void reservar();
public abstract void CheckSala(); // NÂO SERÁ USADO NA APRESENTAÇÃO de 18/05/23
```
Vale ressaltar que apenas atraves do `@Override` podemos mudar como esse método se comporta em outras classes.

### info.java
