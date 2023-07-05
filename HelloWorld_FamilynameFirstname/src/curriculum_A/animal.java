package curriculum_A;

public class animal {

	String name;
	static int count = 0;

	public animal(String name) {
		this.name = name;
		count++;
	}

	public animal(int count) {
		this.name = "犬";
		this.count = count;
	}

	public static void main(String[] args) {
		// Q1：フィールドに動物の名前の変数を定義してください。
		String animalName;

		// Q2：フィールドに動物の数の変数を定義してください。
		int animalCount;

		// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
		animal animal1 = new animal("犬");
		System.out.println(animal1.name);

		// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		animal animal2 = new animal(5);
		System.out.println(animal.count);
	}
}