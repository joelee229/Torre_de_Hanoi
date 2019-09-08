import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class TorredeHanoi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TorredeHanoi frame = new TorredeHanoi();
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
	public TorredeHanoi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon icon = new ImageIcon("Images/hanoiTes02.gif"); 
		JLabel hanoi = new JLabel();
		hanoi.setBounds(41, 12, 341, 126);
		hanoi.setIcon(icon);
		getContentPane().add(hanoi);
		
		JButton btnParte = new JButton("1ª Parte");
		btnParte.setBounds(41, 164, 115, 25);
		contentPane.add(btnParte);
		
		JButton btnParte_1 = new JButton("2ª Parte");
		btnParte_1.setBounds(41, 201, 115, 25);
		contentPane.add(btnParte_1);
	}
}
