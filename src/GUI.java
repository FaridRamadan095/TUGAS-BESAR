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

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

import org.omg.CORBA.ExceptionList;

import javax.swing.JTabbedPane;


public class GUI extends JFrame implements Serializable {

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
	
	private JTextField textFieldPencahayaan;
	private JTextField textFieldSuhu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
<<<<<<< HEAD
		setBounds(100, 100, 797, 500);
=======
		setResizable(false);
		setBounds(100, 100, 797, 477);
>>>>>>> origin/master
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelKondisi = new JPanel();
		tabbedPane.addTab("Kondisi", null, panelKondisi, "Kondisi Inventaris");
		panelKondisi.setLayout(new BorderLayout(0, 0));
		
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
		textFieldNamaRuang.setBounds(140, 10, 173, 20);
		paneltengahkondisi.add(textFieldNamaRuang);
		textFieldNamaRuang.setColumns(10);
		
		JComboBox comboBoxLokasi = new JComboBox();
		comboBoxLokasi.setBackground(new Color(255, 204, 51));
		comboBoxLokasi.setModel(new DefaultComboBoxModel(new String[] {"GKB I", "GKB II", "GKB III"}));
		comboBoxLokasi.setBounds(140, 38, 173, 20);
		paneltengahkondisi.add(comboBoxLokasi);
		
		JComboBox comboBoxFakultas = new JComboBox();
		comboBoxFakultas.setBackground(new Color(255, 204, 51));
		comboBoxFakultas.setModel(new DefaultComboBoxModel(new String[] {"Teknik", "FEB", "FPP", "FAI", "FK", "FIKES", "Hukum", "FISIP", "FKIP", "Psikologi"}));
		comboBoxFakultas.setBounds(140, 63, 173, 20);
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
		canvas.setBounds(317, 0, 5, 400);
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
		txtpnSteker.setBounds(327, 43, 85, 20);
		paneltengahkondisi.add(txtpnSteker);
		
		JTextPane textPaneLCD = new JTextPane();
		textPaneLCD.setText("Kabel LCD");
		textPaneLCD.setForeground(Color.WHITE);
		textPaneLCD.setFont(new Font("Tahoma", Font.BOLD, 11));
		textPaneLCD.setEditable(false);
		textPaneLCD.setBackground(new Color(0, 0, 153));
		textPaneLCD.setBounds(327, 74, 85, 20);
		paneltengahkondisi.add(textPaneLCD);
		
		JTextPane txtpnLampu = new JTextPane();
		txtpnLampu.setText("Lampu");
		txtpnLampu.setForeground(Color.WHITE);
		txtpnLampu.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnLampu.setEditable(false);
		txtpnLampu.setBackground(new Color(0, 0, 153));
		txtpnLampu.setBounds(327, 106, 85, 20);
		paneltengahkondisi.add(txtpnLampu);
		
		JTextPane txtpnKipasAngin = new JTextPane();
		txtpnKipasAngin.setText("Kipas Angin");
		txtpnKipasAngin.setForeground(Color.WHITE);
		txtpnKipasAngin.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnKipasAngin.setEditable(false);
		txtpnKipasAngin.setBackground(new Color(0, 0, 153));
		txtpnKipasAngin.setBounds(327, 139, 85, 20);
		paneltengahkondisi.add(txtpnKipasAngin);
		
		JTextPane txtpnAc = new JTextPane();
		txtpnAc.setText("AC");
		txtpnAc.setForeground(Color.WHITE);
		txtpnAc.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnAc.setEditable(false);
		txtpnAc.setBackground(new Color(0, 0, 153));
		txtpnAc.setBounds(327, 170, 85, 20);
		paneltengahkondisi.add(txtpnAc);
		
		JTextPane txtpnHotspot = new JTextPane();
		txtpnHotspot.setText("Hotspot");
		txtpnHotspot.setForeground(Color.WHITE);
		txtpnHotspot.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnHotspot.setEditable(false);
		txtpnHotspot.setBackground(new Color(0, 0, 153));
		txtpnHotspot.setBounds(327, 260, 85, 20);
		paneltengahkondisi.add(txtpnHotspot);
		
		JTextPane txtpnCctv = new JTextPane();
		txtpnCctv.setText("CCTV");
		txtpnCctv.setForeground(Color.WHITE);
		txtpnCctv.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnCctv.setEditable(false);
		txtpnCctv.setBackground(new Color(0, 0, 153));
		txtpnCctv.setBounds(327, 201, 85, 20);
		paneltengahkondisi.add(txtpnCctv);
		
		JTextPane txtpnPrasarana = new JTextPane();
		txtpnPrasarana.setText("Prasarana");
		txtpnPrasarana.setForeground(Color.WHITE);
		txtpnPrasarana.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnPrasarana.setEditable(false);
		txtpnPrasarana.setBackground(new Color(204, 0, 0));
		txtpnPrasarana.setBounds(327, 10, 96, 20);
		paneltengahkondisi.add(txtpnPrasarana);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(new Color(204, 0, 0));
		canvas_1.setBounds(418, 10, 5, 275);
		paneltengahkondisi.add(canvas_1);
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(new Color(204, 0, 0));
		canvas_2.setBounds(487, 28, 5, 242);
		paneltengahkondisi.add(canvas_2);
		
