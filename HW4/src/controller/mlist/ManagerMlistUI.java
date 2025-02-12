package controller.mlist;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import service.impl.MlistServiceImpl;
import util.Tool;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class ManagerMlistUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pico;
	private JTextField frac;
	private JTextField botul;
	private JTextField slimne;
	private JTextField updateId;
	private static MlistServiceImpl mlistserviceimpl = new MlistServiceImpl();
	private JTextField deleteId;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerMlistUI frame = new ManagerMlistUI();
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
	public ManagerMlistUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1022, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 205, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(248, 160, 196));
		panel.setBounds(10, 20, 399, 324);
		contentPane.add(panel);

		JLabel lblNewLabel_1_1 = new JLabel("皮秒雷射");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(27, 106, 89, 30);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("飛梭雷射");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(25, 152, 128, 30);
		panel.add(lblNewLabel_1_2);

		JLabel lblNewLabel_2_1 = new JLabel("管理訂單");
		lblNewLabel_2_1.setForeground(Color.BLUE);
		lblNewLabel_2_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_2_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1.setBounds(126, 10, 109, 31);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_1_3_1 = new JLabel("肉毒桿菌");
		lblNewLabel_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_3_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 18));
		lblNewLabel_1_3_1.setBounds(26, 194, 128, 30);
		panel.add(lblNewLabel_1_3_1);

		pico = new JTextField("0");
		pico.setFont(new Font("微软雅黑 Light", Font.PLAIN, 15));
		pico.setColumns(10);
		pico.setBounds(126, 106, 154, 34);
		panel.add(pico);

		frac = new JTextField("0");
		frac.setFont(new Font("微软雅黑 Light", Font.PLAIN, 15));
		frac.setColumns(10);
		frac.setBounds(126, 150, 154, 34);
		panel.add(frac);

		botul = new JTextField("0");
		botul.setFont(new Font("微软雅黑 Light", Font.PLAIN, 15));
		botul.setColumns(10);
		botul.setBounds(127, 193, 154, 34);
		panel.add(botul);

		slimne = new JTextField("0");
		slimne.setFont(new Font("微软雅黑 Light", Font.PLAIN, 15));
		slimne.setColumns(10);
		slimne.setBounds(126, 235, 154, 34);
		panel.add(slimne);

		JLabel lblNewLabel_1_3 = new JLabel("瘦瘦針");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("微软雅黑 Light", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(25, 236, 128, 30);
		panel.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_1_1 = new JLabel("ID");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(27, 62, 89, 30);
		panel.add(lblNewLabel_1_1_1);

		updateId = new JTextField();
		updateId.setFont(new Font("微软雅黑 Light", Font.PLAIN, 15));
		updateId.setColumns(10);
		updateId.setBounds(126, 62, 154, 34);
		panel.add(updateId);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(248, 160, 196));
		panel_2.setLayout(null);
		panel_2.setBounds(10, 352, 399, 110);
		contentPane.add(panel_2);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("ID");
		lblNewLabel_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 18));
		lblNewLabel_1_1_2_1.setBounds(35, 6, 52, 30);
		panel_2.add(lblNewLabel_1_1_2_1);

		deleteId = new JTextField();
		deleteId.setFont(new Font("微软雅黑 Light", Font.PLAIN, 15));
		deleteId.setColumns(10);
		deleteId.setBounds(128, 6, 154, 34);
		panel_2.add(deleteId);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(248, 160, 196));
		panel_1.setBounds(419, 20, 579, 324);
		contentPane.add(panel_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 27, 559, 235);
		panel_1.add(scrollPane);
		
				JTextArea output = new JTextArea();
				scrollPane.setViewportView(output);
				output.setFont(new Font("微软雅黑 Light", Font.PLAIN, 11));

		/** Button **/

		JButton btnNewButton_1_1_1_1 = new JButton("回訂單主頁");
		btnNewButton_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tool.gotoPorderMain();
				dispose();
			}
		});
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton_1_1_1_1.setBounds(10, 496, 209, 40);
		contentPane.add(btnNewButton_1_1_1_1);

		JButton btnNewButton_1 = new JButton("查詢");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				output.setText(mlistserviceimpl.AllMlist());
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton_1.setBounds(119, 272, 109, 40);
		panel_1.add(btnNewButton_1);
		
				JButton btnNewButton_1_2 = new JButton("列印");
				btnNewButton_1_2.setBounds(304, 272, 128, 44);
				panel_1.add(btnNewButton_1_2);
				btnNewButton_1_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						try {
							output.print();
						} catch (PrinterException e1) {
							e1.printStackTrace();

						}
					}
				});
				btnNewButton_1_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));

		JButton btnNewButton_1_1 = new JButton("修改");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Id = Integer.parseInt(updateId.getText());
				int Pico = Integer.parseInt(pico.getText());
				int Frac = Integer.parseInt(frac.getText());
				int Botul = Integer.parseInt(botul.getText());
				int Slimne = Integer.parseInt(slimne.getText());
				mlistserviceimpl.updateMlist(Pico, Frac, Botul, Slimne, Id);
			}
		});
		btnNewButton_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(136, 279, 109, 40);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("NT 2000");
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 18));
		lblNewLabel_1_1_2.setBounds(290, 106, 89, 30);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("NT 2500");
		lblNewLabel_1_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 18));
		lblNewLabel_1_1_2_2.setBounds(290, 152, 89, 30);
		panel.add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("NT 3000");
		lblNewLabel_1_1_2_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 18));
		lblNewLabel_1_1_2_2_1.setBounds(291, 194, 89, 30);
		panel.add(lblNewLabel_1_1_2_2_1);
		
		JLabel lblNewLabel_1_1_2_2_1_1 = new JLabel("NT 3500");
		lblNewLabel_1_1_2_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 18));
		lblNewLabel_1_1_2_2_1_1.setBounds(290, 235, 89, 30);
		panel.add(lblNewLabel_1_1_2_2_1_1);

		JButton btnNewButton_1_1_1 = new JButton("刪除");
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Id = Integer.parseInt(deleteId.getText());
				mlistserviceimpl.deleteMlistById(Id);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(138, 50, 109, 40);
		panel_2.add(btnNewButton_1_1_1);

		JButton btnNewButton_2 = new JButton("離開");
		btnNewButton_2.setBounds(281, 494, 128, 44);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(248, 160, 196));
		panel_1_1.setBounds(419, 352, 579, 186);
		contentPane.add(panel_1_1);
		
		JTextArea output_1 = new JTextArea();
		output_1.setFont(new Font("微软雅黑 Light", Font.PLAIN, 15));
		output_1.setBounds(21, 77, 531, 89);
		panel_1_1.add(output_1);
		
		JLabel lblNewLabel_3 = new JLabel("付款金額");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("微软雅黑 Light", Font.BOLD, 25));
		lblNewLabel_3.setBounds(21, 33, 127, 34);
		panel_1_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("微软雅黑 Light", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBounds(137, 32, 110, 35);
		panel_1_1.add(textField);
		
		JButton btnNewButton_2_2 = new JButton("找零");
		btnNewButton_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				   try {
					// 取得產品數量
			            int Pico = Integer.parseInt(pico.getText());
			            int Frac = Integer.parseInt(frac.getText());
			            int Botul = Integer.parseInt(botul.getText());
			            int Slimne = Integer.parseInt(slimne.getText());
			            
			          
			            int pricePico = 2000;
			            int priceFrac = 2500;
			            int priceBotul = 3000;
			            int priceSlimne = 3500;
			            
			            // 計算總金額
			            int totalAmount = (Pico * pricePico) + (Frac * priceFrac) + (Botul * priceBotul) + (Slimne * priceSlimne);
			            
			            // 取得付款金額
			            int paidAmount = Integer.parseInt(textField.getText());

			            // 計算找零
			            int change = paidAmount - totalAmount;

			            // 顯示結果
			            if (change < 0) {
			                output_1.setText("付款金額不足，請再確認！");
			            } else {
			                output_1.setText("應付款金額：" + totalAmount + " 元\n" +
			                                 "實收金額：" + paidAmount + " 元\n" +
			                                 "找零金額：" + change + " 元");
			            }
			        } catch (NumberFormatException ex) {
			            output_1.setText("請輸入有效的數字！");
			        }
			    }
			});
		btnNewButton_2_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton_2_2.setBounds(275, 23, 128, 44);
		panel_1_1.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_2_1 = new JButton("輸出CSV");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			try {
	            // 取得產品數量
	            int Pico = Integer.parseInt(pico.getText());
	            int Frac = Integer.parseInt(frac.getText());
	            int Botul = Integer.parseInt(botul.getText());
	            int Slimne = Integer.parseInt(slimne.getText());

	        
	            int pricePico = 2000;
	            int priceFrac = 2500;
	            int priceBotul = 3000;
	            int priceSlimne = 3500;

	            // 計算總金額
	            int totalAmount = (Pico * pricePico) + (Frac * priceFrac) + (Botul * priceBotul) + (Slimne * priceSlimne);

	            // 取得付款金額
	            int paidAmount = Integer.parseInt(textField.getText());

	            // 計算找零
	            int change = paidAmount - totalAmount;

	            // 建立 CSV 內容
	            String csvContent = "項目,數量,單價,總計\n" +
	                    "皮秒雷射," + Pico + "," + pricePico + "," + (Pico * pricePico) + "\n" +
	                    "飛梭雷射," + Frac + "," + priceFrac + "," + (Frac * priceFrac) + "\n" +
	                    "肉毒桿菌," + Botul + "," + priceBotul + "," + (Botul * priceBotul) + "\n" +
	                    "瘦瘦針," + Slimne + "," + priceSlimne + "," + (Slimne * priceSlimne) + "\n" +
	                    "應付款金額,," + totalAmount + "\n" +
	                    "實收金額,," + paidAmount + "\n" +
	                    "找零金額,," + change + "\n";

	            // 設定 CSV 檔案名稱
	            String fileName = "找零明細.csv";

	            // 寫入檔案
	            FileWriter writer = new FileWriter(fileName);
	            writer.write(csvContent);
	            writer.close();

	            output_1.setText("CSV 檔案已成功輸出：" + fileName);

	        } catch (IOException ex) {
	            output_1.setText("CSV 輸出錯誤：" + ex.getMessage());
	        } catch (NumberFormatException ex) {
	            output_1.setText("請輸入有效的數字！");
	        }
		}
	});
		btnNewButton_2_2_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		btnNewButton_2_2_1.setBounds(428, 25, 128, 44);
		panel_1_1.add(btnNewButton_2_2_1);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(809, 648, 1, 1);
		contentPane.add(layeredPane);

	}
}
