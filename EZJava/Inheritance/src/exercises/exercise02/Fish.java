package exercises.exercise02;

public class Fish extends Animal {
	Fish(){
		this.kind = "물고기";
	}
	@Override
	public void move() {
		System.out.println("물고기는 헤엄친다.");
	}
	
	@Override
	public void sound() {
		System.out.println("물고기는 뻐끔거린다.");
	}
	
	@Override
	public void breathe() {
		System.out.println("물고기는 아가미로 호흡을 한다.");
	}
	public void swim() {
		System.out.println("물고기는 아가미로 호흡을 한다.");
	}

}
