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
import javax.swing.JRadioButton;
import java.awt.Toolkit;


public class Fornecedor extends JFrame {

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
					Fornecedor frame = new Fornecedor();
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
	public Fornecedor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Augustos\\workspace\\CONTROLE DE ESTOQUE\\src\\roupa.jpg"));
		setTitle("Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFornecedores = new JLabel("Fornecedores");
		lblFornecedores.setFont(new Font("Arial", Font.PLAIN, 18));
		lblFornecedores.setBounds(210, 30, 141, 22);
		contentPane.add(lblFornecedores);
		
		JLabel lblCdigoFornecedor = new JLabel("C\u00F3digo ");
		lblCdigoFornecedor.setBounds(10, 87, 61, 14);
		contentPane.add(lblCdigoFornecedor);
		
		textField = new JTextField();
		textField.setBounds(81, 84, 61, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 121, 46, 14);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 115, 210, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 146, 61, 14);
		contentPane.add(lblEndereo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 146, 210, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(10, 180, 46, 14);
		contentPane.add(lblBairro);
		
		textField_3 = new JTextField();
		textField_3.setBounds(81, 177, 210, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 215, 46, 14);
		contentPane.add(lblCidade);
		
		textField_4 = new JTextField();
		textField_4.setBounds(81, 208, 166, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(294, 215, 57, 14);
		contentPane.add(lblEstado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "SC", "SP", "PR", "RS", "RJ", "ES", "MA"}));
		comboBox.setBounds(342, 211, 57, 22);
		contentPane.add(comboBox);
		
		JLabel lblCpf = new JLabel("CEP");
		lblCpf.setBounds(10, 240, 46, 14);
		contentPane.add(lblCpf);
		
		textField_5 = new JTextField();
		textField_5.setBounds(81, 239, 166, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(10, 273, 46, 14);
		contentPane.add(lblCnpj);
		
		textField_6 = new JTextField();
		textField_6.setBounds(81, 270, 166, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 304, 61, 14);
		contentPane.add(lblTelefone);
		
		textField_7 = new JTextField();
		textField_7.setBounds(81, 301, 166, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 332, 46, 14);
		contentPane.add(lblEmail);
		
		textField_8 = new JTextField();
		textField_8.setBounds(81, 329, 210, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNovo = new JButton("Novo Fornecedor");
		btnNovo.setBounds(0, 420, 132, 23);
		contentPane.add(btnNovo);
		
		JButton btnSalvar = new JButton("Salvar Fornecedor");
		btnSalvar.setBounds(153, 420, 149, 23);
		contentPane.add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir fornecedor");
		btnExcluir.setBounds(313, 420, 141, 23);
		contentPane.add(btnExcluir);
		
		JButton btnAtualizar = new JButton("Atualizar Fornecedor");
		btnAtualizar.setBounds(478, 420, 152, 23);
		contentPane.add(btnAtualizar);
		
		JRadioButton rdbtnFornecedorAtivo = new JRadioButton("Fornecedor Ativo");
		rdbtnFornecedorAtivo.setBounds(117, 371, 149, 23);
		contentPane.add(rdbtnFornecedorAtivo);
	}
}
