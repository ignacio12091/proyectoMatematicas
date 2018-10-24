package main.java;

public class Calculadora {
	public Calculadora() {
	}

	public double factorial(double z) {
		double num = z;
		double factorial = 1;
		while (num != 0) {
			factorial = factorial * num;
			num--;
		}
		return factorial;
	}
	
	public double combinatoria (double m, double n) {
		double mFact = factorial(m);
		double nFact = factorial(n);
		double z = m-n;
		double mnFact = factorial(z);
		double resultado = mFact / (mnFact * nFact);
		return resultado;
	}
	
	public double probabilidad (double mTotales, double nTotales, double mFavorables) {
		double casosPosibles = combinatoria(mTotales, nTotales);
		double casosFavorables = combinatoria(mFavorables, 1);
		double a = mTotales - mFavorables;
		double b = nTotales - 1;
		double casosRestantes = combinatoria(a, b);
		double resultado = (casosFavorables * casosRestantes) / casosPosibles;
		return resultado;
	}
}
