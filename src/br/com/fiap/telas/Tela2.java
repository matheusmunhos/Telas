package br.com.fiap.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollBar;

public class Tela2 {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 window = new Tela2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 682, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JFormattedTextField frmtdtxtfldEmail = new JFormattedTextField();
		frmtdtxtfldEmail.setText("E-MAIL");
		frmtdtxtfldEmail.setBounds(213, 214, 239, 20);
		frame.getContentPane().add(frmtdtxtfldEmail);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("SENHA");
		passwordField.setBounds(213, 257, 239, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setToolTipText("");
		btnNewButton.setBounds(267, 288, 137, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCadastrese = new JButton("Cadastre-se");
		btnCadastrese.setToolTipText("");
		btnCadastrese.setBounds(267, 365, 137, 23);
		frame.getContentPane().add(btnCadastrese);
		
		JButton btnEsqueciASenha = new JButton("Esqueci a senha");
		btnEsqueciASenha.setToolTipText("");
		btnEsqueciASenha.setBounds(267, 322, 137, 23);
		frame.getContentPane().add(btnEsqueciASenha);
	}
}