		JTextPane txtpnJumlah = new JTextPane();
		txtpnJumlah.setText("Jumlah");
		txtpnJumlah.setForeground(Color.WHITE);
		txtpnJumlah.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnJumlah.setEditable(false);
		txtpnJumlah.setBackground(new Color(204, 0, 0));
		txtpnJumlah.setBounds(419, 10, 72, 20);
		paneltengahkondisi.add(txtpnJumlah);
		
		JTextPane txtpnKondisi = new JTextPane();
		txtpnKondisi.setText("Kondisi");
		txtpnKondisi.setForeground(Color.WHITE);
		txtpnKondisi.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnKondisi.setEditable(false);
		txtpnKondisi.setBackground(new Color(204, 0, 0));
		txtpnKondisi.setBounds(494, 10, 133, 20);
		paneltengahkondisi.add(txtpnKondisi);
		
		JTextPane txtpnPosisi = new JTextPane();
		txtpnPosisi.setText("Posisi");
		txtpnPosisi.setForeground(Color.WHITE);
		txtpnPosisi.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnPosisi.setEditable(false);
		txtpnPosisi.setBackground(new Color(204, 0, 0));
		txtpnPosisi.setBounds(627, 10, 105, 20);
		paneltengahkondisi.add(txtpnPosisi);
		
		Canvas canvas_3 = new Canvas();
		canvas_3.setBackground(new Color(204, 0, 0));
		canvas_3.setBounds(598, 11, 5, 275);
		paneltengahkondisi.add(canvas_3);
		
		textFieldJumlahSteker = new JTextField();
		textFieldJumlahSteker.setColumns(10);
		textFieldJumlahSteker.setBackground(new Color(255, 204, 51));
		textFieldJumlahSteker.setBounds(432, 43, 51, 20);
		paneltengahkondisi.add(textFieldJumlahSteker);
		
		textFieldJumlahLcd = new JTextField();
		textFieldJumlahLcd.setColumns(10);
		textFieldJumlahLcd.setBackground(new Color(255, 204, 51));
		textFieldJumlahLcd.setBounds(432, 74, 51, 20);
		paneltengahkondisi.add(textFieldJumlahLcd);
		
		textFieldJumlahLampu = new JTextField();
		textFieldJumlahLampu.setColumns(10);
		textFieldJumlahLampu.setBackground(new Color(255, 204, 51));
		textFieldJumlahLampu.setBounds(432, 103, 51, 20);
		paneltengahkondisi.add(textFieldJumlahLampu);
		
		textFieldJumlahKipasAngin = new JTextField();
		textFieldJumlahKipasAngin.setColumns(10);
		textFieldJumlahKipasAngin.setBackground(new Color(255, 204, 51));
		textFieldJumlahKipasAngin.setBounds(432, 139, 51, 20);
		paneltengahkondisi.add(textFieldJumlahKipasAngin);
		
		textFieldJumlahAC = new JTextField();
		textFieldJumlahAC.setColumns(10);
		textFieldJumlahAC.setBackground(new Color(255, 204, 51));
		textFieldJumlahAC.setBounds(432, 170, 51, 20);
		paneltengahkondisi.add(textFieldJumlahAC);
		
		textFieldJumlahCCTV = new JTextField();
		textFieldJumlahCCTV.setColumns(10);
		textFieldJumlahCCTV.setBackground(new Color(255, 204, 51));
		textFieldJumlahCCTV.setBounds(432, 198, 51, 20);
		paneltengahkondisi.add(textFieldJumlahCCTV);
		
		JTextPane txtpnKoneksi = new JTextPane();
		txtpnKoneksi.setText("Koneksi");
		txtpnKoneksi.setForeground(Color.WHITE);
		txtpnKoneksi.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnKoneksi.setEditable(false);
		txtpnKoneksi.setBackground(new Color(204, 0, 0));
		txtpnKoneksi.setBounds(631, 232, 101, 20);
		paneltengahkondisi.add(txtpnKoneksi);
		
		JComboBox comboBoxKondisiSteker = new JComboBox();
		comboBoxKondisiSteker.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Rusak", "Kurang Baik"}));
		comboBoxKondisiSteker.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiSteker.setBackground(Color.WHITE);
		comboBoxKondisiSteker.setBounds(497, 41, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiSteker);
		
		JComboBox comboBoxKondisiLcd = new JComboBox();
		comboBoxKondisiLcd.setModel(new DefaultComboBoxModel(new String[] {"Berfungsi", "Rusak"}));
		comboBoxKondisiLcd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiLcd.setBackground(Color.WHITE);
		comboBoxKondisiLcd.setBounds(497, 74, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiLcd);
		
		JComboBox comboBoxKondisiLampu = new JComboBox();
		comboBoxKondisiLampu.setModel(new DefaultComboBoxModel(new String[] {"Baik 14", "Baik 18", "Baik 5"}));
		comboBoxKondisiLampu.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiLampu.setBackground(Color.WHITE);
		comboBoxKondisiLampu.setBounds(497, 103, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiLampu);
		
