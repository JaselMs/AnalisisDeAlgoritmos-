package fes.aragon.dinamica.arbolbinario.arreglo;

public class ArbolBinarioArreglo<E> {
	private Nodo[] arreglo;
	private int contador;
	public ArbolBinarioArreglo(int longitud) {
		arreglo = new Nodo[longitud];
		contador=0;
	}
	public void insertar(E dato, Integer izq, Integer der) throws Exception {
		if(contador<arreglo.length) {
		Nodo<E> info = new Nodo<E>(dato,izq,der);
		arreglo[contador]=info;
		contador++;
		}else {
			throw new Exception("no se puede agregar mas nodos al arbol binario");
		}
	}
	
	public void valorNodos() {
for (int i = 0; i < arreglo.length; i++) {
			
			
			if(arreglo[i].getDato()!= null) {
			System.out.println(arreglo[i].getDato());
			
			
			if(arreglo[i].getIzquierdo()!=null) {
				System.out.println("hijo izq: " + arreglo[arreglo[i].getIzquierdo()].getDato());
			}else {
				System.out.println("No tiene hijo izquierdo");
				
			}
			
			if(arreglo[i].getDerecho()!=null) {
			System.out.println("hijo der: " +arreglo[arreglo[i].getDerecho()].getDato());
		}else {
			System.out.println("No tiene hijo derecho");
			
		}
			}
		}
	}
}
