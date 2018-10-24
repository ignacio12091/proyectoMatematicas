package main.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {
	/**
	 * @wbp.nonvisual location=-15,9
	 */
	private final Component horizontalStrut = Box.createHorizontalStrut(20);
	private JTextField txtTotalSillas;
	private JTextField txtTotSillasNegras;
	private JTextField txtTotAlumnosAsisten;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setTitle("C\u00E1lculo de probabilidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 300);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblCualEsLa = new JLabel("\u00BFCu\u00E1l es la probabilidad de que un alumno se haya sentado en la silla negra?");
		lblCualEsLa.setFont(new Font("Arial", Font.BOLD, 11));
		springLayout.putConstraint(SpringLayout.NORTH, lblCualEsLa, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblCualEsLa, 32, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblCualEsLa);
		
		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Arial", Font.PLAIN, 34));
		getContentPane().add(lblC);
		
		JLabel label = new JLabel("C");
		springLayout.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, lblC);
		springLayout.putConstraint(SpringLayout.WEST, label, 158, SpringLayout.WEST, getContentPane());
		label.setFont(new Font("Arial", Font.PLAIN, 34));
		getContentPane().add(label);
		
		JSeparator separator = new JSeparator();
		springLayout.putConstraint(SpringLayout.NORTH, separator, 183, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, separator, -76, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblC, 0, SpringLayout.WEST, separator);
		springLayout.putConstraint(SpringLayout.SOUTH, lblC, -6, SpringLayout.NORTH, separator);
		springLayout.putConstraint(SpringLayout.EAST, separator, 229, SpringLayout.WEST, getContentPane());
		separator.setForeground(Color.BLACK);
		getContentPane().add(separator);
		
		JLabel lblP = new JLabel("P = ");
		springLayout.putConstraint(SpringLayout.WEST, separator, 6, SpringLayout.EAST, lblP);
		springLayout.putConstraint(SpringLayout.NORTH, lblP, 142, SpringLayout.SOUTH, lblCualEsLa);
		springLayout.putConstraint(SpringLayout.WEST, lblP, 10, SpringLayout.WEST, getContentPane());
		lblP.setFont(new Font("Arial", Font.PLAIN, 34));
		getContentPane().add(lblP);
		
		JLabel label_1 = new JLabel("C");
		springLayout.putConstraint(SpringLayout.NORTH, label_1, 6, SpringLayout.SOUTH, separator);
		label_1.setFont(new Font("Arial", Font.PLAIN, 34));
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("1");
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		springLayout.putConstraint(SpringLayout.NORTH, label_2, 21, SpringLayout.NORTH, lblC);
		springLayout.putConstraint(SpringLayout.WEST, label_2, 6, SpringLayout.EAST, lblC);
		getContentPane().add(label_2);
		
		JLabel lblTotalAlumnosRestantes = new JLabel("0");
		springLayout.putConstraint(SpringLayout.WEST, lblTotalAlumnosRestantes, 6, SpringLayout.EAST, label);
		lblTotalAlumnosRestantes.setFont(new Font("Arial", Font.PLAIN, 11));
		getContentPane().add(lblTotalAlumnosRestantes);
		
		JLabel lblTotalSillas = new JLabel("0");
		springLayout.putConstraint(SpringLayout.EAST, label_1, -6, SpringLayout.WEST, lblTotalSillas);
		springLayout.putConstraint(SpringLayout.WEST, lblTotalSillas, 143, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblTotalSillas, 6, SpringLayout.SOUTH, separator);
		lblTotalSillas.setFont(new Font("Arial", Font.PLAIN, 11));
		getContentPane().add(lblTotalSillas);
		
		JLabel lblTotalAsisten = new JLabel("0");
		springLayout.putConstraint(SpringLayout.NORTH, lblTotalAsisten, 21, SpringLayout.NORTH, label_1);
		springLayout.putConstraint(SpringLayout.WEST, lblTotalAsisten, 6, SpringLayout.EAST, label_1);
		lblTotalAsisten.setFont(new Font("Arial", Font.PLAIN, 11));
		getContentPane().add(lblTotalAsisten);
		
		txtTotalSillas = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtTotalSillas, 6, SpringLayout.SOUTH, lblCualEsLa);
		springLayout.putConstraint(SpringLayout.WEST, txtTotalSillas, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtTotalSillas, 26, SpringLayout.SOUTH, lblCualEsLa);
		springLayout.putConstraint(SpringLayout.EAST, txtTotalSillas, 44, SpringLayout.WEST, getContentPane());
		getContentPane().add(txtTotalSillas);
		txtTotalSillas.setColumns(10);
		
		JLabel lblIngreseLaCantidad = new JLabel("Ingrese la cantidad total de sillas");
		lblIngreseLaCantidad.setFont(new Font("Arial", Font.PLAIN, 11));
		springLayout.putConstraint(SpringLayout.NORTH, lblIngreseLaCantidad, 3, SpringLayout.NORTH, txtTotalSillas);
		springLayout.putConstraint(SpringLayout.WEST, lblIngreseLaCantidad, 6, SpringLayout.EAST, txtTotalSillas);
		getContentPane().add(lblIngreseLaCantidad);
		
		txtTotSillasNegras = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtTotSillasNegras, 6, SpringLayout.SOUTH, txtTotalSillas);
		springLayout.putConstraint(SpringLayout.WEST, txtTotSillasNegras, 0, SpringLayout.WEST, lblP);
		springLayout.putConstraint(SpringLayout.SOUTH, txtTotSillasNegras, 26, SpringLayout.SOUTH, txtTotalSillas);
		springLayout.putConstraint(SpringLayout.EAST, txtTotSillasNegras, 34, SpringLayout.WEST, lblP);
		txtTotSillasNegras.setColumns(10);
		getContentPane().add(txtTotSillasNegras);
		
		JLabel lblIngreseLaCantidad_1 = new JLabel("Ingrese la cantidad de sillas negras");
		lblIngreseLaCantidad_1.setFont(new Font("Arial", Font.PLAIN, 11));
		springLayout.putConstraint(SpringLayout.NORTH, lblIngreseLaCantidad_1, 3, SpringLayout.NORTH, txtTotSillasNegras);
		springLayout.putConstraint(SpringLayout.WEST, lblIngreseLaCantidad_1, 0, SpringLayout.WEST, lblIngreseLaCantidad);
		getContentPane().add(lblIngreseLaCantidad_1);
		
		txtTotAlumnosAsisten = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtTotAlumnosAsisten, 6, SpringLayout.SOUTH, txtTotSillasNegras);
		springLayout.putConstraint(SpringLayout.WEST, txtTotAlumnosAsisten, 0, SpringLayout.WEST, lblP);
		springLayout.putConstraint(SpringLayout.EAST, txtTotAlumnosAsisten, 34, SpringLayout.WEST, lblP);
		txtTotAlumnosAsisten.setColumns(10);
		getContentPane().add(txtTotAlumnosAsisten);
		
		JLabel lblIngreseLaCantidad_2 = new JLabel("Ingrese la cantidad de alumnos asisten");
		springLayout.putConstraint(SpringLayout.EAST, lblTotalAlumnosRestantes, -14, SpringLayout.EAST, lblIngreseLaCantidad_2);
		lblIngreseLaCantidad_2.setFont(new Font("Arial", Font.PLAIN, 11));
		springLayout.putConstraint(SpringLayout.WEST, lblIngreseLaCantidad_2, 0, SpringLayout.WEST, lblIngreseLaCantidad);
		springLayout.putConstraint(SpringLayout.SOUTH, lblIngreseLaCantidad_2, 0, SpringLayout.SOUTH, txtTotAlumnosAsisten);
		getContentPane().add(lblIngreseLaCantidad_2);
		
		
		
		
		JLabel label_7 = new JLabel("=");
		springLayout.putConstraint(SpringLayout.NORTH, label_7, 0, SpringLayout.NORTH, lblP);
		springLayout.putConstraint(SpringLayout.WEST, label_7, 18, SpringLayout.EAST, separator);
		label_7.setFont(new Font("Arial", Font.PLAIN, 34));
		getContentPane().add(label_7);
		
		JLabel lblResultado = new JLabel("Resultado");
		springLayout.putConstraint(SpringLayout.NORTH, lblResultado, 4, SpringLayout.NORTH, lblP);
		springLayout.putConstraint(SpringLayout.WEST, lblResultado, 26, SpringLayout.EAST, label_7);
		lblResultado.setFont(new Font("Arial", Font.PLAIN, 30));
		getContentPane().add(lblResultado);
		
		JLabel lblTotSillasRestantes = new JLabel("0");
		springLayout.putConstraint(SpringLayout.SOUTH, lblTotalAlumnosRestantes, -6, SpringLayout.NORTH, lblTotSillasRestantes);
		springLayout.putConstraint(SpringLayout.NORTH, lblTotSillasRestantes, 21, SpringLayout.NORTH, lblC);
		springLayout.putConstraint(SpringLayout.WEST, lblTotSillasRestantes, 6, SpringLayout.EAST, label);
		lblTotSillasRestantes.setFont(new Font("Arial", Font.PLAIN, 11));
		getContentPane().add(lblTotSillasRestantes);
		
		JLabel lblTotalSillasNegras = new JLabel("0");
		springLayout.putConstraint(SpringLayout.WEST, lblTotalSillasNegras, 6, SpringLayout.EAST, lblC);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTotalSillasNegras, -6, SpringLayout.NORTH, label_2);
		springLayout.putConstraint(SpringLayout.EAST, lblTotalSillasNegras, -16, SpringLayout.WEST, label);
		lblTotalSillasNegras.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalSillasNegras.setFont(new Font("Arial", Font.PLAIN, 11));
		getContentPane().add(lblTotalSillasNegras);
		
		JButton btnResultadox = new JButton("Calcular");
		btnResultadox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double totSillas = Integer.parseInt(txtTotalSillas.getText());
				double totSillasNegras = Integer.parseInt(txtTotSillasNegras.getText());
				double totAlumnosAsisten = Integer.parseInt(txtTotAlumnosAsisten.getText());
				Calculadora calculadora = new Calculadora();
				double resultado = calculadora.probabilidad(totSillas, totAlumnosAsisten, totSillasNegras);
				lblResultado.setText(String.valueOf(resultado));
				//lblResultado
			}
		});
		
		btnResultadox.setFont(new Font("Arial", Font.PLAIN, 11));
		springLayout.putConstraint(SpringLayout.NORTH, btnResultadox, -1, SpringLayout.NORTH, txtTotSillasNegras);
		springLayout.putConstraint(SpringLayout.EAST, btnResultadox, -37, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnResultadox);
		
		JButton btnVistaPrevia = new JButton("Vista previa");
		btnVistaPrevia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double totSillas = Integer.parseInt(txtTotalSillas.getText());
				double totSillasNegras = Integer.parseInt(txtTotSillasNegras.getText());
				double totAlumnosAsisten = Integer.parseInt(txtTotAlumnosAsisten.getText());
				lblTotalSillas.setText(String.valueOf(totSillas));
				lblTotalAsisten.setText(String.valueOf(totAlumnosAsisten));
				lblTotalSillasNegras.setText(String.valueOf(totSillasNegras));
				double x = totSillas - totSillasNegras;
				lblTotalAlumnosRestantes.setText(String.valueOf(x));
				double z = totAlumnosAsisten - 1;
				lblTotSillasRestantes.setText(String.valueOf(z));
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnVistaPrevia, 19, SpringLayout.SOUTH, btnResultadox);
		springLayout.putConstraint(SpringLayout.EAST, btnVistaPrevia, 0, SpringLayout.EAST, btnResultadox);
		getContentPane().add(btnVistaPrevia);
	}
}
