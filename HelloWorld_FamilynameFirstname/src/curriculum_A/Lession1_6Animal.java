package curriculum_A;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Lession1_6Animal {

	// Dogクラスの定義
	static class Dog {
		String name = "ポチ";
		static int count = 0;

		public Dog() {
			count++;
		}
	}

	public static void main(String[] args) {

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		System.out.println("問1");

		// インスタンスを生成し、名前を出力
		Dog dog = new Dog();

		// 動物の名前をコンソールに出力
		System.out.println(dog.name + "\n");


		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		System.out.println("問2");

		// インスタンスを生成し、犬の数を出力
		Dog dog1 = new Dog();

		Dog dog2 = new Dog();

		// 動物の数をコンソールに出力
		System.out.println(Dog.count + "\n");

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください。

		System.out.println("問3");


		// Calendarクラスのオブジェクトを生成
		Calendar cl = Calendar.getInstance();

		// SimpleDateFormatクラスでフォーマットパターンを設定
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// 現在の日時を指定されたフォーマットで取得、
		// コンソールに出力
		System.out.println(sdf.format(cl.getTime()));

		// DateTimeFormatterクラスのオブジェクトを生成
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		// String型の日付からLocalDateTimeクラスのオブジェクトを生成
		String strDate = "2017/04/10 10:00:00";

		LocalDateTime ld = LocalDateTime.parse(strDate, dtf);

		// 指定されたフォーマットで日時を取得してコンソールに出力
		System.out.println(ld.format(dtf).toString());

	}
}