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

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Anderson\\eclipse-workspace\\prjCOO\\Imagens\\logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Anderson\\eclipse-workspace\\prjCOO\\Imagens\\faixa.jpg"));
		lblNewLabel.setBounds(0, 32, 854, 170);
		contentPane.add(lblNewLabel);
		
		JButton btnCadastrarEntrega = new JButton("Cadastrar Entrega");
		btnCadastrarEntrega.setBounds(21, 365, 150, 60);
		contentPane.add(btnCadastrarEntrega);
		
		JButton btnListaEntregas = new JButton("Listar Entregas");
		btnListaEntregas.setBounds(216, 365, 150, 60);
		contentPane.add(btnListaEntregas);
		
		JButton btnGerenciarFuncionario = new JButton("Gerenciar Funcionario");
		btnGerenciarFuncionario.setBounds(411, 365, 150, 60);
		contentPane.add(btnGerenciarFuncionario);
		
		JButton btnGerenciarCliente = new JButton("Gerenciar Cliente");
		btnGerenciarCliente.setBounds(601, 365, 150, 60);
		contentPane.add(btnGerenciarCliente);
	}
}
