package com.inter;


import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import net.miginfocom.swing.MigLayout;

import com.jpa.Consult;
import com.jpa.Usuario;

@SuppressWarnings("serial")
public class Admin extends JFrame {
	
	JTextPane textPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	public Admin() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 479);
		
		getContentPane().setLayout(new MigLayout("", "[301.00,grow][248.00,grow]", "[421.00,grow][41.00]"));
		
		JButton btnMostrarBbdd = new JButton("Mostrar BBDD");
		btnMostrarBbdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Consult bd = new Consult();
				PaintBD(bd.getBBDD());
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, "cell 0 0,grow");
		
		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "cell 1 0,grow");
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{83, 95, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblDni = new JLabel("DNI");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 0;
		gbc_lblDni.gridy = 0;
		panel.add(lblDni, gbc_lblDni);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 1;
		panel.add(lblNombre, gbc_lblNombre);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMail = new JLabel("Mail");
		GridBagConstraints gbc_lblMail = new GridBagConstraints();
		gbc_lblMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblMail.gridx = 0;
		gbc_lblMail.gridy = 2;
		panel.add(lblMail, gbc_lblMail);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.WEST;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Contrasena");
		GridBagConstraints gbc_lblContrasena = new GridBagConstraints();
		gbc_lblContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasena.gridx = 0;
		gbc_lblContrasena.gridy = 3;
		panel.add(lblContrasena, gbc_lblContrasena);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.anchor = GridBagConstraints.WEST;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JButton btnMeterUsuario = new JButton("Meter usuario");
		btnMeterUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Consult bd = new Consult();
				addUser(bd);
			}
		});
		GridBagConstraints gbc_btnMeterUsuario = new GridBagConstraints();
		gbc_btnMeterUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_btnMeterUsuario.anchor = GridBagConstraints.WEST;
		gbc_btnMeterUsuario.gridx = 1;
		gbc_btnMeterUsuario.gridy = 4;
		panel.add(btnMeterUsuario, gbc_btnMeterUsuario);
		
		JLabel lblDni_1 = new JLabel("DNI");
		GridBagConstraints gbc_lblDni_1 = new GridBagConstraints();
		gbc_lblDni_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblDni_1.gridx = 0;
		gbc_lblDni_1.gridy = 6;
		panel.add(lblDni_1, gbc_lblDni_1);
		getContentPane().add(btnMostrarBbdd, "cell 0 1,alignx center");
	}
	
	public void PaintBD(List<Usuario> list){
		textPane.setText("");
		paintPanel("¡Bienvenido!");
		
		paintPanel("\n");
		
		paintPanel("Este es el conenido de la BBDD ");
		
		paintPanel("\n");
		
		for(int i = 0; i<list.size();i++) {
			
		
		paintPanel("Miembro Nº"+i);
		paintPanel(String.valueOf(list.get(i).getDni()));
		paintPanel(list.get(i).getNombre_usuario());
		paintPanel(list.get(i).getMail());
		paintPanel("\n");
		
		}
		
	}
	
	public void paintPanel(String s){
		
		textPane.setText(textPane.getText() + "\n" + s);
	}
	
	public void addUser(Consult bd){
		
		bd.setUser(Integer.valueOf(textField.getText()), textField_1.getText(), textField_2.getText(), textField_3.getText());
		
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
	}
}
