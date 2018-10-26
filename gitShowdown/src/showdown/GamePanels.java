package showdown;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class GamePanels extends JFrame{

	private JPanel contentPane;

	private JLabel awayBatterName1;
	private JLabel awayBatterName2;
	private JLabel awayBatterName3;
	private JLabel awayBatterName4;
	private JLabel awayBatterName5;
	private JLabel awayBatterName6;
	private JLabel awayBatterName7;
	private JLabel awayBatterName8;
	private JLabel awayBatterName9;
	
	public GamePanels() {
		initialize();
	};

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamePanels frame = new GamePanels();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 5, 5));
		
		JPanel awayLineUp = awayLineUp();
		JPanel homeLineUp = awayLineUp();
		contentPane.add(awayLineUp);
		contentPane.add(homeLineUp);
	}

	private Border loweredEtched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

	private JPanel wLineUp() {
		JPanel awayBattingOrderPane = new JPanel();
		awayBattingOrderPane.setBorder(loweredEtched);
		awayBattingOrderPane.setLayout(new GridLayout(9, 1, 2, 2));
		return awayBattingOrderPane;
	}
	
	private JPanel awayLineUp() {
		JPanel awayBattingOrderPane = new JPanel();
		awayBattingOrderPane.setPreferredSize(new Dimension(150,215));
		awayBattingOrderPane.setBorder(loweredEtched);
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
		
		return awayBattingOrderPane;
	}
}