		JComboBox comboBoxKondisiKipasAngin = new JComboBox();
		comboBoxKondisiKipasAngin.setModel(new DefaultComboBoxModel(new String[] {"Rusak Semua", "Baik 1", "Baik 2"}));
		comboBoxKondisiKipasAngin.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiKipasAngin.setBackground(Color.WHITE);
		comboBoxKondisiKipasAngin.setBounds(497, 139, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiKipasAngin);
		
		JComboBox comboBoxKondisiAc = new JComboBox();
		comboBoxKondisiAc.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Rusak"}));
		comboBoxKondisiAc.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiAc.setBackground(Color.WHITE);
		comboBoxKondisiAc.setBounds(497, 170, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiAc);
		
		JComboBox comboBoxKondisiCCTV = new JComboBox();
		comboBoxKondisiCCTV.setModel(new DefaultComboBoxModel(new String[] {"Rusak Semua", "Baik 2", "Baik 1"}));
		comboBoxKondisiCCTV.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiCCTV.setBackground(Color.WHITE);
		comboBoxKondisiCCTV.setBounds(497, 198, 95, 20);
		paneltengahkondisi.add(comboBoxKondisiCCTV);
		
		JComboBox comboBoxHotspot = new JComboBox();
		comboBoxHotspot.setModel(new DefaultComboBoxModel(new String[] {"UMM Hotspot", "UMM Hotspot Premiun", "Coro", "Speedy@instan"}));
		comboBoxHotspot.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxHotspot.setBackground(Color.WHITE);
		comboBoxHotspot.setBounds(432, 260, 160, 20);
		paneltengahkondisi.add(comboBoxHotspot);
		
		JTextPane txtpnSsid = new JTextPane();
		txtpnSsid.setText("SSID");
		txtpnSsid.setForeground(Color.WHITE);
		txtpnSsid.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnSsid.setEditable(false);
		txtpnSsid.setBackground(new Color(204, 0, 0));
		txtpnSsid.setBounds(421, 232, 213, 20);
		paneltengahkondisi.add(txtpnSsid);
		
		JComboBox comboBoxLoginHotspot = new JComboBox();
		comboBoxLoginHotspot.setModel(new DefaultComboBoxModel(new String[] {"Tdk Bisa", "Bisa"}));
		comboBoxLoginHotspot.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxLoginHotspot.setBackground(Color.WHITE);
		comboBoxLoginHotspot.setBounds(609, 260, 123, 20);
		paneltengahkondisi.add(comboBoxLoginHotspot);
		
		JComboBox comboBoxPosisiSteker = new JComboBox();
		comboBoxPosisiSteker.setModel(new DefaultComboBoxModel(new String[] {"Pojok&DekatDosen", "DitengahRuang", "DekatPintu"}));
		comboBoxPosisiSteker.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiSteker.setBackground(Color.WHITE);
		comboBoxPosisiSteker.setBounds(611, 41, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiSteker);
		
		JComboBox comboBoxPosisiKabelLcd = new JComboBox();
		comboBoxPosisiKabelLcd.setModel(new DefaultComboBoxModel(new String[] {"DekatPintu", "DekatDosen", "DitengahRuang"}));
		comboBoxPosisiKabelLcd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiKabelLcd.setBackground(Color.WHITE);
		comboBoxPosisiKabelLcd.setBounds(611, 74, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiKabelLcd);
		
		JComboBox comboBoxPosisiLampu = new JComboBox();
		comboBoxPosisiLampu.setModel(new DefaultComboBoxModel(new String[] {"AtapRuangan", "DindingRuangan"}));
		comboBoxPosisiLampu.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiLampu.setBackground(Color.WHITE);
		comboBoxPosisiLampu.setBounds(611, 103, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiLampu);
		
		JComboBox comboBoxPosisiKipasAngin = new JComboBox();
		comboBoxPosisiKipasAngin.setModel(new DefaultComboBoxModel(new String[] {"DindingRuangan", "AtapRuangan"}));
		comboBoxPosisiKipasAngin.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiKipasAngin.setBackground(Color.WHITE);
		comboBoxPosisiKipasAngin.setBounds(609, 139, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiKipasAngin);
		
		JComboBox comboBoxPosisiAC = new JComboBox();
		comboBoxPosisiAC.setModel(new DefaultComboBoxModel(new String[] {"Ditengah", "Dibelakang/Disamping"}));
		comboBoxPosisiAC.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiAC.setBackground(Color.WHITE);
		comboBoxPosisiAC.setBounds(609, 170, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiAC);
		
		JComboBox comboBoxPosisiCCTV = new JComboBox();
		comboBoxPosisiCCTV.setModel(new DefaultComboBoxModel(new String[] {"Depan&Belakang", "Kiri&Kanan"}));
		comboBoxPosisiCCTV.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxPosisiCCTV.setBackground(Color.WHITE);
		comboBoxPosisiCCTV.setBounds(611, 198, 121, 20);
		paneltengahkondisi.add(comboBoxPosisiCCTV);
		
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(GUI.class.getResource("/as/Picture1.png")));
		lblImage.setBounds(0, 0, 781, 410);
		paneltengahkondisi.add(lblImage);
		
		JButton button_1 = new JButton(">");
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
<<<<<<< HEAD
		panelbawahkondisi.setLayout(new BorderLayout(0, 0));
		panelbawahkondisi.add(btnLoad, BorderLayout.EAST);
