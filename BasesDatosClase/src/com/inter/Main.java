package com.inter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Main extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 431);
		getContentPane();
		getContentPane().setLayout(new MigLayout("", "[][118.00,grow][107.00][206.00,grow]", "[][][][][][]"));
		
		JLabel lblUsuario = new JLabel("Usuario");
		getContentPane().add(lblUsuario, "cell 1 4,alignx center,aligny center");
		
		JLabel lblPass = new JLabel("Pass");
		getContentPane().add(lblPass, "cell 2 4,alignx center");
		
		textField_1 = new JTextField();
		getContentPane().add(textField_1, "cell 1 5,growx");
		textField_1.setColumns(10);
		
		textField = new JTextField();
		getContentPane().add(textField, "cell 2 5,growx");
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		getContentPane().add(btnLogin, "cell 3 5");
	}

}
