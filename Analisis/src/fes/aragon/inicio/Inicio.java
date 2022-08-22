package fes.aragon.inicio;

import fes.aragon.dinamica.arbolbinario.arreglo.ArbolBinarioArreglo;

public class Inicio {
	public static void main(String[] args) {
		ArbolBinarioArreglo<Integer> arb = new ArbolBinarioArreglo<>(11);
		try {
			arb.insertar(20, 1, 2);
			
			arb.insertar(19, 3, 4);
			arb.insertar(23, 5, 6);
			
			arb.insertar(67, 7, null); //izq de 19
			arb.insertar(null, null, null); //der de 19
			
			arb.insertar(57, null, null); //izq de 23
			arb.insertar(null, null, null); // der de 23
			
			arb.insertar(99, null, null); //izq de67 
			arb.insertar(null, null, null);
			
			arb.insertar(null, null, null);
			arb.insertar(null, null, null);
			
			
			arb.valorNodos();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}