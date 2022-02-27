package br.com.exercicios.elevador;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago Vasconcelos
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

//	Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
//	nascimento e altura. Crie os m�todos p�blicos necess�rios para sets e gets e tamb�m um
//	m�todo para imprimir todos dados de uma pessoa. Crie um m�todo para calcular a idade
//	da pessoa.
	
	
	  private String nome;
	  private LocalDate dataNascimento;
	  private String altura;
	  private Integer idade;
	  
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	  
	
	
	
	 @Override
	public String toString() {
		return "Meu nome � " + nome + "  Nasci em " + this.getDataNascimento() + ", tenho " + altura + " de altura e " + idade
				+ " anos de idade";
	}
	public Integer idadePessoa() {
		 
		 LocalDate hoje = LocalDate.now();
		 this.idade = hoje.getYear() - dataNascimento.getYear();
		 
		 return  this.idade;
		 
		 
	 }	 
	 
	 
	
	
}
