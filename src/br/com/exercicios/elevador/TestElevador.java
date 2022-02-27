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


public class TestElevador {

	public static void main(String[] args) {
	
		
		
        Pessoa pessoa = new Pessoa();
		 
		 pessoa.setNome("Thiago");
		 pessoa.setAltura("1,69");
		 pessoa.setDataNascimento(LocalDate.of(1995, 8, 27));
		 pessoa.idadePessoa();
		
		   Pessoa pessoa1 = new Pessoa();
			 
		   	pessoa1.setNome("Alexandre");
			pessoa1.setAltura("1,69");
			pessoa1.setDataNascimento(LocalDate.of(1995, 8, 27));
			pessoa1.idadePessoa();
			
		  Elevador elevador1 = new Elevador(1,1);
		  
		  
		  elevador1.adicionaPessoas(pessoa);
		  elevador1.adicionaPessoas(pessoa1);
		  
		  elevador1.sobeAndar();
		  elevador1.sobeAndar();
		  elevador1.sobeAndar();
		  elevador1.desceAndar();
		  
		  
		  
		  
		

	}

}
