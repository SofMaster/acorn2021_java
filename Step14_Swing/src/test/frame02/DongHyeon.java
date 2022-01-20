package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DongHyeon extends JFrame{
	public DongHyeon(String title) {
		super(title); 
		setLayout(new FlowLayout());
		JButton cordingBtn=new JButton("기록");
		JButton stopBtn=new JButton("정지");
		JButton resetBtn=new JButton("초기화");
		add(cordingBtn);
		add(stopBtn);
		add(resetBtn);
		
		cordingBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(DongHyeon.this, "기록합니다.");
			}
		});
		
		stopBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(DongHyeon.this, "기록을 중지합니다.");
		});
		
		resetBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(DongHyeon.this, "기록을 초기화합니다.");
		});
	}

	public static void main(String[] args) {
		DongHyeon D=new DongHyeon("동현 프레임");
		D.setBounds(100, 100, 500, 300);
		D.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		D.setVisible(true);
	}
}
