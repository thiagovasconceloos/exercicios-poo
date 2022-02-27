package br.com.exercicios.televisao;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago Vasconcelos
 */
public class TestTelevisao {

	public static void main(String[] args) {
	  Televisao tv = new Televisao();
	  
	  ControleRemoto contrl  = new ControleRemoto();
	   
	  contrl.setCanalAtual(9);
	  contrl.setVolumeAtual(9);
	 
      contrl.aumentarVolume();
      contrl.aumentarCanal();
	  contrl.mostrarInfo();
	  
	 
		
		
		
		
	}
	
	
}


