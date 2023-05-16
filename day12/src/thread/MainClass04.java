package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class A04 extends Thread {
	JFrame frame;
	JLabel label;

	public A04() {
		frame = new JFrame("label example");
		Container con = frame.getContentPane();//컨테이너 생성
		label = new JLabel("test label");
		label.setText("aaaaA");//텍스트 설정

		con.add(label); //컨테이너에 텍스터설정한값 삽입

		Font font = new Font("bell MT", Font.ITALIC, 32);
		label.setFont(font);// 폰트설정

		// 창크기
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack();

	}

	public void run() {

		frame.setVisible(true); // 보여지냐마냐
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x누르면 실행종료

		for (int i = 0;; i++) {
			label.setText(i + ".변경");
		}

	}

}

public class MainClass04 {
	public static void main(String[] args) {
		A04 a = new A04();
		a.start();
		while (true) {
			System.out.println("입력");
			String s = new Scanner(System.in).next();
			System.out.println("출력: " + s);

		}
	}
}
