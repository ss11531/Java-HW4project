package controller.mlist;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import model.Mlist;
import service.impl.MlistServiceImpl;
import util.Tool;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMlistUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pico;
	private JTextField frac;
	private JTextField botul;
	private JTextField slimne;
	private static Member member = (Member) Tool.read("member.txt");
	private static MlistServiceImpl mlistserviceimpl = new MlistServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMlistUI frame = new AddMlistUI();
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
	public AddMlistUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 205, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(248, 205, 237));
		panel.setBounds(30, 87, 353, 357);
		contentPane.add(panel);

		JLabel lblNewLabel_1_1 = new JLabel("皮秒雷射");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(48, 24, 104, 30);
		panel.add(lblNewLabel_1_1);

		pico = new JTextField();
		pico.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		pico.setColumns(10);
		pico.setBounds(175, 24, 130, 34);
		panel.add(pico);

		frac = new JTextField();
		frac.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		frac.setColumns(10);
		frac.setBounds(175, 80, 130, 34);
		panel.add(frac);

		JLabel lblNewLabel_1_1_1 = new JLabel("飛梭雷射");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(48, 80, 104, 30);
		panel.add(lblNewLabel_1_1_1);

		botul = new JTextField();
		botul.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		botul.setColumns(10);
		botul.setBounds(175, 137, 130, 34);
		panel.add(botul);

		JLabel lblNewLabel_1_1_2 = new JLabel("肉毒桿菌");
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_1_1_2.setBounds(48, 137, 104, 30);
		panel.add(lblNewLabel_1_1_2);

		slimne = new JTextField();
		slimne.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		slimne.setColumns(10);
		slimne.setBounds(175, 197, 130, 34);
		panel.add(slimne);

		JLabel lblNewLabel_1_1_3 = new JLabel("瘦瘦針");
		lblNewLabel_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_3.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_1_1_3.setBounds(48, 197, 104, 30);
		panel.add(lblNewLabel_1_1_3);

		JButton btnNewButton_1_1_1_1_1 = new JButton("確定");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name = member.getName();
				int Pico = Integer.parseInt(pico.getText());
				int Frac = Integer.parseInt(frac.getText());
				int Botul = Integer.parseInt(botul.getText());
				int Slimne = Integer.parseInt(slimne.getText());
				Mlist m = new Mlist(Name, Pico, Frac, Botul, Slimne);
				mlistserviceimpl.addMlist(m);
			}
		});
		btnNewButton_1_1_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton_1_1_1_1_1.setBounds(100, 257, 157, 35);
		panel.add(btnNewButton_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1_1 = new JButton("離開");
		btnNewButton_1_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton_1_1_1_1_1_1.setBounds(10, 312, 157, 35);
		panel.add(btnNewButton_1_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1 = new JButton("回主頁");
		btnNewButton_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tool.gotoPorderMain();
				dispose();
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton_1_1_1_1.setBounds(186, 312, 157, 35);
		panel.add(btnNewButton_1_1_1_1);

		JLabel lblNewLabel = new JLabel("新增訂單");
		lblNewLabel.setForeground(new Color(0, 128, 64));
		lblNewLabel.setFont(new Font("微软雅黑 Light", Font.BOLD, 30));
		lblNewLabel.setBounds(141, 12, 135, 65);
		contentPane.add(lblNewLabel);
	}
}
