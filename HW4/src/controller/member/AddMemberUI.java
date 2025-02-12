package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;

import java.awt.Color;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddMemberUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField email;
	private JTextField address;
	private JTextField phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMemberUI frame = new AddMemberUI();
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
	public AddMemberUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 573);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232, 177, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Panel panel = new Panel();
		panel.setBounds(10, 25, 548, 61);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("新增會員資料");
		lblNewLabel_1.setBounds(193, 10, 157, 34);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		panel.add(lblNewLabel_1);

		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 102, 548, 418);
		contentPane.add(panel_1);

		JLabel lblNewLabel_1_1 = new JLabel("姓名");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(58, 23, 52, 30);
		panel_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("帳號");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(58, 77, 52, 30);
		panel_1.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("密碼");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_1_1_1_1.setBounds(58, 135, 52, 30);
		panel_1.add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("郵件");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_1_1_1_1_1.setBounds(58, 190, 52, 30);
		panel_1.add(lblNewLabel_1_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("地址");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_1_1_1_1_1_1.setBounds(58, 243, 52, 30);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("行動");
		lblNewLabel_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(58, 293, 52, 30);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1);

		name = new JTextField();
		name.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		name.setColumns(10);
		name.setBounds(160, 23, 286, 34);
		panel_1.add(name);

		username = new JTextField();
		username.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		username.setColumns(10);
		username.setBounds(160, 77, 286, 34);
		panel_1.add(username);

		password = new JTextField();
		password.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		password.setColumns(10);
		password.setBounds(160, 135, 286, 34);
		panel_1.add(password);

		email = new JTextField();
		email.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		email.setColumns(10);
		email.setBounds(160, 186, 286, 34);
		panel_1.add(email);

		address = new JTextField();
		address.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		address.setColumns(10);
		address.setBounds(160, 239, 286, 34);
		panel_1.add(address);

		phone = new JTextField();
		phone.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		phone.setColumns(10);
		phone.setBounds(160, 293, 286, 34);
		panel_1.add(phone);

		JButton btnNewButton = new JButton("註冊");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username = username.getText();
				String Password = password.getText();
				// 帳號與密碼格式驗證

				if (!Username.matches("^[a-zA-Z0-9]{6,15}$")) {
					JOptionPane.showMessageDialog(null, "帳號格式錯誤！\n請使用 6-15 位英數字。");
					return;
				}
				
				if (!Password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,15}$")) {
					JOptionPane.showMessageDialog(null, "密碼格式錯誤！\n密碼需包含 8-15 位，至少一個英文字母、一個數字及一個特殊符號。");
					return;
				}

				{
					if (new MemberServiceImpl().isUsernameBeenUse(Username)) {
						AddMemberErrorUI addmembererror = new AddMemberErrorUI();
						addmembererror.setVisible(true);
						dispose();
					} else {
						String Name = name.getText();
						//String Password = password.getText();
						String Email = email.getText();
						String Address = address.getText();
						String Phone = phone.getText();

						Member member = new Member(Name, Username, Password, Email, Address, Phone);

						new MemberServiceImpl().addMember(member);

						AddMemberSuccessUI addmembersuccess = new AddMemberSuccessUI();
						addmembersuccess.setVisible(true);
						dispose();
					}

				}

			}
		});
		btnNewButton.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton.setBounds(199, 362, 142, 40);
		panel_1.add(btnNewButton);
	}
}
