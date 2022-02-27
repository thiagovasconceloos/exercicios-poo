package br.com.exercicios.agenda;

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

public class TestPessoa {

	
	public static void main(String[] args) {
		
		
		 Pessoa pessoa = new Pessoa();
		 
		 pessoa.setNome("Thiago");
		 pessoa.setAltura("1,69");
		 pessoa.setDataNascimento(LocalDate.of(1995, 8, 27));
		 pessoa.idadePessoa();
		 
		 Pessoa pessoa2 = new Pessoa();
		 
		 pessoa2.setNome("Alexandre");
		 pessoa2.setAltura("1,69");
		 pessoa2.setDataNascimento(LocalDate.of(1995, 8, 27));
		 pessoa2.idadePessoa();
		 
		
		 
		  Agenda agenda = new Agenda();
		  
		  
		  
		  agenda.adicionaPessoas(pessoa);
		  agenda.adicionaPessoas(pessoa2);
		  agenda.listarContatos();
		  
	
	     
		  System.out.println(agenda.buscarContato("Alexandre"));
		  
		
		  agenda.listarContatos();

		
	}
	
	
	
	
}
