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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuEntregas extends JFrame {

	private JPanel contentPane;
	private JButton btnCadastrarEntrega;
	private JButton btnEditarEntrega;
	private JButton btnFinalizarEntrega;

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
	public MenuEntregas() throws ParseException {
		setTitle("Entregas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		btnCadastrarEntrega = new JButton("Cadastrar Entrega");
		btnEditarEntrega = new JButton("Editar Entrega");
		btnFinalizarEntrega = new JButton("Finalizar Entrega");
		
		btnEditarEntrega.setBounds(145, 122, 140, 70);
		btnCadastrarEntrega.setBounds(145, 11, 140, 70);
		btnFinalizarEntrega.setBounds(145, 230, 140, 70);
		
		contentPane.add(btnEditarEntrega);
		contentPane.add(btnCadastrarEntrega);
		contentPane.add(btnFinalizarEntrega);
		
		
		
		btnFinalizarEntrega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO code here
			}
		});
		
		
		
		btnCadastrarEntrega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO code here
			}
		});
		
		
		
		btnEditarEntrega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO code here
			}
		});
		
	}
}