=======
		panel_1.setLayout(new BorderLayout(0, 0));
		panel_1.add(btnLoad, BorderLayout.EAST);
>>>>>>> origin/master
		
		JButton buttonAnalisis = new JButton("Analisis");
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
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "input dengan benar : "+e, "Erorr", JOptionPane.ERROR_MESSAGE);
				}
				
		
			}
		});
		panelbawahkondisi.add(buttonAnalisis, BorderLayout.CENTER);
		
		JPanel panelKebersihan = new JPanel();
		tabbedPane.addTab("Kebersihan", null, panelKebersihan, null);
		panelKebersihan.setLayout(new BorderLayout(0, 0));
		
		JPanel panelataskebersihan = new JPanel();
		panelataskebersihan.setBackground(new Color(153, 0, 0));
		panelKebersihan.add(panelataskebersihan, BorderLayout.NORTH);
		
		JLabel labelk = new JLabel("Inventaris Kebersihan");
		labelk.setForeground(Color.WHITE);
		labelk.setFont(new Font("Algerian", Font.BOLD, 12));
		panelataskebersihan.add(labelk);
		
		JPanel paneltengahkebersihan = new JPanel();
		paneltengahkebersihan.setLayout(null);
		panelKebersihan.add(paneltengahkebersihan, BorderLayout.CENTER);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Aspek Lingkungan");
		textPane.setForeground(Color.WHITE);
		textPane.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textPane.setEditable(false);
		textPane.setBackground(new Color(0, 0, 102));
		textPane.setBounds(39, 11, 127, 20);
		paneltengahkebersihan.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Kondisi");
		textPane_1.setForeground(Color.WHITE);
		textPane_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textPane_1.setEditable(false);
		textPane_1.setBackground(new Color(0, 0, 102));
		textPane_1.setBounds(164, 11, 149, 20);
		paneltengahkebersihan.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Lantai");
		textPane_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_2.setEditable(false);
		textPane_2.setBackground(new Color(255, 204, 0));
		textPane_2.setBounds(45, 39, 98, 20);
		paneltengahkebersihan.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Dinding");
		textPane_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_3.setEditable(false);
		textPane_3.setBackground(new Color(255, 204, 0));
		textPane_3.setBounds(45, 70, 98, 20);
		paneltengahkebersihan.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("Atap");
		textPane_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_4.setEditable(false);
		textPane_4.setBackground(new Color(255, 204, 0));
		textPane_4.setBounds(45, 101, 98, 20);
		paneltengahkebersihan.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("Pintu");
		textPane_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_5.setEditable(false);
		textPane_5.setBackground(new Color(255, 204, 0));
		textPane_5.setBounds(45, 132, 98, 20);
		paneltengahkebersihan.add(textPane_5);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("Jendela");
		textPane_6.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_6.setEditable(false);
		textPane_6.setBackground(new Color(255, 204, 0));
		textPane_6.setBounds(45, 163, 98, 20);
		paneltengahkebersihan.add(textPane_6);
		
		JComboBox comboBoxKondisiLantai = new JComboBox();
		comboBoxKondisiLantai.setForeground(Color.WHITE);
		comboBoxKondisiLantai.setBackground(Color.GRAY);
		comboBoxKondisiLantai.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiLantai.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Kotor", "Berantakan"}));
		comboBoxKondisiLantai.setBounds(164, 39, 141, 20);
		paneltengahkebersihan.add(comboBoxKondisiLantai);
		
		JComboBox comboBoxKondisiDinding = new JComboBox();
		comboBoxKondisiDinding.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Kotor", "Berantakan"}));
		comboBoxKondisiDinding.setForeground(Color.WHITE);
		comboBoxKondisiDinding.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiDinding.setBackground(Color.GRAY);
		comboBoxKondisiDinding.setBounds(164, 70, 141, 20);
		paneltengahkebersihan.add(comboBoxKondisiDinding);
		
		JComboBox comboBoxKondisiAtap = new JComboBox();
		comboBoxKondisiAtap.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Kotor", "Berantakan"}));
		comboBoxKondisiAtap.setForeground(Color.WHITE);
		comboBoxKondisiAtap.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiAtap.setBackground(Color.GRAY);
		comboBoxKondisiAtap.setBounds(164, 101, 141, 20);
		paneltengahkebersihan.add(comboBoxKondisiAtap);
		
		JComboBox comboBoxKondisiPintu = new JComboBox();
		comboBoxKondisiPintu.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Kotor", "Berantakan"}));
		comboBoxKondisiPintu.setForeground(Color.WHITE);
		comboBoxKondisiPintu.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiPintu.setBackground(Color.GRAY);
		comboBoxKondisiPintu.setBounds(164, 132, 141, 20);
		paneltengahkebersihan.add(comboBoxKondisiPintu);
		
		JComboBox comboBoxKondisiJendela = new JComboBox();
		comboBoxKondisiJendela.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Kotor", "Berantakan"}));
		comboBoxKondisiJendela.setForeground(Color.WHITE);
		comboBoxKondisiJendela.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKondisiJendela.setBackground(Color.GRAY);
		comboBoxKondisiJendela.setBounds(164, 163, 141, 20);
		paneltengahkebersihan.add(comboBoxKondisiJendela);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("Aspek Kebersihan");
		textPane_7.setForeground(Color.WHITE);
		textPane_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textPane_7.setEditable(false);
		textPane_7.setBackground(new Color(0, 0, 102));
		textPane_7.setBounds(39, 194, 127, 20);
		paneltengahkebersihan.add(textPane_7);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText("Kondisi");
		textPane_8.setForeground(Color.WHITE);
		textPane_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textPane_8.setEditable(false);
		textPane_8.setBackground(new Color(0, 0, 102));
		textPane_8.setBounds(164, 194, 149, 20);
		paneltengahkebersihan.add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText("Sirkulasi Udara");
		textPane_9.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_9.setEditable(false);
		textPane_9.setBackground(new Color(255, 204, 0));
		textPane_9.setBounds(45, 220, 98, 20);
		paneltengahkebersihan.add(textPane_9);
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setText("Pencahayaan");
		textPane_10.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_10.setEditable(false);
		textPane_10.setBackground(new Color(255, 204, 0));
		textPane_10.setBounds(45, 251, 98, 20);
		paneltengahkebersihan.add(textPane_10);
		
		JTextPane textPane_11 = new JTextPane();
		textPane_11.setText("Kelembapan");
		textPane_11.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_11.setEditable(false);
		textPane_11.setBackground(new Color(255, 204, 0));
		textPane_11.setBounds(45, 282, 98, 20);
		paneltengahkebersihan.add(textPane_11);
		
		JTextPane textPane_12 = new JTextPane();
		textPane_12.setText("Suhu");
		textPane_12.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_12.setEditable(false);
		textPane_12.setBackground(new Color(255, 204, 0));
		textPane_12.setBounds(45, 313, 98, 20);
		paneltengahkebersihan.add(textPane_12);
		
		JComboBox comboBoxSirkulasiUdara = new JComboBox();
		comboBoxSirkulasiUdara.setModel(new DefaultComboBoxModel(new String[] {"KurangLancar", "Lancar"}));
		comboBoxSirkulasiUdara.setForeground(Color.WHITE);
		comboBoxSirkulasiUdara.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxSirkulasiUdara.setBackground(Color.GRAY);
		comboBoxSirkulasiUdara.setBounds(164, 220, 141, 20);
		paneltengahkebersihan.add(comboBoxSirkulasiUdara);
		
		
		textFieldPencahayaan = new JTextField();
		textFieldPencahayaan.setBackground(Color.GRAY);
		textFieldPencahayaan.setBounds(164, 251, 86, 20);
		paneltengahkebersihan.add(textFieldPencahayaan);
		textFieldPencahayaan.setColumns(10);
		
		JLabel lblangka = new JLabel("(NUMBER)");
		lblangka.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblangka.setForeground(new Color(0, 0, 102));
		lblangka.setBounds(260, 257, 62, 14);
		paneltengahkebersihan.add(lblangka);
		
		JLabel label = new JLabel("%");
		label.setForeground(new Color(0, 0, 102));
		label.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label.setBounds(260, 288, 62, 14);
		paneltengahkebersihan.add(label);
		
		JComboBox comboBoxKelembapan = new JComboBox();
		comboBoxKelembapan.setModel(new DefaultComboBoxModel(new String[] {"10", "20", "30", "40", "50", "60", "70", "80", "90", "100"}));
		comboBoxKelembapan.setForeground(Color.WHITE);
		comboBoxKelembapan.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKelembapan.setBackground(Color.GRAY);
		comboBoxKelembapan.setBounds(164, 282, 86, 20);
		paneltengahkebersihan.add(comboBoxKelembapan);
		
		textFieldSuhu = new JTextField();
		textFieldSuhu.setBackground(Color.GRAY);
		textFieldSuhu.setColumns(10);
		textFieldSuhu.setBounds(164, 313, 86, 20);
		paneltengahkebersihan.add(textFieldSuhu);
		
		JLabel lblCelcius = new JLabel("Celcius");
		lblCelcius.setForeground(new Color(0, 0, 102));
		lblCelcius.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCelcius.setBounds(260, 319, 62, 14);
		paneltengahkebersihan.add(lblCelcius);
		
		Canvas canvas_4 = new Canvas();
		canvas_4.setBackground(new Color(0, 0, 102));
		canvas_4.setBounds(149, 11, 5, 330);
		paneltengahkebersihan.add(canvas_4);
		
		JTextPane textPane_13 = new JTextPane();
		textPane_13.setText("Aspek Kenyamanan");
		textPane_13.setForeground(Color.WHITE);
		textPane_13.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textPane_13.setEditable(false);
		textPane_13.setBackground(new Color(0, 0, 102));
		textPane_13.setBounds(373, 132, 127, 20);
		paneltengahkebersihan.add(textPane_13);
		
		JTextPane textPane_14 = new JTextPane();
		textPane_14.setText("Kondisi");
		textPane_14.setForeground(Color.WHITE);
		textPane_14.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textPane_14.setEditable(false);
		textPane_14.setBackground(new Color(0, 0, 102));
		textPane_14.setBounds(498, 132, 149, 20);
		paneltengahkebersihan.add(textPane_14);
		
		JTextPane textPane_15 = new JTextPane();
		textPane_15.setText("Kebisingan");
		textPane_15.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_15.setEditable(false);
		textPane_15.setBackground(new Color(255, 204, 0));
		textPane_15.setBounds(379, 160, 98, 20);
		paneltengahkebersihan.add(textPane_15);
		
		JTextPane textPane_16 = new JTextPane();
		textPane_16.setText("Bau");
		textPane_16.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_16.setEditable(false);
		textPane_16.setBackground(new Color(255, 204, 0));
		textPane_16.setBounds(379, 189, 98, 20);
		paneltengahkebersihan.add(textPane_16);
		
		JTextPane textPane_17 = new JTextPane();
		textPane_17.setText("Kebocoran");
		textPane_17.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_17.setEditable(false);
		textPane_17.setBackground(new Color(255, 204, 0));
		textPane_17.setBounds(379, 222, 98, 20);
		paneltengahkebersihan.add(textPane_17);
		
		JTextPane textPane_18 = new JTextPane();
		textPane_18.setText("Kerusakan");
		textPane_18.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_18.setEditable(false);
		textPane_18.setBackground(new Color(255, 204, 0));
		textPane_18.setBounds(379, 253, 98, 20);
		paneltengahkebersihan.add(textPane_18);
		
		JTextPane textPane_19 = new JTextPane();
		textPane_19.setText("Keausan");
		textPane_19.setFont(new Font("Times New Roman", Font.BOLD, 11));
		textPane_19.setEditable(false);
		textPane_19.setBackground(new Color(255, 204, 0));
		textPane_19.setBounds(379, 284, 98, 20);
		paneltengahkebersihan.add(textPane_19);
		
		JComboBox comboBoxKebisingan = new JComboBox();
		comboBoxKebisingan.setModel(new DefaultComboBoxModel(new String[] {"Tidak Bising", "Bising"}));
		comboBoxKebisingan.setForeground(Color.WHITE);
		comboBoxKebisingan.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKebisingan.setBackground(Color.GRAY);
		comboBoxKebisingan.setBounds(498, 158, 141, 20);
		paneltengahkebersihan.add(comboBoxKebisingan);
		
		JComboBox comboBoxBau = new JComboBox();
		comboBoxBau.setModel(new DefaultComboBoxModel(new String[] {"Bau", "Tidak Bau"}));
		comboBoxBau.setForeground(Color.WHITE);
		comboBoxBau.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxBau.setBackground(Color.GRAY);
		comboBoxBau.setBounds(498, 189, 141, 20);
		paneltengahkebersihan.add(comboBoxBau);
		
		JComboBox comboBoxKebocoran = new JComboBox();
		comboBoxKebocoran.setModel(new DefaultComboBoxModel(new String[] {"Bocor", "Tidak Bocor"}));
		comboBoxKebocoran.setForeground(Color.WHITE);
		comboBoxKebocoran.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKebocoran.setBackground(Color.GRAY);
		comboBoxKebocoran.setBounds(498, 220, 141, 20);
		paneltengahkebersihan.add(comboBoxKebocoran);
		
		JComboBox comboBoxKerusakan = new JComboBox();
		comboBoxKerusakan.setModel(new DefaultComboBoxModel(new String[] {"Tidak Rusak", "Rusak"}));
		comboBoxKerusakan.setForeground(Color.WHITE);
		comboBoxKerusakan.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKerusakan.setBackground(Color.GRAY);
		comboBoxKerusakan.setBounds(498, 251, 141, 20);
		paneltengahkebersihan.add(comboBoxKerusakan);
		
		JComboBox comboBoxKeausan = new JComboBox();
		comboBoxKeausan.setModel(new DefaultComboBoxModel(new String[] {"Aus", "Tidak Aus"}));
		comboBoxKeausan.setForeground(Color.WHITE);
		comboBoxKeausan.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBoxKeausan.setBackground(Color.GRAY);
		comboBoxKeausan.setBounds(498, 284, 141, 20);
		paneltengahkebersihan.add(comboBoxKeausan);
		
		JTextPane txtpnNamaruang = new JTextPane();
		txtpnNamaruang.setEditable(false);
		txtpnNamaruang.setText(BacaTulisFile.bacaKondisi().getNamaRuang());
		txtpnNamaruang.setFont(new Font("Times New Roman", Font.BOLD, 11));
		txtpnNamaruang.setBackground(new Color(255, 204, 0));
		txtpnNamaruang.setBounds(563, 11, 122, 20);
		paneltengahkebersihan.add(txtpnNamaruang);
		
		JTextPane txtpnFakultas = new JTextPane();
		txtpnFakultas.setEditable(false);
		txtpnFakultas.setText(BacaTulisFile.bacaKondisi().getFakultas());
		txtpnFakultas.setFont(new Font("Times New Roman", Font.BOLD, 11));
		txtpnFakultas.setBackground(new Color(255, 204, 0));
		txtpnFakultas.setBounds(563, 42, 122, 20);
		paneltengahkebersihan.add(txtpnFakultas);
		
		JTextPane txtpnLokasi = new JTextPane();
		txtpnLokasi.setEditable(false);
		txtpnLokasi.setText(BacaTulisFile.bacaKondisi().getLokasiRuang());
		txtpnLokasi.setFont(new Font("Times New Roman", Font.BOLD, 11));
		txtpnLokasi.setBackground(new Color(255, 204, 0));
		txtpnLokasi.setBounds(563, 73, 122, 20);
		paneltengahkebersihan.add(txtpnLokasi);
		
		JLabel lblNamaRuangankebersihan = new JLabel("Nama Ruang");
		lblNamaRuangankebersihan.setForeground(new Color(0, 0, 102));
		lblNamaRuangankebersihan.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNamaRuangankebersihan.setBounds(435, 14, 93, 14);
		paneltengahkebersihan.add(lblNamaRuangankebersihan);
		
		JLabel lblFakultaskebersihan = new JLabel("Fakultas");
		lblFakultaskebersihan.setForeground(new Color(0, 0, 102));
		lblFakultaskebersihan.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFakultaskebersihan.setBounds(435, 42, 93, 14);
		paneltengahkebersihan.add(lblFakultaskebersihan);
		
		JLabel lblLokasikebersihan = new JLabel("Lokasi");
		lblLokasikebersihan.setForeground(new Color(0, 0, 102));
		lblLokasikebersihan.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblLokasikebersihan.setBounds(435, 70, 93, 14);
		paneltengahkebersihan.add(lblLokasikebersihan);
		
		Canvas canvas_5 = new Canvas();
		canvas_5.setBackground(new Color(0, 0, 102));
		canvas_5.setBounds(483, 132, 5, 207);
		paneltengahkebersihan.add(canvas_5);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(GUI.class.getResource("/as/Picture3.png")));
		label_7.setBounds(0, 0, 800, 400);
		paneltengahkebersihan.add(label_7);
		
		JPanel panelbawahkebersihan = new JPanel();
		panelKebersihan.add(panelbawahkebersihan, BorderLayout.SOUTH);
		panelbawahkebersihan.setLayout(new BorderLayout(0, 0));
		
		JButton button = new JButton("Analisis");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
