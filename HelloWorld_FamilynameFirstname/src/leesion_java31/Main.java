package leesion_java31;

public class Main {
	public static void main(String[] args) {
		
		// 問題4：MainクラスにsetOwnerを用いて、Carクラスの
		// インスタンス「car」の所有者を「person1」に、
		// Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定します。
		// Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		 // ownerを設定
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());

		// 問題5：セットできたら、ownerをコンソールに出力してください。

		 // ownerを表示
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		 // 購入処理
		person1.buy(car);
		person2.buy(bicycle);
	}
}