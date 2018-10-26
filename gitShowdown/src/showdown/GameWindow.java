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
import javax.swing.border.LineBorder;

public class GameWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel awayBigScore;
	private JLabel homeBigScore;
	private JPanel homeSB7;
	private JPanel awaySB1;
	private JPanel homeSB9;
	private JPanel homeSBEx;
	private JPanel homeSB8;
	private JPanel homeSB1;
	private JPanel awaySB3;
	private JPanel awaySB4;
	private JPanel awaySB5;
	private JPanel awaySB6;
	private JPanel awaySB7;
	private JPanel awaySB8;
	private JPanel awaySB9;
	private JPanel awaySBEx;
	private JPanel awaySB2;
	private JPanel homeSB2;
	private JPanel homeSB3;
	private JPanel homeSB4;
	private JPanel homeSB5;
	private JPanel homeSB6;
	private JLabel inning1;
	private JLabel inning2;
	private JLabel inning3;
	private JLabel inning4;
	private JLabel inning5;
	private JLabel inning6;
	private JLabel inning7;
	private JLabel inning8;
	private JLabel inning9;
	private JLabel inningEx;
	private JPanel inning1_panel;
	private JPanel inning2_panel;
	private JPanel inning3_panel;
	private JPanel inning4_panel;
	private JPanel inning5_panel;
	private JPanel inning6_panel;
	private JPanel inning7_panel;
	private JPanel inning8_panel;
	private JPanel inning9_panel;
	private JPanel inningEx_panel;
	private JLabel homeSBLabel7;
	private JLabel homeSBLabel1;
	private JLabel awaySBLabel1;
	private JLabel homeSBLabel9;
	private JLabel homeSBLabelEx;
	private JLabel homeSBLabel8;
	private JLabel homeSBLabel2;
	private JLabel homeSBLabel3;
	private JLabel homeSBLabel4;
	private JLabel homeSBLabel5;
	private JLabel homeSBLabel6;
	private JLabel awaySBLabel3;
	private JLabel awaySBLabel4;
	private JLabel awaySBLabel5;
	private JLabel awaySBLabel6;
	private JLabel awaySBLabel7;
	private JLabel awaySBLabel8;
	private JLabel awaySBLabel9;
	private JLabel awaySBLabelEx;
	private JLabel awaySBLabel2;

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
		gbc_awayTeamNamePanel.insets = new Insets(4, 4, 5, 5);
		gbc_awayTeamNamePanel.gridx = 0;
		gbc_awayTeamNamePanel.gridy = 0;
		gbc_awayTeamNamePanel.gridwidth = 2;
		bigScoreBoard.add(awayTeamNamePanel, gbc_awayTeamNamePanel);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 175, 30);
		lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		awayTeamNamePanel.add(lblNewLabel);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 153, 153));
		panel_4.setLayout(null);
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridheight = 4;
		gbc_panel_4.insets = new Insets(4, 2, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 2;
		gbc_panel_4.gridy = 0;
		bigScoreBoard.add(panel_4, gbc_panel_4);
		
		homeTeamNamePanel = new JPanel();
		homeTeamNamePanel.setBackground(new Color(0, 153, 153));
		homeTeamNamePanel.setLayout(null);
		GridBagConstraints gbc_homeTeamNamePanel = new GridBagConstraints();
		gbc_homeTeamNamePanel.gridwidth = 2;
		gbc_homeTeamNamePanel.insets = new Insets(4, 2, 5, 4);
		gbc_homeTeamNamePanel.fill = GridBagConstraints.BOTH;
		gbc_homeTeamNamePanel.gridx = 3;
		gbc_homeTeamNamePanel.gridy = 0;
		bigScoreBoard.add(homeTeamNamePanel, gbc_homeTeamNamePanel);
		
		label = new JLabel("New label");
		label.setForeground(Color.WHITE);
		label.setBounds(0, 0, 174, 30);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Leelawadee UI", Font.BOLD, 24));
		homeTeamNamePanel.add(label);
		
		awayTotalScore = new JPanel();
		awayTotalScore.setBackground(new Color(0, 153, 153));
		awayTotalScore.setLayout(null);
		GridBagConstraints gbc_awayTotalScore = new GridBagConstraints();
		gbc_awayTotalScore.gridwidth = 2;
		gbc_awayTotalScore.gridheight = 3;
		gbc_awayTotalScore.insets = new Insets(2, 4, 5, 5);
		gbc_awayTotalScore.fill = GridBagConstraints.BOTH;
		gbc_awayTotalScore.gridx = 0;
		gbc_awayTotalScore.gridy = 1;
		bigScoreBoard.add(awayTotalScore, gbc_awayTotalScore);
		
		awayBigScore = new JLabel("00");
		awayBigScore.setForeground(Color.WHITE);
		awayBigScore.setBackground(Color.BLACK);
		awayBigScore.setBounds(0, 0, 175, 116);
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
		gbc_homeTotalScore.insets = new Insets(2, 2, 5, 4);
		gbc_homeTotalScore.fill = GridBagConstraints.BOTH;
		gbc_homeTotalScore.gridx = 3;
		gbc_homeTotalScore.gridy = 1;
		bigScoreBoard.add(homeTotalScore, gbc_homeTotalScore);
		
		homeBigScore = new JLabel("00");
		homeBigScore.setForeground(Color.WHITE);
		homeBigScore.setBounds(0, 0, 180, 116);
		homeBigScore.setHorizontalAlignment(SwingConstants.CENTER);
		homeBigScore.setFont(new Font("Counter-Strike", Font.BOLD, 50));
		homeTotalScore.add(homeBigScore);
		
		panel_8 = new JPanel();
		panel_8.setBorder(null);
		panel_8.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.gridwidth = 5;
		gbc_panel_8.insets = new Insets(2, 4, 4, 4);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 0;
		gbc_panel_8.gridy = 4;
		bigScoreBoard.add(panel_8, gbc_panel_8);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_8.rowHeights = new int[]{0, 0, 0};
		gbl_panel_8.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		gbl_panel_8.rowWeights = new double[]{1.0, 1.0, 1.0};
		panel_8.setLayout(gbl_panel_8);
		
		inning1_panel = new JPanel();
		inning1_panel.setBorder(null);
		inning1_panel.setBackground(new Color(0, 153, 153));
		inning1_panel.setLayout(null);
		GridBagConstraints gbc_inning1_panel = new GridBagConstraints();
		gbc_inning1_panel.fill = GridBagConstraints.BOTH;
		gbc_inning1_panel.insets = new Insets(0, 0, 1, 0);
		gbc_inning1_panel.gridx = 0;
		gbc_inning1_panel.gridy = 0;
		panel_8.add(inning1_panel, gbc_inning1_panel);
		
		inning1 = new JLabel("1");
		inning1.setHorizontalAlignment(SwingConstants.CENTER);
		inning1.setBounds(1, 1, 42, 19);
		inning1_panel.add(inning1);
		inning1.setBackground(new Color(0, 153, 153));
		inning1.setForeground(Color.WHITE);
		inning1.setFont(new Font("Counter-Strike", Font.PLAIN, 14));
		
		inning2_panel = new JPanel();
		inning2_panel.setBorder(null);
		inning2_panel.setBackground(new Color(0, 153, 153));
		inning2_panel.setLayout(null);
		GridBagConstraints gbc_inning2_panel = new GridBagConstraints();
		gbc_inning2_panel.fill = GridBagConstraints.BOTH;
		gbc_inning2_panel.insets = new Insets(0, 0, 1, 0);
		gbc_inning2_panel.gridx = 1;
		gbc_inning2_panel.gridy = 0;
		panel_8.add(inning2_panel, gbc_inning2_panel);
		
		inning2 = new JLabel("2");
		inning2.setHorizontalAlignment(SwingConstants.CENTER);
		inning2.setBounds(0, 1, 43, 19);
		inning2_panel.add(inning2);
		inning2.setBackground(new Color(0, 153, 153));
		inning2.setForeground(Color.WHITE);
		inning2.setFont(new Font("Counter-Strike", Font.PLAIN, 14));
		
		inning3_panel = new JPanel();
		inning3_panel.setBorder(null);
		inning3_panel.setBackground(new Color(0, 153, 153));
		inning3_panel.setLayout(null);
		GridBagConstraints gbc_inning3_panel = new GridBagConstraints();
		gbc_inning3_panel.fill = GridBagConstraints.BOTH;
		gbc_inning3_panel.insets = new Insets(0, 0, 1, 0);
		gbc_inning3_panel.gridx = 2;
		gbc_inning3_panel.gridy = 0;
		panel_8.add(inning3_panel, gbc_inning3_panel);
		
		inning3 = new JLabel("3");
		inning3.setHorizontalAlignment(SwingConstants.CENTER);
		inning3.setBounds(0, 1, 43, 19);
		inning3_panel.add(inning3);
		inning3.setBackground(new Color(0, 153, 153));
		inning3.setForeground(Color.WHITE);
		inning3.setFont(new Font("Counter-Strike", Font.PLAIN, 14));
		
		inning4_panel = new JPanel();
		inning4_panel.setBorder(null);
		inning4_panel.setBackground(new Color(0, 153, 153));
		inning4_panel.setLayout(null);
		GridBagConstraints gbc_inning4_panel = new GridBagConstraints();
		gbc_inning4_panel.fill = GridBagConstraints.BOTH;
		gbc_inning4_panel.insets = new Insets(0, 0, 1, 0);
		gbc_inning4_panel.gridx = 3;
		gbc_inning4_panel.gridy = 0;
		panel_8.add(inning4_panel, gbc_inning4_panel);
		
		inning4 = new JLabel("4");
		inning4.setHorizontalAlignment(SwingConstants.CENTER);
		inning4.setBounds(0, 1, 43, 19);
		inning4_panel.add(inning4);
		inning4.setBackground(new Color(0, 153, 153));
		inning4.setForeground(Color.WHITE);
		inning4.setFont(new Font("Counter-Strike", Font.PLAIN, 14));
		
		inning5_panel = new JPanel();
		inning5_panel.setBorder(null);
		inning5_panel.setBackground(new Color(0, 153, 153));
		inning5_panel.setLayout(null);
		GridBagConstraints gbc_inning5_panel = new GridBagConstraints();
		gbc_inning5_panel.fill = GridBagConstraints.BOTH;
		gbc_inning5_panel.insets = new Insets(0, 0, 1, 0);
		gbc_inning5_panel.gridx = 4;
		gbc_inning5_panel.gridy = 0;
		panel_8.add(inning5_panel, gbc_inning5_panel);
		
		inning5 = new JLabel("5");
		inning5.setHorizontalAlignment(SwingConstants.CENTER);
		inning5.setBounds(0, 1, 43, 19);
		inning5_panel.add(inning5);
		inning5.setBackground(new Color(0, 153, 153));
		inning5.setForeground(Color.WHITE);
		inning5.setFont(new Font("Counter-Strike", Font.PLAIN, 14));
		
		inning6_panel = new JPanel();
		inning6_panel.setBorder(null);
		inning6_panel.setBackground(new Color(0, 153, 153));
		inning6_panel.setLayout(null);
		GridBagConstraints gbc_inning6_panel = new GridBagConstraints();
		gbc_inning6_panel.fill = GridBagConstraints.BOTH;
		gbc_inning6_panel.insets = new Insets(0, 0, 1, 0);
		gbc_inning6_panel.gridx = 5;
		gbc_inning6_panel.gridy = 0;
		panel_8.add(inning6_panel, gbc_inning6_panel);
		
		inning6 = new JLabel("6");
		inning6.setHorizontalAlignment(SwingConstants.CENTER);
		inning6.setBounds(0, 1, 43, 19);
		inning6_panel.add(inning6);
		inning6.setBackground(new Color(0, 153, 153));
		inning6.setForeground(Color.WHITE);
		inning6.setFont(new Font("Counter-Strike", Font.PLAIN, 14));
		
		inning7_panel = new JPanel();
		inning7_panel.setBorder(null);
		inning7_panel.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_inning7_panel = new GridBagConstraints();
		gbc_inning7_panel.fill = GridBagConstraints.BOTH;
		gbc_inning7_panel.insets = new Insets(1, 1, 1, 1);
		gbc_inning7_panel.gridx = 6;
		gbc_inning7_panel.gridy = 0;
		panel_8.add(inning7_panel, gbc_inning7_panel);
		GridBagLayout gbl_inning7_panel = new GridBagLayout();
		gbl_inning7_panel.columnWidths = new int[]{0, 0};
		gbl_inning7_panel.rowHeights = new int[]{0, 0};
		gbl_inning7_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_inning7_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		inning7_panel.setLayout(gbl_inning7_panel);
		
		inning7 = new JLabel("7");
		GridBagConstraints gbc_inning7 = new GridBagConstraints();
		gbc_inning7.gridx = 0;
		gbc_inning7.gridy = 0;
		inning7_panel.add(inning7, gbc_inning7);
		inning7.setBackground(new Color(0, 153, 153));
		inning7.setForeground(Color.WHITE);
		inning7.setFont(new Font("Counter-Strike", Font.PLAIN, 14));
		
		inning8_panel = new JPanel();
		inning8_panel.setBorder(null);
		inning8_panel.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_inning8_panel = new GridBagConstraints();
		gbc_inning8_panel.fill = GridBagConstraints.BOTH;
		gbc_inning8_panel.insets = new Insets(1, 1, 1, 1);
		gbc_inning8_panel.gridx = 7;
		gbc_inning8_panel.gridy = 0;
		panel_8.add(inning8_panel, gbc_inning8_panel);
		GridBagLayout gbl_inning8_panel = new GridBagLayout();
		gbl_inning8_panel.columnWidths = new int[]{0, 0};
		gbl_inning8_panel.rowHeights = new int[]{0, 0};
		gbl_inning8_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_inning8_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		inning8_panel.setLayout(gbl_inning8_panel);
		
		inning8 = new JLabel("8");
		GridBagConstraints gbc_inning8 = new GridBagConstraints();
		gbc_inning8.gridx = 0;
		gbc_inning8.gridy = 0;
		inning8_panel.add(inning8, gbc_inning8);
		inning8.setBackground(new Color(0, 153, 153));
		inning8.setForeground(Color.WHITE);
		inning8.setFont(new Font("Counter-Strike", Font.PLAIN, 14));
		
		inning9_panel = new JPanel();
		inning9_panel.setBorder(null);
		inning9_panel.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_inning9_panel = new GridBagConstraints();
		gbc_inning9_panel.fill = GridBagConstraints.BOTH;
		gbc_inning9_panel.insets = new Insets(1, 1, 1, 1);
		gbc_inning9_panel.gridx = 8;
		gbc_inning9_panel.gridy = 0;
		panel_8.add(inning9_panel, gbc_inning9_panel);
		GridBagLayout gbl_inning9_panel = new GridBagLayout();
		gbl_inning9_panel.columnWidths = new int[]{0, 0};
		gbl_inning9_panel.rowHeights = new int[]{0, 0};
		gbl_inning9_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_inning9_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		inning9_panel.setLayout(gbl_inning9_panel);
		
		inning9 = new JLabel("9");
		GridBagConstraints gbc_inning9 = new GridBagConstraints();
		gbc_inning9.gridx = 0;
		gbc_inning9.gridy = 0;
		inning9_panel.add(inning9, gbc_inning9);
		inning9.setBackground(new Color(0, 153, 153));
		inning9.setForeground(Color.WHITE);
		inning9.setFont(new Font("Counter-Strike", Font.PLAIN, 14));
		
		inningEx_panel = new JPanel();
		inningEx_panel.setBorder(null);
		inningEx_panel.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_inningEx_panel = new GridBagConstraints();
		gbc_inningEx_panel.fill = GridBagConstraints.BOTH;
		gbc_inningEx_panel.insets = new Insets(1, 1, 1, 1);
		gbc_inningEx_panel.gridx = 9;
		gbc_inningEx_panel.gridy = 0;
		panel_8.add(inningEx_panel, gbc_inningEx_panel);
		GridBagLayout gbl_inningEx_panel = new GridBagLayout();
		gbl_inningEx_panel.columnWidths = new int[]{0, 0};
		gbl_inningEx_panel.rowHeights = new int[]{0, 0};
		gbl_inningEx_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_inningEx_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		inningEx_panel.setLayout(gbl_inningEx_panel);
		
		inningEx = new JLabel("Ex");
		GridBagConstraints gbc_inningEx = new GridBagConstraints();
		gbc_inningEx.gridx = 0;
		gbc_inningEx.gridy = 0;
		inningEx_panel.add(inningEx, gbc_inningEx);
		inningEx.setBackground(new Color(0, 153, 153));
		inningEx.setForeground(Color.WHITE);
		inningEx.setFont(new Font("Counter-Strike", Font.PLAIN, 14));
		
		homeSB7 = new JPanel();
		homeSB7.setBorder(new LineBorder(new Color(0, 102, 102)));
		homeSB7.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_homeSB7 = new GridBagConstraints();
		gbc_homeSB7.insets = new Insets(1, 1, 1, 1);
		gbc_homeSB7.fill = GridBagConstraints.BOTH;
		gbc_homeSB7.gridx = 6;
		gbc_homeSB7.gridy = 2;
		panel_8.add(homeSB7, gbc_homeSB7);
		
		homeSBLabel7 = new JLabel("");
		homeSB7.add(homeSBLabel7);
		
		homeSB1 = new JPanel();
		homeSB1.setBorder(new LineBorder(new Color(0, 102, 102)));
		homeSB1.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_homeSB1 = new GridBagConstraints();
		gbc_homeSB1.insets = new Insets(1, 1, 1, 1);
		gbc_homeSB1.fill = GridBagConstraints.BOTH;
		gbc_homeSB1.gridx = 0;
		gbc_homeSB1.gridy = 2;
		panel_8.add(homeSB1, gbc_homeSB1);
		
		homeSBLabel1 = new JLabel("");
		homeSB1.add(homeSBLabel1);
		
		awaySB1 = new JPanel();
		awaySB1.setBorder(new LineBorder(new Color(0, 102, 102)));
		awaySB1.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_awaySB1 = new GridBagConstraints();
		gbc_awaySB1.insets = new Insets(1, 1, 1, 1);
		gbc_awaySB1.fill = GridBagConstraints.BOTH;
		gbc_awaySB1.gridx = 0;
		gbc_awaySB1.gridy = 1;
		panel_8.add(awaySB1, gbc_awaySB1);
		
		awaySBLabel1 = new JLabel("");
		awaySB1.add(awaySBLabel1);
		
		homeSB9 = new JPanel();
		homeSB9.setBorder(new LineBorder(new Color(0, 102, 102)));
		homeSB9.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_homeSB9 = new GridBagConstraints();
		gbc_homeSB9.insets = new Insets(1, 1, 1, 1);
		gbc_homeSB9.fill = GridBagConstraints.BOTH;
		gbc_homeSB9.gridx = 8;
		gbc_homeSB9.gridy = 2;
		panel_8.add(homeSB9, gbc_homeSB9);
		
		homeSBLabel9 = new JLabel("");
		homeSB9.add(homeSBLabel9);
		
		homeSBEx = new JPanel();
		homeSBEx.setBorder(new LineBorder(new Color(0, 102, 102)));
		homeSBEx.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_homeSBEx = new GridBagConstraints();
		gbc_homeSBEx.insets = new Insets(1, 1, 1, 1);
		gbc_homeSBEx.fill = GridBagConstraints.BOTH;
		gbc_homeSBEx.gridx = 9;
		gbc_homeSBEx.gridy = 2;
		panel_8.add(homeSBEx, gbc_homeSBEx);
		
		homeSBLabelEx = new JLabel("");
		homeSBEx.add(homeSBLabelEx);
		
		homeSB8 = new JPanel();
		homeSB8.setBorder(new LineBorder(new Color(0, 102, 102)));
		homeSB8.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_homeSB8 = new GridBagConstraints();
		gbc_homeSB8.insets = new Insets(1, 1, 1, 1);
		gbc_homeSB8.fill = GridBagConstraints.BOTH;
		gbc_homeSB8.gridx = 7;
		gbc_homeSB8.gridy = 2;
		panel_8.add(homeSB8, gbc_homeSB8);
		
		homeSBLabel8 = new JLabel("");
		homeSB8.add(homeSBLabel8);
		
		awaySB3 = new JPanel();
		awaySB3.setBorder(new LineBorder(new Color(0, 102, 102)));
		awaySB3.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_awaySB3 = new GridBagConstraints();
		gbc_awaySB3.insets = new Insets(1, 1, 1, 1);
		gbc_awaySB3.fill = GridBagConstraints.BOTH;
		gbc_awaySB3.gridx = 2;
		gbc_awaySB3.gridy = 1;
		panel_8.add(awaySB3, gbc_awaySB3);
		
		awaySBLabel3 = new JLabel("");
		awaySB3.add(awaySBLabel3);
		
		awaySB4 = new JPanel();
		awaySB4.setBorder(new LineBorder(new Color(0, 102, 102)));
		awaySB4.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_awaySB4 = new GridBagConstraints();
		gbc_awaySB4.insets = new Insets(1, 1, 1, 1);
		gbc_awaySB4.fill = GridBagConstraints.BOTH;
		gbc_awaySB4.gridx = 3;
		gbc_awaySB4.gridy = 1;
		panel_8.add(awaySB4, gbc_awaySB4);
		
		awaySBLabel4 = new JLabel("");
		awaySB4.add(awaySBLabel4);
		
		awaySB5 = new JPanel();
		awaySB5.setBorder(new LineBorder(new Color(0, 102, 102)));
		awaySB5.setBackground(new Color(0, 153, 153));
		awaySB5.setLayout(null);
		GridBagConstraints gbc_awaySB5 = new GridBagConstraints();
		gbc_awaySB5.insets = new Insets(1, 1, 1, 1);
		gbc_awaySB5.fill = GridBagConstraints.BOTH;
		gbc_awaySB5.gridx = 4;
		gbc_awaySB5.gridy = 1;
		panel_8.add(awaySB5, gbc_awaySB5);
		
		awaySBLabel5 = new JLabel("");
		awaySBLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		awaySBLabel5.setBounds(0, 0, 37, 22);
		awaySB5.add(awaySBLabel5);
		
		awaySB6 = new JPanel();
		awaySB6.setBorder(new LineBorder(new Color(0, 102, 102)));
		awaySB6.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_awaySB6 = new GridBagConstraints();
		gbc_awaySB6.insets = new Insets(1, 1, 1, 1);
		gbc_awaySB6.fill = GridBagConstraints.BOTH;
		gbc_awaySB6.gridx = 5;
		gbc_awaySB6.gridy = 1;
		panel_8.add(awaySB6, gbc_awaySB6);
		
		awaySBLabel6 = new JLabel("");
		awaySB6.add(awaySBLabel6);
		
		awaySB7 = new JPanel();
		awaySB7.setBorder(new LineBorder(new Color(0, 102, 102)));
		awaySB7.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_awaySB7 = new GridBagConstraints();
		gbc_awaySB7.insets = new Insets(1, 1, 1, 1);
		gbc_awaySB7.fill = GridBagConstraints.BOTH;
		gbc_awaySB7.gridx = 6;
		gbc_awaySB7.gridy = 1;
		panel_8.add(awaySB7, gbc_awaySB7);
		
		awaySBLabel7 = new JLabel("");
		awaySB7.add(awaySBLabel7);
		
		awaySB8 = new JPanel();
		awaySB8.setBorder(new LineBorder(new Color(0, 102, 102)));
		awaySB8.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_awaySB8 = new GridBagConstraints();
		gbc_awaySB8.insets = new Insets(1, 1, 1, 1);
		gbc_awaySB8.fill = GridBagConstraints.BOTH;
		gbc_awaySB8.gridx = 7;
		gbc_awaySB8.gridy = 1;
		panel_8.add(awaySB8, gbc_awaySB8);
		
		awaySBLabel8 = new JLabel("");
		awaySB8.add(awaySBLabel8);
		
		awaySB9 = new JPanel();
		awaySB9.setBorder(new LineBorder(new Color(0, 102, 102)));
		awaySB9.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_awaySB9 = new GridBagConstraints();
		gbc_awaySB9.insets = new Insets(1, 1, 1, 1);
		gbc_awaySB9.fill = GridBagConstraints.BOTH;
		gbc_awaySB9.gridx = 8;
		gbc_awaySB9.gridy = 1;
		panel_8.add(awaySB9, gbc_awaySB9);
		
		awaySBLabel9 = new JLabel("");
		awaySB9.add(awaySBLabel9);
		
		awaySBEx = new JPanel();
		awaySBEx.setBorder(new LineBorder(new Color(0, 102, 102)));
		awaySBEx.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_awaySBEx = new GridBagConstraints();
		gbc_awaySBEx.insets = new Insets(1, 1, 1, 1);
		gbc_awaySBEx.fill = GridBagConstraints.BOTH;
		gbc_awaySBEx.gridx = 9;
		gbc_awaySBEx.gridy = 1;
		panel_8.add(awaySBEx, gbc_awaySBEx);
		
		awaySBLabelEx = new JLabel("");
		awaySBEx.add(awaySBLabelEx);
		
		awaySB2 = new JPanel();
		awaySB2.setBorder(new LineBorder(new Color(0, 102, 102)));
		awaySB2.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_awaySB2 = new GridBagConstraints();
		gbc_awaySB2.insets = new Insets(1, 1, 1, 1);
		gbc_awaySB2.fill = GridBagConstraints.BOTH;
		gbc_awaySB2.gridx = 1;
		gbc_awaySB2.gridy = 1;
		panel_8.add(awaySB2, gbc_awaySB2);
		
		awaySBLabel2 = new JLabel("");
		awaySB2.add(awaySBLabel2);
		
		homeSB2 = new JPanel();
		homeSB2.setBorder(new LineBorder(new Color(0, 102, 102)));
		homeSB2.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_homeSB2 = new GridBagConstraints();
		gbc_homeSB2.insets = new Insets(1, 1, 1, 1);
		gbc_homeSB2.fill = GridBagConstraints.BOTH;
		gbc_homeSB2.gridx = 1;
		gbc_homeSB2.gridy = 2;
		panel_8.add(homeSB2, gbc_homeSB2);
		
		homeSBLabel2 = new JLabel("");
		homeSB2.add(homeSBLabel2);
		
		homeSB3 = new JPanel();
		homeSB3.setBorder(new LineBorder(new Color(0, 102, 102)));
		homeSB3.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_homeSB3 = new GridBagConstraints();
		gbc_homeSB3.insets = new Insets(1, 1, 1, 1);
		gbc_homeSB3.fill = GridBagConstraints.BOTH;
		gbc_homeSB3.gridx = 2;
		gbc_homeSB3.gridy = 2;
		panel_8.add(homeSB3, gbc_homeSB3);
		
		homeSBLabel3 = new JLabel("");
		homeSB3.add(homeSBLabel3);
		
		homeSB4 = new JPanel();
		homeSB4.setBorder(new LineBorder(new Color(0, 102, 102)));
		homeSB4.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_homeSB4 = new GridBagConstraints();
		gbc_homeSB4.insets = new Insets(1, 1, 1, 1);
		gbc_homeSB4.fill = GridBagConstraints.BOTH;
		gbc_homeSB4.gridx = 3;
		gbc_homeSB4.gridy = 2;
		panel_8.add(homeSB4, gbc_homeSB4);
		
		homeSBLabel4 = new JLabel("");
		homeSB4.add(homeSBLabel4);
		
		homeSB5 = new JPanel();
		homeSB5.setBorder(new LineBorder(new Color(0, 102, 102)));
		homeSB5.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_homeSB5 = new GridBagConstraints();
		gbc_homeSB5.insets = new Insets(1, 1, 1, 1);
		gbc_homeSB5.fill = GridBagConstraints.BOTH;
		gbc_homeSB5.gridx = 4;
		gbc_homeSB5.gridy = 2;
		panel_8.add(homeSB5, gbc_homeSB5);
		
		homeSBLabel5 = new JLabel("");
		homeSB5.add(homeSBLabel5);
		
		homeSB6 = new JPanel();
		homeSB6.setBorder(new LineBorder(new Color(0, 102, 102)));
		homeSB6.setBackground(new Color(0, 153, 153));
		GridBagConstraints gbc_homeSB6 = new GridBagConstraints();
		gbc_homeSB6.insets = new Insets(1, 1, 1, 1);
		gbc_homeSB6.fill = GridBagConstraints.BOTH;
		gbc_homeSB6.gridx = 5;
		gbc_homeSB6.gridy = 2;
		panel_8.add(homeSB6, gbc_homeSB6);
		
		homeSBLabel6 = new JLabel("");
		homeSB6.add(homeSBLabel6);
		
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
		awayBatterName1.setText(awayBO.nextBatter().name + "  ");
		awayBatterName2.setText(awayBO.nextBatter().name+ "  ");
		awayBatterName3.setText(awayBO.nextBatter().name+ "  ");
		awayBatterName4.setText(awayBO.nextBatter().name+ "  ");
		awayBatterName5.setText(awayBO.nextBatter().name+ "  ");
		awayBatterName6.setText(awayBO.nextBatter().name+ "  ");
		awayBatterName7.setText(awayBO.nextBatter().name+ "  ");
		awayBatterName8.setText(awayBO.nextBatter().name+ "  ");
		awayBatterName9.setText(awayBO.nextBatter().name+ "  ");
	}
	
	public void setHomeBattingOrderTable(BattingOrder homeBO) {
		homeBatterName1.setText("  " + homeBO.nextBatter().name);
		homeBatterName2.setText("  " + homeBO.nextBatter().name);
		homeBatterName3.setText("  " + homeBO.nextBatter().name);
		homeBatterName4.setText("  " + homeBO.nextBatter().name);
		homeBatterName5.setText("  " + homeBO.nextBatter().name);
		homeBatterName6.setText("  " + homeBO.nextBatter().name);
		homeBatterName7.setText("  " + homeBO.nextBatter().name);
		homeBatterName8.setText("  " + homeBO.nextBatter().name);
		homeBatterName9.setText("  " + homeBO.nextBatter().name);
	}
	
	public void setScores(int awayScore, int homeScore) {
		awayBigScore.setText(awayScore + "");
		homeBigScore.setText(homeScore + "");
	}

}
