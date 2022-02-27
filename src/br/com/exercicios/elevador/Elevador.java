package br.com.exercicios.elevador;
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





public class Elevador {
	
	private List<Pessoa> listadePessoas = new ArrayList<Pessoa>();
	private Integer capacidade;
	private Integer totalAndares;
	private Integer andarAtual;
	
	
	public Elevador(Integer capacidade,Integer totalAndares) {
		
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		this.andarAtual = 0;
		
	}
	
	
	public List<Pessoa> getListadePessoas() {
		return listadePessoas;
	}
	public void setListadePessoas(List<Pessoa> listadePessoas) {
		this.listadePessoas = listadePessoas;
	}
	public Integer getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	public Integer getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(Integer totalAndares) {
		this.totalAndares = totalAndares;
	}
	
	
	
	

	public void adicionaPessoas(Pessoa pessoa) {
		  if (listadePessoas.size() <= capacidade -1) {
		  this.listadePessoas.add(pessoa); }
		  else {
			   System.out.println("Elevador cheio");
		  }
	}
	
	
	public void removerPessoa(Pessoa pessoa) {
		
		        for (int i = 0; i < listadePessoas.size(); i++) {
	             pessoa = listadePessoas.get(i);
	             if(listadePessoas.size() > 0) {
	             
	            	listadePessoas.remove(pessoa);
	                System.out.println("Uma pessoa saiu");
	             } else {
	            	 
	            	 System.out.println("Elevador vazio");
	             }
	            
	        }
	       

	    
		
	}
	
	public void sobeAndar() {
		
	   
		if(this.andarAtual <= this.totalAndares -1) {
			
			this.andarAtual += 1;
			
			System.out.println("Você subiu um andar, seu andar atual é "+ this.andarAtual);
					 
		  
		    
		} else {
			
			System.out.println("Ultimo andar");
		}
		
		 
		
	}
	
	
		public void desceAndar() {
		
		
	   
		if(this.andarAtual > 0) {
			
			this.andarAtual -= 1;
			System.out.println("Você desceu um andar, seu andar atual é "+ this.andarAtual);
			 
		   
		} else {
			
			System.out.println("Já esta no terreo");
		}
		
		
		
	}
	
	
}
