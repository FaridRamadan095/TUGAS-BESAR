import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;

import java.awt.Canvas;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InventarisKeamanan extends JFrame {


	private KeamananRuangKelas keamanan;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventarisKeamanan window = new InventarisKeamanan();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InventarisKeamanan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setResizable(false);
		setBounds(100, 100, 797, 493);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane txtpnAspek = new JTextPane();
		txtpnAspek.setEditable(false);
		txtpnAspek.setForeground(Color.WHITE);
		txtpnAspek.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnAspek.setBackground(new Color(255, 102, 0));
		txtpnAspek.setText("Aspek");
		txtpnAspek.setBounds(110, 126, 247, 23);
		panel.add(txtpnAspek);
		
		JTextPane txtpnKondisi = new JTextPane();
		txtpnKondisi.setEditable(false);
		txtpnKondisi.setText("Kondisi");
		txtpnKondisi.setForeground(Color.WHITE);
		txtpnKondisi.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnKondisi.setBackground(new Color(255, 102, 0));
		txtpnKondisi.setBounds(356, 126, 183, 23);
		panel.add(txtpnKondisi);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(255, 102, 0));
		canvas.setBounds(292, 126, 5, 182);
		panel.add(canvas);
		
		JComboBox comboBoxkokoh = new JComboBox();
		comboBoxkokoh.setModel(new DefaultComboBoxModel(new String[] {"Kokoh", "Tidak Kokoh"}));
		comboBoxkokoh.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBoxkokoh.setForeground(Color.WHITE);
		comboBoxkokoh.setBackground(new Color(0, 0, 153));
		comboBoxkokoh.setBounds(303, 164, 217, 20);
		panel.add(comboBoxkokoh);
		
		JComboBox comboBoxPintu = new JComboBox();
		comboBoxPintu.setModel(new DefaultComboBoxModel(new String[] {"Ada", "Tidak Ada"}));
		comboBoxPintu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBoxPintu.setForeground(Color.WHITE);
		comboBoxPintu.setBackground(new Color(0, 0, 153));
		comboBoxPintu.setBounds(303, 201, 217, 20);
		panel.add(comboBoxPintu);
		
		JComboBox comboBoxJendela = new JComboBox();
		comboBoxJendela.setModel(new DefaultComboBoxModel(new String[] {"Ada", "Tidak Ada"}));
		comboBoxJendela.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBoxJendela.setForeground(Color.WHITE);
		comboBoxJendela.setBackground(new Color(0, 0, 153));
		comboBoxJendela.setBounds(303, 232, 217, 20);
		panel.add(comboBoxJendela);
		
		JComboBox comboBoxBahaya = new JComboBox();
		comboBoxBahaya.setModel(new DefaultComboBoxModel(new String[] {"Aman", "Kurang Aman"}));
		comboBoxBahaya.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBoxBahaya.setForeground(Color.WHITE);
		comboBoxBahaya.setBackground(new Color(0, 0, 153));
		comboBoxBahaya.setBounds(303, 263, 217, 20);
		panel.add(comboBoxBahaya);
		
		JTextPane txtpnKekokohan = new JTextPane();
		txtpnKekokohan.setText("Kekokohan");
		txtpnKekokohan.setForeground(Color.WHITE);
		txtpnKekokohan.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnKekokohan.setEditable(false);
		txtpnKekokohan.setBackground(new Color(204, 0, 0));
		txtpnKekokohan.setBounds(126, 164, 159, 23);
		panel.add(txtpnKekokohan);
		
		JTextPane txtpnKunciPintu = new JTextPane();
		txtpnKunciPintu.setText("Kunci Pintu");
		txtpnKunciPintu.setForeground(Color.WHITE);
		txtpnKunciPintu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnKunciPintu.setEditable(false);
		txtpnKunciPintu.setBackground(new Color(204, 0, 0));
		txtpnKunciPintu.setBounds(126, 201, 159, 23);
		panel.add(txtpnKunciPintu);
		
		JTextPane txtpnKunciJendela = new JTextPane();
		txtpnKunciJendela.setText("Kunci Jendela");
		txtpnKunciJendela.setForeground(Color.WHITE);
		txtpnKunciJendela.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnKunciJendela.setEditable(false);
		txtpnKunciJendela.setBackground(new Color(204, 0, 0));
		txtpnKunciJendela.setBounds(127, 232, 159, 23);
		panel.add(txtpnKunciJendela);
		
		JTextPane txtpnBahaya = new JTextPane();
		txtpnBahaya.setText("Bahaya");
		txtpnBahaya.setForeground(Color.WHITE);
		txtpnBahaya.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnBahaya.setEditable(false);
		txtpnBahaya.setBackground(new Color(204, 0, 0));
		txtpnBahaya.setBounds(127, 263, 159, 23);
		panel.add(txtpnBahaya);
		
		JTextPane textPaneNamaRuang = new JTextPane();
		textPaneNamaRuang.setText(BacaTulisFile.bacaKondisi().getNamaRuang());
		textPaneNamaRuang.setForeground(Color.WHITE);
		textPaneNamaRuang.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPaneNamaRuang.setEditable(false);
		textPaneNamaRuang.setBackground(new Color(204, 0, 0));
		textPaneNamaRuang.setBounds(495, 11, 159, 23);
		panel.add(textPaneNamaRuang);
		
		JTextPane textPaneFakultas = new JTextPane();
		textPaneFakultas.setText(BacaTulisFile.bacaKondisi().getFakultas());
		textPaneFakultas.setForeground(Color.WHITE);
		textPaneFakultas.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPaneFakultas.setEditable(false);
		textPaneFakultas.setBackground(new Color(204, 0, 0));
		textPaneFakultas.setBounds(495, 39, 159, 23);
		panel.add(textPaneFakultas);
		
		JTextPane textPaneLokasi = new JTextPane();
		textPaneLokasi.setText(BacaTulisFile.bacaKondisi().getLokasiRuang());
		textPaneLokasi.setForeground(Color.WHITE);
		textPaneLokasi.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPaneLokasi.setEditable(false);
		textPaneLokasi.setBackground(new Color(204, 0, 0));
		textPaneLokasi.setBounds(495, 66, 159, 23);
		panel.add(textPaneLokasi);
		
		JLabel lblNamaRuang = new JLabel("Nama Ruang");
		lblNamaRuang.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNamaRuang.setForeground(new Color(0, 0, 153));
		lblNamaRuang.setBounds(356, 11, 99, 23);
		panel.add(lblNamaRuang);
		
		JLabel lblFakultas = new JLabel("Fakultas");
		lblFakultas.setForeground(new Color(0, 0, 153));
		lblFakultas.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFakultas.setBounds(356, 39, 99, 23);
		panel.add(lblFakultas);
		
		JLabel lblLokasi = new JLabel("Lokasi");
		lblLokasi.setForeground(new Color(0, 0, 153));
		lblLokasi.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblLokasi.setBounds(355, 66, 99, 23);
		panel.add(lblLokasi);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("/as/Picture4.png")));
		lblBg.setBounds(-43, 0, 781, 428);
		panel.add(lblBg);
		
		JPanel panelAtas = new JPanel();
		panelAtas.setBackground(new Color(255, 102, 0));
		getContentPane().add(panelAtas, BorderLayout.NORTH);
		
		JLabel lblInventarisKeamanan = new JLabel("Inventaris Keamanan");
		lblInventarisKeamanan.setForeground(Color.WHITE);
		lblInventarisKeamanan.setFont(new Font("Algerian", Font.BOLD, 12));
		panelAtas.add(lblInventarisKeamanan);
		
		JPanel paneBawah = new JPanel();
		getContentPane().add(paneBawah, BorderLayout.SOUTH);
		paneBawah.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Analisis");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					keamanan= new KeamananRuangKelas();
					keamanan.setKekokohan(comboBoxkokoh.getSelectedItem()+"");
					keamanan.setKunciPintu(comboBoxPintu.getSelectedItem()+"");
					keamanan.setKunciJendela(comboBoxJendela.getSelectedItem()+"");
					keamanan.setBahaya(comboBoxBahaya.getSelectedItem()+"");
					
					BacaTulisFile.simpanKeamanan(keamanan);
					AnalisisKeamanan aman = new AnalisisKeamanan();
					aman.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "input dengan benar : "+e, "Erorr", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(255, 102, 0));
		paneBawah.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Load");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					keamanan = BacaTulisFile.bacaKeamanan();
					comboBoxkokoh.setSelectedItem(keamanan.getKekokohan());
					comboBoxPintu.setSelectedItem(keamanan.getKunciPintu());
					comboBoxJendela.setSelectedItem(keamanan.getKunciJendela());
					comboBoxBahaya.setSelectedItem(keamanan.getBahaya());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "File Tidak Ada / Tidak Lengkap", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 102, 0));
		paneBawah.add(btnNewButton_1, BorderLayout.EAST);
		
		JButton button = new JButton("<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InventarisKebersihan invber = new InventarisKebersihan();
				invber.setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(255, 102, 0));
		getContentPane().add(button, BorderLayout.WEST);
	}
}
