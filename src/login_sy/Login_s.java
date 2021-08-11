package login_sy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

import Amra.RestaurantFrame;

import javax.swing.ImageIcon;

public class Login_s {

	private JFrame frame;
	private JTextField textUsername;
	private JPasswordField txtPassword;
	private JFrame frmLoginSystem;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_s window = new Login_s();
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
	public Login_s() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(78,205,196));
		frame.setBounds(100, 100, 654, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("User ID");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblUsername.setBounds(164, 98, 135, 25);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPassword.setBounds(164, 147, 158, 29);
		frame.getContentPane().add(lblPassword);
		
		textUsername = new JTextField();
		textUsername.setBackground(new Color(238, 238, 238));
		textUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
		textUsername.setBounds(309, 98, 183, 28);
		frame.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(new Color(238, 238, 238));
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPassword.setBounds(309, 153, 183, 28);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password =txtPassword.getText();
				String username =textUsername.getText();
				
				if(password.contains("Admin")&& username.contains("Admin")) {
					txtPassword.setText(null);
					textUsername.setText(null);
					
					RestaurantFrame info = new RestaurantFrame(); 
					RestaurantFrame.main(null);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					textUsername.setText(null);
				}
				
			}
		});
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBackground(new Color(34, 167, 240));
		btnLogin.setBounds(58, 250, 105, 36);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(249, 105, 14));
		btnReset.setForeground(Color.WHITE);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textUsername.setText(null);
				txtPassword.setText(null);
				
			}
			
			
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(266, 250, 105, 36);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(new Color(240,52,52));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLoginSystem=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystem, "Confirm if you want to exit","Login System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
					
				}
				
			}
		});
		btnExit.setBounds(473, 250, 93, 36);
		frame.getContentPane().add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 638, 70);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login panel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(132, 11, 468, 48);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Sakib Mahmud\\Desktop\\network-vpn-icon.png"));
		lblNewLabel_2.setBounds(68, 11, 54, 48);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sakib Mahmud\\Desktop\\man-icon (1).png"));
		lblNewLabel_1.setBounds(98, 75, 56, 62);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sakib Mahmud\\Desktop\\secrecy-icon.png"));
		label.setBounds(98, 133, 56, 48);
		frame.getContentPane().add(label);
	}
}
