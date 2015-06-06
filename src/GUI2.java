import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;

import java.awt.BorderLayout;

import javax.swing.JComboBox;

import java.awt.Panel;

import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Canvas;

import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSplitPane;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JTextPane;

import java.awt.color.CMMException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.net.URL;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

import org.omg.CORBA.ExceptionList;

import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class GUI2 extends JFrame implements Serializable {

	private JTextField textFieldNamaRuang;
	private JTextField textFieldPanjang;
	private JTextField textFieldLebar;
	private JTextField textFieldJumlahKursi;
	private JTextField textFieldJumlahPintu;
	private JTextField textFieldJumlahJendela;
	
	
	private JumlahKondisidanPosisiSarana kondisi;
	private KebersihanRuangKelas bersih;
	private KeamananRuangKelas keamanan;
	
	private BacaTulisFile bacatulis;

	private JTable table;
	private JTextField textFieldJumlahSteker;
	private JTextField textFieldJumlahLcd;
	private JTextField textFieldJumlahLampu;
	private JTextField textFieldJumlahKipasAngin;
	private JTextField textFieldJumlahAC;
	private JTextField textFieldJumlahCCTV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 window = new GUI2();
					window.setVisible(true);
					window.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 797, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelKondisi = new JPanel();
		getContentPane().add(panelKondisi, BorderLayout.CENTER);
		panelKondisi.setLayout(new BorderLayout(0, 0));
		

		
		JPanel paneltengahkondisi = new JPanel();
		panelKondisi.add(paneltengahkondisi, BorderLayout.CENTER);
		paneltengahkondisi.setLayout(null);
		
		JLabel lblLokasiRuang = new JLabel("Lokasi Ruangan");
		lblLokasiRuang.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblLokasiRuang.setForeground(Color.WHITE);
		lblLokasiRuang.setBounds(14, 41, 138, 14);
		paneltengahkondisi.add(lblLokasiRuang);
		
		JLabel lblNamaRuangankondisi = new JLabel("Nama Ruangan");
		lblNamaRuangankondisi.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNamaRuangankondisi.setForeground(Color.WHITE);
		lblNamaRuangankondisi.setBounds(14, 16, 149, 14);
		paneltengahkondisi.add(lblNamaRuangankondisi);
		
		JLabel labelFakultaskondisi = new JLabel("Fakultas");
		labelFakultaskondisi.setForeground(Color.WHITE);
		labelFakultaskondisi.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelFakultaskondisi.setBounds(14, 66, 138, 14);
		paneltengahkondisi.add(labelFakultaskondisi);
		
		textFieldNamaRuang = new JTextField();
		textFieldNamaRuang.setBackground(new Color(255, 204, 51));
		textFieldNamaRuang.setBounds(140, 10, 134, 20);
		paneltengahkondisi.add(textFieldNamaRuang);
		textFieldNamaRuang.setColumns(10);
		
		JComboBox comboBoxLokasi = new JComboBox();
		comboBoxLokasi.setBackground(new Color(255, 204, 51));
		comboBoxLokasi.setModel(new DefaultComboBoxModel(new String[] {"GKB I", "GKB II", "GKB III"}));
		comboBoxLokasi.setBounds(140, 38, 134, 20);
		paneltengahkondisi.add(comboBoxLokasi);
		
		JComboBox comboBoxFakultas = new JComboBox();
		comboBoxFakultas.setBackground(new Color(255, 204, 51));
		comboBoxFakultas.setModel(new DefaultComboBoxModel(new String[] {"Teknik", "FEB", "FPP", "FAI", "FK", "FIKES", "Hukum", "FISIP", "FKIP", "Psikologi"}));
		comboBoxFakultas.setBounds(140, 63, 134, 20);
		paneltengahkondisi.add(comboBoxFakultas);
		
		JLabel lblPanjang = new JLabel("Panjang (meter)");
		lblPanjang.setForeground(Color.WHITE);
		lblPanjang.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPanjang.setBounds(12, 106, 113, 14);
		paneltengahkondisi.add(lblPanjang);
		
		JLabel lblLebar = new JLabel("Lebar (meter)");
		lblLebar.setForeground(Color.WHITE);
		lblLebar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblLebar.setBounds(14, 152, 85, 14);
		paneltengahkondisi.add(lblLebar);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(0, 0, 102));
		canvas.setBounds(284, 0, 5, 400);
		paneltengahkondisi.add(canvas);
		
		textFieldPanjang = new JTextField();
		textFieldPanjang.setBackground(new Color(255, 204, 51));
		textFieldPanjang.setBounds(14, 124, 138, 20);
		paneltengahkondisi.add(textFieldPanjang);
		textFieldPanjang.setColumns(10);
		
		textFieldLebar = new JTextField();
		textFieldLebar.setBackground(new Color(255, 204, 51));
		textFieldLebar.setColumns(10);
		textFieldLebar.setBounds(14, 170, 138, 20);
		paneltengahkondisi.add(textFieldLebar);
		
		JLabel labelJumlahKursi = new JLabel("Jumlah Kursi");
		labelJumlahKursi.setForeground(Color.WHITE);
		labelJumlahKursi.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelJumlahKursi.setBounds(12, 201, 113, 14);
		paneltengahkondisi.add(labelJumlahKursi);
		
		textFieldJumlahKursi = new JTextField();
		textFieldJumlahKursi.setBackground(new Color(255, 204, 51));
		textFieldJumlahKursi.setBounds(12, 220, 140, 20);
		paneltengahkondisi.add(textFieldJumlahKursi);
		textFieldJumlahKursi.setColumns(10);
		
		JLabel labelJumlahPintu = new JLabel("Jumlah Pintu");
		labelJumlahPintu.setForeground(Color.WHITE);
		labelJumlahPintu.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelJumlahPintu.setBounds(10, 249, 101, 14);
		paneltengahkondisi.add(labelJumlahPintu);
		
		JLabel lblJumlahJendela = new JLabel("Jumlah Jendela");
		lblJumlahJendela.setForeground(Color.WHITE);
		lblJumlahJendela.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblJumlahJendela.setBounds(10, 297, 101, 14);
		paneltengahkondisi.add(lblJumlahJendela);
		
		textFieldJumlahPintu = new JTextField();
		textFieldJumlahPintu.setBackground(new Color(255, 204, 51));
		textFieldJumlahPintu.setColumns(10);
		textFieldJumlahPintu.setBounds(10, 266, 142, 20);
		paneltengahkondisi.add(textFieldJumlahPintu);
		
		textFieldJumlahJendela = new JTextField();
		textFieldJumlahJendela.setBackground(new Color(255, 204, 51));
		textFieldJumlahJendela.setColumns(10);
		textFieldJumlahJendela.setBounds(12, 322, 140, 20);
		paneltengahkondisi.add(textFieldJumlahJendela);
		
		JTextPane txtpnSteker = new JTextPane();
		txtpnSteker.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnSteker.setEditable(false);
		txtpnSteker.setForeground(Color.WHITE);
		txtpnSteker.setBackground(new Color(0, 0, 153));
		txtpnSteker.setText("Steker");
		txtpnSteker.setBounds(294, 43, 85, 20);
		paneltengahkondisi.add(txtpnSteker);
		
		JTextPane textPaneLCD = new JTextPane();
		textPaneLCD.setText("Kabel LCD");
		textPaneLCD.setForeground(Color.WHITE);
		textPaneLCD.setFont(new Font("Tahoma", Font.BOLD, 11));
		textPaneLCD.setEditable(false);
		textPaneLCD.setBackground(new Color(0, 0, 153));
		textPaneLCD.setBounds(294, 74, 85, 20);
		paneltengahkondisi.add(textPaneLCD);
		
		JTextPane txtpnLampu = new JTextPane();
		txtpnLampu.setText("Lampu");
		txtpnLampu.setForeground(Color.WHITE);
		txtpnLampu.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnLampu.setEditable(false);
		txtpnLampu.setBackground(new Color(0, 0, 153));
		txtpnLampu.setBounds(294, 106, 85, 20);
		paneltengahkondisi.add(txtpnLampu);
		
		JTextPane txtpnKipasAngin = new JTextPane();
		txtpnKipasAngin.setText("Kipas Angin");
		txtpnKipasAngin.setForeground(Color.WHITE);
		txtpnKipasAngin.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnKipasAngin.setEditable(false);
		txtpnKipasAngin.setBackground(new Color(0, 0, 153));
		txtpnKipasAngin.setBounds(294, 139, 85, 20);
		paneltengahkondisi.add(txtpnKipasAngin);
		
		JTextPane txtpnAc = new JTextPane();
		txtpnAc.setText("AC");
		txtpnAc.setForeground(Color.WHITE);
		txtpnAc.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnAc.setEditable(false);
		txtpnAc.setBackground(new Color(0, 0, 153));
		txtpnAc.setBounds(294, 170, 85, 20);
		paneltengahkondisi.add(txtpnAc);
		
		JTextPane txtpnHotspot = new JTextPane();
		txtpnHotspot.setText("Hotspot");
		txtpnHotspot.setForeground(Color.WHITE);
		txtpnHotspot.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnHotspot.setEditable(false);
		txtpnHotspot.setBackground(new Color(0, 0, 153));
		txtpnHotspot.setBounds(294, 260, 85, 20);
		paneltengahkondisi.add(txtpnHotspot);
		
		JTextPane txtpnCctv = new JTextPane();
		txtpnCctv.setText("CCTV");
		txtpnCctv.setForeground(Color.WHITE);
		txtpnCctv.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnCctv.setEditable(false);
		txtpnCctv.setBackground(new Color(0, 0, 153));
		txtpnCctv.setBounds(294, 201, 85, 20);
		paneltengahkondisi.add(txtpnCctv);
		
		JTextPane txtpnPrasarana = new JTextPane();
		txtpnPrasarana.setText("Prasarana");
		txtpnPrasarana.setForeground(Color.WHITE);
		txtpnPrasarana.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnPrasarana.setEditable(false);
		txtpnPrasarana.setBackground(new Color(204, 0, 0));
		txtpnPrasarana.setBounds(294, 10, 96, 20);
		paneltengahkondisi.add(txtpnPrasarana);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(new Color(204, 0, 0));
		canvas_1.setBounds(385, 10, 5, 275);
		paneltengahkondisi.add(canvas_1);
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(new Color(204, 0, 0));
		canvas_2.setBounds(456, 10, 5, 242);
		paneltengahkondisi.add(canvas_2);
		
		JTextPane txtpnJumlah = new JTextPane();
		txtpnJumlah.setText("Jumlah");
		txtpnJumlah.setForeground(Color.WHITE);
		txtpnJumlah.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnJumlah.setEditable(false);
		txtpnJumlah.setBackground(new Color(204, 0, 0));
		txtpnJumlah.setBounds(386, 10, 72, 20);
		paneltengahkondisi.add(txtpnJumlah);
		
		JTextPane txtpnKondisi = new JTextPane();
		txtpnKondisi.setText("Kondisi");
		txtpnKondisi.setForeground(Color.WHITE);
		txtpnKondisi.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnKondisi.setEditable(false);
		txtpnKondisi.setBackground(new Color(204, 0, 0));
		txtpnKondisi.setBounds(461, 10, 133, 20);
		paneltengahkondisi.add(txtpnKondisi);
		
		JTextPane txtpnPosisi = new JTextPane();
		txtpnPosisi.setText("Posisi");
		txtpnPosisi.setForeground(Color.WHITE);
		txtpnPosisi.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnPosisi.setEditable(false);
		txtpnPosisi.setBackground(new Color(204, 0, 0));
		txtpnPosisi.setBounds(594, 10, 105, 20);
		paneltengahkondisi.add(txtpnPosisi);
		
		Canvas canvas_3 = new Canvas();
		canvas_3.setBackground(new Color(204, 0, 0));
		canvas_3.setBounds(565, 11, 5, 275);
		paneltengahkondisi.add(canvas_3);
		
		textFieldJumlahSteker = new JTextField();
		textFieldJumlahSteker.setColumns(10);
		textFieldJumlahSteker.setBackground(new Color(255, 204, 51));
		textFieldJumlahSteker.setBounds(399, 43, 51, 20);
		paneltengahkondisi.add(textFieldJumlahSteker);
		
		textFieldJumlahLcd = new JTextField();
		textFieldJumlahLcd.setColumns(10);
		textFieldJumlahLcd.setBackground(new Color(255, 204, 51));
		textFieldJumlahLcd.setBounds(399, 74, 51, 20);
		paneltengahkondisi.add(textFieldJumlahLcd);
		
		textFieldJumlahLampu = new JTextField();
		textFieldJumlahLampu.setColumns(10);
		textFieldJumlahLampu.setBackground(new Color(255, 204, 51));
		textFieldJumlahLampu.setBounds(399, 103, 51, 20);
		paneltengahkondisi.add(textFieldJumlahLampu);
		
		textFieldJumlahKipasAngin = new JTextField();
		textFieldJumlahKipasAngin.setColumns(10);
		textFieldJumlahKipasAngin.setBackground(new Color(255, 204, 51));
		textFieldJumlahKipasAngin.setBounds(399, 139, 51, 20);
		paneltengahkondisi.add(textFieldJumlahKipasAngin);
		
		textFieldJumlahAC = new JTextField();
		textFieldJumlahAC.setColumns(10);
		textFieldJumlahAC.setBackground(new Color(255, 204, 51));
		textFieldJumlahAC.setBounds(399, 170, 51, 20);
		paneltengahkondisi.add(textFieldJumlahAC);
		
		textFieldJumlahCCTV = new JTextField();
		textFieldJumlahCCTV.setColumns(10);
		textFieldJumlahCCTV.setBackground(new Color(255, 204, 51));
		textFieldJumlahCCTV.setBounds(399, 198, 51, 20);
		paneltengahkondisi.add(textFieldJumlahCCTV);
		
		JTextPane txtpnKoneksi = new JTextPane();
		txtpnKoneksi.setText("Koneksi");
		txtpnKoneksi.setForeground(Color.WHITE);
		txtpnKoneksi.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnKoneksi.setEditable(false);
		txtpnKoneksi.setBackground(new Color(204, 0, 0));
		txtpnKoneksi.setBounds(598, 232, 101, 20);
		paneltengahkondisi.add(txtpnKoneksi);
		
		JComboBox comboBoxKondisiSteker = new JComboBox();
		comboBoxKondisiSteker.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Rusak", "Kurang Baik"}));
		comboBoxKondisiSteker.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiSteker.setBackground(Color.WHITE);
		comboBoxKondisiSteker.setBounds(464, 41, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiSteker);
		
		JComboBox comboBoxKondisiLcd = new JComboBox();
		comboBoxKondisiLcd.setModel(new DefaultComboBoxModel(new String[] {"Berfungsi", "Rusak"}));
		comboBoxKondisiLcd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiLcd.setBackground(Color.WHITE);
		comboBoxKondisiLcd.setBounds(464, 74, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiLcd);
		
		JComboBox comboBoxKondisiLampu = new JComboBox();
		comboBoxKondisiLampu.setModel(new DefaultComboBoxModel(new String[] {"Baik 14", "Baik 18", "Baik 5"}));
		comboBoxKondisiLampu.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiLampu.setBackground(Color.WHITE);
		comboBoxKondisiLampu.setBounds(464, 103, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiLampu);
		
		JComboBox comboBoxKondisiKipasAngin = new JComboBox();
		comboBoxKondisiKipasAngin.setModel(new DefaultComboBoxModel(new String[] {"Rusak Semua", "Baik 1", "Baik 2"}));
		comboBoxKondisiKipasAngin.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiKipasAngin.setBackground(Color.WHITE);
		comboBoxKondisiKipasAngin.setBounds(464, 139, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiKipasAngin);
		
		JComboBox comboBoxKondisiAc = new JComboBox();
		comboBoxKondisiAc.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Rusak"}));
		comboBoxKondisiAc.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiAc.setBackground(Color.WHITE);
		comboBoxKondisiAc.setBounds(464, 170, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiAc);
		
		JComboBox comboBoxKondisiCCTV = new JComboBox();
		comboBoxKondisiCCTV.setModel(new DefaultComboBoxModel(new String[] {"Rusak Semua", "Baik 2", "Baik 1"}));
		comboBoxKondisiCCTV.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiCCTV.setBackground(Color.WHITE);
		comboBoxKondisiCCTV.setBounds(464, 198, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiCCTV);
		
		JComboBox comboBoxHotspot = new JComboBox();
		comboBoxHotspot.setModel(new DefaultComboBoxModel(new String[] {"UMM Hotspot", "UMM Hotspot Premiun", "Coro", "Speedy@instan"}));
		comboBoxHotspot.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxHotspot.setBackground(Color.WHITE);
		comboBoxHotspot.setBounds(399, 260, 160, 20);
		paneltengahkondisi.add(comboBoxHotspot);
		
		JTextPane txtpnSsid = new JTextPane();
		txtpnSsid.setText("SSID");
		txtpnSsid.setForeground(Color.WHITE);
		txtpnSsid.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnSsid.setEditable(false);
		txtpnSsid.setBackground(new Color(204, 0, 0));
		txtpnSsid.setBounds(388, 232, 213, 20);
		paneltengahkondisi.add(txtpnSsid);
		
		JComboBox comboBoxLoginHotspot = new JComboBox();
		comboBoxLoginHotspot.setModel(new DefaultComboBoxModel(new String[] {"Tdk Bisa", "Bisa"}));
		comboBoxLoginHotspot.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxLoginHotspot.setBackground(Color.WHITE);
		comboBoxLoginHotspot.setBounds(576, 260, 123, 20);
		paneltengahkondisi.add(comboBoxLoginHotspot);
		
		JComboBox comboBoxPosisiSteker = new JComboBox();
		comboBoxPosisiSteker.setModel(new DefaultComboBoxModel(new String[] {"Pojok&DekatDosen", "DitengahRuang", "DekatPintu"}));
		comboBoxPosisiSteker.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiSteker.setBackground(Color.WHITE);
		comboBoxPosisiSteker.setBounds(578, 41, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiSteker);
		
		JComboBox comboBoxPosisiKabelLcd = new JComboBox();
		comboBoxPosisiKabelLcd.setModel(new DefaultComboBoxModel(new String[] {"DekatPintu", "DekatDosen", "DitengahRuang"}));
		comboBoxPosisiKabelLcd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiKabelLcd.setBackground(Color.WHITE);
		comboBoxPosisiKabelLcd.setBounds(578, 74, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiKabelLcd);
		
		JComboBox comboBoxPosisiLampu = new JComboBox();
		comboBoxPosisiLampu.setModel(new DefaultComboBoxModel(new String[] {"AtapRuangan", "DindingRuangan"}));
		comboBoxPosisiLampu.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiLampu.setBackground(Color.WHITE);
		comboBoxPosisiLampu.setBounds(578, 103, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiLampu);
		
		JComboBox comboBoxPosisiKipasAngin = new JComboBox();
		comboBoxPosisiKipasAngin.setModel(new DefaultComboBoxModel(new String[] {"DindingRuangan", "AtapRuangan"}));
		comboBoxPosisiKipasAngin.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiKipasAngin.setBackground(Color.WHITE);
		comboBoxPosisiKipasAngin.setBounds(576, 139, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiKipasAngin);
		
		JComboBox comboBoxPosisiAC = new JComboBox();
		comboBoxPosisiAC.setModel(new DefaultComboBoxModel(new String[] {"Ditengah", "Dibelakang/Disamping"}));
		comboBoxPosisiAC.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiAC.setBackground(Color.WHITE);
		comboBoxPosisiAC.setBounds(576, 170, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiAC);
		
		JComboBox comboBoxPosisiCCTV = new JComboBox();
		comboBoxPosisiCCTV.setModel(new DefaultComboBoxModel(new String[] {"Depan&Belakang", "Kiri&Kanan"}));
		comboBoxPosisiCCTV.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiCCTV.setBackground(Color.WHITE);
		comboBoxPosisiCCTV.setBounds(578, 198, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiCCTV);
		
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(GUI2.class.getResource("/as/Picture1.png")));
		lblImage.setBounds(0, 0, 781, 410);
		paneltengahkondisi.add(lblImage);
		
		Panel panelataskondisi = new Panel();
		panelKondisi.add(panelataskondisi, BorderLayout.NORTH);
		panelataskondisi.setBackground(new Color(0, 0, 102));
		
		JLabel lblInventarisKelas = new JLabel("Inventaris Kondisi");
		lblInventarisKelas.setForeground(Color.WHITE);
		lblInventarisKelas.setBackground(new Color(0, 0, 153));
		lblInventarisKelas.setIcon(null);
		panelataskondisi.add(lblInventarisKelas);
		lblInventarisKelas.setFont(new Font("Algerian", Font.BOLD, 13));
		
		JPanel panelbawahkondisi = new JPanel();
		panelKondisi.add(panelbawahkondisi, BorderLayout.SOUTH);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(GUI2.class.getResource("/as/left-28998_641.png")));
		panelKondisi.add(button_1, BorderLayout.EAST);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InventarisKebersihan invber = new InventarisKebersihan();
				invber.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 0, 102));
		button_1.setToolTipText("Next");
		
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setIcon(new ImageIcon(GUI2.class.getResource("/as/load-md.png")));
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					kondisi = BacaTulisFile.bacaKondisi();
					textFieldNamaRuang.setText(kondisi.getNamaRuang());
					comboBoxLokasi.setSelectedItem(kondisi.getLokasiRuang());
					comboBoxFakultas.setSelectedItem(kondisi.getFakultas());
					textFieldPanjang.setText(kondisi.getPanjangRuang()+"");
					textFieldLebar.setText(kondisi.getLebarRuang()+"");
					textFieldJumlahKursi.setText(kondisi.getJumlahKursi()+"");
					textFieldJumlahPintu.setText(kondisi.getJumlahPintu()+"");
					textFieldJumlahJendela.setText(kondisi.getJumlahJendela()+"");
					textFieldJumlahSteker.setText(kondisi.getJumlahStopkontak()+"");
					comboBoxKondisiSteker.setSelectedIndex(kondisi.getKondisiStopKontak());
					comboBoxPosisiSteker.setSelectedIndex(kondisi.getPosisiStopKontak());
					textFieldJumlahLcd.setText(kondisi.getJumlahKabelLcd()+"");
					comboBoxKondisiLcd.setSelectedIndex(kondisi.getKondisiKabelLcd());
					comboBoxPosisiKabelLcd.setSelectedIndex(kondisi.getPosisiKabelLcd());
					textFieldJumlahLampu.setText(kondisi.getJumlahLampu()+"");
					comboBoxKondisiLampu.setSelectedIndex(kondisi.getKondisiLampu());
					comboBoxPosisiLampu.setSelectedIndex(kondisi.getPosisiLampu());
					textFieldJumlahKipasAngin.setText(kondisi.getJumlahKipasAngin()+"");
					comboBoxKondisiKipasAngin.setSelectedIndex(kondisi.getKondisiKipasAngin());
					comboBoxPosisiKipasAngin.setSelectedIndex(kondisi.getPosisiKipasAngin());
					textFieldJumlahAC.setText(kondisi.getJumlahAc()+"");
					comboBoxKondisiAc.setSelectedIndex(kondisi.getKondisiAc());
					comboBoxPosisiAC.setSelectedIndex(kondisi.getPosisiAc());
					comboBoxHotspot.setSelectedIndex(kondisi.getSSID());
					comboBoxLoginHotspot.setSelectedIndex(kondisi.getInputBandwidth());
					textFieldJumlahCCTV.setText(kondisi.getJumlahCctv()+"");
					comboBoxKondisiCCTV.setSelectedIndex(kondisi.getKondisiCctv());
					comboBoxPosisiCCTV.setSelectedIndex(kondisi.getPosisiCctv());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "File Tidak Ada / Tidak Lengkap", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		btnLoad.setForeground(Color.WHITE);
		btnLoad.setBackground(new Color(0, 0, 102));
		panelbawahkondisi.setLayout(new BorderLayout(0, 0));
		panelbawahkondisi.add(btnLoad, BorderLayout.EAST);
		
		JButton buttonAnalisis = new JButton("Analisis");
		buttonAnalisis.setIcon(new ImageIcon(GUI2.class.getResource("/as/input-25064_640.png")));
		buttonAnalisis.setForeground(Color.WHITE);
		buttonAnalisis.setBackground(new Color(0, 0, 102));
		buttonAnalisis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					kondisi = new JumlahKondisidanPosisiSarana();
					kondisi.setNamaRuang(textFieldNamaRuang.getText());
					kondisi.setLokasiRuang(comboBoxLokasi.getSelectedItem()+"");
					kondisi.setFakultas(comboBoxFakultas.getSelectedItem()+"");
					kondisi.setPanjangRuang(Integer.parseInt(textFieldPanjang.getText()));
					kondisi.setLebarRuang(Integer.parseInt(textFieldLebar.getText()));
					kondisi.setJumlahKursi(Integer.parseInt(textFieldJumlahKursi.getText()));
					kondisi.setJumlahPintu(Integer.parseInt(textFieldJumlahPintu.getText()));
					kondisi.setJumlahJendela(Integer.parseInt(textFieldJumlahJendela.getText()));
					
					kondisi.setJumlahStopkontak(Integer.parseInt(textFieldJumlahSteker.getText()));
					kondisi.setKondisiStopKontak(comboBoxKondisiSteker.getSelectedIndex());
					kondisi.setPosisiStopKontak(comboBoxPosisiSteker.getSelectedIndex());
					
					kondisi.setJumlahKabelLcd(Integer.parseInt(textFieldJumlahLcd.getText()));
					kondisi.setKondisiKabelLcd(comboBoxKondisiLcd.getSelectedIndex());
					kondisi.setPosisiKabelLcd(comboBoxPosisiKabelLcd.getSelectedIndex());
					
					kondisi.setJumlahLampu(Integer.parseInt(textFieldJumlahLampu.getText()));
					kondisi.setKondisiLampu(comboBoxKondisiLampu.getSelectedIndex());
					kondisi.setPosisiLampu(comboBoxPosisiLampu.getSelectedIndex());
					
					kondisi.setJumlahKipasAngin(Integer.parseInt(textFieldJumlahKipasAngin.getText()));
					kondisi.setKondisiKipasAngin(comboBoxKondisiKipasAngin.getSelectedIndex());
					kondisi.setPosisiKipasAngin(comboBoxPosisiKipasAngin.getSelectedIndex());
					
					kondisi.setJumlahAc(Integer.parseInt(textFieldJumlahAC.getText()));
					kondisi.setKondisiAc(comboBoxKondisiAc.getSelectedIndex());
					kondisi.setPosisiAc(comboBoxPosisiAC.getSelectedIndex());
					
					kondisi.setSSID(comboBoxHotspot.getSelectedIndex());
					kondisi.setInputBandwidth(comboBoxLoginHotspot.getSelectedIndex());
					
					kondisi.setJumlahCctv(Integer.parseInt(textFieldJumlahCCTV.getText()));
					kondisi.setKondisiCctv(comboBoxKondisiCCTV.getSelectedIndex());
					kondisi.setPosisiCctv(comboBoxPosisiCCTV.getSelectedIndex());
					
					BacaTulisFile.simpanKondisi(kondisi);

					AnalisisKondisi an = new AnalisisKondisi();
					an.setVisible(true);
					new Diagram(kondisi.hitungSesuai(), kondisi.hitungTdkSesuai());
					
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "input dengan benar : "+e, "Erorr", JOptionPane.ERROR_MESSAGE);
				}
				
		
			}
		});
		panelbawahkondisi.add(buttonAnalisis, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(204, 0, 0));
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setIcon(new ImageIcon(GUI2.class.getResource("/as/Card-file-icon.png")));
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnFile.setForeground(Color.WHITE);
		menuBar.add(mnFile);
		
		JMenuItem mntmLogout = new JMenuItem("LogOut");
		mntmLogout.setIcon(new ImageIcon(GUI2.class.getResource("/as/logout.png")));
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Login log = new Login();
				log.setVisible(true);
			}
		});
		mnFile.add(mntmLogout);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon(GUI2.class.getResource("/as/logout (1).png")));
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		mnFile.addSeparator();
		mnFile.add(mntmExit);
		
		JMenu mnAuthors = new JMenu("Authors");
		mnAuthors.setIcon(new ImageIcon(GUI2.class.getResource("/as/User.png")));
		mnAuthors.setForeground(Color.WHITE);
		menuBar.add(mnAuthors);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Tri Fidrian Arya");
		mntmNewMenuItem.setIcon(new ImageIcon(GUI2.class.getResource("/as/Messenger.png")));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
					Desktop.getDesktop().browse(new URL("https://www.facebook.com/Tri.Fidrian.Arya").toURI());
					   
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Gagal Membuka", "Error", JOptionPane.ERROR_MESSAGE);
					}
			}
			
		});
		mnAuthors.add(mntmNewMenuItem);
		
		JMenuItem mntmFaridRamadan = new JMenuItem("Farid Ramadan");
		mntmFaridRamadan.setIcon(new ImageIcon(GUI2.class.getResource("/as/Messenger.png")));
		mntmFaridRamadan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					Desktop.getDesktop().browse(new URL("https://www.facebook.com/farid.cliquers.904?fref=ts").toURI());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Gagal Membuka", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		mnAuthors.add(mntmFaridRamadan);
		
		JMenuItem mntmAlfianNoorArafah = new JMenuItem("Alfian Noor Arafah");
		mntmAlfianNoorArafah.setIcon(new ImageIcon(GUI2.class.getResource("/as/Messenger.png")));
		mntmAlfianNoorArafah.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.facebook.com/alfiannoorarafah.arafah?fref=ts").toURI());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Gagal Membuka", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		mnAuthors.add(mntmAlfianNoorArafah);
	}
}
