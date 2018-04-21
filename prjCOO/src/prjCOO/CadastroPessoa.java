package prjCOO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

public class CadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JTextField fieldEndereco;
	private JTextField fieldCidade;
	private JTextField fieldComplemento;
	private JFormattedTextField fieldCep;
	private JFormattedTextField fieldCnpj;
	private JFormattedTextField fieldCpf;
	private JPasswordField fieldSenha;
	private JLabel lblNome;
	protected JLabel lblCnpj;
	private JLabel lblEndereo;
	private JLabel lblCidade;
	private JLabel lblEstado;
	private JLabel lblCep;
	private JLabel lblComplemento;
	private JLabel lblSenha;
	protected JLabel lblCpf;
	private JLabel lblCargo;
	private JComboBox cbxEstado;
	private JComboBox cbxCargo;
	private JButton btnConfirmar;
	private JButton btnCancelar;
	private JButton btnCliente;
	private JButton btnFuncionario;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCliente frame = new CadastrarCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public CadastroPessoa() throws ParseException {
		setTitle("Cadastro");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		String[] estados = {"AC","AL","AP","AM","BA","CE","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};
		String[] cargos = {"Gerente","Recursos Humanos","Atendimento ao Cliente","Motorista"};
		
		
		fieldNome = new JTextField();
		fieldEndereco = new JTextField();
		fieldComplemento = new JTextField();
		fieldCidade = new JTextField();
		fieldCep = new JFormattedTextField();
		fieldCnpj = new JFormattedTextField();
		fieldCpf = new JFormattedTextField();
		fieldSenha = new JPasswordField();
		lblNome = new JLabel("Nome");
		lblCnpj = new JLabel("CNPJ");
		lblEndereo = new JLabel("Endere\u00E7o");
		lblCidade = new JLabel("Cidade");
		lblEstado = new JLabel("Estado");
		lblCep = new JLabel("CEP");
		lblComplemento = new JLabel("Complemento");
		lblCpf = new JLabel("CPF");
		lblCargo = new JLabel("Cargo");
		lblSenha = new JLabel("Senha");
		cbxEstado = new JComboBox(estados);
		cbxCargo = new JComboBox(cargos);
		btnConfirmar = new JButton("Confirmar");
		btnCancelar = new JButton("Cancelar");
		btnCliente = new JButton("Cliente");
		btnFuncionario = new JButton("Funcion\u00E1rio");
		new MaskFormatter("#####-###").install(fieldCep);
		new MaskFormatter("###.###.###/####-##").install(fieldCep);
		new MaskFormatter("###.###.###-##").install(fieldCep);
		
		
		fieldNome.setBounds(38, 62, 86, 20);
		fieldEndereco.setBounds(38, 233, 86, 20);
		fieldCidade.setBounds(38, 328, 86, 20);
		fieldComplemento.setBounds(192, 233, 86, 20);
		fieldCep.setBounds(192, 328, 86, 20);
		fieldCnpj.setBounds(38, 144, 86, 20);
		fieldCpf.setBounds(192, 144, 86, 20);
		fieldSenha.setBounds(192, 417, 86, 20);
		lblNome.setBounds(38, 37, 46, 14);
		lblCnpj.setBounds(38, 119, 46, 14);
		lblEndereo.setBounds(38, 208, 46, 14);
		lblCidade.setBounds(38, 303, 46, 14);
		lblEstado.setBounds(38, 392, 46, 14);
		lblCep.setBounds(192, 303, 46, 14);
		lblComplemento.setBounds(192, 208, 46, 14);
		lblCpf.setBounds(192, 119, 46, 14);
		lblCargo.setBounds(192, 37, 46, 14);
		lblSenha.setBounds(192, 392, 46, 14);
		cbxEstado.setBounds(38, 417, 86, 20);
		cbxCargo.setBounds(192, 62, 86, 20);
		btnCliente.setBounds(520, 232, 89, 23);
		btnFuncionario.setBounds(520, 299, 89, 23);
		btnConfirmar.setBounds(520, 81, 89, 23);
		btnCancelar.setBounds(520, 158, 89, 23);
		
		
		contentPane.add(fieldNome);
		contentPane.add(fieldEndereco);
		contentPane.add(fieldCidade);
		contentPane.add(fieldComplemento);
		contentPane.add(fieldCep);
		contentPane.add(fieldCnpj);
		contentPane.add(fieldCpf);
		contentPane.add(fieldSenha);
		contentPane.add(lblNome);
		contentPane.add(lblCnpj);
		contentPane.add(lblEndereo);
		contentPane.add(lblCidade);
		contentPane.add(lblEstado);
		contentPane.add(lblCep);
		contentPane.add(lblComplemento);
		contentPane.add(lblCpf);
		contentPane.add(lblCargo);
		contentPane.add(lblSenha);
		contentPane.add(cbxEstado);
		contentPane.add(cbxCargo);
		contentPane.add(btnCliente);
		contentPane.add(btnFuncionario);
		contentPane.add(btnConfirmar);
		contentPane.add(btnCancelar);
		
		
		fieldNome.setColumns(10);
		fieldEndereco.setColumns(10);
		fieldCidade.setColumns(10);
		fieldComplemento.setColumns(10);
		
		
		
		
		
		
		
		
		
		
		
		ativarCampos(false, false);
		
		
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//confirmar envio dos dados*********************************************************************
				if(lblCpf.isVisible()) {
					//envio dos dados de funcionario
				}else {
					//envio dos dados de cliente
				}
			}
		});
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ativar opções de cliente*******************************************
				ativarCampos(false, true);
				
			}
		});
		
		
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ativar opções de funcionario*******************************************
				ativarCampos(true, false);
				
			}
		});
		
	}
	protected void ativarCampos(boolean funcionario, boolean cliente) {
		boolean geral = true;
		if(!funcionario && !cliente)
			geral = false;
		fieldNome.setVisible(geral);
		fieldEndereco.setVisible(geral);
		fieldCidade.setVisible(geral);
		fieldComplemento.setVisible(geral);
		fieldCep.setVisible(geral);
		fieldCnpj.setVisible(cliente);
		fieldCpf.setVisible(funcionario);
		fieldSenha.setVisible(funcionario);
		lblNome.setVisible(geral);
		lblCnpj.setVisible(cliente);
		lblEndereo.setVisible(geral);
		lblCidade.setVisible(geral);
		lblEstado.setVisible(geral);
		lblCep.setVisible(geral);
		lblComplemento.setVisible(geral);
		lblCpf.setVisible(funcionario);
		lblCargo.setVisible(funcionario);
		lblSenha.setVisible(funcionario);
		cbxEstado.setVisible(geral);
		cbxCargo.setVisible(funcionario);
		btnConfirmar.setVisible(geral);
		btnCancelar.setVisible(geral);
	}
}