<<<<<<< HEAD
				try {
					bersih = new KebersihanRuangKelas();
					
					bersih.setKondisiLantai(comboBoxKondisiLantai.getSelectedItem().toString());
					bersih.setKondisiDinding(comboBoxKondisiDinding.getSelectedItem().toString());
					bersih.setKondisiAtap(comboBoxKondisiAtap.getSelectedItem().toString());
					bersih.setKondisiPintu(comboBoxKondisiPintu.getSelectedItem()+"");
					bersih.setKondisiJendela(comboBoxKondisiJendela.getSelectedItem()+"");
					
					bersih.setSirkulasiUdara(comboBoxSirkulasiUdara.getSelectedItem()+"");
					bersih.setNilaiPencahayaan(Integer.parseInt(textFieldPencahayaan.getText()));
					bersih.setInputKelembapan(Integer.parseInt(comboBoxKelembapan.getSelectedItem()+""));
					bersih.setInputSuhu(Integer.parseInt(textFieldSuhu.getText()));
					
					bersih.setKebisingan(comboBoxKebisingan.getSelectedIndex());
					bersih.setBau(comboBoxBau.getSelectedIndex());
					bersih.setKebocoran(comboBoxKebocoran.getSelectedIndex());
					bersih.setKerusakan(comboBoxKerusakan.getSelectedIndex());
					bersih.setKeausan(comboBoxKeausan.getSelectedIndex());
					
					BacaTulisFile.simpanBersih(bersih);
					AnalisisBersih ber = new AnalisisBersih();
					ber.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "input dengan benar : "+e, "Erorr", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		panelbawahkebersihan.add(button, BorderLayout.CENTER);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(new Color(153, 0, 0));
=======
				InventarisKebersihan invber = new InventarisKebersihan();
				invber.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 0, 102));
		button_1.setToolTipText("Next");
		getContentPane().add(button_1, BorderLayout.EAST);
