package interfaz;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainFormFirst {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFormFirst window = new MainFormFirst();
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
	public MainFormFirst() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel tituloPrincipal = new JLabel("Nanograma - Programación III",  SwingConstants.CENTER);
		tituloPrincipal.setFont(new Font("SansSerif", Font.BOLD,24));
		frame.getContentPane().add(tituloPrincipal, BorderLayout.NORTH);
		
		
		JPanel panelBoton = new JPanel();
		panelBoton.setLayout(new BoxLayout(panelBoton, BoxLayout.Y_AXIS));

		JButton buttonPlay = new JButton("Jugar");
		buttonPlay.setFont(new Font("SansSerif", Font.BOLD, 20));
		buttonPlay.setAlignmentX(Component.CENTER_ALIGNMENT); 

		JButton buttonComoJugar = new JButton("¿Cómo jugar?");
		buttonComoJugar.setFont(new Font("SansSerif", Font.BOLD, 20));
		buttonComoJugar.setAlignmentX(Component.CENTER_ALIGNMENT);

		panelBoton.add(buttonPlay);
		panelBoton.add(Box.createVerticalStrut(10)); 
		panelBoton.add(buttonComoJugar);

		frame.getContentPane().add(panelBoton, BorderLayout.CENTER);



	   
		
		
	}

}
