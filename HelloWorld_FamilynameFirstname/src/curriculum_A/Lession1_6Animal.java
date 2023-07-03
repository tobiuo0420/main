package curriculum_A;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lession1_6Animal {
	 static class Animal {
	        String name;
	        static int count = 0;

	        public Animal(String name) {
	            this.name = name;
	            count++;
	        }
	    }

	public static void main(String[] args) {
		// Q1：Animalクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		System.out.println("問1");

		// インスタンスを生成し、名前を出力
		Animal animal1 = new Animal("犬");

		// 動物の名前をコンソールに出力
		System.out.println(animal1.name + "\n");

		// Q2：Animalクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		System.out.println("問2");

		// インスタンスを生成し、動物の数を出力
		Animal animal2 = new Animal("猫");

		// 動物の数をコンソールに出力
		System.out.println(Animal.count + "\n");

		// Q3：現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください。
		System.out.println("問3");

		// Calendarクラスのオブジェクトを生成
		Calendar calendar = Calendar.getInstance();

		// SimpleDateFormatクラスでフォーマットパターンを設定
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// 現在の日時を指定されたフォーマットで取得、コンソールに出力
		System.out.println(sdf.format(calendar.getTime()));
	}
}