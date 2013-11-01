import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;


public class Usuario extends JFrame {

	private JPanel contentPane;
	private JTextField cpUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
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
	public Usuario() {
		setForeground(new Color(212, 208, 200));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Usuario.class.getResource("/sun/print/resources/duplex.png")));
		setTitle("Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setFont(new Font("Arial", Font.BOLD, 20));
		lblUsurio.setBounds(128, 26, 111, 14);
		contentPane.add(lblUsurio);
		
		JLabel cpUsuario_1 = new JLabel("Usu\u00E1rio");
		cpUsuario_1.setFont(new Font("Arial", Font.BOLD, 14));
		cpUsuario_1.setBounds(68, 95, 66, 16);
		contentPane.add(cpUsuario_1);
		
		JLabel cpSenha = new JLabel("Senha");
		cpSenha.setFont(new Font("Arial", Font.BOLD, 14));
		cpSenha.setBounds(68, 136, 46, 14);
		contentPane.add(cpSenha);
		
		cpUsuario = new JTextField();
		cpUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		cpUsuario.setBounds(144, 94, 95, 20);
		contentPane.add(cpUsuario);
		cpUsuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 134, 95, 20);
		contentPane.add(passwordField);
		
		JButton btnConectar = new JButton("Login");
		btnConectar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnConectar.setBounds(105, 185, 91, 23);
		contentPane.add(btnConectar);
	}
}
