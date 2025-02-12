package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.mlist.MlistMainUI;
import model.Member;
import util.Tool;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class LoginSuccessUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private static Member member=(Member)Tool.read("member.txt");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSuccessUI frame = new LoginSuccessUI();
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
	public LoginSuccessUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 246);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232, 177, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("登入成功");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_1.setBounds(141, 26, 120, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel showMember = new JLabel("");
		showMember.setForeground(Color.BLACK);
		showMember.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		showMember.setBounds(81, 76, 291, 30);
		contentPane.add(showMember);
		showMember.setText(member.getName()+"  歡迎光臨");
		
		JButton btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MlistMainUI pordermain=new MlistMainUI();
				pordermain.setVisible(true);
				dispose();
			}
		});
		btnOk.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnOk.setBounds(146, 136, 147, 40);
		contentPane.add(btnOk);
	}

}
