package prjCOO;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditaEntrega extends CadastroEntrega {

	private JPanel contentPane;
	private JTextField fieldCodEntrega;
	private JButton btnPesquisarEntrega;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditaEntrega frame = new EditaEntrega();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public EditaEntrega() throws ParseException {
		super();
		setTitle("Alterar Dados de Entrega");
		
		fieldCodEntrega = new JTextField();
		btnPesquisarEntrega = new JButton("Pesquisar");
		btnCancelar = new JButton("Cancelar");
		
		
		fieldCodEntrega.setBounds(41, 411, 86, 20);
		btnPesquisarEntrega.setBounds(148, 410, 89, 23);
		btnCancelar.setBounds(97, 465, 89, 23);
		
		
		getContentPane().add(fieldCodEntrega);
		getContentPane().add(btnPesquisarEntrega);
		getContentPane().add(btnCancelar);
		
		
		fieldCodEntrega.setColumns(10);
		
		btnPesquisarEntrega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO code here
			}
		});
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO code here
			}
		});
	}
}
