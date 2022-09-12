package br.senai.sp.jandira.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDeTela;
	public Font fonteDoTitulo;
	public Color corDoTitulo;
	public Font fonteDaDescricao;
	public Color corDaDescricao;
	public Font fonteDosLabels;
	public Color corDaFonteLabels;
	public Color corDosTexts;
	public Color corDoFundoDosTexts;
	public Font fonteDosTexts;
	public Font fonteDosBotões;
	public Color corDoBotaoCalcular;
	public Color corDoTextoBotaoCalcular;
	public Color corDoBotaoLimpar;
	public Color corDoTextoBotaoLimpar;
	public Color corFundoDaTabuada;
	public Color corDoFundoDaTabuada;
	public int codigoDoTexto;

	public void criarTela() {
		JFrame tela = new JFrame();

		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDeTela);

		JLabel labelNome = new JLabel();
		labelNome.setText("Tabuada 1.0");
		labelNome.setBounds(70, 10, 200, 50);
		labelNome.setFont(fonteDoTitulo);
		labelNome.setForeground(corDoTitulo);

		JLabel labelDescricao1 = new JLabel();
		labelDescricao1.setText("Com a tabuada 1.0 os seus problemas acabaram, ");
		labelDescricao1.setBounds(73, 30, 350, 50);
		labelDescricao1.setFont(fonteDaDescricao);
		labelDescricao1.setForeground(corDaDescricao);

		JLabel labelDescricao2 = new JLabel();
		labelDescricao2.setText("calcule a tabuada que desejar em segundos!");
		labelDescricao2.setBounds(73, 45, 350, 50);
		labelDescricao2.setFont(fonteDaDescricao);
		labelDescricao2.setForeground(corDaDescricao);

		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(87, 100, 350, 50);
		labelMultiplicando.setFont(fonteDosLabels);
		labelMultiplicando.setForeground(corDaFonteLabels);

		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(200, 105, 150, 40);
		textMultiplicando.setFont(fonteDosTexts);
		textMultiplicando.setForeground(corDosTexts);
		textMultiplicando.setBackground(corDoFundoDosTexts);

		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Minímo Multiplicador:");
		labelMinMultiplicador.setBounds(30, 150, 350, 50);
		labelMinMultiplicador.setFont(fonteDosLabels);
		labelMinMultiplicador.setForeground(corDaFonteLabels);

		JTextField textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(200, 155, 150, 40);
		textMinMultiplicador.setFont(fonteDosTexts);
		textMinMultiplicador.setForeground(corDosTexts);
		textMinMultiplicador.setBackground(corDoFundoDosTexts);

		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador:");
		labelMaxMultiplicador.setBounds(27, 200, 350, 50);
		labelMaxMultiplicador.setFont(fonteDosLabels);
		labelMaxMultiplicador.setForeground(corDaFonteLabels);

		JTextField textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(200, 205, 150, 40);
		textMaxMultiplicador.setFont(fonteDosTexts);
		textMaxMultiplicador.setForeground(corDosTexts);
		textMaxMultiplicador.setBackground(corDoFundoDosTexts);

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("CALCULAR");
		buttonCalcular.setBounds(30, 300, 200, 40);
		buttonCalcular.setFont(fonteDosBotões);
		buttonCalcular.setForeground(corDoTextoBotaoCalcular);
		buttonCalcular.setBackground(corDoBotaoCalcular);

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("LIMPAR");
		buttonLimpar.setBounds(250, 300, 100, 40);
		buttonLimpar.setFont(fonteDosBotões);
		buttonLimpar.setForeground(corDoTextoBotaoLimpar);
		buttonLimpar.setBackground(corDoBotaoLimpar);

		JLabel labelResultado = new JLabel();
		labelResultado.setText("RESULTADO:");
		labelResultado.setBounds(10, 280, 365, 200);
		labelResultado.setFont(fonteDosLabels);
		labelResultado.setForeground(corDaFonteLabels);

		JLabel labelCopyright = new JLabel();
		labelCopyright.setText("Copyright by: Vinicius Nunes | 2022");
		labelCopyright.setBounds(90, 640, 360, 40);
		labelCopyright.setFont(fonteDosTexts);
		labelCopyright.setForeground(corDaFonteLabels);

		JList<String> lista = new JList<String>();
		JScrollPane scroll = new JScrollPane(lista);
		scroll.setVisible(false);

		scroll.setBounds(10, 400, 365, 250);
		lista.setBackground(corFundoDaTabuada);
		lista.setForeground(corDoFundoDaTabuada);

		// adicionando imagem/icone
		ImageIcon imagem = new ImageIcon(getClass().getResource("lapis-de-cor.png"));
		JLabel labelImagem = new JLabel(imagem);

		labelImagem.setBounds(10, 30, 50, 50);

		buttonCalcular.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				lista.setBackground(corFundoDaTabuada);
				lista.setForeground(corDoFundoDaTabuada);

				Tabuada tabuada = new Tabuada();

				tabuada.multiplicado = Integer.parseInt(textMultiplicando.getText());
				tabuada.minMultiplicador = Integer.parseInt(textMinMultiplicador.getText());
				tabuada.maxMultiplicador = Integer.parseInt(textMaxMultiplicador.getText());

				String[] resultado = tabuada.getTabuada();
				lista.setListData(resultado);
				scroll.setVisible(true);

			}

		});

		buttonLimpar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// lista.setForeground(corFundoDaTabuada);
				textMultiplicando.setText("");
				textMaxMultiplicador.setText("");
				textMinMultiplicador.setText("");
				scroll.setVisible(false);

			}
		});

		textMultiplicando.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				codigoDoTexto = e.getKeyCode();

				// System.out.println("teste");

				textMultiplicando.setText(textMultiplicando.getText().replaceAll("[^0-9]", ""));

			}

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == 10) {
					textMinMultiplicador.requestFocus();

				}
			}
		});

		textMinMultiplicador.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				codigoDoTexto = e.getKeyCode();

				// System.out.println("teste");

				textMinMultiplicador.setText(textMinMultiplicador.getText().replaceAll("[^0-9]", ""));

			}

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == 10) {
					textMaxMultiplicador.requestFocus();

				}
			}
		});

		textMaxMultiplicador.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				codigoDoTexto = e.getKeyCode();

				// System.out.println("teste");

				textMaxMultiplicador.setText(textMaxMultiplicador.getText().replaceAll("[^0-9]", ""));

			}

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == 10) {
					buttonCalcular.requestFocus();

				}
			}
		});

		buttonCalcular.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == 10) {
					buttonLimpar.requestFocus();

				}

			}

		});

		buttonLimpar.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

				if (e.getKeyCode() == 10) {
					textMultiplicando.requestFocus();
				}
			}
		});

		// adicionando ao painel
		painel.add(labelNome);
		painel.add(labelDescricao1);
		painel.add(labelDescricao2);
		painel.add(labelMultiplicando);
		painel.add(textMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(textMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textMaxMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		painel.add(labelImagem);
		painel.add(labelCopyright);

		tela.setVisible(true);

	}

}
