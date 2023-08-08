package leesion_java32;

public class Person {
	public String name;
	public int age;
	public double height;
	public double weight;
	// 問題1：クラスフィールド「count」を定義してください（
	// 初期値：0, データ型：int）
	public static int count = 0;

	// コンストラクタ
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// 問題2：Personコンストラクタの中で
		// クラスフィールドcountに1を足してください
		count++;
	}

	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}

	// クラスメソッド
	// 問題4：クラスメソッド「printCount」を定義してください
	// （データ型：void）
	public static void printCount() {
		// 問題5：クラスメソッドの中にクラスフィールド「count」を用いて
		// 「合計〇〇人です」と出力してください
		System.out.println("合計" + count + "人です");
	}
}