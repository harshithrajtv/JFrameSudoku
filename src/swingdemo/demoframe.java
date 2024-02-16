package swingdemo;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;

public class demoframe extends JFrame {
private String turn="1";
    
    private boolean globalflag=true;
    
    private String SolveBoard [][]={
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"3","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"}
    };
    
   
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demoframe frame = new demoframe();
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
	public demoframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 712);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new LineBorder(Color.BLACK));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.desktop));
		panel_1.setBounds(234, 29, 181, 149);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton r1c4 = new JButton("5");
		r1c4.setBackground(Color.BLUE);
		r1c4.setBounds(10, 11, 45, 38);
		panel_1.add(r1c4);
		
		JButton r1c5 = new JButton("");
		r1c5.setBackground(Color.BLUE);
		r1c5.setBounds(67, 11, 49, 38);
		panel_1.add(r1c5);
		
		JButton r1c6 = new JButton("");
		r1c6.setBackground(Color.BLUE);
		r1c6.setBounds(126, 11, 45, 38);
		panel_1.add(r1c6);
		
		JButton r2c4 = new JButton("");
		r2c4.setBackground(Color.BLUE);
		r2c4.setBounds(10, 51, 45, 38);
		panel_1.add(r2c4);
		
		JButton r2c5 = new JButton("7");
		r2c5.setBackground(Color.BLUE);
		r2c5.setBounds(67, 51, 44, 38);
		panel_1.add(r2c5);
		
		JButton r2c6 = new JButton("8");
		r2c6.setBackground(Color.BLUE);
		r2c6.setBounds(126, 51, 44, 38);
		panel_1.add(r2c6);
		
		JButton r3c4 = new JButton("");
		r3c4.setBackground(Color.BLUE);
		r3c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		r3c4.setBounds(10, 100, 45, 38);
		panel_1.add(r3c4);
		
		JButton r3c5 = new JButton("4");
		r3c5.setBackground(Color.BLUE);
		r3c5.setBounds(67, 100, 49, 38);
		panel_1.add(r3c5);
		
		JButton r3c6 = new JButton("");
		r3c6.setBackground(Color.BLUE);
		r3c6.setBounds(126, 97, 45, 38);
		panel_1.add(r3c6);
	
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(SystemColor.desktop));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(32, 29, 181, 149);
		contentPane.add(panel_1_1);
		
		JButton r1c1 = new JButton("");
		r1c1.setBackground(Color.BLUE);
		r1c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		r1c1.setBounds(10, 11, 46, 38);
		panel_1_1.add(r1c1);
		
		JButton r1c2 = new JButton("");
		r1c2.setBackground(Color.BLUE);
		r1c2.setBounds(64, 11, 46, 38);
		panel_1_1.add(r1c2);
		
		JButton r1c3 = new JButton("");
		r1c3.setBackground(Color.BLUE);
		r1c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		r1c3.setBounds(120, 11, 51, 38);
		panel_1_1.add(r1c3);
		
		JButton r2c1 = new JButton("4");
		r2c1.setBackground(Color.BLUE);
		r2c1.setBounds(10, 51, 46, 38);
		panel_1_1.add(r2c1);
		
		JButton r2c2 = new JButton("");
		r2c2.setBackground(Color.BLUE);
		r2c2.setBounds(64, 51, 49, 38);
		panel_1_1.add(r2c2);
		
		JButton r2c3 = new JButton("6");
		r2c3.setBackground(Color.BLUE);
		r2c3.setBounds(120, 51, 46, 38);
		panel_1_1.add(r2c3);
		
		JButton r3c1 = new JButton("7");
		r3c1.setBackground(Color.BLUE);
		r3c1.setBounds(10, 97, 46, 38);
		panel_1_1.add(r3c1);
		
		JButton r3c2 = new JButton("");
		r3c2.setBackground(Color.BLUE);
		r3c2.setBounds(64, 97, 46, 38);
		panel_1_1.add(r3c2);
		
		JButton r3c3 = new JButton("6");
		r3c3.setBackground(Color.BLUE);
		r3c3.setBounds(120, 97, 51, 38);
		panel_1_1.add(r3c3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(SystemColor.desktop));
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(437, 29, 174, 149);
		contentPane.add(panel_1_2);
		
		JButton r1c7 = new JButton("7");
		r1c7.setBackground(Color.BLUE);
		r1c7.setBounds(10, 11, 42, 38);
		panel_1_2.add(r1c7);
		
		JButton r1c8 = new JButton("3");
		r1c8.setBackground(Color.BLUE);
		r1c8.setBounds(62, 11, 42, 38);
		panel_1_2.add(r1c8);
		
		JButton r1c9 = new JButton("4");
		r1c9.setBackground(Color.BLUE);
		r1c9.setBounds(114, 11, 42, 38);
		panel_1_2.add(r1c9);
		
		JButton r2c7 = new JButton("5");
		r2c7.setBackground(Color.BLUE);
		r2c7.setBounds(10, 51, 42, 38);
		panel_1_2.add(r2c7);
		
		JButton r2c8 = new JButton("");
		r2c8.setBackground(Color.BLUE);
		r2c8.setBounds(62, 51, 42, 38);
		panel_1_2.add(r2c8);
		
		JButton r2c9 = new JButton("9");
		r2c9.setBackground(Color.BLUE);
		r2c9.setBounds(114, 51, 42, 38);
		panel_1_2.add(r2c9);
		
		JButton r3c7 = new JButton("");
		r3c7.setBackground(Color.BLUE);
		r3c7.setBounds(10, 100, 42, 38);
		panel_1_2.add(r3c7);
		
		JButton r3c8 = new JButton("2");
		r3c8.setBackground(Color.BLUE);
		r3c8.setBounds(62, 97, 42, 38);
		panel_1_2.add(r3c8);
		
		JButton r3c9 = new JButton("");
		r3c9.setBackground(Color.BLUE);
		r3c9.setBounds(114, 97, 42, 38);
		panel_1_2.add(r3c9);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new LineBorder(SystemColor.desktop));
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(32, 189, 181, 149);
		contentPane.add(panel_1_3);
		
		JButton r4c1 = new JButton("");
		r4c1.setBackground(Color.BLUE);
		r4c1.setBounds(10, 11, 47, 38);
		panel_1_3.add(r4c1);
		
		JButton r4c2 = new JButton("");
		r4c2.setBackground(Color.BLUE);
		r4c2.setBounds(67, 11, 44, 38);
		panel_1_3.add(r4c2);
		
		JButton r4c3 = new JButton("");
		r4c3.setBackground(Color.BLUE);
		r4c3.setBounds(121, 11, 50, 38);
		panel_1_3.add(r4c3);
		
		JButton r5c1 = new JButton("");
		r5c1.setBackground(Color.BLUE);
		r5c1.setBounds(10, 51, 44, 38);
		panel_1_3.add(r5c1);
		
		JButton r5c2 = new JButton("3");
		r5c2.setBackground(Color.BLUE);
		r5c2.setBounds(67, 51, 44, 38);
		panel_1_3.add(r5c2);
		
		JButton r5c3 = new JButton("4");
		r5c3.setBackground(Color.BLUE);
		r5c3.setBounds(121, 51, 44, 38);
		panel_1_3.add(r5c3);
		
		JButton r6c1 = new JButton("");
		r6c1.setBackground(Color.BLUE);
		r6c1.setBounds(10, 97, 47, 38);
		panel_1_3.add(r6c1);
		
		JButton r6c2 = new JButton("6");
		r6c2.setBackground(Color.BLUE);
		r6c2.setBounds(67, 97, 44, 38);
		panel_1_3.add(r6c2);
		
		JButton r6c3 = new JButton("");
		r6c3.setBackground(Color.BLUE);
		r6c3.setBounds(121, 97, 50, 38);
		panel_1_3.add(r6c3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBorder(new LineBorder(SystemColor.desktop));
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(234, 189, 181, 149);
		contentPane.add(panel_1_4);
		
		JButton r4c4 = new JButton("");
		r4c4.setBackground(Color.BLUE);
		r4c4.setBounds(20, 11, 49, 38);
		panel_1_4.add(r4c4);
		
		JButton r4c5 = new JButton("3");
		r4c5.setBackground(Color.BLUE);
		r4c5.setBounds(79, 11, 41, 38);
		panel_1_4.add(r4c5);
		
		JButton r4c6 = new JButton("5");
		r4c6.setBackground(Color.BLUE);
		r4c6.setBounds(130, 11, 41, 38);
		panel_1_4.add(r4c6);
		
		JButton r5c4 = new JButton("");
		r5c4.setBackground(Color.BLUE);
		r5c4.setBounds(20, 51, 52, 38);
		panel_1_4.add(r5c4);
		
		JButton r5c5 = new JButton("");
		r5c5.setBackground(Color.BLUE);
		r5c5.setBounds(79, 51, 41, 38);
		panel_1_4.add(r5c5);
		
		JButton r5c6 = new JButton("");
		r5c6.setBackground(Color.BLUE);
		r5c6.setBounds(130, 51, 44, 38);
		panel_1_4.add(r5c6);
		
		JButton r6c4 = new JButton("1");
		r6c4.setBackground(Color.BLUE);
		r6c4.setBounds(20, 97, 49, 38);
		panel_1_4.add(r6c4);
		
		JButton r6c5 = new JButton("8");
		r6c5.setBackground(Color.BLUE);
		r6c5.setBounds(79, 97, 41, 38);
		panel_1_4.add(r6c5);
		
		JButton r6c6 = new JButton("");
		r6c6.setBackground(Color.BLUE);
		r6c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		r6c6.setBounds(130, 100, 41, 38);
		panel_1_4.add(r6c6);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBorder(new LineBorder(SystemColor.desktop));
		panel_1_5.setLayout(null);
		panel_1_5.setBounds(437, 189, 174, 149);
		contentPane.add(panel_1_5);
		
		JButton r4c7 = new JButton("");
		r4c7.setBackground(Color.BLUE);
		r4c7.setBounds(10, 11, 46, 38);
		panel_1_5.add(r4c7);
		
		JButton r4c8 = new JButton("9");
		r4c8.setBackground(Color.BLUE);
		r4c8.setBounds(66, 11, 46, 38);
		panel_1_5.add(r4c8);
		
		JButton r4c9 = new JButton("");
		r4c9.setBackground(Color.BLUE);
		r4c9.setBounds(116, 11, 48, 38);
		panel_1_5.add(r4c9);
		
		JButton r5c7 = new JButton("2");
		r5c7.setBackground(Color.BLUE);
		r5c7.setBounds(10, 51, 46, 38);
		panel_1_5.add(r5c7);
		
		JButton r5c8 = new JButton("8");
		r5c8.setBackground(Color.BLUE);
		r5c8.setBounds(66, 51, 46, 38);
		panel_1_5.add(r5c8);
		
		JButton r5c9 = new JButton("");
		r5c9.setBackground(Color.BLUE);
		r5c9.setBounds(116, 51, 48, 38);
		panel_1_5.add(r5c9);
		
		JButton r6c7 = new JButton("");
		r6c7.setBackground(Color.BLUE);
		r6c7.setBounds(10, 97, 46, 38);
		panel_1_5.add(r6c7);
		
		JButton r6c8 = new JButton("");
		r6c8.setBackground(Color.BLUE);
		r6c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		r6c8.setBounds(66, 100, 46, 38);
		panel_1_5.add(r6c8);
		
		JButton r6c9 = new JButton("");
		r6c9.setBackground(Color.BLUE);
		r6c9.setBounds(116, 100, 48, 38);
		panel_1_5.add(r6c9);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setBorder(new LineBorder(SystemColor.desktop));
		panel_1_6.setLayout(null);
		panel_1_6.setBounds(32, 349, 181, 149);
		contentPane.add(panel_1_6);
		
		JButton r7c1 = new JButton("");
		r7c1.setBackground(Color.BLUE);
		r7c1.setBounds(22, 11, 43, 38);
		panel_1_6.add(r7c1);
		
		JButton r7c2 = new JButton("4");
		r7c2.setBackground(Color.BLUE);
		r7c2.setBounds(75, 11, 43, 38);
		panel_1_6.add(r7c2);
		
		JButton r7c3 = new JButton("");
		r7c3.setBackground(Color.BLUE);
		r7c3.setBounds(128, 11, 43, 38);
		panel_1_6.add(r7c3);
		
		JButton r8c1 = new JButton("3");
		r8c1.setBackground(Color.BLUE);
		r8c1.setBounds(22, 51, 44, 38);
		panel_1_6.add(r8c1);
		
		JButton r8c2 = new JButton("");
		r8c2.setBackground(Color.BLUE);
		r8c2.setBounds(75, 51, 44, 38);
		panel_1_6.add(r8c2);
		
		JButton r8c3 = new JButton("");
		r8c3.setBackground(Color.BLUE);
		r8c3.setBounds(128, 51, 44, 38);
		panel_1_6.add(r8c3);
		
		JButton r9c1 = new JButton("6");
		r9c1.setBackground(Color.BLUE);
		r9c1.setBounds(22, 97, 43, 38);
		panel_1_6.add(r9c1);
		
		JButton r9c2 = new JButton("8");
		r9c2.setBackground(Color.BLUE);
		r9c2.setBounds(75, 97, 43, 38);
		panel_1_6.add(r9c2);
		
		JButton r9c3 = new JButton("9");
		r9c3.setBackground(Color.BLUE);
		r9c3.setBounds(128, 97, 43, 38);
		panel_1_6.add(r9c3);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setBorder(new LineBorder(SystemColor.desktop));
		panel_1_7.setLayout(null);
		panel_1_7.setBounds(234, 349, 181, 149);
		contentPane.add(panel_1_7);
		
		JButton r7c4 = new JButton("");
		r7c4.setBackground(Color.BLUE);
		r7c4.setBounds(25, 11, 42, 38);
		panel_1_7.add(r7c4);
		
		JButton r7c5 = new JButton("5");
		r7c5.setBackground(Color.BLUE);
		r7c5.setBounds(77, 11, 42, 38);
		panel_1_7.add(r7c5);
		
		JButton r7c6 = new JButton("");
		r7c6.setBackground(Color.BLUE);
		r7c6.setBounds(129, 11, 42, 38);
		panel_1_7.add(r7c6);
		
		JButton r8c4 = new JButton("9");
		r8c4.setBackground(Color.BLUE);
		r8c4.setBounds(25, 51, 44, 38);
		panel_1_7.add(r8c4);
		
		JButton r8c5 = new JButton("6");
		r8c5.setBackground(Color.BLUE);
		r8c5.setBounds(77, 51, 44, 38);
		panel_1_7.add(r8c5);
		
		JButton r8c6 = new JButton("");
		r8c6.setBackground(Color.BLUE);
		r8c6.setBounds(129, 51, 42, 38);
		panel_1_7.add(r8c6);
		
		JButton r9c4 = new JButton("");
		r9c4.setBackground(Color.BLUE);
		r9c4.setBounds(25, 97, 42, 38);
		panel_1_7.add(r9c4);
		
		JButton r9c5 = new JButton("");
		r9c5.setBackground(Color.BLUE);
		r9c5.setBounds(77, 97, 42, 38);
		panel_1_7.add(r9c5);
		
		JButton r9c6 = new JButton("1");
		r9c6.setBackground(Color.BLUE);
		r9c6.setBounds(129, 97, 42, 38);
		panel_1_7.add(r9c6);
		
		JPanel panel_1_8 = new JPanel();
		panel_1_8.setBorder(new LineBorder(SystemColor.desktop));
		panel_1_8.setLayout(null);
		panel_1_8.setBounds(437, 349, 174, 149);
		contentPane.add(panel_1_8);
		
		JButton r7c7 = new JButton("9");
		r7c7.setBackground(Color.BLUE);
		r7c7.setBounds(10, 11, 50, 38);
		panel_1_8.add(r7c7);
		
		JButton r7c8 = new JButton("");
		r7c8.setBackground(Color.BLUE);
		r7c8.setBounds(70, 11, 42, 38);
		panel_1_8.add(r7c8);
		
		JButton r7c9 = new JButton("6");
		r7c9.setBackground(Color.BLUE);
		r7c9.setBounds(122, 11, 42, 38);
		panel_1_8.add(r7c9);
		
		JButton r8c7 = new JButton("");
		r8c7.setBackground(Color.BLUE);
		r8c7.setBounds(10, 51, 50, 38);
		panel_1_8.add(r8c7);
		
		JButton r8c8 = new JButton("");
		r8c8.setBackground(Color.BLUE);
		r8c8.setBounds(70, 51, 42, 38);
		panel_1_8.add(r8c8);
		
		JButton r8c9 = new JButton("2");
		r8c9.setBackground(Color.BLUE);
		r8c9.setBounds(122, 51, 44, 38);
		panel_1_8.add(r8c9);
		
		JButton r9c7 = new JButton("");
		r9c7.setBackground(Color.BLUE);
		r9c7.setBounds(10, 100, 50, 38);
		panel_1_8.add(r9c7);
		
		JButton r9c8 = new JButton("");
		r9c8.setBackground(Color.BLUE);
		r9c8.setBounds(70, 100, 42, 38);
		panel_1_8.add(r9c8);
		
		JButton r9c9 = new JButton("");
		r9c9.setBackground(Color.BLUE);
		r9c9.setBounds(122, 97, 42, 38);
		panel_1_8.add(r9c9);
		// Row 1
		r1c1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r1c1.setText(turn);
		        r1c1.setBackground(Color.WHITE);
		    }
		});

		r1c2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r1c2.setText(turn);
		        r1c2.setBackground(Color.WHITE);
		    }
		});

		r1c3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r1c3.setText(turn);
		        r1c3.setBackground(Color.WHITE);
		    }
		});

		r1c4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r1c4.setText(turn);
		        r1c4.setBackground(Color.WHITE);
		    }
		});

		r1c5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r1c5.setText(turn);
		        r1c5.setBackground(Color.WHITE);
		    }
		});

		r1c6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r1c6.setText(turn);
		        r1c6.setBackground(Color.WHITE);
		    }
		});

		r1c7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r1c7.setText(turn);
		        r1c7.setBackground(Color.WHITE);
		    }
		});

		r1c8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r1c8.setText(turn);
		        r1c8.setBackground(Color.WHITE);
		    }
		});

		r1c9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r1c9.setText(turn);
		        r1c9.setBackground(Color.WHITE);
		    }
		});

		// Row 2
		// Row 2
		r2c1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r2c1.setText(turn);
		        r2c1.setBackground(Color.WHITE);
		    }
		});

		r2c2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r2c2.setText(turn);
		        r2c2.setBackground(Color.WHITE);
		    }
		});

		r2c3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r2c3.setText(turn);
		        r2c3.setBackground(Color.WHITE);
		    }
		});

		r2c4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r2c4.setText(turn);
		        r2c4.setBackground(Color.WHITE);
		    }
		});

		r2c5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r2c5.setText(turn);
		        r2c5.setBackground(Color.WHITE);
		    }
		});

		r2c6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r2c6.setText(turn);
		        r2c6.setBackground(Color.WHITE);
		    }
		});

		r2c7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r2c7.setText(turn);
		        r2c7.setBackground(Color.WHITE);
		    }
		});

		r2c8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r2c8.setText(turn);
		        r2c8.setBackground(Color.WHITE);
		    }
		});

		r2c9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r2c9.setText(turn);
		        r2c9.setBackground(Color.WHITE);
		    }
		});
		// Row 3
		r3c1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r3c1.setText(turn);
		        r3c1.setBackground(Color.WHITE);
		    }
		});

		r3c2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r3c2.setText(turn);
		        r3c2.setBackground(Color.WHITE);
		    }
		});

		r3c3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r3c3.setText(turn);
		        r3c3.setBackground(Color.WHITE);
		    }
		});

		r3c4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r3c4.setText(turn);
		        r3c4.setBackground(Color.WHITE);
		    }
		});

		r3c5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r3c5.setText(turn);
		        r3c5.setBackground(Color.WHITE);
		    }
		});

		r3c6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r3c6.setText(turn);
		        r3c6.setBackground(Color.WHITE);
		    }
		});

		r3c7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r3c7.setText(turn);
		        r3c7.setBackground(Color.WHITE);
		    }
		});

		r3c8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r3c8.setText(turn);
		        r3c8.setBackground(Color.WHITE);
		    }
		});

		r3c9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r3c9.setText(turn);
		        r3c9.setBackground(Color.WHITE);
		    }
		});
		// Row 4
		r4c1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r4c1.setText(turn);
		        r4c1.setBackground(Color.WHITE);
		    }
		});

		r4c2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r4c2.setText(turn);
		        r4c2.setBackground(Color.WHITE);
		    }
		});

		r4c3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r4c3.setText(turn);
		        r4c3.setBackground(Color.WHITE);
		    }
		});

		r4c4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r4c4.setText(turn);
		        r4c4.setBackground(Color.WHITE);
		    }
		});

		r4c5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r4c5.setText(turn);
		        r4c5.setBackground(Color.WHITE);
		    }
		});

		r4c6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r4c6.setText(turn);
		        r4c6.setBackground(Color.WHITE);
		    }
		});

		r4c7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r4c7.setText(turn);
		        r4c7.setBackground(Color.WHITE);
		    }
		});

		r4c8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r4c8.setText(turn);
		        r4c8.setBackground(Color.WHITE);
		    }
		});

		r4c9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r4c9.setText(turn);
		        r4c9.setBackground(Color.WHITE);
		    }
		});
		// Row 5
		r5c1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r5c1.setText(turn);
		        r5c1.setBackground(Color.WHITE);
		    }
		});

		r5c2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r5c2.setText(turn);
		        r5c2.setBackground(Color.WHITE);
		    }
		});

		r5c3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r5c3.setText(turn);
		        r5c3.setBackground(Color.WHITE);
		    }
		});

		r5c4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r5c4.setText(turn);
		        r5c4.setBackground(Color.WHITE);
		    }
		});

		r5c5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r5c5.setText(turn);
		        r5c5.setBackground(Color.WHITE);
		    }
		});

		r5c6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r5c6.setText(turn);
		        r5c6.setBackground(Color.WHITE);
		    }
		});

		r5c7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r5c7.setText(turn);
		        r5c7.setBackground(Color.WHITE);
		    }
		});

		r5c8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r5c8.setText(turn);
		        r5c8.setBackground(Color.WHITE);
		    }
		});

		r5c9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r5c9.setText(turn);
		        r5c9.setBackground(Color.WHITE);
		    }
		});
		// Row 6
		r6c1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r6c1.setText(turn);
		        r6c1.setBackground(Color.WHITE);
		    }
		});

		r6c2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r6c2.setText(turn);
		        r6c2.setBackground(Color.WHITE);
		    }
		});

		r6c3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r6c3.setText(turn);
		        r6c3.setBackground(Color.WHITE);
		    }
		});

		r6c4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r6c4.setText(turn);
		        r6c4.setBackground(Color.WHITE);
		    }
		});

		r6c5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r6c5.setText(turn);
		        r6c5.setBackground(Color.WHITE);
		    }
		});

		r6c6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r6c6.setText(turn);
		        r6c6.setBackground(Color.WHITE);
		    }
		});

		r6c7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r6c7.setText(turn);
		        r6c7.setBackground(Color.WHITE);
		    }
		});

		r6c8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r6c8.setText(turn);
		        r6c8.setBackground(Color.WHITE);
		    }
		});

		r6c9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r6c9.setText(turn);
		        r6c9.setBackground(Color.WHITE);
		    }
		});
		// Row 7
		r7c1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r7c1.setText(turn);
		        r7c1.setBackground(Color.WHITE);
		    }
		});

		r7c2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r7c2.setText(turn);
		        r7c2.setBackground(Color.WHITE);
		    }
		});

		r7c3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r7c3.setText(turn);
		        r7c3.setBackground(Color.WHITE);
		    }
		});

		r7c4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r7c4.setText(turn);
		        r7c4.setBackground(Color.WHITE);
		    }
		});

		r7c5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r7c5.setText(turn);
		        r7c5.setBackground(Color.WHITE);
		    }
		});

		r7c6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r7c6.setText(turn);
		        r7c6.setBackground(Color.WHITE);
		    }
		});

		r7c7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r7c7.setText(turn);
		        r7c7.setBackground(Color.WHITE);
		    }
		});

		r7c8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r7c8.setText(turn);
		        r7c8.setBackground(Color.WHITE);
		    }
		});

		r7c9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r7c9.setText(turn);
		        r7c9.setBackground(Color.WHITE);
		    }
		});
		// Row 8
		r8c1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r8c1.setText(turn);
		        r8c1.setBackground(Color.WHITE);
		    }
		});

		r8c2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r8c2.setText(turn);
		        r8c2.setBackground(Color.WHITE);
		    }
		});

		r8c3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r8c3.setText(turn);
		        r8c3.setBackground(Color.WHITE);
		    }
		});

		r8c4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r8c4.setText(turn);
		        r8c4.setBackground(Color.WHITE);
		    }
		});

		r8c5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r8c5.setText(turn);
		        r8c5.setBackground(Color.WHITE);
		    }
		});

		r8c6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r8c6.setText(turn);
		        r8c6.setBackground(Color.WHITE);
		    }
		});

		r8c7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r8c7.setText(turn);
		        r8c7.setBackground(Color.WHITE);
		    }
		});

		r8c8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r8c8.setText(turn);
		        r8c8.setBackground(Color.WHITE);
		    }
		});

		r8c9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r8c9.setText(turn);
		        r8c9.setBackground(Color.WHITE);
		    }
		});
		// Row 9
		r9c1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r9c1.setText(turn);
		        r9c1.setBackground(Color.WHITE);
		    }
		});

		r9c2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r9c2.setText(turn);
		        r9c2.setBackground(Color.WHITE);
		    }
		});

		r9c3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r9c3.setText(turn);
		        r9c3.setBackground(Color.WHITE);
		    }
		});

		r9c4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r9c4.setText(turn);
		        r9c4.setBackground(Color.WHITE);
		    }
		});

		r9c5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r9c5.setText(turn);
		        r9c5.setBackground(Color.WHITE);
		    }
		});

		r9c6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r9c6.setText(turn);
		        r9c6.setBackground(Color.WHITE);
		    }
		});

		r9c7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r9c7.setText(turn);
		        r9c7.setBackground(Color.WHITE);
		    }
		});

		r9c8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r9c8.setText(turn);
		        r9c8.setBackground(Color.WHITE);
		    }
		});

		r9c9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        r9c9.setText(turn);
		        r9c9.setBackground(Color.WHITE);
		    }
		});


		// Continue adding ActionListeners for the remaining buttons in similar fashion...

		JButton r1c1_1 = new JButton("1");
		r1c1_1.setBackground(SystemColor.desktop);
		r1c1_1.setBounds(48, 524, 46, 38);
		contentPane.add(r1c1_1);
		r1c1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		        turn="1";
            }
        });
		 
		JButton r1c1_2 = new JButton("2");
		r1c1_2.setBackground(SystemColor.desktop);
		r1c1_2.setBounds(115, 524, 46, 38);
		contentPane.add(r1c1_2);
		r1c1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		        turn="2";
            }
        });
		
		JButton r1c1_3 = new JButton("3");
		r1c1_3.setBackground(SystemColor.desktop);
		r1c1_3.setBounds(178, 524, 46, 38);
		contentPane.add(r1c1_3);
		r1c1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		        turn="3";
            }
        });
		
		JButton r1c1_4 = new JButton("4");
		r1c1_4.setBackground(SystemColor.desktop);
		r1c1_4.setBounds(246, 524, 46, 38);
		contentPane.add(r1c1_4);
		r1c1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		        turn="4";
            }
        });
		
		JButton r1c1_5 = new JButton("5");
		r1c1_5.setBackground(SystemColor.desktop);
		r1c1_5.setBounds(302, 524, 46, 38);
		contentPane.add(r1c1_5);
		r1c1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		        turn="5";
            }
        });
		
		JButton r1c1_6 = new JButton("6");
		r1c1_6.setBackground(SystemColor.desktop);
		r1c1_6.setBounds(358, 524, 46, 38);
		contentPane.add(r1c1_6);
		r1c1_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		        turn="6";
            }
        });
		
		JButton r1c1_7 = new JButton("7");
		r1c1_7.setBackground(SystemColor.desktop);
		r1c1_7.setBounds(425, 524, 46, 38);
		contentPane.add(r1c1_7);
		r1c1_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		        turn="7";
            }
        });
		
		
		JButton r1c1_8 = new JButton("8");
		r1c1_8.setBackground(SystemColor.desktop);
		r1c1_8.setBounds(481, 524, 46, 38);
		contentPane.add(r1c1_8);
		r1c1_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		        turn="8";
            }
        });
		
		
		JButton r1c1_9 = new JButton("9");
		r1c1_9.setBackground(SystemColor.desktop);
		r1c1_9.setBounds(550, 524, 46, 38);
		contentPane.add(r1c1_9);
		r1c1_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		        turn="9";
            }
        });
		

		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setBounds(58, 573, 89, 38);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        ResetGame();
		    }

			public void ResetGame() {
				// TODO Auto-generated method stub
				JButton preDefinedButton[] = {r1c4, r1c7, r1c8, r1c9, r2c1, r2c5, r2c6, r2c7, r2c9, r3c1, r3c3, r3c5, r3c8, r4c5, r4c6, r4c8, r5c2, r5c3, r5c7, r5c8,
			            r6c2, r6c4, r6c5, r7c2, r7c5, r7c7, r7c9, r8c1, r8c4, r8c5, r8c9, r9c1, r9c2, r9c3, r9c6};

			    JButton Button[][] = {
			            {r1c1, r1c2, r1c3, r1c4, r1c5, r1c6, r1c7, r1c8, r1c9},
			            {r2c1, r2c2, r2c3, r2c4, r2c5, r2c6, r2c7, r2c8, r2c9},
			            {r3c1, r3c2, r3c3, r3c4, r3c5, r3c6, r3c7, r3c8, r3c9},
			            {r4c1, r4c2, r4c3, r4c4, r4c5, r4c6, r4c7, r4c8, r4c9},
			            {r5c1, r5c2, r5c3, r5c4, r5c5, r5c6, r5c7, r5c8, r5c9},
			            {r6c1, r6c2, r6c3, r6c4, r6c5, r6c6, r6c7, r6c8, r6c9},
			            {r7c1, r7c2, r7c3, r7c4, r7c5, r7c6, r7c7, r7c8, r7c9},
			            {r8c1, r8c2, r8c3, r8c4, r8c5, r8c6, r8c7, r8c8, r8c9},
			            {r9c1, r9c2, r9c3, r9c4, r9c5, r9c6, r9c7, r9c8, r9c9}
			    };

			    for (int i = 0; i < 9; i++) {
			        for (int j = 0; j < 9; j++) {
			            boolean flag = true;

			            for (int k = 0; k < preDefinedButton.length; k++) {
			                if (Button[i][j] == preDefinedButton[k]) {
			                    flag = false;
			                    break; // No need to continue checking once the button is found
			                }
			            }
			            if (flag) { // Simplified if condition
			                Button[i][j].setText("");
			                Button[i][j].setForeground(Color.black); // Assuming 'black' is defined somewhere
			                Button[i][j].setBackground(Color.white); // Assuming 'white' is defined somewhere
			            }
			        }
			    }
			}
		});
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setBounds(188, 573, 89, 39);
		contentPane.add(btnExit); 
		btnExit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
		});
		JButton btnNewButton_2 = new JButton("Selection");
		btnNewButton_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton preDefinedButton []={r1c4,r1c7,r1c8,r1c9,r2c1,r2c5,r2c6,r2c7,r2c9,r3c1,r3c3,r3c5,r3c8,r4c5,r4c6,r4c8,r5c2,r5c3,r5c7,r5c8
                        ,r6c2,r6c4,r6c5,r7c2,r7c5,r7c7,r7c9,r8c1,r8c4,r8c5,r8c9,r9c1,r9c2,r9c3,r9c6};

