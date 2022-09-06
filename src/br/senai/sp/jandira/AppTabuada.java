package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tabuada tabuada = new Tabuada();

		tabuada.multiplicado = 139;
		tabuada.minMultiplicador = 120;
		tabuada.maxMultiplicador = 1000;

		String[] resultado = tabuada.getTabuada();

		int contador = 0;
		
		while (contador < resultado.length) {
			System.out.println(resultado[contador]);
			contador++;
		
		}
		

		FrameTabuada tela = new FrameTabuada();
		
		tela.altura = 700;
		tela.largura = 500;
		
		
		tela.criarTela();
		
		
		
		
		
		
		
		

	}

}
