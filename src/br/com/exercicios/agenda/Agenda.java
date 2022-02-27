package br.com.exercicios.agenda;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago Vasconcelos
 */

import java.util.ArrayList;
import java.util.List;

public class Agenda {
   
	private List<Pessoa> listadePessoas = new ArrayList<Pessoa>();

	
	

	
	

	public void adicionaPessoas(Pessoa pessoa) {
		
		 this.listadePessoas.add(pessoa);
	}
	

	public void listarContatos() {
    	listadePessoas.stream()
		  .forEach(c-> System.out.println(c));      
    	
    }
	
	
	public void removerContato(String nome) {
        for (int i = 0; i < listadePessoas.size(); i++) {
            Pessoa pessoa = listadePessoas.get(i);
                if (pessoa.getNome().equalsIgnoreCase(nome)) {
            	listadePessoas.remove(pessoa);
                System.out.println("Contato removido");
                
            } 
        }
        System.out.println("Nao encontrado");

    }
	
	
	
	public int   buscarContato(String nome) {
		int auxiliar = 0;
		
	      for (int i = 0; i < listadePessoas.size(); i++) {
	            Pessoa pessoa = listadePessoas.get(i);
	                if (pessoa.getNome().equalsIgnoreCase(nome)) {
	                	auxiliar = listadePessoas.indexOf(pessoa);
	                
	                return auxiliar;
	            } 
	        }
	        System.out.println("Nao encontrado");
	        return auxiliar;
	    }
		
	
	
        
        
        
		
        
    
	
	public void mostraContato(int j) {
		 
		 
	        	Pessoa pessoa = listadePessoas.get(j);
	             System.out.println(pessoa.getNome());
	            }
		
    	
    }
	
	

