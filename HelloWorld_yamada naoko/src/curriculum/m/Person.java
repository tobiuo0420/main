package curriculum.m;

class Person {

	// 問題1：インスタンスフィールド
	String name;
	int age;
	double height;
	double weight;

	// 問題10：人数をカウント
	static int count = 0;

	// 問題2,3,4：コンストラクタ
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		count++; // 人数をカウント
	}

	// 問題6,7：BMIメソッド
	double bmi() {
		return this.weight / (this.height * this.height);
	}

	// 問題8,9,10：表示メソッド
	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
		System.out.println("合計" + count + "人です");
	}
}