JButton Button[][]={
{r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
{r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
{r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
{r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
{r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
{r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
{r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
{r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
{r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
};
if(globalflag==true){
globalflag=false;
btnNewButton_2.setText("Hide Solution");
for(int i=0;i<9;i++){
   for(int j=0;j<9;j++){
       boolean flag=true;
       for(int k=0;k<preDefinedButton.length;k++){
           if(Button[i][j]==preDefinedButton[k]){
               flag=false;
           }
       }
       if(flag==true) {
           Button[i][j].setText(SolveBoard[i][j]);
           Button[i][j].setBackground(Color.white);
           Button[i][j].setForeground(Color.black);
       }
   }
}
}
else{
	btnNewButton_2.setText("Solution"); 
    globalflag=true;
    ResetGame();
 }

			}
			public void ResetGame() {
				// TODO Auto-generated method stub
				JButton preDefinedButton[] = {r1c4, r1c7, r1c8, r1c9, r2c1, r2c5, r2c6, r2c7, r2c9, r3c1, r3c3, r3c5, r3c8, r4c5, r4c6, r4c8, r5c2, r5c3, r5c7, r5c8,
			            r6c2, r6c4, r6c5, r7c2, r7c5, r7c7, r7c9, r8c1, r8c4, r8c5, r8c9, r9c1, r9c2, r9c3, r9c6};

			    JButton Button[][] = {
			            {r1c1, r1c2, r1c3, r1c4, r1c5, r1c6, r1c7, r1c8, r1c9},
			            {r2c1, r2c2, r2c3, r2c4, r2c5, r2c6, r2c7, r2c8, r2c9},
			            {r3c1, r3c2, r3c3, r3c4, r3c5, r3c6, r3c7, r3c8, r3c9},
			            {r4c1, r4c2, r4c3, r4c4, r4c5, r4c6, r4c7, r4c8, r4c9},
			            {r5c1, r5c2, r5c3, r5c4, r5c5, r5c6, r5c7, r5c8, r5c9},
			            {r6c1, r6c2, r6c3, r6c4, r6c5, r6c6, r6c7, r6c8, r6c9},
			            {r7c1, r7c2, r7c3, r7c4, r7c5, r7c6, r7c7, r7c8, r7c9},
			            {r8c1, r8c2, r8c3, r8c4, r8c5, r8c6, r8c7, r8c8, r8c9},
			            {r9c1, r9c2, r9c3, r9c4, r9c5, r9c6, r9c7, r9c8, r9c9}
			    };

			    for (int i = 0; i < 9; i++) {
			        for (int j = 0; j < 9; j++) {
			            boolean flag = true;

			            for (int k = 0; k < preDefinedButton.length; k++) {
			                if (Button[i][j] == preDefinedButton[k]) {
			                    flag = false;
			                    break; // No need to continue checking once the button is found
			                }
			            }
			            if (flag) { // Simplified if condition
			                Button[i][j].setText("");
			                Button[i][j].setForeground(Color.black); // Assuming 'black' is defined somewhere
			                Button[i][j].setBackground(Color.white); // Assuming 'white' is defined somewhere
			            }
			        }
			    }
			}
		});
		btnNewButton_2.setBounds(312, 573, 89, 39);
		contentPane.add(btnNewButton_2);
		JButton btnNewButton_3 = new JButton("Check Moves");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setBackground(new Color(255, 255, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JButton Button[][]={
				            {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
				            {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
				            {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
				            {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
				            {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
				            {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
				            {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
				            {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
				            {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
				        };
				        for(int i=0;i<9;i++){
				            for(int j=0;j<9;j++){
				                if(Button[i][j].getText()!=SolveBoard[i][j] && Button[i][j].getText()!=""){
				                    Button[i][j].setBackground(Color.red);
				                }
				            }
				        }
			}
		});
		btnNewButton_3.setBounds(437, 573, 104, 39);
		contentPane.add(btnNewButton_3);
	}
}