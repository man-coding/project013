package innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//awt: 화면 기반 어플리케이션을 개발하기 위한 라이브러리이다.
public class Ex06 {

	public static void main(String[] args) {

		// 1. 화면 만들기
		Frame frame = new Frame();

		frame.setLayout(new FlowLayout());

		frame.setBounds(500, 300, 500, 300);

		frame.setVisible(true);

		// 2. 버튼 만들기
		Button button = new Button("click");

		frame.add(button);

		// 3. 버튼 이벤트 등록하기
//		button.addActionListener(new EventHandler()); -> 밑에서 클래스 생성하고 객체 생성해서 구현

		button.addActionListener(new ActionListener() {// 익명클래스로 객체 바로 생성하고 자식클래스까지 생성하여 구현

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다....");
			}
		});
	}

}

//class EventHandler implements ActionListener {  //액션리스너는 인터페이스이므로 implements를 써줘야 함. <-- 27행과 같이 구현
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼을 클릭했습니다!");
//	}
//
//}
