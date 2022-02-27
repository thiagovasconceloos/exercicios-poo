package br.com.exercicios.televisao;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago Vasconcelos
 */
public class ControleRemoto extends Televisao  {

	
	
	
	
	
	
	 public void aumentarVolume() {
		 
		if (this.volumeAtual <10) {
			 
			this.volumeAtual ++;
			
		} else {
			System.out.println("Volume está no maximo");
		}
		}
	 
	 
	 
	 public  void reduzirVolume() {
		 
		if(this.volumeAtual > 0) {
			this.volumeAtual  --;
			
		} else {
				
			System.out.println("Volume está no mudo");
		}
	
	 }
	
	

	 public void aumentarCanal() {
		 
		if(this.canalAtual<  10) {
			this.canalAtual ++ ;
			
		} else {
			
			System.out.println("Não há canais disponiveis");
		}
		 
		
	 } 
	
	 
	 public void reduzirCanal() {
		 
		if(this.canalAtual> 0) {
			this.canalAtual --;
			
		} else {
				
			System.out.println("Não há canais disponiveis");
		}
		 
			
	 }

	 public void mostrarInfo() {
		 
		 System.out.println(canalAtual);
		 System.out.println(volumeAtual);
		 
	 }
	 
	 
	 
	 public void trocardeCanal(Integer canal) {
		 
		 this.canalAtual = canal;
		 
	 }
	 
	
}
