package Restarent_Bill_Generator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 557, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restarent Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(166, 11, 230, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(42, 86, 46, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(42, 141, 92, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Ice _cream-30", "tea-40", "Biryani-180", "coffee-50"}));
		c1.setBounds(140, 92, 161, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(144, 149, 157, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Item=(String) c1.getSelectedItem();
				String Quantity=t1.getText();
				int q=Integer.parseInt(Quantity);
				int bill=0;
				if(Item.equals("Ice_cream-30"))
				{
					bill=q*30;
					JOptionPane.showConfirmDialog(btnNewButton, "hello Bhavani \n Selected Item:"+Item+"\n Quantity:"+q+" \n Your Bill:"+bill);
				}
				else if(Item.equals("tea-40"))
				{
				   bill=q*40;
				   JOptionPane.showConfirmDialog(btnNewButton, "hello Bhavani \n Selected Item:"+Item+"\n Quantity:"+q+" \n Your Bill:"+bill);
				}
				else if(Item.equals("Biryani-180"))
				{
					bill=q*180;
					JOptionPane.showConfirmDialog(btnNewButton, "hello Bhavani \n Selected Item:"+Item+"\n Quantity:"+q+" \n Your Bill:"+bill);
				}
				else if(Item.equals("cofee-50"))
				{
					bill=q*50;
					JOptionPane.showConfirmDialog(btnNewButton, "hello Bhavani \n Selected Item:"+Item+"\n Quantity:"+q+" \n Your Bill:"+bill);
				}
			}
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(88, 248, 132, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
