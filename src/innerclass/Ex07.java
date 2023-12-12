package innerclass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//익명클래스 사용하기
public class Ex07 {

	public static void main(String[] args) {

		// 1. 화면 만들기
		Frame frame = new Frame();

		frame.setLayout(new FlowLayout());

		frame.setBounds(500, 300, 500, 300);

		frame.setVisible(true);
		

//		// 3. 키 이벤트 등록하기
//		frame.addKeyListener(new MyKeyListener());   (클래스를 만들고 객체 생성해서 기능 구현)

		// 익명클래스로 키 이벤트 등록
		frame.addKeyListener(new KeyAdapter() { //부모의 이름을 사용해서 자식클래스를 만들어낸다 (new를 써서 익명클래스의 객체가 만들어진 것.

			public void keyPressed(KeyEvent e) {  //keyPressed로 물려줌.. 메소드 재정의
				System.out.println("키를 눌렀습니다!");
			}
		});
	}

}

class MyKeyListener extends KeyAdapter {

//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("키를 눌렀습니다!");
//	}

}