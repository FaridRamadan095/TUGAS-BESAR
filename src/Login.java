import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;

import java.awt.GridLayout;

import javax.swing.JTextField;

import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPanel panelbawah;
	private JLabel lblInginDaftar;
	private JPanel panel_1;
	private JLabel lblUsername_1;
	private JTextField txtDaftaruser;
	private JLabel lblPassword;
	private JTextField txtDaftarpass;
	private JButton btnNewButton;
	private JButton btnDaftar;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 10, 10));
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 37));
		panel.add(lblUsername);
		
		txtUser = new JTextField();
		txtUser.setForeground(Color.WHITE);
		txtUser.setBackground(new Color(0, 0, 102));
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtUser.setText("User");
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setFont(new Font("Times New Roman", Font.BOLD, 37));
		panel.add(lblPass);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setBackground(new Color(0, 0, 102));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(passwordField);
		
		panelbawah = new JPanel();
		contentPane.add(panelbawah, BorderLayout.SOUTH);
		panelbawah.setLayout(new BorderLayout(0, 0));
		
		lblInginDaftar = new JLabel("Ingin daftar??");
		panelbawah.add(lblInginDaftar, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panelbawah.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblUsername_1 = new JLabel("Username");
		panel_1.add(lblUsername_1);
		
		txtDaftaruser = new JTextField();
		txtDaftaruser.setFont(new Font("Times New Roman", Font.BOLD, 11));
		txtDaftaruser.setBackground(new Color(255, 204, 0));
		txtDaftaruser.setText("DaftarUser");
		panel_1.add(txtDaftaruser);
		txtDaftaruser.setColumns(10);
		
		lblPassword = new JLabel("Password");
		panel_1.add(lblPassword);
		
		txtDaftarpass = new JTextField();
		txtDaftarpass.setFont(new Font("Times New Roman", Font.BOLD, 11));
		txtDaftarpass.setBackground(new Color(255, 204, 0));
		txtDaftarpass.setText("DaftarPass");
		panel_1.add(txtDaftarpass);
		txtDaftarpass.setColumns(10);
		
		btnDaftar = new JButton("Daftar");
		btnDaftar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					DataMember.simpanMember(txtDaftaruser.getText(), txtDaftarpass.getText());
					JOptionPane.showMessageDialog(null, "Data Tersimpan", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Tidak Dapat Menyimpan data", "Error" , JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnDaftar.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnDaftar.setBackground(new Color(255, 204, 0));
		panel_1.add(btnDaftar);
		
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String login="|"+txtUser.getText()+"|"+passwordField.getText()+"|";
					if(DataMember.bacaMember().contains(login)==true){
						JOptionPane.showMessageDialog(null, "Login Sukses", "Login", JOptionPane.INFORMATION_MESSAGE);
						GUI2 gu = new GUI2();
						gu.setVisible(true);
						dispose();
					}else{
						JOptionPane.showMessageDialog(null, "Gagal Login", "Login", JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Gagal", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(153, 0, 0));
		contentPane.add(btnNewButton, BorderLayout.EAST);
	}
}
