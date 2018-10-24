package main.java;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.combinatoria(1, 1));
		System.out.println(calculadora.combinatoria(29, 24));
		System.out.println(calculadora.combinatoria(30, 25));
		
		System.out.println(calculadora.probabilidad(30, 25, 1));
		
	}

}
