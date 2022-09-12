package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {

	public static void main(String[] args) {

		FrameTabuada tela = new FrameTabuada();

		tela.altura = 710;
		tela.largura = 400;
		tela.titulo = "Tabuada";
		tela.corDeFundoDeTela = new Color(255, 255, 255);

		// título
		tela.corDoTitulo = new Color(255, 20, 0);
		tela.fonteDoTitulo = new Font("Montserrat", Font.BOLD, 24);
		// descrição
		tela.corDaDescricao = new Color(180, 180, 180);
		tela.fonteDaDescricao = new Font("Montserrat", Font.PLAIN, 12);
		//text
		tela.corDosTexts = new Color(255, 20, 30);
		// labels
		tela.corDaFonteLabels = new Color(100, 100, 100);
		tela.fonteDosLabels = new Font("Montserrat", Font.BOLD, 16);
		// botãoCalcular
		tela.corDoBotaoCalcular = new Color(112, 173, 71);
		tela.fonteDosBotões = new Font("Montserrat", Font.BOLD, 16);
		tela.corDoTextoBotaoCalcular = new Color(255, 255, 255);
		// botãoLimpar
		tela.corDoBotaoLimpar = new Color(255, 192, 0);
		tela.corDoTextoBotaoLimpar = new Color(255, 255, 255);
		// jlist
		tela.corFundoDaTabuada = new Color(230, 230, 230);
		tela.corDoFundoDaTabuada = new Color(49, 170, 120);

		tela.criarTela();

	}

}
