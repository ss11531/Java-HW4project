package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;
import util.Tool;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LoginUI extends JFrame {
	private JLabel label_1;// 用來顯示時間
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 363);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232, 177, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("好美麗診所登入系統");
		lblNewLabel.setForeground(new Color(0, 128, 64));
		lblNewLabel.setFont(new Font("微软雅黑 Light", Font.BOLD, 30));
		lblNewLabel.setBounds(127, 35, 285, 65);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("帳號：");
		lblNewLabel_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		lblNewLabel_1.setBounds(89, 114, 62, 46);
		contentPane.add(lblNewLabel_1);

		username = new JTextField();
		username.setFont(new Font("微软雅黑", Font.BOLD, 20));
		username.setColumns(10);
		username.setBackground(Color.WHITE);
		username.setBounds(163, 114, 233, 46);
		contentPane.add(username);

		JLabel lblNewLabel_2 = new JLabel("密碼：");
		lblNewLabel_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		lblNewLabel_2.setBounds(89, 182, 62, 46);
		contentPane.add(lblNewLabel_2);

		password = new JTextField();
		password.setFont(new Font("微软雅黑", Font.BOLD, 20));
		password.setColumns(10);
		password.setBackground(Color.WHITE);
		password.setBounds(163, 182, 233, 46);
		contentPane.add(password);

		JButton btnNewButton = new JButton("登入");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username = username.getText();
				String Password = password.getText();

				// 帳號與密碼格式正確後，執行登入驗證
				Member member = new MemberServiceImpl().Login(Username, Password);

				if (member != null) {
					Tool.save(member, "member.txt");
					LoginSuccessUI loginsuccess = new LoginSuccessUI();
					loginsuccess.setVisible(true);
					dispose();
				} else {
					LoginErrorUI loginerror = new LoginErrorUI();
					loginerror.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton.setBounds(38, 254, 132, 52);
		contentPane.add(btnNewButton);

		JButton btnNewButton_2 = new JButton("註冊");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				AddMemberUI addmember = new AddMemberUI();
				addmember.setVisible(true);
				dispose();

			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_2.setBounds(219, 254, 132, 52);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("離開");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_1.setBounds(404, 254, 90, 52);
		contentPane.add(btnNewButton_1);

		label_1 = new JLabel("");
		label_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 15));
		label_1.setBounds(13, 4, 308, 46);
		contentPane.add(label_1);
		
		// 啟動時間更新執行緒
		Thread clockThread = new Thread(new ClockRunnable());
		clockThread.start();

	}

	// 格式化數字（補零）
	private static String format(int number) {
		return number < 10 ? "0" + number : "" + number;
	}

	// 獲取當前時間
	private static String getTime() {
		Calendar cal = new GregorianCalendar();
		int Year = cal.get(Calendar.YEAR);
		int Month = cal.get(Calendar.MONTH) + 1; // 修正月份
		int Day = cal.get(Calendar.DAY_OF_MONTH);

		int Hour = cal.get(Calendar.HOUR_OF_DAY);
		int Minute = cal.get(Calendar.MINUTE);
		int Second = cal.get(Calendar.SECOND);
		return format(Year) + "-" + format(Month) + "-" + format(Day) + " " + format(Hour) + ":" + format(Minute) + ":"
				+ format(Second);
	}

	// 定時更新時間的執行緒
	private class ClockRunnable implements Runnable {
		@Override
		public void run() {
			while (true) {
				label_1.setText(getTime());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
