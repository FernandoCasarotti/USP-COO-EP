package prjCOO;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditaPessoa extends CadastroPessoa {

	private JPanel contentPane;
	private JTextField fieldCodigo;
	JLabel lblCodigo;
	JButton btnDesligar;
	JButton btnPesquisar;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste frame = new teste();
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
	public EditaPessoa()throws ParseException {
		super();
		setTitle("Atualizar Dados");
		
		fieldCodigo = new JTextField();
		lblCodigo = new JLabel("C\u00F3digo");
		btnDesligar = new JButton("Desligar");
		btnPesquisar = new JButton("Pesquisar");
		
		fieldCodigo.setBounds(521, 385, 86, 20);
		lblCodigo.setBounds(521, 360, 46, 14);
		btnDesligar.setBounds(521, 426, 89, 23);
		btnPesquisar.setBounds(627, 385, 89, 23);
		
		fieldCodigo.setColumns(10);
		
		getContentPane().add(fieldCodigo);
		getContentPane().add(lblCodigo);
		getContentPane().add(btnDesligar);
		getContentPane().add(btnPesquisar);
		
		btnDesligar.setVisible(false);
		
		btnDesligar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//demitir funcionario ou desligar cliente*****************************************
				if(lblCpf.isVisible()) {
					
				}else{
					
				}
			}
		});
		
		
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//procurarfuncionario ou cliente de acordo com o código********************************
				//antes de mais nada, tem que testar se voltaou alguma coisa do banco para depois continuar a execução
				if(lblCpf.isVisible()) {
					btnDesligar.setVisible(true);
				}else{
					btnDesligar.setVisible(true);
				}
			}
		});
	}
	
	private void ativarCamposEdicao(boolean funcionario, boolean cliente) {
		boolean geral = true;
		if(!funcionario && !cliente)
			geral = false;
		btnDesligar.setVisible(geral);
		super.ativarCampos(funcionario, cliente);
	}

}
