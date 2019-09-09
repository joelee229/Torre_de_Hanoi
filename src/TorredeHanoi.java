import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class TorredeHanoi extends JFrame {

	private JPanel contentPane;
	private int dis;
	private String est;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TorredeHanoi frame = new TorredeHanoi();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
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
		super("Torre de Hanoi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon icon = new ImageIcon("Images/hanoiTes02.gif"); 
		JLabel hanoi = new JLabel();
		hanoi.setBounds(41, 12, 200, 126);
		hanoi.setIcon(icon);
		getContentPane().add(hanoi);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(251, 12, 252, 238);
		contentPane.add(textArea);

		JButton btnParte = new JButton("1ª Parte");
		btnParte.setBounds(41, 164, 115, 25);
		btnParte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dis = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de discos:","Discos",JOptionPane.INFORMATION_MESSAGE));
					int res =(int) Math.pow(2, dis)-1;
					textArea.setText("O número mínimo de \nmovimentos é igual a "+res);
				}catch(Exception ae) {}
			}
		});
		contentPane.add(btnParte);

		JButton btnParte_1 = new JButton("2ª Parte");
		btnParte_1.setBounds(41, 201, 115, 25);
		btnParte_1.addActionListener(new ActionListener() {
			public void mov(int disco, char origem, char dest, char manobra){
				if(disco == 1){
					est = textArea.getText();
					textArea.setText(est+"\nMovimento disco"+disco+" de "+origem+" para "+dest);
				}else{
					est = textArea.getText();
					mov(disco -1, origem, manobra, dest);
					textArea.setText(est+"\nMovimento disco "+disco+" de " +origem+" para "+dest);
					mov(disco-1, manobra, dest, origem);
				}
			}
			public void actionPerformed(ActionEvent e) {
				try {
					
					int dis1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de discos:","Discos",JOptionPane.INFORMATION_MESSAGE));
					int res =(int) Math.pow(2, dis1)-1;
					if(dis1 ==dis) {
						est = textArea.getText();
						textArea.setText(est+"\nOs movimentos são: ");
						mov(dis1, 'A', 'C', 'B');
					}else {
						textArea.setText("O número mínimo de \nmovimentos é igual a "+res+"\n Os movimentos são: ");
						mov(dis1, 'A', 'C', 'B');
					}
				}catch(Exception ae) {}


			}
		});
		contentPane.add(btnParte_1);


	}
}
