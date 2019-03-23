package tic_tac_toe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class tic_tac_toe {

	private JFrame frame;
    private String startgame="X";
    private int xcount=0;
    private int ocount=0;
	private JButton btnButton;//btn1
	private JButton btnButton_1;//btn2
	private JButton btnButton_2;//btn3
	private JButton btnButton_3;//btn4
	private JButton btnButton_4;//btn5
	private JButton btnButton_5;//btn6
	private JButton btnButton_6;//btn7
	private JButton btnButton_7;//btn8
	private JButton btnNewButton;//btn9
	private JTextField txtcount_X;
	private JTextField txtcount_o;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tic_tac_toe window = new tic_tac_toe();
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
	public tic_tac_toe() {
		initialize();
		//gameScore();
	}
     private void gameScore_x()
     {
    	 txtcount_X.setText(String.valueOf(++xcount));
    	 //txtcount_o.setText(String.valueOf(ocount++));
     }
     private void gameScore_o()
     {
    	 //txtcount_X.setText(String.valueOf(xcount++));
    	 txtcount_o.setText(String.valueOf(++ocount));
     }
     private void chooseplayer()
     {
    	 if(startgame.equalsIgnoreCase("X"))
    	 {
    		 startgame="O";
    	 }
    	 else
    	 {
    		 startgame="X";
    	 }
     }
    
     private void winninggame()
     {
    	 String b1=btnButton.getText();
    	 String b2=btnButton_1.getText();
    	 String b3=btnButton_2.getText();
    	 String b4=btnButton_3.getText();
    	 String b5=btnButton_4.getText();
    	 String b6=btnButton_5.getText();
    	 String b7=btnButton_6.getText();
    	 String b8=btnButton_7.getText();
    	 String b9=btnNewButton.getText();
    	 
    	 if(b1==("X") && b2==("X") && b3==("X"))
    	 {
    		 
    		 JOptionPane.showMessageDialog(frame,"player x wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //xcount++;
    		 gameScore_x();
    	 }
    	 
    	 else if(b4==("X") && b5==("X") && b6== ("X"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player x wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //xcount++;
    		 gameScore_x();
    	 }
    	 
    	 else if(b7==("X") && b8==("X") && b9== ("X"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player x wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //xcount++;
    		 gameScore_x();
    	 }
    	 
    	 else if(b1==("X") && b5==("X") && b9== ("X"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player x wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //xcount++;
    		 gameScore_x();
    	 }
    	 
    	 else if(b7==("X") && b5==("X") && b3== ("X"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player x wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //xcount++;
    		 gameScore_x();
    	 }
    	 else if(b1==("X") && b4==("X") && b7== ("X"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player x wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //xcount++;
    		 gameScore_x();
    	 }
    	 else if(b2==("X") && b5==("X") && b8== ("X"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player x wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //xcount++;
    		 gameScore_x();
    	 }
    	 else if(b3==("X") && b6==("X") && b9== ("X"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player x wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //xcount++;
    		 gameScore_x();
    	 }
    	 ////////////////////////////////////////////////////////////////////////////////////////////////////////
    	 //for player o
    	 
    	 else  if(b1==("O") && b2==("O") && b3== ("O"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player o wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //ocount++;
    		 gameScore_o();
    	 }
    	 
    	 else if(b4==("O") && b5==("O") && b6== ("O"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player o wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //ocount++;
    		 gameScore_o();
    	 }
    	 
    	 else if(b7==("O") && b8==("O") && b9== ("O"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player o wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //ocount++;
    		 gameScore_o();
    	 }
    	 
    	 else if(b1==("O") && b5==("O") && b9== ("O"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player o wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //ocount++;
    		 gameScore_o();
    	 }
    	 
    	 else if(b7==("O") && b5==("O") && b3== ("O"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player o wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //ocount++;
    		 gameScore_o();
    	 }
    	 else if(b1==("O") && b4==("O") && b7== ("O"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player o wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //ocount++;
    		 gameScore_o();
    	 }
    	 else if(b2==("O") && b5==("O") && b8== ("O"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player o wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //ocount++;
    		 gameScore_o();
    	 }
    	 else if(b3==("O") && b6==("O") && b9== ("O"))
    	 {
    		 JOptionPane.showMessageDialog(frame,"player o wins","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    		 //ocount++;
    		 gameScore_o();
    	 }
    	/* else 
    	 {
    		 JOptionPane.showMessageDialog(frame,"DRAW","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
    	 }*/
    
     }
     
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 820, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		//button1's code action listner
		
		btnButton = new JButton("");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnButton.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btnButton.setForeground(Color.RED);
				}
				else
				{
					btnButton.setForeground(Color.blue);
				}
				chooseplayer();
				winninggame();
			}
		});
		btnButton.setFont(new Font("Tahoma", Font.PLAIN, 48));
		panel_3.add(btnButton, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		//button2's code action listner
		
		
		btnButton_1 = new JButton("");
		btnButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnButton_1.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btnButton_1.setForeground(Color.RED);
				}
				else
				{
					btnButton_1.setForeground(Color.blue);
				}
				chooseplayer();
				winninggame();
			}
		});
		btnButton_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		panel_4.add(btnButton_1, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		
		//button3's code goes here
		
		btnButton_2 = new JButton("");
		btnButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnButton_2.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btnButton_2.setForeground(Color.RED);
				}
				else
				{
					btnButton_2.setForeground(Color.blue);
				}
				chooseplayer();
				winninggame();
			}
		});
		btnButton_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		panel_5.add(btnButton_2, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayerx = new JLabel("playerX");
		lblPlayerx.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.add(lblPlayerx, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		txtcount_X = new JTextField();
		txtcount_X.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtcount_X.setText("0");
		panel_1.add(txtcount_X, BorderLayout.CENTER);
		txtcount_X.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		//button4's code goes here
		
		btnButton_3 = new JButton("");
		btnButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnButton_3.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btnButton_3.setForeground(Color.RED);
				}
				else
				{
					btnButton_3.setForeground(Color.blue);
				}
				chooseplayer();
				winninggame();
			}
			
		});
		btnButton_3.setFont(new Font("Tahoma", Font.PLAIN, 48));
		panel_6.add(btnButton_3, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		//button5's code goes here
		
		btnButton_4 = new JButton("");
		btnButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnButton_4.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btnButton_4.setForeground(Color.RED);
				}
				else
				{
					btnButton_4.setForeground(Color.blue);
				}
				chooseplayer();
				winninggame();
			}
		});
		btnButton_4.setFont(new Font("Tahoma", Font.PLAIN, 48));
		panel_15.add(btnButton_4, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		//button6's code goes here
		
		btnButton_5 = new JButton("");
		btnButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnButton_5.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btnButton_5.setForeground(Color.RED);
				}
				else
				{
					btnButton_5.setForeground(Color.blue);
				}
				chooseplayer();
				winninggame();
			}
		});
		btnButton_5.setFont(new Font("Tahoma", Font.PLAIN, 48));
		panel_8.add(btnButton_5, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayero = new JLabel("PlayerO");
		lblPlayero.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_13.add(lblPlayero, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		txtcount_o = new JTextField();
		txtcount_o.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtcount_o.setText("0");
		panel_14.add(txtcount_o, BorderLayout.CENTER);
		txtcount_o.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		//button7's code goes here
		
		btnButton_6 = new JButton("");
		btnButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnButton_6.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btnButton_6.setForeground(Color.RED);
				}
				else
				{
					btnButton_6.setForeground(Color.blue);
				}
				chooseplayer();
				winninggame();
			}
		});
		btnButton_6.setFont(new Font("Tahoma", Font.PLAIN, 48));
		panel_11.add(btnButton_6, BorderLayout.CENTER);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		//button8's code goes here
		
		btnButton_7 = new JButton("");
		btnButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnButton_7.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btnButton_7.setForeground(Color.RED);
				}
				else
				{
					btnButton_7.setForeground(Color.blue);
				}
				chooseplayer();
				winninggame();
			}
		});
		btnButton_7.setFont(new Font("Tahoma", Font.PLAIN, 48));
		panel_16.add(btnButton_7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		//button9's code goes here
		
		btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				btnNewButton.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btnNewButton.setForeground(Color.RED);
				}
				else
				{
					btnNewButton.setForeground(Color.blue);
				}
				chooseplayer();
				winninggame();
			}
		});
		panel_12.add(btnNewButton, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		              frame=new JFrame("Exit");
		              if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit game",
		            		  "tic tac toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION);
		              System.exit(0);
		              
			}
		});
		panel_9.add(btnExit, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      btnButton.setText(null);//button1
			      btnButton_1.setText(null);//button2
			      btnButton_2.setText(null);//button3
			      btnButton_3.setText(null);//button4
			      btnButton_4.setText(null);//button5
			      btnButton_5.setText(null);//button6
			      btnButton_6.setText(null);//button7
			      btnButton_7.setText(null);//button8
			      btnNewButton.setText(null);//button9
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_7.add(btnReset, BorderLayout.CENTER);
	}

}
