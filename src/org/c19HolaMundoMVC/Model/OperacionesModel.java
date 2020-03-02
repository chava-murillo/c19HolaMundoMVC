package org.c19HolaMundoMVC.Model;

public class OperacionesModel {
	
	protected int numero1;
	protected int numero2;

	public OperacionesModel() {
		// TODO Auto-generated constructor stub
	}
	
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public int getNumero1() {
		return numero1;
	}
	
	public int getNumero2() {
		return numero2;
	}
	
	public int sumita() {
		return(this.numero1 + this.numero2);
	}
	
	public int resta() {
		return(this.numero1 - this.numero2);
	}
}

