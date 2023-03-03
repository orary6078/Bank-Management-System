package Dasboard_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;

public class Source_Code_MachineUse {
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Source_Code_MachineUse window = new Source_Code_MachineUse();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Source_Code_MachineUse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setResizable(false);
		frame.setBounds(100, 100, 990, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setSize(530,550);
		
		JPanel MAIN_PANEL = new JPanel();
		MAIN_PANEL.setBackground(new Color(255, 255, 255));
		MAIN_PANEL.setBounds(0, 0, 970, 512);
		frame.getContentPane().add(MAIN_PANEL);
		MAIN_PANEL.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(144, -28, 826, 540);
		MAIN_PANEL.add(tabbedPane);
		
		JPanel Dashboard_Panel = new JPanel();
		tabbedPane.addTab("New tab", null, Dashboard_Panel, null);
		Dashboard_Panel.setLayout(null);
		
		JPanel DPF = new JPanel();
		DPF.setBounds(0, 36, 367, 474);
		Dashboard_Panel.add(DPF);
		DPF.setLayout(null);
		
		JLabel DPFL = new JLabel("DASHBOARD");
		DPFL.setBounds(138, 174, 115, 14);
		DPF.add(DPFL);
		
		JPanel DPS = new JPanel();
		DPS.setBounds(367, 36, 367, 474);
		Dashboard_Panel.add(DPS);
		DPS.setLayout(null);

		JLabel INFO_PANEL_CLOSE_DB = new JLabel("◄");
		INFO_PANEL_CLOSE_DB.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				DPF.setVisible(true);
				frame.setSize(530,550);
			}
		});
		INFO_PANEL_CLOSE_DB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		INFO_PANEL_CLOSE_DB.setBounds(342, 5, 20, 25);
		Dashboard_Panel.add(INFO_PANEL_CLOSE_DB);
		
		JLabel DPSL = new JLabel("DASHBOARD");
		DPSL.setBounds(100, 200, 46, 14);
		DPS.add(DPSL);
		
		JPanel LoadMoney_Panel = new JPanel();
		LoadMoney_Panel.setLayout(null);
		tabbedPane.addTab("New tab", null, LoadMoney_Panel, null);
		
		JPanel LMPF = new JPanel();
		LMPF.setLayout(null);
		LMPF.setBounds(0, 36, 367, 474);
		LoadMoney_Panel.add(LMPF);
		
		JLabel lblNewLabel_1 = new JLabel("XZNOM");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(104, 21, 58, 31);
		LMPF.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Load");
		lblNewLabel_2.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(104, 43, 80, 14);
		LMPF.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\logo.png"));
		lblNewLabel.setBounds(28, 11, 80, 70);
		LMPF.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\star.png"));
		lblNewLabel_3.setBounds(296, 11, 50, 50);
		LMPF.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(32, 81, 312, 2);
		LMPF.add(panel);
		
		JLabel lblNewLabel_4 = new JLabel("Account ID");
		lblNewLabel_4.setBounds(28, 121, 80, 14);
		LMPF.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBackground(new Color(240, 240, 240));
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setBounds(25, 147, 312, 26);
		LMPF.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_1.setBackground(SystemColor.menu);
		textField_1.setBounds(25, 221, 312, 26);
		LMPF.add(textField_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Amount");
		lblNewLabel_4_1.setBounds(28, 196, 133, 14);
		LMPF.add(lblNewLabel_4_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_2.setBackground(SystemColor.menu);
		textField_2.setBounds(28, 312, 312, 26);
		LMPF.add(textField_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Account Password");
		lblNewLabel_4_1_1.setBounds(28, 277, 133, 14);
		LMPF.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("CONFIRM");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\confirm.png"));
		lblNewLabel_7.setIconTextGap(10);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(49, 400, 113, 35);
		LMPF.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("CANCEL");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\cancel.png"));
		lblNewLabel_6.setIconTextGap(10);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(224, 400, 113, 35);
		LMPF.add(lblNewLabel_6);
		
		JPanel LMPS = new JPanel();
		LMPS.setLayout(null);
		LMPS.setBounds(367, 36, 367, 474);
		LoadMoney_Panel.add(LMPS);
		
		JPanel LMPF_1 = new JPanel();
		LMPF_1.setLayout(null);
		LMPF_1.setBounds(0, 0, 367, 474);
		LMPS.add(LMPF_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("XZNOM");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(104, 21, 58, 31);
		LMPF_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Load");
		lblNewLabel_2_1.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(104, 43, 80, 14);
		LMPF_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\logo.png"));
		lblNewLabel_5.setBounds(28, 11, 80, 70);
		LMPF_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\star.png"));
		lblNewLabel_3_1.setBounds(296, 11, 50, 50);
		LMPF_1.add(lblNewLabel_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(32, 81, 312, 2);
		LMPF_1.add(panel_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Account ID");
		lblNewLabel_4_2.setBounds(28, 121, 80, 14);
		LMPF_1.add(lblNewLabel_4_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_3.setBackground(SystemColor.menu);
		textField_3.setBounds(25, 147, 312, 26);
		LMPF_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_4.setBackground(SystemColor.menu);
		textField_4.setBounds(25, 221, 312, 26);
		LMPF_1.add(textField_4);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Amount");
		lblNewLabel_4_1_2.setBounds(28, 196, 133, 14);
		LMPF_1.add(lblNewLabel_4_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_5.setBackground(SystemColor.menu);
		textField_5.setBounds(28, 312, 312, 26);
		LMPF_1.add(textField_5);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Account Password");
		lblNewLabel_4_1_1_1.setBounds(28, 277, 133, 14);
		LMPF_1.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("CONFIRM");
		lblNewLabel_7_1.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\confirm.png"));
		lblNewLabel_7_1.setIconTextGap(10);
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_1.setBounds(49, 400, 113, 35);
		LMPF_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("CANCEL");
		lblNewLabel_6_1.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\cancel.png"));
		lblNewLabel_6_1.setIconTextGap(10);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_1.setBounds(224, 400, 113, 35);
		LMPF_1.add(lblNewLabel_6_1);
		
		JLabel INFO_PANEL_CLOSE_LM = new JLabel("◄");
		INFO_PANEL_CLOSE_LM.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				LMPF.setVisible(true);
				frame.setSize(530,550);
			}
		});
		INFO_PANEL_CLOSE_LM.setFont(new Font("Tahoma", Font.PLAIN, 20));
		INFO_PANEL_CLOSE_LM.setBounds(342, 11, 20, 25);
		LoadMoney_Panel.add(INFO_PANEL_CLOSE_LM);
		
		JPanel WithDrawMoney_Panel = new JPanel();
		WithDrawMoney_Panel.setLayout(null);
		tabbedPane.addTab("New tab", null, WithDrawMoney_Panel, null);
		
		JPanel WDMFP = new JPanel();
		WDMFP.setLayout(null);
		WDMFP.setBounds(0, 36, 367, 474);
		WithDrawMoney_Panel.add(WDMFP);
		
		JPanel LMPF_2 = new JPanel();
		LMPF_2.setLayout(null);
		LMPF_2.setBounds(0, 0, 367, 474);
		WDMFP.add(LMPF_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("XZNOM");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(104, 21, 58, 31);
		LMPF_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Withdraw");
		lblNewLabel_2_2.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		lblNewLabel_2_2.setBounds(104, 43, 80, 14);
		LMPF_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\logo.png"));
		lblNewLabel_9.setBounds(28, 11, 80, 70);
		LMPF_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\star.png"));
		lblNewLabel_3_2.setBounds(296, 11, 50, 50);
		LMPF_2.add(lblNewLabel_3_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(32, 81, 312, 2);
		LMPF_2.add(panel_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Account ID");
		lblNewLabel_4_3.setBounds(28, 121, 80, 14);
		LMPF_2.add(lblNewLabel_4_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_6.setBackground(SystemColor.menu);
		textField_6.setBounds(25, 147, 312, 26);
		LMPF_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_7.setBackground(SystemColor.menu);
		textField_7.setBounds(25, 221, 312, 26);
		LMPF_2.add(textField_7);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Amount");
		lblNewLabel_4_1_3.setBounds(28, 196, 133, 14);
		LMPF_2.add(lblNewLabel_4_1_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_8.setBackground(SystemColor.menu);
		textField_8.setBounds(28, 312, 312, 26);
		LMPF_2.add(textField_8);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("Account Password");
		lblNewLabel_4_1_1_2.setBounds(28, 277, 133, 14);
		LMPF_2.add(lblNewLabel_4_1_1_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("CONFIRM");
		lblNewLabel_7_2.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\confirm.png"));
		lblNewLabel_7_2.setIconTextGap(10);
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_2.setBounds(49, 400, 113, 35);
		LMPF_2.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("CANCEL");
		lblNewLabel_6_2.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\cancel.png"));
		lblNewLabel_6_2.setIconTextGap(10);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_2.setBounds(224, 400, 113, 35);
		LMPF_2.add(lblNewLabel_6_2);
		
		JPanel WDMSP = new JPanel();
		WDMSP.setLayout(null);
		WDMSP.setBounds(367, 36, 367, 474);
		WithDrawMoney_Panel.add(WDMSP);
		
		JPanel LMPF_2_1 = new JPanel();
		LMPF_2_1.setLayout(null);
		LMPF_2_1.setBounds(0, 0, 367, 474);
		WDMSP.add(LMPF_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("XZNOM");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(104, 21, 58, 31);
		LMPF_2_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Withdraw");
		lblNewLabel_2_2_1.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		lblNewLabel_2_2_1.setBounds(104, 43, 80, 14);
		LMPF_2_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\logo.png"));
		lblNewLabel_9_1.setBounds(28, 11, 80, 70);
		LMPF_2_1.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("");
		lblNewLabel_3_2_1.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\star.png"));
		lblNewLabel_3_2_1.setBounds(296, 11, 50, 50);
		LMPF_2_1.add(lblNewLabel_3_2_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(32, 81, 312, 2);
		LMPF_2_1.add(panel_2_1);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("Account ID");
		lblNewLabel_4_3_1.setBounds(28, 121, 80, 14);
		LMPF_2_1.add(lblNewLabel_4_3_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_9.setBackground(SystemColor.menu);
		textField_9.setBounds(25, 147, 312, 26);
		LMPF_2_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_10.setBackground(SystemColor.menu);
		textField_10.setBounds(25, 221, 312, 26);
		LMPF_2_1.add(textField_10);
		
		JLabel lblNewLabel_4_1_3_1 = new JLabel("Amount");
		lblNewLabel_4_1_3_1.setBounds(28, 196, 133, 14);
		LMPF_2_1.add(lblNewLabel_4_1_3_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_11.setBackground(SystemColor.menu);
		textField_11.setBounds(28, 312, 312, 26);
		LMPF_2_1.add(textField_11);
		
		JLabel lblNewLabel_4_1_1_2_1 = new JLabel("Account Password");
		lblNewLabel_4_1_1_2_1.setBounds(28, 277, 133, 14);
		LMPF_2_1.add(lblNewLabel_4_1_1_2_1);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("CONFIRM");
		lblNewLabel_7_2_1.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\confirm.png"));
		lblNewLabel_7_2_1.setIconTextGap(10);
		lblNewLabel_7_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_2_1.setBounds(49, 400, 113, 35);
		LMPF_2_1.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("CANCEL");
		lblNewLabel_6_2_1.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\cancel.png"));
		lblNewLabel_6_2_1.setIconTextGap(10);
		lblNewLabel_6_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_2_1.setBounds(224, 400, 113, 35);
		LMPF_2_1.add(lblNewLabel_6_2_1);
		
		JLabel INFO_PANEL_CLOSE_WM = new JLabel("◄");
		INFO_PANEL_CLOSE_WM.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				WDMFP.setVisible(true);
				frame.setSize(530,550);
			}
		});
		INFO_PANEL_CLOSE_WM.setFont(new Font("Tahoma", Font.PLAIN, 20));
		INFO_PANEL_CLOSE_WM.setBounds(342, 11, 20, 25);
		WithDrawMoney_Panel.add(INFO_PANEL_CLOSE_WM);
		
		JPanel TransferMoney_Panel = new JPanel();
		TransferMoney_Panel.setLayout(null);
		tabbedPane.addTab("New tab", null, TransferMoney_Panel, null);
		
		JPanel TMFP = new JPanel();
		TMFP.setLayout(null);
		TMFP.setBounds(0, 36, 367, 474);
		TransferMoney_Panel.add(TMFP);
		
		JPanel LMPF_3 = new JPanel();
		LMPF_3.setLayout(null);
		LMPF_3.setBounds(0, 0, 367, 474);
		TMFP.add(LMPF_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("XZNOM");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(104, 21, 58, 31);
		LMPF_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Transfer");
		lblNewLabel_2_3.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		lblNewLabel_2_3.setBounds(104, 43, 80, 14);
		LMPF_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\logo.png"));
		lblNewLabel_10.setBounds(28, 11, 80, 70);
		LMPF_3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\star.png"));
		lblNewLabel_3_3.setBounds(296, 11, 50, 50);
		LMPF_3.add(lblNewLabel_3_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(32, 81, 312, 2);
		LMPF_3.add(panel_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Account ID");
		lblNewLabel_4_4.setBounds(28, 121, 80, 14);
		LMPF_3.add(lblNewLabel_4_4);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_12.setBackground(SystemColor.menu);
		textField_12.setBounds(25, 147, 312, 26);
		LMPF_3.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_13.setBackground(SystemColor.menu);
		textField_13.setBounds(25, 221, 312, 26);
		LMPF_3.add(textField_13);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("Amount");
		lblNewLabel_4_1_4.setBounds(28, 196, 133, 14);
		LMPF_3.add(lblNewLabel_4_1_4);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_14.setBackground(SystemColor.menu);
		textField_14.setBounds(28, 312, 312, 26);
		LMPF_3.add(textField_14);
		
		JLabel lblNewLabel_4_1_1_3 = new JLabel("Account Password");
		lblNewLabel_4_1_1_3.setBounds(28, 277, 133, 14);
		LMPF_3.add(lblNewLabel_4_1_1_3);
		
		JLabel lblNewLabel_7_3 = new JLabel("CONFIRM");
		lblNewLabel_7_3.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\confirm.png"));
		lblNewLabel_7_3.setIconTextGap(10);
		lblNewLabel_7_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_3.setBounds(49, 400, 113, 35);
		LMPF_3.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_6_3 = new JLabel("CANCEL");
		lblNewLabel_6_3.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\cancel.png"));
		lblNewLabel_6_3.setIconTextGap(10);
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_3.setBounds(224, 400, 113, 35);
		LMPF_3.add(lblNewLabel_6_3);
		
		JPanel TMSP = new JPanel();
		TMSP.setLayout(null);
		TMSP.setBounds(367, 36, 367, 474);
		TransferMoney_Panel.add(TMSP);
		
		JPanel LMPF_3_1 = new JPanel();
		LMPF_3_1.setLayout(null);
		LMPF_3_1.setBounds(0, 36, 367, 474);
		TMSP.add(LMPF_3_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("XZNOM");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_1.setBounds(104, 21, 58, 31);
		LMPF_3_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Transfer");
		lblNewLabel_2_3_1.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		lblNewLabel_2_3_1.setBounds(104, 43, 80, 14);
		LMPF_3_1.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("");
		lblNewLabel_10_1.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\logo.png"));
		lblNewLabel_10_1.setBounds(28, 11, 80, 70);
		LMPF_3_1.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\star.png"));
		lblNewLabel_3_3_1.setBounds(296, 11, 50, 50);
		LMPF_3_1.add(lblNewLabel_3_3_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.BLACK);
		panel_3_1.setBounds(32, 81, 312, 2);
		LMPF_3_1.add(panel_3_1);
		
		JLabel lblNewLabel_4_4_1 = new JLabel("Account ID");
		lblNewLabel_4_4_1.setBounds(28, 121, 80, 14);
		LMPF_3_1.add(lblNewLabel_4_4_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_15.setBackground(SystemColor.menu);
		textField_15.setBounds(25, 147, 312, 26);
		LMPF_3_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_16.setBackground(SystemColor.menu);
		textField_16.setBounds(25, 221, 312, 26);
		LMPF_3_1.add(textField_16);
		
		JLabel lblNewLabel_4_1_4_1 = new JLabel("Amount");
		lblNewLabel_4_1_4_1.setBounds(28, 196, 133, 14);
		LMPF_3_1.add(lblNewLabel_4_1_4_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_17.setBackground(SystemColor.menu);
		textField_17.setBounds(28, 312, 312, 26);
		LMPF_3_1.add(textField_17);
		
		JLabel lblNewLabel_4_1_1_3_1 = new JLabel("Account Password");
		lblNewLabel_4_1_1_3_1.setBounds(28, 277, 133, 14);
		LMPF_3_1.add(lblNewLabel_4_1_1_3_1);
		
		JLabel lblNewLabel_7_3_1 = new JLabel("CONFIRM");
		lblNewLabel_7_3_1.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\confirm.png"));
		lblNewLabel_7_3_1.setIconTextGap(10);
		lblNewLabel_7_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_3_1.setBounds(49, 400, 113, 35);
		LMPF_3_1.add(lblNewLabel_7_3_1);
		
		JLabel lblNewLabel_6_3_1 = new JLabel("CANCEL");
		lblNewLabel_6_3_1.setIcon(new ImageIcon("D:\\Eclipse WorkSpace\\Dashboard_Frame\\src\\IMG\\cancel.png"));
		lblNewLabel_6_3_1.setIconTextGap(10);
		lblNewLabel_6_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_3_1.setBounds(224, 400, 113, 35);
		LMPF_3_1.add(lblNewLabel_6_3_1);
		
		JLabel INFO_PANEL_CLOSE_TM = new JLabel("◄");
		INFO_PANEL_CLOSE_TM.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				TMFP.setVisible(true);
				frame.setSize(530,550);
			}
		});
		INFO_PANEL_CLOSE_TM.setFont(new Font("Tahoma", Font.PLAIN, 20));
		INFO_PANEL_CLOSE_TM.setBounds(342, 5, 20, 25);
		TransferMoney_Panel.add(INFO_PANEL_CLOSE_TM);
		
		JPanel Statement_Panel = new JPanel();
		Statement_Panel.setLayout(null);
		tabbedPane.addTab("New tab", null, Statement_Panel, null);
		
		JPanel SFP = new JPanel();
		SFP.setLayout(null);
		SFP.setBounds(0, 36, 367, 474);
		Statement_Panel.add(SFP);
		
		JLabel SFPL = new JLabel("STATEMENT");
		SFPL.setBounds(138, 174, 115, 14);
		SFP.add(SFPL);
		
		JPanel SSP = new JPanel();
		SSP.setLayout(null);
		SSP.setBounds(367, 36, 367, 474);
		Statement_Panel.add(SSP);
		
		JLabel SSPL = new JLabel("STATEMENT");
		SSPL.setBounds(100, 200, 46, 14);
		SSP.add(SSPL);
		
		JLabel INFO_PANEL_CLOSE_SM = new JLabel("◄");
		INFO_PANEL_CLOSE_SM.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				SFP.setVisible(true);
				frame.setSize(530,550);
			}
		});
		INFO_PANEL_CLOSE_SM.setFont(new Font("Tahoma", Font.PLAIN, 20));
		INFO_PANEL_CLOSE_SM.setBounds(342, 5, 20, 25);
		Statement_Panel.add(INFO_PANEL_CLOSE_SM);
		
				JPanel MENU_BAR = new JPanel();
				MENU_BAR.setBackground(new Color(21, 35, 51));
				MENU_BAR.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
				MENU_BAR.setBounds(-20, 0, 165, 556);
				MAIN_PANEL.add(MENU_BAR);
				MENU_BAR.setLayout(null);
				
		JPanel MBFP = new JPanel();
		MBFP.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				DPF.setVisible(true);
				tabbedPane.setSelectedIndex(0);
				Dimension v = frame.getSize();
				if (v.width == 970 && v.height == 512) {
				    frame.setSize(530, 550);
				}
			}
		});
		MBFP.setBackground(new Color(41, 57, 80));
		MBFP.setBounds(21, 120, 144, 40);
		MENU_BAR.add(MBFP);
		MBFP.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Dashboard");
		lblNewLabel_8.setBounds(10, 5, 100, 30);
		MBFP.add(lblNewLabel_8);
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setIconTextGap(10);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setIcon(null);
		
		JPanel MBSP = new JPanel();
		MBSP.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				LMPF.setVisible(true);
				tabbedPane.setSelectedIndex(1);
				Dimension v = frame.getSize();
				if (v.width == 970 && v.height == 512) {
				    frame.setSize(530, 550);
				}
			}
		});
		MBSP.setLayout(null);
		MBSP.setBackground(new Color(41, 57, 80));
		MBSP.setBounds(12, 170, 153, 40);
		MENU_BAR.add(MBSP);
		
		JLabel lblNewLabel_8_2 = new JLabel("  Load Money");
		lblNewLabel_8_2.setIcon(null);
		lblNewLabel_8_2.setIconTextGap(10);
		lblNewLabel_8_2.setForeground(Color.WHITE);
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8_2.setBounds(10, 5, 100, 30);
		MBSP.add(lblNewLabel_8_2);
		
		JPanel MBTP = new JPanel();
		MBTP.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				WDMFP.setVisible(true);
				tabbedPane.setSelectedIndex(2);
				Dimension v = frame.getSize();
				if (v.width == 970 && v.height == 512) {
				    frame.setSize(530, 550);
				}
			}
		});
		MBTP.setLayout(null);
		MBTP.setBackground(new Color(41, 57, 80));
		MBTP.setBounds(12, 220, 153, 40);
		MENU_BAR.add(MBTP);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("  Withdraw Money");
		lblNewLabel_8_2_1.setIconTextGap(10);
		lblNewLabel_8_2_1.setForeground(Color.WHITE);
		lblNewLabel_8_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8_2_1.setBounds(10, 5, 140, 30);
		MBTP.add(lblNewLabel_8_2_1);
		
		JPanel MBFHP = new JPanel();
		MBFHP.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				TMFP.setVisible(true);
				tabbedPane.setSelectedIndex(3);
				Dimension v = frame.getSize();
				if (v.width == 970 && v.height == 512) {
				    frame.setSize(530, 550);
				}
			}
		});
		MBFHP.setLayout(null);
		MBFHP.setBackground(new Color(41, 57, 80));
		MBFHP.setBounds(12, 270, 153, 40);
		MENU_BAR.add(MBFHP);
		
		JLabel lblNewLabel_8_2_2 = new JLabel("  Transfer Money");
		lblNewLabel_8_2_2.setIconTextGap(10);
		lblNewLabel_8_2_2.setForeground(Color.WHITE);
		lblNewLabel_8_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8_2_2.setBounds(10, 5, 138, 30);
		MBFHP.add(lblNewLabel_8_2_2);
		
		JPanel MBFTP = new JPanel();
		MBFTP.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				SFP.setVisible(true);
				tabbedPane.setSelectedIndex(4);
				Dimension v = frame.getSize();
				if (v.width == 970 && v.height == 512) {
				    frame.setSize(530, 550);
				}
			}
		});
		MBFTP.setLayout(null);
		MBFTP.setBackground(new Color(41, 57, 80));
		MBFTP.setBounds(12, 320, 153, 40);
		MENU_BAR.add(MBFTP);
		
		JLabel lblNewLabel_8_2_3 = new JLabel("  Statements");
		lblNewLabel_8_2_3.setIconTextGap(10);
		lblNewLabel_8_2_3.setForeground(Color.WHITE);
		lblNewLabel_8_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8_2_3.setBounds(10, 5, 100, 30);
		MBFTP.add(lblNewLabel_8_2_3);
		
		JLabel INFO_PANEL_OPEN = new JLabel("►");
		INFO_PANEL_OPEN.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frame.setSize(970,512);
				DPF.setVisible(false);
				LMPF.setVisible(false);
				WDMFP.setVisible(false);
				TMFP.setVisible(false);
				SFP.setVisible(false);
			}
		});
		INFO_PANEL_OPEN.setForeground(new Color(255, 255, 255));
		INFO_PANEL_OPEN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		INFO_PANEL_OPEN.setBounds(140, 480, 20, 25);
		MENU_BAR.add(INFO_PANEL_OPEN);
	}
}
