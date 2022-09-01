package br.senai.sp.jandira.model;

public class Tabuada {

	public double multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	public double produto = 0;

	// definindo o tamanho do vetor
	public String[] resultado = new String[minMultiplicador + 1];

	// definindo a quantidade de repetições
	// public String[] tabuada = new String[minMaxSubtracao];

	public String[] getCalcular() {
		 
		while (minMultiplicador <= maxMultiplicador) {
			produto = multiplicando * minMultiplicador;
			resultado[minMultiplicador] = multiplicando + " X " + minMultiplicador + " = " + produto;
			minMultiplicador++;
		}
		
		return resultado;

	}
}