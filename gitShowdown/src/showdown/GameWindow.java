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
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;

public class GameWindow extends JFrame {
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
	private JPanel bigScoreBoard;
	private JPanel panel_2;
	private JPanel awayTeamNamePanel;
	private JPanel panel_4;
	private JPanel homeTeamNamePanel;
	private JPanel awayTotalScore;
	private JPanel homeTotalScore;
	private JPanel panel_8;
	private JPanel panel_9;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel awayBigScore;
	private JLabel homeBigScore;

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
		awayBattingOrderPane.setLayout(new GridLayout(9, 1, 2, 2));
		
		awayBatterName1 = new JLabel("Away Batter 1");
		awayBatterName1.setFont(new Font("Courier New", Font.PLAIN, 12));
		awayBatterName1.setHorizontalAlignment(SwingConstants.TRAILING);
		awayBatterName1.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName1);
		
		awayBatterName2 = new JLabel("Away Batter 2");
		awayBatterName2.setFont(new Font("Courier New", Font.PLAIN, 12));
		awayBatterName2.setHorizontalAlignment(SwingConstants.TRAILING);
		awayBatterName2.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName2);
		
		awayBatterName3 = new JLabel("Away Batter 3");
		awayBatterName3.setFont(new Font("Courier New", Font.PLAIN, 12));
		awayBatterName3.setHorizontalAlignment(SwingConstants.TRAILING);
		awayBatterName3.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName3);
		
		awayBatterName4 = new JLabel("Away Batter 4");
		awayBatterName4.setFont(new Font("Courier New", Font.PLAIN, 12));
		awayBatterName4.setHorizontalAlignment(SwingConstants.TRAILING);
		awayBatterName4.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName4);
		
		awayBatterName5 = new JLabel("Away Batter 5");
		awayBatterName5.setFont(new Font("Courier New", Font.PLAIN, 12));
		awayBatterName5.setHorizontalAlignment(SwingConstants.TRAILING);
		awayBatterName5.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName5);
		
		awayBatterName6 = new JLabel("Away Batter 6");
		awayBatterName6.setFont(new Font("Courier New", Font.PLAIN, 12));
		awayBatterName6.setHorizontalAlignment(SwingConstants.TRAILING);
		awayBatterName6.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName6);
		
		awayBatterName7 = new JLabel("Away Batter 7");
		awayBatterName7.setFont(new Font("Courier New", Font.PLAIN, 12));
		awayBatterName7.setHorizontalAlignment(SwingConstants.TRAILING);
		awayBatterName7.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName7);
		
		awayBatterName8 = new JLabel("Away Batter 8");
		awayBatterName8.setFont(new Font("Courier New", Font.PLAIN, 12));
		awayBatterName8.setHorizontalAlignment(SwingConstants.TRAILING);
		awayBatterName8.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName8);
		
		awayBatterName9 = new JLabel("Away Batter 9");
		awayBatterName9.setFont(new Font("Courier New", Font.PLAIN, 12));
		awayBatterName9.setHorizontalAlignment(SwingConstants.TRAILING);
		awayBatterName9.setBorder(loweredEtched);
		awayBattingOrderPane.add(awayBatterName9);
		
		JPanel gameInfoPanel = new JPanel();
		contentPane.add(gameInfoPanel);
		gameInfoPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		bigScoreBoard = new JPanel();
		bigScoreBoard.setBackground(new Color(0, 102, 102));
		gameInfoPanel.add(bigScoreBoard);
		GridBagLayout gbl_bigScoreBoard = new GridBagLayout();
		gbl_bigScoreBoard.columnWidths = new int[]{60, 60, 60, 60, 60};
		gbl_bigScoreBoard.rowHeights = new int[]{10, 10, 10, 10, 10};
		gbl_bigScoreBoard.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0};
		gbl_bigScoreBoard.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0};
		bigScoreBoard.setLayout(gbl_bigScoreBoard);
		
		awayTeamNamePanel = new JPanel();
		awayTeamNamePanel.setBackground(new Color(0, 153, 153));
		awayTeamNamePanel.setLayout(null);
		GridBagConstraints gbc_awayTeamNamePanel = new GridBagConstraints();
		gbc_awayTeamNamePanel.fill = GridBagConstraints.BOTH;
		gbc_awayTeamNamePanel.insets = new Insets(4, 4, 2, 2);
		gbc_awayTeamNamePanel.gridx = 0;
		gbc_awayTeamNamePanel.gridy = 0;
		gbc_awayTeamNamePanel.gridwidth = 2;
		bigScoreBoard.add(awayTeamNamePanel, gbc_awayTeamNamePanel);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 175, 40);
		lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		awayTeamNamePanel.add(lblNewLabel);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 153, 153));
		panel_4.setLayout(null);
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridheight = 5;
		gbc_panel_4.insets = new Insets(4, 2, 4, 2);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 2;
		gbc_panel_4.gridy = 0;
		bigScoreBoard.add(panel_4, gbc_panel_4);
		
		homeTeamNamePanel = new JPanel();
		homeTeamNamePanel.setBackground(new Color(0, 153, 153));
		homeTeamNamePanel.setLayout(null);
		GridBagConstraints gbc_homeTeamNamePanel = new GridBagConstraints();
		gbc_homeTeamNamePanel.gridwidth = 2;
		gbc_homeTeamNamePanel.insets = new Insets(4, 2, 2, 4);
		gbc_homeTeamNamePanel.fill = GridBagConstraints.BOTH;
		gbc_homeTeamNamePanel.gridx = 3;
		gbc_homeTeamNamePanel.gridy = 0;
		bigScoreBoard.add(homeTeamNamePanel, gbc_homeTeamNamePanel);
		
		label = new JLabel("New label");
		label.setForeground(Color.WHITE);
		label.setBounds(0, 0, 180, 40);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Leelawadee UI", Font.BOLD, 24));
		homeTeamNamePanel.add(label);
		
		awayTotalScore = new JPanel();
		awayTotalScore.setBackground(new Color(0, 153, 153));
		awayTotalScore.setLayout(null);
		GridBagConstraints gbc_awayTotalScore = new GridBagConstraints();
		gbc_awayTotalScore.gridwidth = 2;
		gbc_awayTotalScore.gridheight = 3;
		gbc_awayTotalScore.insets = new Insets(2, 4, 2, 2);
		gbc_awayTotalScore.fill = GridBagConstraints.BOTH;
		gbc_awayTotalScore.gridx = 0;
		gbc_awayTotalScore.gridy = 1;
		bigScoreBoard.add(awayTotalScore, gbc_awayTotalScore);
		
		awayBigScore = new JLabel("00");
		awayBigScore.setForeground(Color.WHITE);
		awayBigScore.setBackground(Color.BLACK);
		awayBigScore.setBounds(0, 0, 175, 142);
		awayBigScore.setHorizontalAlignment(SwingConstants.CENTER);
		awayBigScore.setFont(new Font("Counter-Strike", Font.BOLD, 50));
		awayTotalScore.add(awayBigScore);
		
		homeTotalScore = new JPanel();
		homeTotalScore.setForeground(Color.WHITE);
		homeTotalScore.setBackground(new Color(0, 153, 153));
		homeTotalScore.setLayout(null);
		GridBagConstraints gbc_homeTotalScore = new GridBagConstraints();
		gbc_homeTotalScore.gridwidth = 2;
		gbc_homeTotalScore.gridheight = 3;
		gbc_homeTotalScore.insets = new Insets(2, 2, 2, 4);
		gbc_homeTotalScore.fill = GridBagConstraints.BOTH;
		gbc_homeTotalScore.gridx = 3;
		gbc_homeTotalScore.gridy = 1;
		bigScoreBoard.add(homeTotalScore, gbc_homeTotalScore);
		
		homeBigScore = new JLabel("00");
		homeBigScore.setForeground(Color.WHITE);
		homeBigScore.setBounds(0, 0, 180, 142);
		homeBigScore.setHorizontalAlignment(SwingConstants.CENTER);
		homeBigScore.setFont(new Font("Counter-Strike", Font.BOLD, 50));
		homeTotalScore.add(homeBigScore);
		
		panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.gridwidth = 2;
		gbc_panel_8.insets = new Insets(2, 4, 4, 2);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 0;
		gbc_panel_8.gridy = 4;
		bigScoreBoard.add(panel_8, gbc_panel_8);
		
		panel_9 = new JPanel();
		panel_9.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.gridwidth = 2;
		gbc_panel_9.insets = new Insets(2, 2, 4, 4);
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 3;
		gbc_panel_9.gridy = 4;
		bigScoreBoard.add(panel_9, gbc_panel_9);
		
		JPanel buttonPanel = new JPanel();
		gameInfoPanel.add(buttonPanel);
		
		panel_2 = new JPanel();
		gameInfoPanel.add(panel_2);
		
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
		homeBattingOrderPane.setLayout(new GridLayout(9, 1, 2, 2));
		
		homeBatterName1 = new JLabel("Home Batter 1");
		homeBatterName1.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName1);
		
		homeBatterName2 = new JLabel("Home Batter 2");
		homeBatterName2.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName2);
		
		homeBatterName3 = new JLabel("Home Batter 3");
		homeBatterName3.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName3);
		
		homeBatterName4 = new JLabel("Home Batter 4");
		homeBatterName4.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName4);
		
		homeBatterName5 = new JLabel("Home Batter 5");
		homeBatterName5.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName5);
		
		homeBatterName6 = new JLabel("Home Batter 6");
		homeBatterName6.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName6);
		
		homeBatterName7 = new JLabel("Home Batter 7");
		homeBatterName7.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName7);
		
		homeBatterName8 = new JLabel("Home Batter 8");
		homeBatterName8.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName8);
		
		homeBatterName9 = new JLabel("Home Batter 9");
		homeBatterName9.setBorder(loweredEtched);
		homeBattingOrderPane.add(homeBatterName9);
		
		JPanel panel_3 = new JPanel();
		homeTeamStuff.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
	}
	
	public void setAwayBattingOrderTable(BattingOrder awayBO) {
		awayBatterName1.setText(awayBO.nextBatter() + "  ");
		awayBatterName2.setText(awayBO.nextBatter() + "  ");
		awayBatterName3.setText(awayBO.nextBatter() + "  ");
		awayBatterName4.setText(awayBO.nextBatter() + "  ");
		awayBatterName5.setText(awayBO.nextBatter() + "  ");
		awayBatterName6.setText(awayBO.nextBatter() + "  ");
		awayBatterName7.setText(awayBO.nextBatter() + "  ");
		awayBatterName8.setText(awayBO.nextBatter() + "  ");
		awayBatterName9.setText(awayBO.nextBatter() + "  ");
	}
	
	public void setHomeBattingOrderTable(BattingOrder homeBO) {
		homeBatterName1.setText("  " + homeBO.nextBatter());
		homeBatterName2.setText("  " + homeBO.nextBatter());
		homeBatterName3.setText("  " + homeBO.nextBatter());
		homeBatterName4.setText("  " + homeBO.nextBatter());
		homeBatterName5.setText("  " + homeBO.nextBatter());
		homeBatterName6.setText("  " + homeBO.nextBatter());
		homeBatterName7.setText("  " + homeBO.nextBatter());
		homeBatterName8.setText("  " + homeBO.nextBatter());
		homeBatterName9.setText("  " + homeBO.nextBatter());
	}
	
	public void setScores(int awayScore, int homeScore) {
		awayBigScore.setText(awayScore + "");
		homeBigScore.setText(homeScore + "");
	}

}
