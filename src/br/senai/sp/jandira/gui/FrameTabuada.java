package br.senai.sp.jandira.gui;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	public Font fonteDoTitulo;
	public Color corDoTitulo;
	public Color corDeFundoDeTela;
	public Font fonteDosLabels;
	public Color corDaFonteLabels;
	public Color corDoBotao;
	public Color corDoTextoBotao;
	
	
	public void criarTela() {
		JFrame tela = new JFrame();
		
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDeTela);
		

		
		
		JTextField textNome = new JTextField();
		textNome.setBounds(30, 110, 150, 30);
		
		
		
		
		
		
		
		
		
		
		
		
		
		tela.setVisible(true);

		
	}
	


}
