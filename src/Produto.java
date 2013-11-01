import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;


public class Produto extends JFrame {

	private JPanel contentPane;
	private JTextField cpCodigo;
	private JTextField cpDescricao;
	private JTextField cp_Fornecedor;
	private JTextField cpPreco;
	private JTextField cpEstoqueMinimo;
	private JTextField cpEstoqueMaximo;
	private JTextField cpQntAtualEstoque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produto frame = new Produto();
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
	public Produto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Augustos\\workspace\\CONTROLE DE ESTOQUE\\src\\roupa.jpg"));
		setForeground(Color.WHITE);
		setFont(null);
		setTitle("Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Codigo = new JLabel("C\u00F3digo");
		Codigo.setFont(new Font("Arial", Font.PLAIN, 13));
		Codigo.setBounds(10, 110, 46, 20);
		contentPane.add(Codigo);
		
		cpCodigo = new JTextField();
		cpCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cpCodigo.setBounds(153, 111, 59, 20);
		contentPane.add(cpCodigo);
		cpCodigo.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(10, 143, 46, -2);
		contentPane.add(lblDescrio);
		
		cpDescricao = new JTextField();
		cpDescricao.setBounds(152, 142, 371, 20);
		contentPane.add(cpDescricao);
		cpDescricao.setColumns(10);
		
		JLabel cpFornecedor = new JLabel("Fornecedor");
		cpFornecedor.setFont(new Font("Arial", Font.PLAIN, 13));
		cpFornecedor.setBounds(10, 176, 86, 14);
		contentPane.add(cpFornecedor);
		
		cp_Fornecedor = new JTextField();
		cp_Fornecedor.setBounds(152, 174, 371, 20);
		contentPane.add(cp_Fornecedor);
		cp_Fornecedor.setColumns(10);
		
		JLabel cpPreço = new JLabel("Pre\u00E7o");
		cpPreço.setFont(new Font("Arial", Font.PLAIN, 13));
		cpPreço.setBounds(10, 201, 46, 14);
		contentPane.add(cpPreço);
		
		cpPreco = new JTextField();
		cpPreco.setBounds(152, 199, 86, 20);
		contentPane.add(cpPreco);
		cpPreco.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Produtos");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(259, 41, 124, 14);
		contentPane.add(lblNewLabel);
		
		JLabel cp_EstoqueMinimo = new JLabel("Estoque minimo");
		cp_EstoqueMinimo.setFont(new Font("Arial", Font.PLAIN, 13));
		cp_EstoqueMinimo.setBounds(10, 226, 94, 14);
		contentPane.add(cp_EstoqueMinimo);
		
		cpEstoqueMinimo = new JTextField();
		cpEstoqueMinimo.setBounds(152, 224, 86, 20);
		contentPane.add(cpEstoqueMinimo);
		cpEstoqueMinimo.setColumns(10);
		
		JLabel cp_EstoqueMaximo = new JLabel("Estoque M\u00E1ximo");
		cp_EstoqueMaximo.setFont(new Font("Arial", Font.PLAIN, 13));
		cp_EstoqueMaximo.setBounds(10, 252, 98, 14);
		contentPane.add(cp_EstoqueMaximo);
		
		JLabel cpDescrição = new JLabel("Descri\u00E7\u00E3o");
		cpDescrição.setFont(new Font("Arial", Font.PLAIN, 13));
		cpDescrição.setBounds(10, 151, 74, 14);
		contentPane.add(cpDescrição);
		
		cpEstoqueMaximo = new JTextField();
		cpEstoqueMaximo.setBounds(152, 250, 86, 20);
		contentPane.add(cpEstoqueMaximo);
		cpEstoqueMaximo.setColumns(10);
		
		JButton btnNovoProduto = new JButton("Novo Produto");
		btnNovoProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cpCodigo.setText("");
				cpDescricao.setText("");
				cp_Fornecedor.setText("");
				cpPreco.setText("");
				cpEstoqueMinimo.setText("");
				cpEstoqueMaximo.setText("");
				cpQntAtualEstoque.setText("");
				}
		});
		btnNovoProduto.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNovoProduto.setBounds(10, 333, 134, 43);
		contentPane.add(btnNovoProduto);
		
		
		JButton btnSalvarProduto = new JButton("Salvar Produto");
		btnSalvarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cpCodigo.setText("");
				cpDescricao.setText("");
				cp_Fornecedor.setText("");
				cpPreco.setText("");
				cpEstoqueMinimo.setText("");
				cpEstoqueMaximo.setText("");
                cpQntAtualEstoque.setText("");
			}
		});
		btnSalvarProduto.setFont(new Font("Arial", Font.PLAIN, 13));
		btnSalvarProduto.setBounds(166, 333, 124, 43);
		contentPane.add(btnSalvarProduto);
		
		JButton btnRemoverProdruto = new JButton("Remover Prodruto");
		btnRemoverProdruto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cpCodigo.setText("");
				cpDescricao.setText("");
				cp_Fornecedor.setText("");
				cpPreco.setText("");
				cpEstoqueMinimo.setText("");
				cpEstoqueMaximo.setText("");
                cpQntAtualEstoque.setText("");
			}
		});
		btnRemoverProdruto.setFont(new Font("Arial", Font.PLAIN, 13));
		btnRemoverProdruto.setBounds(317, 333, 141, 43);
		contentPane.add(btnRemoverProdruto);
		
		JButton btnAtualizarProduto = new JButton("Atualizar Produto");
		btnAtualizarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cpCodigo.setText("");
				cpDescricao.setText("");
				cp_Fornecedor.setText("");
				cpPreco.setText("");
				cpEstoqueMinimo.setText("");
				cpEstoqueMaximo.setText("");
				cpQntAtualEstoque.setText("");
			}
		});
		btnAtualizarProduto.setFont(new Font("Arial", Font.PLAIN, 13));
		btnAtualizarProduto.setBounds(487, 333, 143, 44);
		contentPane.add(btnAtualizarProduto);
		
		JRadioButton btnProdutoAtivo = new JRadioButton("Produto Ativo");
		btnProdutoAtivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cpCodigo.setText("");
				cpDescricao.setText("");
				cp_Fornecedor.setText("");
				cpPreco.setText("");
				cpEstoqueMinimo.setText("");
				cpEstoqueMaximo.setText("");
                cpQntAtualEstoque.setText("");
			}
		});
		btnProdutoAtivo.setFont(new Font("Arial", Font.PLAIN, 13));
		btnProdutoAtivo.setBounds(336, 249, 122, 21);
		contentPane.add(btnProdutoAtivo);
		
		JLabel cp_QntAtualNo = new JLabel("Qnt Atual no Estoque");
		cp_QntAtualNo.setFont(new Font("Arial", Font.PLAIN, 13));
		cp_QntAtualNo.setBounds(10, 278, 132, 14);
		contentPane.add(cp_QntAtualNo);
		
		cpQntAtualEstoque = new JTextField();
		cpQntAtualEstoque.setBounds(152, 275, 86, 20);
		contentPane.add(cpQntAtualEstoque);
		cpQntAtualEstoque.setColumns(10);
	}
}
