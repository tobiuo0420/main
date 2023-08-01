package leesion_java31;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private double height;
	private double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// フルネームを返すメソッド
	public String fullName() {
		return firstName + " " + lastName;
	}

	// buyメソッド
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(this.fullName() + "が購入しました");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(this.fullName() + "が購入しました");
	}

	// bmiとprintメソッド
	public double bmi() {
		return weight / (height * height);
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.printf("BMIは%.1fです%n", bmi());
	}
}