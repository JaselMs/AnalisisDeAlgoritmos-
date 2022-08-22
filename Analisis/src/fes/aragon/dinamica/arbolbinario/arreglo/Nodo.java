package fes.aragon.dinamica.arbolbinario.arreglo;

import java.util.Objects;

public class Nodo<E> {
	private E dato;
	private Integer izquierdo;
	private Integer derecho;
	public Nodo(E dato) {
		this(dato, null, null);
	}
	public Nodo(E dato, Integer izquierdo, Integer derecho) {
		this.dato=dato;
		this.izquierdo=izquierdo;
		this.derecho=derecho;
	}
	public E getDato() {
		return dato;
	}
	public void setDato(E dato) {
		this.dato = dato;
	}
	public Integer getIzquierdo() {
		return izquierdo;
	}
	public void setIzquierdo(Integer izquierdo) {
		this.izquierdo = izquierdo;
	}
	public Integer getDerecho() {
		return derecho;
	}
	public void setDerecho(Integer derecho) {
		this.derecho = derecho;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dato);
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Integer && this.dato instanceof Integer) {
			Integer dato1 = (Integer) this.dato;
			Integer dato2 = (Integer)obj;
			if (dato1<dato2) {
				return true;
			}else {
				return false;
			}
		}
		
		Nodo other = (Nodo) obj;
		return Objects.equals(dato, other.dato);
	}
	
	

}
