package curriculum.b;

public class Question5 {

	public static void main(String[] args) {
		/* Q1 次の条件を満たす メソッド helloWorld を作成してください。
		引数なし 戻り値なし 
		"Hello, World!" を表示
		
		実行例
		Hello, World! */

		/* Q2 次の条件を満たす メソッド doubleValue を作成してください。
		引数：整数 (int num) 戻り値：整数（引数の2倍の値）
		戻り値をもとに実行例のように表示
		
		実行例
		10 を 2 倍すると 20 です。 */

		/* Q3 次の条件を満たす メソッド isEven を作成してください。
		引数：整数 (int num) 戻り値：true（偶数なら）、false（奇数なら）
		num1に7,num2に10を設定し以下の実行例になるように表示
		
		実行例
		10 は偶数です。
		7 は奇数です。 */

		/* Q4 次の2つのクラスを作成し、Mainクラスから Greetingクラスのメソッドを呼び出すようにしてください。
		Greeting.java (別のクラス)
		sayHello() メソッドを持ち、"こんにちは！" を表示
		Main.java
		Greeting クラスをインポートして sayHello() を実行 */

		/* Q5 次の2つのクラスを作成し、下記がコンソールに出力されるように作成してください
		※thisとsetterとgetterとフィールドを使ってください
		動物名：ライオン
		体長：2.1m
		速度：80km/h
		Animal .java (別のクラス)
		動物名、体長、速度の変数を持ち各変数のgetterとsetterを作成
		Main.java
		変数の中身を設定し、出力の処理を行う */

		// Q1
		helloWorld();

		// Q2
		int result = doubleValue(10);
		System.out.println("10 を 2 倍すると " + result + " です。");

		// Q3
		int num1 = 7;
		int num2 = 10;

		if (isEven(num2)) {
			System.out.println(num2 + " は偶数です。");
		} else {
			System.out.println(num2 + " は奇数です。");
		}

		if (isEven(num1)) {
			System.out.println(num1 + " は偶数です。");
		} else {
			System.out.println(num1 + " は奇数です。");
		}

		// Q4
		Greeting greeting = new Greeting();
		greeting.sayHello();

		// Q5
		Animal animal = new Animal();
		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);

		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}

	// Q1
	public static void helloWorld() {
		System.out.println("Hello, World!");
	}

	// Q2
	public static int doubleValue(int num) {
		return num * 2;
	}

	// Q3
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
