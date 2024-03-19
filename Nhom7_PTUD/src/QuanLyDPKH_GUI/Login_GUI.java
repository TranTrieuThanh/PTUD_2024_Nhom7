package QuanLyDPKH_GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login_GUI extends JFrame{
	
	private JPanel jpRow1;
	private JLabel title;
	private JPanel jpTong;
	private JPanel jpRow2;
	private JLabel lb_taikhoan;
	private JTextField txt_taikhoan;
	private JPanel jpRow3;
	private JLabel lb_mk;
	private JTextField txt_mk;
	private JPanel jpRow4;
	private JButton button_login;
	public Login_GUI()
	{
		setTitle("Đăng nhập");
		jpTong= new JPanel();
		jpTong.setLayout( new BoxLayout(jpTong,BoxLayout.Y_AXIS));
		//row1
		jpRow1= new JPanel();
		jpRow1.add(title= new JLabel("Đăng nhập"));
		title.setForeground(Color.blue);
		
		Font  fo = new Font ("Times New Roman", Font.BOLD, 30); 
		title.setFont(fo);
		//Row2
		jpRow2= new JPanel();
		jpRow2.setLayout(new BoxLayout(jpRow2, BoxLayout.X_AXIS));
		jpRow2.add(lb_taikhoan= new JLabel("Tài khoản"));
		jpRow2.add(Box.createHorizontalStrut(10));
		txt_taikhoan= new JTextField(20);
		txt_taikhoan.setBounds(50, 50, 20, 5);
		jpRow2.add(txt_taikhoan);
		//row3
		jpRow3= new JPanel();
		jpRow3.setLayout(new BoxLayout(jpRow3, BoxLayout.X_AXIS));
		jpRow3.add(lb_mk= new JLabel("Mật khẩu"));
		jpRow3.add(Box.createHorizontalStrut(13));
		txt_mk= new JTextField(19);
		txt_mk.setBounds(50, 50, 20, 5);
		jpRow3.add(txt_mk);
		//row4
		jpRow4= new JPanel();
		jpRow4.add(button_login= new JButton("Đăng nhập"));
		button_login.setForeground(Color.BLUE);
		jpTong.add(jpRow1);
		jpTong.add(Box.createVerticalStrut(5));
		jpTong.add(jpRow2);
		jpTong.add(Box.createVerticalStrut(5));
		jpTong.add(jpRow3);
		jpTong.add(Box.createVerticalStrut(5));
		jpTong.add(jpRow4);
		add(jpTong);
		setSize(300, 180);
		setVisible(true);
		setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Login_GUI();
}
}
