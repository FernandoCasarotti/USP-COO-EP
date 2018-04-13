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

public class CadastrarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JTextField fieldCnpj;
	private JTextField fieldEndereco;
	private JTextField fieldCidade;

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
	public CadastrarCliente() throws ParseException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fieldNome = new JTextField();
		fieldNome.setBounds(38, 62, 86, 20);
		contentPane.add(fieldNome);
		fieldNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(38, 37, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(38, 119, 46, 14);
		contentPane.add(lblCnpj);
		
		fieldCnpj = new JTextField();
		fieldCnpj.setColumns(10);
		fieldCnpj.setBounds(38, 144, 86, 20);
		contentPane.add(fieldCnpj);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(38, 208, 46, 14);
		contentPane.add(lblEndereo);
		
		fieldEndereco = new JTextField();
		fieldEndereco.setColumns(10);
		fieldEndereco.setBounds(38, 233, 86, 20);
		contentPane.add(fieldEndereco);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(38, 303, 46, 14);
		contentPane.add(lblCidade);
		
		fieldCidade = new JTextField();
		fieldCidade.setColumns(10);
		fieldCidade.setBounds(38, 328, 86, 20);
		contentPane.add(fieldCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(38, 392, 46, 14);
		contentPane.add(lblEstado);
		
		JComboBox cbbEstado = new JComboBox();
		cbbEstado.setBounds(38, 417, 86, 20);
		contentPane.add(cbbEstado);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//confirmar envio dos dados***************************************************
			}
		});
		btnConfirmar.setBounds(520, 81, 89, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(520, 158, 89, 23);
		contentPane.add(btnCancelar);
		
		JFormattedTextField fieldCep = new JFormattedTextField();
		fieldCep.setBounds(192, 62, 97, 20);
		contentPane.add(fieldCep);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(192, 37, 46, 14);
		MaskFormatter mascara = new MaskFormatter("#####-###");
		mascara.install(fieldCep);
		contentPane.add(lblCep);
	}
}
