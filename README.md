# exercicios-poo
http://www.facom.ufu.br/~bacala/POO/lista1.pdf


[Projeto Pessoa]: https://github.com/thiagovasconceloos/exercicios-poo/blob/main/src/br/com/exercicios/agenda/Pessoa.java
[Projeto Agenda]: https://github.com/thiagovasconceloos/exercicios-poo/tree/main/src/br/com/exercicios/agenda
[Projeto Elevador]: https://github.com/thiagovasconceloos/exercicios-poo/tree/main/src/br/com/exercicios/elevador
[Projeto Televisao]: https://github.com/thiagovasconceloos/exercicios-poo/tree/main/src/br/com/exercicios/televisao

# Lista de Exercícios 1 – Revisão de POO em Java
Para cada exercício crie um novo projeto ou separe as classes por pacotes (packages). Teste
todos os programas na classe principal (classe que contém o método main).
# 1. Crie uma classe para representar uma pessoa.
 <br> Com os atributos privados de nome, data de nascimento e altura. <br> Crie os métodos públicos necessários para sets e gets e também um
método para imprimir todos dados de uma pessoa.<br>  Crie um método para calcular a idade
da pessoa.

<br>   [Projeto Pessoa][Projeto Pessoa] 
# 2. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
<br> void armazenaPessoa(String nome, int idade, float altura);
<br> void removePessoa(String nome);
<br> int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
<br> void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
<br> void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
agenda.

<br> [Projeto Agenda][Projeto Agenda] 
# 3. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. 
<br> A classe deve armazenar o andar atual (térreo = 0), total de andares
no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
presentes nele.<br>  A classe deve também disponibilizar os seguintes métodos:
<br> Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
andares no prédio (os elevadores sempre começam no térreo e vazio);
<br>  Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
espaço);
<br> Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
<br> Sobe : para subir um andar (não deve subir se já estiver no último andar);
<br> Desce : para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get).



<br> [Projeto Elevador][Projeto Elevador]

# 4. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão.
<br> O controle de volume permite:
<br> aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
<br>  aumentar e diminuir o número do canal em uma unidade
<br>  trocar para um canal indicado;
<br>  consultar o valor do volume de som e o canal selecionado


<br> [Projeto Televisao][Projeto Televisao]

