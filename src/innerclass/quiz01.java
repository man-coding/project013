package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class quiz01 {

	public static void main(String[] args) {

		Frame frame = new Frame();

		frame.setLayout(new FlowLayout());

		frame.setBounds(500, 300, 500, 300);

		TextArea textArea = new TextArea("텍스트상자", 10, 50);
		frame.add(textArea);

		frame.setVisible(true);
		// 미리 구현한 클래스로 키 이벤트 등록
//		textArea.addFocusListener(new MyFocusListener()); // 부모 포커스리스너는 인터페이스이므로 인자로 받을 수 없다. 그걸 상속받는 구현 클래스를 만든 다음 그
//															// 인스턴스를 넣어준다(마이포커스

		textArea.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

				System.out.println("텍스트에 포커스가 벗어났습니다!");
			}

			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("텍스트에 포커스가 되었습니다!");

			}
		});
	}

}

//class MyFocusListener implements FocusListener {  //익명클래스로 구현할 때에는 아예 클래스 안 써도 됨.
////
////	@Override
////	public void focusGained(FocusEvent e) {
////		System.out.println("텍스트에 포커스가 되었습니다!");
////
////	}
////
////	@Override
////	public void focusLost(FocusEvent e) {
////		System.out.println("텍스트에 포커스가 벗어났습니다!");
////	}
//
//}