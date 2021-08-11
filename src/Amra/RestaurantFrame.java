package Amra;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.DropMode;

public class RestaurantFrame {

	private JFrame frame;
	private JTextField jlblconvert;
	private JTextField jtxtcbm;
	private JTextField jtxtchb;
	private JTextField jtxtconvert;
	private JTextField jlblcostmeal;
	private JTextField jlblcostdelivery;
	private JTextField jlbltax;
	private JTextField jlblsubtotal;
	private JTextField jlbltotal;
	private JTextField jtxtqt;
	private JTextField jlblcostdrink;
	private JTextField jtxtcb;
	private JTextArea jtxtarea;
	/*private JTextField append(String Q1,String Q2,String Q3)
	{
		System.out.println("\t\nRestaurant Management Systems : \n\n" + "Chicken Burger :\t\t" + Q1 + "\nChicken Burger Meal :\t\t" + Q2 + "\nCheese Burger :\t\t" + Q3 + "\nThank You For Bying From Us");
		return jlblconvert; 
		
	}*/
	
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	
	
	double USA = 82.98;
	double Brazil = 25.11;
	double India = 1.28;
	double Qatar = 22.79;
	double Saudi_Arabia = 22.13;
	double Nepal = 0.80;
	double UK = 116.30;
	double China = 13.20;
	double  Malaysia = 21.48;
	protected JLabel jlblconversion;
	private JTextField jtxtconversion;
	private JTextField jtxtreceipt;
	private JTextField txtdisplay;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantFrame window = new RestaurantFrame();
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
	public RestaurantFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(0,0, 1234,758);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 255, 102));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(35, 86, 468, 342);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblChickenBurger.setBounds(22, 13, 204, 41);
		panel.add(lblChickenBurger);
		
		JLabel label = new JLabel("Chicken Burger Meal");
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(22, 69, 246, 41);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Cheese Burger");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_1.setBounds(22, 123, 204, 41);
		panel.add(label_1);
		
		jtxtcbm = new JTextField();
		jtxtcbm.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtcbm.setColumns(10);
		jtxtcbm.setBounds(266, 69, 162, 41);
		panel.add(jtxtcbm);
		
		jtxtchb = new JTextField();
		jtxtchb.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtchb.setColumns(10);
		jtxtchb.setBounds(266, 123, 162, 41);
		panel.add(jtxtchb);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDrink.setBounds(22, 177, 204, 41);
		panel.add(lblDrink);
		
		JList list = new JList();
		list.setBounds(62, 304, 1, 1);
		panel.add(list);
		
		JComboBox jcombodrink = new JComboBox();
		jcombodrink.setForeground(new Color(153, 255, 102));
		jcombodrink.setBackground(new Color(0, 153, 255));
		jcombodrink.setFont(new Font("Tahoma", Font.BOLD, 20));
		jcombodrink.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink",
				"1.Coca-Cola", "2.Mountain-Dew", "3.Pepsi", "4.RC Jira Pani", 
				"5.Fanta", "6.Mirinda", "7.7Up", "8.Mojo", "9.Frooto", "10.Speed"}));
		jcombodrink.setBounds(22, 222, 188, 47);
		panel.add(jcombodrink);
		
		JCheckBox jcdelivery = new JCheckBox("Home Delivery");
		jcdelivery.setForeground(new Color(255, 255, 255));
		jcdelivery.setBackground(new Color(204, 0, 153));
		jcdelivery.setFont(new Font("Tahoma", Font.BOLD, 22));
		jcdelivery.setBounds(22, 285, 204, 47);
		panel.add(jcdelivery);
		
		JCheckBox jtax = new JCheckBox("Tax");
		jtax.setForeground(new Color(255, 255, 255));
		jtax.setBackground(new Color(204, 0, 153));
		jtax.setFont(new Font("Tahoma", Font.BOLD, 25));
		jtax.setBounds(266, 288, 162, 41);
		panel.add(jtax);
		
		JLabel lblQty = new JLabel("Quantity");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblQty.setBounds(266, 177, 190, 41);
		panel.add(lblQty);
		
		jtxtqt = new JTextField();
		jtxtqt.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtqt.setColumns(10);
		jtxtqt.setBounds(266, 223, 162, 41);
		panel.add(jtxtqt);
		
		jtxtcb = new JTextField();
		jtxtcb.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtcb.setColumns(10);
		jtxtcb.setBounds(266, 13, 162, 41);
		panel.add(jtxtcb);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 255, 102));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(35, 441, 468, 171);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_2 = new JLabel("Cost Of Drinks");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_2.setBounds(30, 13, 204, 41);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Cost Of Meal");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_3.setBounds(30, 67, 246, 41);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Cost Of Delivery");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_4.setBounds(30, 121, 204, 41);
		panel_2.add(label_4);
		
		jlblcostmeal = new JTextField();
		jlblcostmeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblcostmeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblcostmeal.setColumns(10);
		jlblcostmeal.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		jlblcostmeal.setBounds(225, 70, 222, 36);
		panel_2.add(jlblcostmeal);
		
		jlblcostdelivery = new JTextField();
		jlblcostdelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblcostdelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblcostdelivery.setColumns(10);
		jlblcostdelivery.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		jlblcostdelivery.setBounds(225, 121, 222, 36);
		panel_2.add(jlblcostdelivery);
		
		jlblcostdrink = new JTextField();
		jlblcostdrink.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblcostdrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblcostdrink.setColumns(10);
		jlblcostdrink.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		jlblcostdrink.setBounds(225, 16, 222, 36);
		panel_2.add(jlblcostdrink);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(102, 255, 102));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(515, 442, 305, 170);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTax.setBounds(12, 13, 90, 41);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblSubTotal.setBounds(12, 67, 132, 41);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total ");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTotal.setBounds(12, 121, 108, 41);
		panel_3.add(lblTotal);
		
		jlbltax = new JTextField();
		jlbltax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbltax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlbltax.setColumns(10);
		jlbltax.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		jlbltax.setBounds(137, 16, 156, 36);
		panel_3.add(jlbltax);
		
		jlblsubtotal = new JTextField();
		jlblsubtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblsubtotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblsubtotal.setColumns(10);
		jlblsubtotal.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		jlblsubtotal.setBounds(137, 70, 156, 36);
		panel_3.add(jlblsubtotal);
		
		jlbltotal = new JTextField();
		jlbltotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbltotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlbltotal.setColumns(10);
		jlbltotal.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		jlbltotal.setBounds(137, 124, 156, 36);
		panel_3.add(jlbltotal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 255, 102));
		panel_1.setBounds(515, 86, 305, 342);
		frame.getContentPane().add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setLayout(null);
		
		JComboBox jcombocurrency = new JComboBox();
		jcombocurrency.setForeground(new Color(153, 255, 51));
		jcombocurrency.setBackground(new Color(0, 153, 255));
		jcombocurrency.setFont(new Font("Tahoma", Font.BOLD, 25));
		jcombocurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One", "1.USA", "2.Brazil", "3.India", "4.Qatar", "5.Saudi-Arabia", "6.Nepal", "7.UK", "8.China", "9.Malaysia"}));
		jcombocurrency.setBounds(38, 60, 230, 38);
		panel_1.add(jcombocurrency);
		
		jlblconvert = new JTextField();
		jlblconvert.setHorizontalAlignment(SwingConstants.CENTER);
		jlblconvert.setBounds(38, 133, 230, 41);
		panel_1.add(jlblconvert);
		jlblconvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblconvert.setColumns(10);
		
		jtxtconvert = new JTextField();
		jtxtconvert.setBounds(38, 196, 230, 36);
		panel_1.add(jtxtconvert);
		jtxtconvert.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		jtxtconvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtconvert.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtconvert.setColumns(10);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.setForeground(new Color(255, 255, 255));
		jbtnConvert.setBackground(new Color(255, 51, 255));
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double bdtaka = Double.parseDouble(jlblconvert.getText());
				if(jcombocurrency.getSelectedItem().equals("1.USA"))
				{
					String cconvert1 = String.format("$ %.2f", bdtaka/USA);
					jtxtconvert.setText(cconvert1);
				}
				if(jcombocurrency.getSelectedItem().equals("2.Brazil"))
				{
					String cconvert2 = String.format("R$ %.2f", bdtaka/Brazil);
					jtxtconvert.setText(cconvert2);
				}
				if(jcombocurrency.getSelectedItem().equals("3.India"))
				{
					String cconvert3= String.format(" ₹ %.2f", bdtaka/India);
					jtxtconvert.setText(cconvert3);
				}
				if(jcombocurrency.getSelectedItem().equals("4.Qatar"))
				{
					String cconvert4 = String.format("%.2f ﷼.", bdtaka/Qatar);
					jtxtconvert.setText(cconvert4);  
				}
				if(jcombocurrency.getSelectedItem().equals("5.Saudi-Arabia"))
				{
					String cconvert5 = String.format("%.2f ﷼.", bdtaka/Saudi_Arabia);
					jtxtconvert.setText(cconvert5);  
				}
				if(jcombocurrency.getSelectedItem().equals("6.Nepal"))
				{
					String cconvert6 = String.format("₹  %.2f", bdtaka*Nepal);
					jtxtconvert.setText(cconvert6);  
				}
				if(jcombocurrency.getSelectedItem().equals("7.UK"))
				{
					String cconvert7 = String.format("£ %.2f", bdtaka/UK);
					jtxtconvert.setText(cconvert7);  
				}
				if(jcombocurrency.getSelectedItem().equals("8.China"))
				{
					String cconvert8 = String.format("¥ %.2f", bdtaka/China);
					jtxtconvert.setText(cconvert8);  
				}
				if(jcombocurrency.getSelectedItem().equals("9.Malaysia"))
				{
					String cconvert9 = String.format("rɪŋɡɪt %.2f", bdtaka/Malaysia);
					jtxtconvert.setText(cconvert9);  
				}
				
				
			}
		});
		jbtnConvert.setFont(new Font("Tahoma", Font.BOLD, 22));
		jbtnConvert.setBounds(12, 256, 127, 51);
		panel_1.add(jbtnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.setForeground(new Color(255, 255, 255));
		btnClose.setBackground(new Color(255, 51, 51));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jlblconvert.setText(null);
				jtxtconvert.setText(null);
				jcombocurrency.setSelectedItem("Choose One");
				
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnClose.setBounds(161, 256, 121, 51);
		panel_1.add(btnClose);
		
		JLabel lblNewLabel_1 = new JLabel("Currency Converter");
		lblNewLabel_1.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(28, 13, 271, 51);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(102, 255, 102));
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(35, 625, 1150, 68);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(0, 204, 255));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jlblcostdelivery.setText(null);
				jlblsubtotal.setText(null);
				jlbltotal.setText(null);
				jlbltax.setText(null);
				jlblconvert.setText(null);
				jlblcostdelivery.setText(null);
				jlblcostdrink.setText(null);
				jlblcostmeal.setText("0");
				jlblsubtotal.setText(null);
				jlbltax.setText(null);
				jlbltotal.setText(null);
				
				jtxtcb.setText(null);
				jtxtcbm.setText(null);
				jtxtchb.setText(null);
				jtxtconvert.setText(null);
				jtxtqt.setText(null);
				jcombodrink.setSelectedItem("Select a Drink");
				jcombocurrency.setSelectedItem("Choose One");
				
				 
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnReset.setBounds(562, 13, 205, 39);
		panel_5.add(btnReset);
		
		JButton jbtnRecipt = new JButton("Receipt");
		jbtnRecipt.setForeground(new Color(255, 255, 255));
		jbtnRecipt.setBackground(new Color(0, 204, 255));
		jbtnRecipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				double qty1 = Double.parseDouble(jtxtcb.getText());
				double qty2 = Double.parseDouble(jtxtcbm.getText());
				double qty3 = Double.parseDouble(jtxtchb.getText());
				
				String Q1 = String.format("%.2f", qty1);
				String Q2 = String.format("%.2f", qty2);
				String Q3 = String.format("%.2f", qty3);
				
				jtxtreceipt.setText("\t\nRestaurant Management Systems : \n\n" + "Chicken Burger :  " 
				+ Q1 + "\nChicken Burger Meal :  " 
						+ Q2 + "\nCheese Burger :  " 
				+ Q3 + "\nThank You For Bying From Us");
				
				jtxtarea.append("\t\nRestaurant Management Systems : \n\n" + "Chicken Burger :  " 
				+ Q1 + "\nChicken Burger Meal :  " 
						+ Q2 + "\nCheese Burger :  " 
				+ Q3 + "\nThank You For Bying From Us");
				
			}
		});
		jbtnRecipt.setFont(new Font("Tahoma", Font.BOLD, 35));
		jbtnRecipt.setBounds(302, 15, 205, 39);
		panel_5.add(jbtnRecipt);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setForeground(new Color(255, 255, 255));
		btnTotal.setBackground(new Color(0, 204, 255));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double Cbur = Double.parseDouble(jtxtcb.getText());
				double price_cbur = 60;
				double burger;
				
				burger = (Cbur*price_cbur);
				String pMeal = String.format("%.2f", burger);
				jlblcostmeal.setText(pMeal);
				
				
				double Cbmeal = Double.parseDouble(jtxtcbm.getText());
				double price_chbmeal = 90;
				double burgermeal;
				
				burgermeal = (Cbmeal*price_chbmeal);
				String cbMeal = String.format("%.2f", burgermeal+burger);
				jlblcostmeal.setText(cbMeal);
				
				
				double Chbmeal = Double.parseDouble(jtxtchb.getText());
				double price_chburger = 120;
				double chburger;
				
				chburger = (Chbmeal*price_chburger);
				String cheesemeal = String.format("%.2f",chburger+burgermeal+burger);
				jlblcostmeal.setText(cheesemeal);
				
				
				
				//----------------------------Home Delivery-------------------------------------------------
				double idelivery = 10;
				
				if(jcdelivery.isSelected())
				{
					String pdelivery = String.format("%.2f", idelivery);
					jlblcostdelivery.setText(pdelivery);
					
				}
				else
				{
					jlblcostdelivery.setText("0");
				}
			
				
				//-----------------------------------------------Drinks------------------------------------------------ 
				
				double drinks = Double.parseDouble(jtxtqt.getText());
				double cola = 20*drinks;
				double dew = 25*drinks;
				double pepsi = 20*drinks; 
				double jira = 15*drinks;
				double fanta = 35*drinks;
				double mirinda = 30*drinks;
				double brazil = 30*drinks;
				double mojo = 20*drinks;
				double fruto = 25*drinks;
				double speed = 25*drinks;
				
				
				
				if(jcombodrink.getSelectedItem().equals("2.Mountain-Dew"))
				{
					String cdew = String.format("%.2f",dew);
					jlblcostdrink.setText(cdew);
				}
				if(jcombodrink.getSelectedItem().equals("1.Coca-Cola"))
				{
					String ccola = String.format("%.2f",cola);
					jlblcostdrink.setText(ccola);
				}
				if(jcombodrink.getSelectedItem().equals("3.Pepsi"))
				{
					String cpepsi = String.format("%.2f",pepsi);
					jlblcostdrink.setText(cpepsi);
				}
				if(jcombodrink.getSelectedItem().equals("4.RC Jira Pani"))
				{
					String cjira = String.format("%.2f",jira);
					jlblcostdrink.setText(cjira);
				}
				if(jcombodrink.getSelectedItem().equals("5.Fanta"))
				{
					String cfanta = String.format("%.2f",fanta);
					jlblcostdrink.setText(cfanta);
				}
				if(jcombodrink.getSelectedItem().equals("6.Mirinda"))
				{
					String cmirinda = String.format("%.2f",mirinda);
					jlblcostdrink.setText(cmirinda);
				}
				if(jcombodrink.getSelectedItem().equals("7.7Up"))
				{
					String cbrazil = String.format("%.2f",brazil);
					jlblcostdrink.setText(cbrazil);
				}
				if(jcombodrink.getSelectedItem().equals("8.Mojo"))
				{
					String cmojo = String.format("%.2f",mojo);
					jlblcostdrink.setText(cmojo);
				}
				if(jcombodrink.getSelectedItem().equals("9.Frooto"))
				{
					String cfruto = String.format("%.2f",fruto);
					jlblcostdrink.setText(cfruto);
				}
				if(jcombodrink.getSelectedItem().equals("10.Speed"))
				{
					String cspeed = String.format("%.2f",speed);
					jlblcostdrink.setText(cspeed);
				}
				if(jcombodrink.getSelectedItem().equals("Select a Drink"))
				{
					jlblcostdrink.setText("0");
				}
				
				//==========================================TAX================================================
				
				double ctotal1 = Double.parseDouble(jlblcostdrink.getText());
				double ctotal2 = Double.parseDouble(jlblcostmeal.getText());
				double ctotal3 = Double.parseDouble(jlblcostdelivery.getText());  
				double alltotal = (ctotal1 + ctotal2 + ctotal3)/100;  
				
				if(jtax.isSelected())
				{
					String itotal = String.format("%.2f", alltotal);
					jlbltax.setText(itotal);
				}
				
				//================================================Total & Sub-Total================================================= 
				
				
				double ctotal4 = Double.parseDouble(jlbltax.getText());
				
				double subtotal = (ctotal1 + ctotal2 + ctotal3);
				String isubtotal = String.format("৳ %.2f", subtotal);
				jlblsubtotal.setText(isubtotal); 
				
				double allTotal = (ctotal1 + ctotal2 + ctotal3 + ctotal4);
				String itotal = String.format("৳ %.2f", allTotal); 
				jlbltotal.setText(itotal);
				
				String itaxtotal = String.format("৳ %.2f", ctotal4);
				jlbltax.setText(itaxtotal); 
				
				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnTotal.setBounds(85, 15, 171, 39);
		panel_5.add(btnTotal);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(0, 204, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnExit.setBounds(823, 13, 205, 39);
		panel_5.add(btnExit);
		
		JLabel lblNewLabel = new JLabel(" Restaurant Management Systems ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		lblNewLabel.setBounds(177, 13, 957, 68);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(102, 255, 102));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(832, 84, 352, 528);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 41, 325, 474);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		jtxtreceipt = new JTextField();
		jtxtreceipt.setBounds(12, 13, 296, 160);
		panel_6.add(jtxtreceipt);
		jtxtreceipt.setColumns(10);
		
		JTextArea jtxtarea = new JTextArea();
		jtxtarea.setBounds(12, 231, 296, 181);
		panel_6.add(jtxtarea);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 153, 255));
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		txtdisplay = new JTextField();
		txtdisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdisplay.setFont(new Font("Lucida Fax", Font.BOLD, 26));
		txtdisplay.setColumns(10);
		txtdisplay.setBounds(29, 43, 279, 56);
		panel_7.add(txtdisplay);
		
		JButton btnspace = new JButton("\uF0E7");
		btnspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(txtdisplay.getText().length()>0)
				{
					
					StringBuilder strb = new StringBuilder(txtdisplay.getText());
					strb.deleteCharAt(txtdisplay.getText().length()-1);
					backspace = strb.toString();
					txtdisplay.setText(backspace); 
					
					
				}
				
			}
		});
		btnspace.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnspace.setBackground(new Color(255, 0, 102));
		btnspace.setBounds(29, 112, 60, 41);
		panel_7.add(btnspace);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtdisplay.setText(null);
				
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnclear.setBackground(new Color(255, 0, 51));
		btnclear.setBounds(101, 112, 60, 41);
		panel_7.add(btnclear);
		
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "%";
			}
		});
		btnpercent.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnpercent.setBackground(new Color(255, 255, 51));
		btnpercent.setBounds(174, 113, 60, 41);
		panel_7.add(btnpercent);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBackground(new Color(255, 255, 51));
		btnplus.setBounds(246, 111, 60, 42);
		panel_7.add(btnplus);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText()+btn7.getText();
				txtdisplay.setText(Enternumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBackground(new Color(51, 204, 51));
		btn7.setBounds(29, 166, 60, 41);
		panel_7.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText()+btn8.getText();
				txtdisplay.setText(Enternumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBackground(new Color(51, 204, 51));
		btn8.setBounds(101, 166, 60, 41);
		panel_7.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText()+btn9.getText();
				txtdisplay.setText(Enternumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBackground(new Color(51, 204, 51));
		btn9.setBounds(174, 167, 60, 41);
		panel_7.add(btn9);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnsub.setBackground(new Color(255, 255, 51));
		btnsub.setBounds(248, 166, 60, 41);
		panel_7.add(btnsub);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText()+btn4.getText();
				txtdisplay.setText(Enternumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBackground(new Color(51, 204, 51));
		btn4.setBounds(29, 220, 60, 42);
		panel_7.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText()+btn5.getText();
				txtdisplay.setText(Enternumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBackground(new Color(51, 204, 51));
		btn5.setBounds(101, 220, 60, 42);
		panel_7.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText()+btn6.getText();
				txtdisplay.setText(Enternumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBackground(new Color(51, 204, 51));
		btn6.setBounds(174, 221, 60, 41);
		panel_7.add(btn6);
		
		JButton btnmul = new JButton("X");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "X";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmul.setBackground(new Color(255, 255, 51));
		btnmul.setBounds(248, 220, 60, 41);
		panel_7.add(btnmul);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText()+btn1.getText();
				txtdisplay.setText(Enternumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBackground(new Color(51, 204, 51));
		btn1.setBounds(29, 275, 60, 41);
		panel_7.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText()+btn2.getText();
				txtdisplay.setText(Enternumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBackground(new Color(51, 204, 51));
		btn2.setBounds(101, 275, 60, 41);
		panel_7.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText()+btn3.getText();
				txtdisplay.setText(Enternumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBackground(new Color(51, 204, 102));
		btn3.setBounds(174, 275, 60, 41);
		panel_7.add(btn3);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndiv.setBackground(new Color(255, 255, 51));
		btndiv.setBounds(246, 274, 60, 41);
		panel_7.add(btndiv);
		
		JButton btnzero = new JButton("0");
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText()+btnzero.getText();
				txtdisplay.setText(Enternumber);
			}
		});
		btnzero.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnzero.setBackground(new Color(51, 204, 51));
		btnzero.setBounds(29, 329, 60, 41);
		panel_7.add(btnzero);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText()+btndot.getText();
				txtdisplay.setText(Enternumber);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBackground(new Color(153, 102, 255));
		btndot.setBounds(101, 329, 60, 41);
		panel_7.add(btndot);
		
		JButton btnpm = new JButton("\u00B1");
		btnpm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = ops * (-1);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnpm.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpm.setBackground(new Color(204, 51, 255));
		btnpm.setBounds(174, 329, 60, 41);
		panel_7.add(btnpm);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtdisplay.getText());
				
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtdisplay.setText(answer);
					
				}
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtdisplay.setText(answer);
					
				}
				else if(operations == "X")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtdisplay.setText(answer);
					
				}
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtdisplay.setText(answer);
					
				}
				else if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtdisplay.setText(answer);
					
				}
				
				
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBackground(new Color(255, 51, 0));
		btnequal.setBounds(248, 328, 60, 42);
		panel_7.add(btnequal);
	}
}
