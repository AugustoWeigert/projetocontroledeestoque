import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton(" Cadastrar Clientes");
		btnNewButton.setBounds(89, 69, 156, 69);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar \r\nfornecedor");
		btnNewButton_1.setBounds(89, 170, 156, 69);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cadastrar Usu\u00E1rio");
		btnNewButton_2.setBounds(89, 270, 156, 69);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Consultar Clientes");
		btnNewButton_3.setBounds(324, 69, 166, 69);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Consultar Fornecedor");
		btnNewButton_4.setBounds(324, 170, 166, 69);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Consultar Estoque");
		btnNewButton_5.setBounds(324, 270, 166, 69);
		contentPane.add(btnNewButton_5);
	}

}
