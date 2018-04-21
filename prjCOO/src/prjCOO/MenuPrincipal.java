package prjCOO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel;
	JButton btnGerenciarEntrega;
	JButton btnListaEntregas;
	JButton btnGerenciarPessoas;
	JButton btnCadastrarPessoas;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("~\\prjCOO\\Imagens\\logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		btnGerenciarEntrega = new JButton("Gerenciar Entregas");
		btnListaEntregas = new JButton("Lista de Entregas");
		btnGerenciarPessoas = new JButton("Gerenciar Pessoas");
		btnCadastrarPessoas = new JButton("Cadastrar Pessoas");
		
		lblNewLabel.setBounds(0, 32, 854, 170);
		btnGerenciarEntrega.setBounds(21, 365, 150, 60);
		btnListaEntregas.setBounds(216, 365, 150, 60);
		btnGerenciarPessoas.setBounds(411, 365, 150, 60);
		btnCadastrarPessoas.setBounds(601, 365, 150, 60);
		
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Anderson\\eclipse-workspace\\prjCOO\\Imagens\\faixa.jpg"));
		
		contentPane.add(lblNewLabel);
		contentPane.add(btnGerenciarEntrega);
		contentPane.add(btnListaEntregas);
		contentPane.add(btnGerenciarPessoas);	
		contentPane.add(btnCadastrarPessoas);
		
		
		btnGerenciarEntrega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		btnListaEntregas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		btnGerenciarPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new EditarPessoa().setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		
		
		btnCadastrarPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new CadastrarPessoa().setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
	}
}
