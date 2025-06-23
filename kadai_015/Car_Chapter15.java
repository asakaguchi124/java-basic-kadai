package kadai_015;

public class Car_Chapter15 {

	
	//フィールド（内部データ）
	private int gear = 1; //1～５のギア
	private int speed = 10; //ギアチェンジ後の速度

	
	//メソッド：ギアの値により速度を変更
	public void gearChange( int afterGear ) {
		
		int beforegear = this.gear;
		
		switch (afterGear) {
		case 1 -> { this.gear = afterGear; this.speed = 10; } 
		case 2 -> { this.gear = afterGear; this.speed = 20; }
		case 3 -> { this.gear = afterGear; this.speed = 30; }
		case 4 -> { this.gear = afterGear; this.speed = 40; }
		case 5 -> { this.gear = afterGear; this.speed = 50; }
		default -> { this.gear = afterGear; this.speed = 10; }
		}
		
		System.out.println("ギア" + beforegear + "から" + this.gear + "に切り替えました");
	}
	
	//メソッド：ギアチェンジ後の速度を表示
	public void run () {
		
		System.out.println("速度は時速" + this.speed + "kmです" );
	}

}
