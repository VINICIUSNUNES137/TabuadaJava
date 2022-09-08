package br.senai.sp.jandira.model;

public class Tabuada {

	public int multiplicado;
	public int minMultiplicador;
	public int maxMultiplicador;

	public String[] getTabuada() {

		int tamanho = maxMultiplicador - minMultiplicador + 1;

		String tabuada[] = new String[tamanho];
		int contador = 0;

		while (contador < tamanho) {
			int produto = multiplicado * minMultiplicador;
			String resultado = multiplicado + " X " + minMultiplicador + " = " + produto;
			tabuada[contador] = resultado;

			contador++;
			minMultiplicador++;
		}
		return tabuada;
	}

}
