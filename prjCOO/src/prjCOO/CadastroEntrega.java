package prjCOO;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Date;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroEntrega extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCliente;
	private JTextField fieldMotorista;
	private JTextField fieldPeso;
	private JTextField fieldDistancia;
	private JFormattedTextField fieldDataEntrega;
	private JLabel lblCliente;
	private JLabel lblMotorista;
	private JLabel lblPeso;
	private JLabel lblDistancia;
	private JLabel lblDataDaEntrega;
	private JLabel lblNomeCliente;
	private JLabel lblNomeMotorista;
	private JLabel lblTipoDaCarga;
	private JLabel lblNivelDeRisco;
	private JComboBox cbxTipoCarga;
	private JComboBox cbxRiscoCarga;
	private JButton btnPesquisarCliente;
	private JButton btnPesquisarMotorista;
	private JButton btnCadastrar;
	private JButton btnCancelar;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroEntrega frame = new CadastroEntrega();
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
	public CadastroEntrega() throws ParseException {
		setTitle("Cadastro de Entrega");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		String[] tipoCarga = {};
		String[] risco = {};
		
		fieldCliente = new JTextField();
		fieldMotorista = new JTextField();
		fieldPeso = new JTextField();
		fieldDistancia = new JTextField();
		fieldDataEntrega = new JFormattedTextField();
		lblCliente = new JLabel("Cliente");
		lblMotorista = new JLabel("Motorista");
		lblPeso = new JLabel("Peso");
		lblDistancia = new JLabel("Dist\u00E2ncia");
		lblDataDaEntrega = new JLabel("Data da Entrega");
		lblNomeCliente = new JLabel("Nome Cliente");
		lblNomeMotorista = new JLabel("Nome Motorista");
		lblTipoDaCarga = new JLabel("Tipo da Carga");
		lblNivelDeRisco = new JLabel("Nivel de Risco");
		cbxTipoCarga = new JComboBox(tipoCarga);
		cbxRiscoCarga = new JComboBox(risco);
		btnPesquisarCliente = new JButton("Pesquisar");
		btnPesquisarMotorista = new JButton("Pesquisar");
		btnCadastrar = new JButton("Cadastrar");
		btnCancelar = new JButton("Cancelar");
		new MaskFormatter("##/##/####").install(fieldDataEntrega);
		
		
		fieldCliente.setBounds(41, 46, 86, 20);
		fieldMotorista.setBounds(41, 105, 86, 20);
		fieldPeso.setBounds(41, 161, 86, 20);
		fieldDistancia.setBounds(41, 217, 86, 20);
		fieldDataEntrega.setBounds(41, 283, 86, 20);
		lblCliente.setBounds(41, 21, 46, 14);
		lblMotorista.setBounds(41, 80, 46, 14);
		lblPeso.setBounds(41, 136, 46, 14);
		lblDistancia.setBounds(41, 192, 46, 14);
		lblDataDaEntrega.setBounds(41, 258, 86, 14);
		lblNomeCliente.setBounds(97, 21, 177, 14);
		lblNomeMotorista.setBounds(94, 80, 180, 14);
		lblTipoDaCarga.setBounds(147, 136, 79, 14);
		lblNivelDeRisco.setBounds(147, 192, 79, 14);
		cbxTipoCarga.setBounds(147, 161, 89, 20);
		cbxRiscoCarga.setBounds(147, 217, 89, 20);
		btnPesquisarCliente.setBounds(147, 45, 89, 23);
		btnPesquisarMotorista.setBounds(147, 104, 89, 23);
		btnCadastrar.setBounds(41, 354, 89, 23);
		btnCancelar.setBounds(147, 354, 89, 23);
		
		
		contentPane.add(fieldCliente);
		contentPane.add(fieldMotorista);
		contentPane.add(fieldPeso);
		contentPane.add(fieldDistancia);
		contentPane.add(fieldDataEntrega);
		contentPane.add(lblCliente);
		contentPane.add(lblMotorista);
		contentPane.add(lblPeso);
		contentPane.add(lblDistancia);
		contentPane.add(lblDataDaEntrega);
		contentPane.add(lblNomeCliente);
		contentPane.add(lblNomeMotorista);
		contentPane.add(lblTipoDaCarga);
		contentPane.add(lblNivelDeRisco);
		contentPane.add(cbxTipoCarga);
		contentPane.add(cbxRiscoCarga);
		contentPane.add(btnPesquisarCliente);
		contentPane.add(btnPesquisarMotorista);
		contentPane.add(btnCadastrar);
		contentPane.add(btnCancelar);
		
		
		fieldCliente.setColumns(10);
		fieldMotorista.setColumns(10);
		fieldPeso.setColumns(10);
		fieldDistancia.setColumns(10);
		
		
		btnPesquisarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO code here
				//lblNomeCliente vai receber o nome do cliente vindo do banco
			}
		});
		
		
		btnPesquisarMotorista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO code here
				//lblNomeMotorista vai receber o nome do motorista vindo do banco
			}
		});
		
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO code here
			}
		});
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO code here
				dispose();
			}
		});
	}

}
