import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;


public class Clientes extends JFrame  {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Arial", Font.PLAIN, 18));
		lblClientes.setBounds(238, 52, 131, 14);
		contentPane.add(lblClientes);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(10, 104, 46, 14);
		contentPane.add(lblCdigo);
		
		textField = new JTextField();
		textField.setBounds(66, 101, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 137, 46, 14);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 134, 256, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 168, 57, 14);
		contentPane.add(lblEndereo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 165, 256, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(10, 200, 46, 14);
		contentPane.add(lblBairro);
		
		textField_3 = new JTextField();
		textField_3.setBounds(66, 197, 256, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cidade");
		lblNewLabel.setBounds(10, 235, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(66, 232, 163, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(276, 235, 46, 14);
		contentPane.add(lblEstado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "SC", "MA", "ES", "RJ", "SP", "PA", "PR", "RS", "RN", "MG"}));
		comboBox.setBounds(332, 231, 57, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("CEP");
		lblNewLabel_1.setBounds(10, 272, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(66, 269, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label = new JLabel("-");
		label.setBounds(158, 272, 46, 14);
		contentPane.add(label);
		
		textField_6 = new JTextField();
		textField_6.setBounds(168, 269, 66, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTele = new JLabel("Telefone");
		lblTele.setBounds(10, 308, 46, 14);
		contentPane.add(lblTele);
		
		textField_7 = new JTextField();
		textField_7.setBounds(66, 305, 138, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(264, 308, 46, 14);
		contentPane.add(lblEmail);
		
		textField_8 = new JTextField();
		textField_8.setBounds(303, 305, 143, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(10, 403, 91, 23);
		contentPane.add(btnNovo);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(124, 403, 91, 23);
		contentPane.add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(238, 403, 91, 23);
		contentPane.add(btnExcluir);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(355, 403, 91, 23);
		contentPane.add(btnAtualizar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(471, 403, 91, 23);
		contentPane.add(btnRemover);
	}
}
