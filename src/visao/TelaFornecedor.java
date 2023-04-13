package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;

public class TelaFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeEmpresa;
	private JTextField txtCPF;
	private JTextField txtCNPJ;
	private JTextField txtTelefone;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
	public TelaFornecedor() {
		setTitle("Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 715);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(159, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane
				.setLayout(new MigLayout("", "[84.00px,grow][148px][250px][83px][250px][150px,grow][11.00][148.00px]",
						"[][28px][31px][][23px][25px][23px][23px][23px][25px][][334px,grow]"));

		JLabel lblNomeEmpresa = new JLabel("Nome da empresa:");
		lblNomeEmpresa.setForeground(new Color(255, 255, 255));
		lblNomeEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNomeEmpresa, "cell 1 1,alignx right,growy");

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setForeground(new Color(255, 255, 255));
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblCpf, "cell 3 1,alignx right,growy");

		txtNomeEmpresa = new JTextField();
		contentPane.add(txtNomeEmpresa, "cell 2 1,growx,aligny center");
		txtNomeEmpresa.setColumns(10);

		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		contentPane.add(txtCPF, "cell 4 1,growx,aligny center");

		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setForeground(new Color(255, 255, 255));
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblCnpj, "cell 1 2,alignx right,growy");

		txtCNPJ = new JTextField();
		txtCNPJ.setColumns(10);
		contentPane.add(txtCNPJ, "cell 2 2,growx,aligny center");

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(new Color(255, 255, 255));
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblTelefone, "cell 3 2,alignx right,growy");

		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		contentPane.add(txtTelefone, "cell 4 2,growx,aligny center");

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(230, 224, 0));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnCadastrar, "cell 7 4,growx,aligny top");

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(new Color(230, 224, 0));
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnAtualizar, "cell 7 6,growx,aligny top");

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(new Color(230, 224, 0));
		contentPane.add(btnExcluir, "cell 7 8,growx,aligny top");

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, "cell 0 4 6 8,grow");
		panel.setLayout(new MigLayout("", "[145.00px,grow]", "[82.00px,grow]"));

		table = new JTable();
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
		new String[] { "Nome da Empresa", "CNPJ", "CPF", "Telefone" });
		table.setModel(new DefaultTableModel(new Object[][] {},
		new String[] { "Nome da Empresa", "CNPJ", "CPF", "Telefone" }));
		panel.add(table, "cell 0 0,grow");

		JButton btnListar = new JButton("Listar");
		btnListar.setBackground(new Color(230, 224, 0));
		contentPane.add(btnListar, "cell 7 10,growx,aligny top");
	}
}