>>>>>>> origin/master
		
		JButton button_2 = new JButton("Load");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					bersih = BacaTulisFile.bacaBersih();
					comboBoxKondisiLantai.setSelectedItem(bersih.getKondisiLantai());
					comboBoxKondisiDinding.setSelectedItem(bersih.getKondisiDinding());
					comboBoxKondisiAtap.setSelectedItem(bersih.getKondisiAtap());
					comboBoxKondisiPintu.setSelectedItem(bersih.getKondisiPintu());
					comboBoxKondisiJendela.setSelectedItem(bersih.getKondisiJendela());
					
					comboBoxSirkulasiUdara.setSelectedItem(bersih.getSirkulasiUdara());
					textFieldPencahayaan.setText(bersih.getNilaiPencahayaan()+"");
					comboBoxKelembapan.setSelectedItem(bersih.getInputKelembapan()+"");
					textFieldSuhu.setText(bersih.getInputSuhu()+"");
					comboBoxKebisingan.setSelectedIndex(bersih.getKebisingan());
					comboBoxBau.setSelectedIndex(bersih.getBau());
					comboBoxKebocoran.setSelectedIndex(bersih.getKebocoran());
					comboBoxKerusakan.setSelectedIndex(bersih.getKerusakan());
					comboBoxKeausan.setSelectedIndex(bersih.getKeausan());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "File Tidak Ada / Tidak Lengkap", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		panelbawahkebersihan.add(button_2, BorderLayout.EAST);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBackground(new Color(153, 0, 0));
		
		JPanel panelKeamanan = new JPanel();
		tabbedPane.addTab("Keamanan", null, panelKeamanan, null);
		panelKeamanan.setLayout(new BorderLayout(0, 0));
		
		JPanel panelataskeamanan = new JPanel();
		panelataskeamanan.setBackground(new Color(255, 102, 0));
		panelKeamanan.add(panelataskeamanan, BorderLayout.NORTH);
		
		JLabel label_1 = new JLabel("Inventaris Keamanan");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Algerian", Font.BOLD, 12));
		panelataskeamanan.add(label_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panelKeamanan.add(panel, BorderLayout.CENTER);
		
		JTextPane textPane_20 = new JTextPane();
		textPane_20.setText("Aspek");
		textPane_20.setForeground(Color.WHITE);
		textPane_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPane_20.setEditable(false);
		textPane_20.setBackground(new Color(255, 102, 0));
		textPane_20.setBounds(110, 126, 247, 23);
		panel.add(textPane_20);
		
		JTextPane textPane_21 = new JTextPane();
		textPane_21.setText("Kondisi");
		textPane_21.setForeground(Color.WHITE);
		textPane_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPane_21.setEditable(false);
		textPane_21.setBackground(new Color(255, 102, 0));
		textPane_21.setBounds(356, 126, 183, 23);
		panel.add(textPane_21);
		
		Canvas canvas_6 = new Canvas();
		canvas_6.setBackground(new Color(255, 102, 0));
		canvas_6.setBounds(292, 126, 5, 182);
		panel.add(canvas_6);
		
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
		
		JTextPane textPane_22 = new JTextPane();
		textPane_22.setText("Kekokohan");
		textPane_22.setForeground(Color.WHITE);
		textPane_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPane_22.setEditable(false);
		textPane_22.setBackground(new Color(204, 0, 0));
		textPane_22.setBounds(126, 164, 159, 23);
		panel.add(textPane_22);
		
		JTextPane textPane_23 = new JTextPane();
		textPane_23.setText("Kunci Pintu");
		textPane_23.setForeground(Color.WHITE);
		textPane_23.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPane_23.setEditable(false);
		textPane_23.setBackground(new Color(204, 0, 0));
		textPane_23.setBounds(126, 201, 159, 23);
		panel.add(textPane_23);
		
		JTextPane textPane_24 = new JTextPane();
		textPane_24.setText("Kunci Jendela");
		textPane_24.setForeground(Color.WHITE);
		textPane_24.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPane_24.setEditable(false);
		textPane_24.setBackground(new Color(204, 0, 0));
		textPane_24.setBounds(127, 232, 159, 23);
		panel.add(textPane_24);
		
		JTextPane textPane_25 = new JTextPane();
		textPane_25.setText("Bahaya");
		textPane_25.setForeground(Color.WHITE);
		textPane_25.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textPane_25.setEditable(false);
		textPane_25.setBackground(new Color(204, 0, 0));
		textPane_25.setBounds(127, 263, 159, 23);
		panel.add(textPane_25);
		
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
		
		JLabel lblNamaRuangkeamanan = new JLabel("Nama Ruang");
		lblNamaRuangkeamanan.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNamaRuangkeamanan.setForeground(new Color(0, 0, 153));
		lblNamaRuangkeamanan.setBounds(356, 11, 99, 23);
		panel.add(lblNamaRuangkeamanan);
		
		JLabel lblFakultaskeamanan = new JLabel("Fakultas");
		lblFakultaskeamanan.setForeground(new Color(0, 0, 153));
		lblFakultaskeamanan.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFakultaskeamanan.setBounds(356, 39, 99, 23);
		panel.add(lblFakultaskeamanan);
		
		JLabel lblLokasi = new JLabel("Lokasi");
		lblLokasi.setForeground(new Color(0, 0, 153));
		lblLokasi.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblLokasi.setBounds(355, 66, 99, 23);
		panel.add(lblLokasi);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("/as/Picture4.png")));
		lblBg.setBounds(0, 0, 781, 428);
		panel.add(lblBg);
		
		JPanel panelBawah = new JPanel();
		panelKeamanan.add(panelBawah, BorderLayout.SOUTH);
		panelBawah.setLayout(new BorderLayout(0, 0));
		
		JButton button_3 = new JButton("Analisis");
		button_3.addActionListener(new ActionListener() {
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
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setBackground(new Color(255, 102, 0));
		panelBawah.add(button_3, BorderLayout.CENTER);
		
		JButton button_4 = new JButton("Load");
		button_4.addActionListener(new ActionListener() {
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
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_4.setBackground(new Color(255, 102, 0));
		panelBawah.add(button_4, BorderLayout.EAST);
	}
}
