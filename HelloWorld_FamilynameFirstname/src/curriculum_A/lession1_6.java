package curriculum_A;

public class lession1_6 {

	// Animalクラス作成
	static class Animal {
		String name;

		public Animal(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {

		// Q1：フィールドに動物の名前の変数を定義してください。


		// 犬を代入する変数 animalName を定義
		String animalName = "犬";


		// Q2：フィールドに動物の数の変数を定義してください。


		// 動物の数を表す変数 animalCount を定義
		int animalCount = 3;


		// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。


		// 犬を引数として持つ Animal オブジェクト dog を作成
		Animal dog = new Animal("犬");


		// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。


		// 引数を持つ Animal オブジェクトを作成し、animalCount2 に代入
		int animalCount2 = 3;

	}
}