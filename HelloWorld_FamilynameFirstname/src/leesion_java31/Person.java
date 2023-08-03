package leesion_java31;

//Personクラス
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

	// 問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。
	// （仮引数：car）
	
	// 問題7：buyメソッドの中でsetOwnerメソッドとthisを用いて
	// ownerフィールドの値をセットしましょう。
	// 問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
	
	// 問題9：引数の型が異なるbuyメソッドを定義しましょう。
	//（仮引数：bicycle）
	
	// 問題10：Mainクラスからbuyメソッドを用いて、
	//「person1」がcarを購入、「person2」が
	// bicycleを購入するプログラムを作成しましょう。
	
	// buyメソッドを定義
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