package exam01_field_polymorphism;
import hankook.*;

public class Car {
	public Tire frontLeftTire = new HankookTire();
	public Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();

	Tire backRightTire = new HankookTire();

	Number01_braek num1_brake = new Number01_braek();
	Number02_brake num2_brake = new Number02_brake();

	brake brake1 = new Number01_braek();
	Pedal pedal1 = new Number02_brake();


	//tires라는 배열에 Trie 타입의 newHankookTire 객체를 만듦듦
public Tire[] tires = {
			new newHankookTire(),
			new newHankookTire(),
			new newHankookTire(),
			new newHankookTire()
	};



	void run() {

//		System.out.println("---------자식 num1,2---------");
//		num1_brake.push();
//		num2_brake.push();

		System.out.println("---------부모인 brake1---------");
		brake1.stop();

		System.out.println("---------(부모)break2 -> 자식으로 형변환 자식의 메소드(push)출력----------");

		Number01_braek brake2 =(Number01_braek)brake1;
		//자식클래스 변수 = (자식클래스) 부모타입클래스타입
		// 형변함
		brake2.push();  // 원래 없던 메소드 자식으로 형변환 해서 가능
		brake2.stop();

		System.out.println("-----부모인 padal--------");
		pedal1.push(); //pedal의 메소
//		pedal1.stop(); // pedal에는 stop메소가 없음

		System.out.println("-----형변환-------");
		Number02_brake pedal2 = (Number02_brake) pedal1;
		pedal2.stop();
		System.out.println("---형변환 완료-----");



		brake2.defaultPedal(backLeftTire);
		backLeftTire = new KumhoTire();
		brake2.defaultPedal(backLeftTire);
		backLeftTire = new newHankookTire();
		brake2.defaultPedal(backLeftTire);



		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		//개선된for문 문법
		//for(자료형 변수명 : 배열명){문장}
//		for(Tire tire : tires){
//			tire.roll();
//		}

	}
}
