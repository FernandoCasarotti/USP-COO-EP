package prjCOO;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Pedido extends JFrame {

	private JPanel contentPane;
	private JTextField fieldDistancia;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido frame = new Pedido();
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
	public Pedido() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField fieldDataEntrega = new JFormattedTextField();
		fieldDataEntrega.setBounds(78, 86, 96, 20);
		MaskFormatter mascara = new MaskFormatter("##/##/####");
		mascara.install(fieldDataEntrega);
		contentPane.add(fieldDataEntrega);
		
		JLabel lblDataDaEntrega = new JLabel("Data da Entrega");
		lblDataDaEntrega.setBounds(78, 59, 96, 14);
		contentPane.add(lblDataDaEntrega);
		
		JLabel lblNewLabel = new JLabel("Dist\u00E2ncia");
		lblNewLabel.setBounds(78, 151, 46, 14);
		contentPane.add(lblNewLabel);
		
		fieldDistancia = new JTextField();
		fieldDistancia.setBounds(78, 176, 86, 20);
		contentPane.add(fieldDistancia);
		fieldDistancia.setColumns(10);
		
		JLabel label = new JLabel("Dist\u00E2ncia");
		label.setBounds(78, 226, 46, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(78, 251, 86, 20);
		contentPane.add(textField);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(633, 30, 89, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(633, 111, 89, 23);
		contentPane.add(btnCancelar);
	}
}
