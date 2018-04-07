package showdown;

import java.awt.EventQueue;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;

public class GameWindow extends JFrame {
	
	private JTable pitcherStatTable;
	private JTable batterStatTable;
	private Border loweredEtched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	private JLabel awayBatterName1;
	private JLabel awayBatterName2;
	private JLabel awayBatterName3;
	private JLabel awayBatterName4;
	private JLabel awayBatterName5;
	private JLabel awayBatterName6;
	private JLabel awayBatterName7;
	private JLabel awayBatterName8;
	private JLabel awayBatterName9;
	
	private JLabel homeBatterName1;
	private JLabel homeBatterName2;
	private JLabel homeBatterName3;
	private JLabel homeBatterName4;
	private JLabel homeBatterName5;
	private JLabel homeBatterName6;
	private JLabel homeBatterName7;
	private JLabel homeBatterName8;
	private JLabel homeBatterName9;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow frame = new GameWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public GameWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 5, 5));
		
		JPanel awayPanel = new JPanel();
		contentPane.add(awayPanel);
		awayPanel.setLayout(new GridLayout(0, 1, 5, 5));
		
		JPanel awayStatPanel = new JPanel();
		awayPanel.add(awayStatPanel);
		
		JPanel awayBufferPanel = new JPanel();
		awayPanel.add(awayBufferPanel);
		
		JPanel awayTeamStuff = new JPanel();
		awayPanel.add(awayTeamStuff);
		awayTeamStuff.setLayout(new GridLayout(0, 2, 5, 5));
		
		JPanel panel_1 = new JPanel();
		awayTeamStuff.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel awayBattingOrderPane = new JPanel();
		awayBattingOrderPane.setBorder(loweredEtched);
		awayTeamStuff.add(awayBattingOrderPane);
		awayBattingOrderPane.setLayout(new GridLayout(0, 2, 2, 2));
		
		JLabel awayBatter1 = new JLabel("1:");
		awayBatter1.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatter1);
		
		awayBatterName1 = new JLabel("Away Batter 1");
		awayBatterName1.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName1);
		
		JLabel awayBatter2 = new JLabel("2:");
		awayBatter2.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatter2);
		
		awayBatterName2 = new JLabel("Away Batter 2");
		awayBatterName2.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName2);
		
		JLabel awayBatter3 = new JLabel("3:");
		awayBatter3.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatter3);
		
		awayBatterName3 = new JLabel("Away Batter 3");
		awayBatterName3.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName3);
		
		JLabel awayBatter4 = new JLabel("4:"); 
		awayBatter4.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatter4);
		
		awayBatterName4 = new JLabel("Away Batter 4");
		awayBatterName4.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName4);
		
		JLabel awayBatter5 = new JLabel("5:"); 
		awayBatter5.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatter5);
		
		awayBatterName5 = new JLabel("Away Batter 5");
		awayBatterName5.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName5);
		
		JLabel awayBatter6 = new JLabel("6:");
		awayBatter6.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatter6);
		
		awayBatterName6 = new JLabel("Away Batter 6");
		awayBatterName6.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName6);
		
		JLabel awayBatter7 = new JLabel("7:");
		awayBatter7.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatter7);
		
		awayBatterName7 = new JLabel("Away Batter 7");
		awayBatterName7.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName7);
		
		JLabel awayBatter8 = new JLabel("8:"); 
		awayBatter8.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatter8);
		
		awayBatterName8 = new JLabel("Away Batter 8");
		awayBatterName8.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName8);
		
		JLabel awayBatter9 = new JLabel("9:");
		awayBatter9.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatter9);
		
		awayBatterName9 = new JLabel("Away Batter 9");
		awayBatterName9.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName9);
		
		JPanel gameInfoPanel = new JPanel();
		contentPane.add(gameInfoPanel);
		gameInfoPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		pitcherStatTable = new JTable();
		gameInfoPanel.add(pitcherStatTable);
		
		JPanel buttonPanel = new JPanel();
		gameInfoPanel.add(buttonPanel);
		
		batterStatTable = new JTable();
		gameInfoPanel.add(batterStatTable);
		
		JPanel homePanel = new JPanel();
		contentPane.add(homePanel);
		homePanel.setLayout(new GridLayout(0, 1, 5, 5));
		
		JPanel homeStatPanel = new JPanel();
		homePanel.add(homeStatPanel);
		
		JPanel homeBufferPanel = new JPanel();
		homePanel.add(homeBufferPanel);
		
		JPanel homeTeamStuff = new JPanel();
		homePanel.add(homeTeamStuff);
		homeTeamStuff.setLayout(new GridLayout(0, 2, 5, 5));
		
		JPanel homeBattingOrderPane = new JPanel();
		homeBattingOrderPane.setBorder(loweredEtched);
		homeTeamStuff.add(homeBattingOrderPane);
		homeBattingOrderPane.setLayout(new GridLayout(0, 2, 2, 2));
		
		JLabel homeBatter1 = new JLabel("1:");
		homeBatter1.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatter1);
		
		homeBatterName1 = new JLabel("Home Batter 1");
		homeBatterName1.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName1);
		
		JLabel homeBatter2 = new JLabel("2:");
		homeBatter2.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatter2);
		
		homeBatterName2 = new JLabel("Home Batter 2");
		homeBatterName2.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName2);
		
		JLabel homeBatter3 = new JLabel("3:");
		homeBatter3.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatter3);
		
		homeBatterName3 = new JLabel("Home Batter 3");
		homeBatterName3.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName3);
		
		JLabel homeBatter4 = new JLabel("4:");
		homeBatter4.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatter4);
		
		homeBatterName4 = new JLabel("Home Batter 4");
		homeBatterName4.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName4);
		
		JLabel homeBatter5 = new JLabel("5:");
		homeBatter5.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatter5);
		
		homeBatterName5 = new JLabel("Home Batter 5");
		homeBatterName5.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName5);
		
		JLabel homeBatter6 = new JLabel("6:");
		homeBatter6.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatter6);
		
		homeBatterName6 = new JLabel("Home Batter 6");
		homeBatterName6.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName6);
		
		JLabel homeBatter7 = new JLabel("7:");
		homeBatter7.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatter7);
		
		homeBatterName7 = new JLabel("Home Batter 7");
		homeBatterName7.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName7);
		
		JLabel homeBatter8 = new JLabel("8:");
		homeBatter8.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatter8);
		
		homeBatterName8 = new JLabel("Home Batter 8");
		homeBatterName8.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName8);
		
		JLabel homeBatter9 = new JLabel("9:");
		homeBatter9.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatter9);
		
		homeBatterName9 = new JLabel("Home Batter 9");
		homeBatterName9.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName9);
		
		JPanel panel_3 = new JPanel();
		homeTeamStuff.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
	}
	
	public void setAwayBattingOrderTable(BattingOrder awayBO) {
		awayBatterName1.setText(awayBO.nextBatter());
		awayBatterName2.setText(awayBO.nextBatter());
		awayBatterName3.setText(awayBO.nextBatter());
		awayBatterName4.setText(awayBO.nextBatter());
		awayBatterName5.setText(awayBO.nextBatter());
		awayBatterName6.setText(awayBO.nextBatter());
		awayBatterName7.setText(awayBO.nextBatter());
		awayBatterName8.setText(awayBO.nextBatter());
		awayBatterName9.setText(awayBO.nextBatter());
	}
	
	public void setHomeBattingOrderTable(BattingOrder homeBO) {
		homeBatterName1.setText(homeBO.nextBatter());
		homeBatterName2.setText(homeBO.nextBatter());
		homeBatterName3.setText(homeBO.nextBatter());
		homeBatterName4.setText(homeBO.nextBatter());
		homeBatterName5.setText(homeBO.nextBatter());
		homeBatterName6.setText(homeBO.nextBatter());
		homeBatterName7.setText(homeBO.nextBatter());
		homeBatterName8.setText(homeBO.nextBatter());
		homeBatterName9.setText(homeBO.nextBatter());
	}

}
