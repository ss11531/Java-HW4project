package controller.mlist;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.mlist.AddMlistUI;
import controller.mlist.ManagerMlistUI;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MlistMainUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MlistMainUI frame = new MlistMainUI();
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
	public MlistMainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 205, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("管理選項");
		lblNewLabel.setForeground(new Color(0, 128, 64));
		lblNewLabel.setFont(new Font("微软雅黑 Light", Font.BOLD, 30));
		lblNewLabel.setBounds(122, 15, 135, 65);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 205, 237));
		panel.setBounds(41, 90, 290, 163);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("新增訂單");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddMlistUI addmlist = new AddMlistUI();
				addmlist.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton.setBounds(67, 24, 143, 40);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("管理訂單");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManagerMlistUI managermlist = new ManagerMlistUI();
				managermlist.setVisible(true);
				dispose();

			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton_1.setBounds(67, 91, 143, 40);
		panel.add(btnNewButton_1);
	}
}
