package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	public void gearChange(final int afterGear) {
		System.out.print("ギアが" + this.gear + "から");
		this.gear = afterGear;
		switch(afterGear) {
		case 1->this.speed=10;
		case 2->this.speed=20;
		case 3->this.speed=30;
		case 4->this.speed=40;
		case 5->this.speed=50;
		default->{
			this.speed=10;
			this.gear =1;
		}
		}
		System.out.println(this.gear + "に切り替わりました");
	}
	public void run() {
		System.out.println("速度は時速" + this.speed + "です");
	}

}
