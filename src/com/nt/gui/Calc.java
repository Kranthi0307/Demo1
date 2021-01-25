package com.nt.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 599, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(39, 36, 120, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(100, 192, 144, -61);
		frame.getContentPane().add(horizontalBox);
		
		btnNewButton = new JButton("*");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val1 = 0, val2 = 0;
				int result = 0;
				val1 = Integer.parseInt(textField.getText());
				val2 = Integer.parseInt(textField_1.getText());
				
				result = val1 * val2;
				
			}
		});
		btnNewButton.setBounds(39, 130, 89, 43);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val1 = 0, val2 = 0;
				int result = 0;
				val1 = Integer.parseInt(textField.getText());
				val2 = Integer.parseInt(textField_1.getText());
				
				result = val1 + val2;
				textField_2.setText(String.valueOf(result));
			}
		});
		btnNewButton_1.setBounds(198, 130, 89, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val1 = 0, val2 = 0;
				int result = 0;
				val1 = Integer.parseInt(textField.getText());
				val2 = Integer.parseInt(textField_1.getText());
				
				result = val1 - val2;
				textField_2.setText(String.valueOf(result));
			}
		});
		btnNewButton_2.setBounds(39, 205, 89, 43);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val1 = 0, val2 = 0;
				int result = 0;
				val1 = Integer.parseInt(textField.getText());
				val2 = Integer.parseInt(textField_1.getText());
				
				result = val1 / val2;
				textField_2.setText(String.valueOf(result));
			}
		});
		btnNewButton_3.setBounds(198, 205, 89, 43);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Enter");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				textField_2.setText(String.valueOf(result));
			}
		});
		btnNewButton_4.setBounds(374, 215, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(198, 36, 120, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(374, 36, 120, 23);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
