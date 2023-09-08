package sma.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SupermarketManagement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupermarketManagement frame = new SupermarketManagement();
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
	public SupermarketManagement() {
		setTitle("Supermarket Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 857, 246);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Cusutomer Management");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CustomerManagement customerManagement = new CustomerManagement();
				customerManagement.show();
			}
		});
		btnNewButton.setBounds(34, 27, 213, 40);
		panel.add(btnNewButton);
		
		JButton btnInvoiceManagement = new JButton("Invoice Management");
		btnInvoiceManagement.setBounds(290, 27, 213, 40);
		panel.add(btnInvoiceManagement);
		
		JButton btnItemManagement = new JButton("Item Management");
		btnItemManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ItemManagement itemManagement = new ItemManagement();
				itemManagement.show();
			}
		});
		btnItemManagement.setBounds(551, 27, 213, 40);
		panel.add(btnItemManagement);
	}
}