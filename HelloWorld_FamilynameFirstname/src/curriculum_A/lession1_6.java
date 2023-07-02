package curriculum_A;

public class lession1_6 {

	// Animalクラス作成
	static class Animal {
		String name;

		// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
		public Animal(String name) {
			this.name = name;
		}

		// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		public Animal(int count) {
			this.name = "動物";

		}
	}

	public static void main(String[] args) {

		// Q1：フィールドに動物の名前の変数を定義してください。

		String animalName;

		// 犬を代入する変数 animalName を定義
		animalName = "犬";

		// Q2：フィールドに動物の数の変数を定義してください。
		int animalCount;

		// 動物の数を表す変数 animalCount を定義
		animalCount = 3;

	}
}