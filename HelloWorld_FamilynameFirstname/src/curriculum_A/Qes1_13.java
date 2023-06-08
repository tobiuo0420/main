package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//1,バイト型（byte）,短整数型（short）,整数型（int）,長整数型（long）
		//単精度浮動小数点数型（float）,倍精度浮動小数点数型（double）
		//文字型（char）,文字列型（String）,ブーリアン型（boolean)

		// バイト型宣言
		byte ten;

		// 短整数型宣言
		short onehundred;

		// 整数型宣言
		int onethousand;

		// 長整数型宣言
		long tenthousand;

		// 単精度浮動小数点数型宣言
		float f;

		// 倍精度浮動小数点数型宣言
		double d;

		// 文字型宣言
		char c;

		// 文字列型宣言
		String str;

		// ブーリアン型宣言
		boolean bool;

		
		//2,それぞれのローカル変数をローカル内でそれぞれの初期値を代入し、
		//初期化してください

		// バイト型
		ten = 0; // 初期化

		// 短整数型
		onehundred = 0; // 初期化

		// 整数型
		onethousand = 0; // 初期化

		// 長整数型
		tenthousand = 0L; // 初期化

		// 単精度浮動小数点数型
		f = 0.0f; // 初期化

		// 倍精度浮動小数点数型
		d = 0.0d; // 初期化

		// 文字型
		c = '\u0000'; // 初期化

		// 文字列型
		str = null; // 初期化

		// ブーリアン型
		bool = false; // 初期化

		
		//3,初期化をしたそれぞれの変数に下記の値を代入してください

		System.out.println("問3");
		
		// 10を代入
		ten = 10; 

		// 変数値を表示
		System.out.println("バイト型：" + ten);
		
		// 100を代入
		onehundred = 100; 

		// 変数値を表示
		System.out.println("短整数型：" + onehundred);
		
		// 1000を代入
		onethousand = 1000;

		// 変数値を表示
		System.out.println("整数型：" + onethousand);
		
		// 10000Lを代入
		tenthousand = 10000L;

		// 変数値を表示
		System.out.println("長整数型：" + tenthousand);
		
		// 9,5を代入
		f = 9.5f;

		// 変数の値を表示
		System.out.println("単精度浮動小数点数型：" + f);
		
		// 10,5を代入
		d = 10.5d;

		// 変数の値を表示
		System.out.println("倍精度浮動小数点数型：" + d);
		
		// aを代入
		c = 'a';

		// 変数値を表示
		System.out.println("文字型：" + c);
		
		// ハローを代入
		str = "ハロー";

		// 変数値を表示
		System.out.println("文字列型：" + str);
		
		// trueを代入
		bool = true;

		// 変数値を表示
		System.out.println("ブーリアン型：" + bool + "\n");

		
		//4,下記の通りにコンソール出力されるようにしてください
		//上記で作成した変数を必ず使用すること

		System.out.println("問4");

		// 10足す100足す1000足す10000
		System.out.println(ten + onehundred + onethousand 
	                       + tenthousand);

		// 9.5足す10.5
		System.out.println(f + d);

		// 文字並べ
		System.out.println(c + " " + str + " " + bool);

		// 数字を全て足す
		System.out.println(ten + onehundred + onethousand
		                   + tenthousand + f + d);

		// 少数点以外の数字を全てかける
		System.out.println(ten * onehundred * onethousand
		                   * tenthousand);

		// 10.5割る100
		System.out.println(d / onehundred);

		// 10引く100
		System.out.println(ten - onehundred + "\n");

	
		//5,次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、
		//意図通りに動きません。正しく動作するように修正してください。

		System.out.println("問5");

		// 変数に20の値を代入
		String num = "20";

		// 変数に23を代入
		int num1 = 23;

		// 変数の値を整数型に変換、num1と足した値を出力
		System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1 + "\n"));

	
		//6,『』で囲われた人の情報を変数にして、
		//formatの通りコンソールに出力してください
		//ローカル変数に代入し○○に入れてください

		System.out.println("問6");

		// 名前
		String name = "山田太郎";

		// 年齢
		int age = 18;

		// 身長
		double height = 170.5;

		// 体重
		double weight = 62.2;

		// 好きな食べ物
		String food = "寿司";

	
		// 名前を出力
		System.out.println("初めまして" + name + "です");

		// 年齢を出力
		System.out.println("年齢は" + age + "歳です");

		// 身長を出力
		System.out.println("身長は" + height + "cmです");

		// 体重を出力
		System.out.println("体重は" + weight + "kgです");

		// 好きな食べ物を出力
		System.out.println("好きな食べ物は" + food + "です" + "\n");

	
		//7,6で作成した自己紹介に続いてBMIが出力されるようにしてください
		//ただし計算は数値を直書きせず、全て変数を使ってすること

		System.out.println("問7");

		// BMIを計算
		double heightInMeter = height / 100.0;
		double bmi = weight /(heightInMeter * heightInMeter);

	
		// BMIを出力
		System.out.println(String.format("BMIは%.1fです\n", bmi));

	
		//8,6で宣言した変数に再代入し下記の通りコンソールに出力してください

		System.out.println("問8");

		// 名前
		name = "鈴木一郎";

		// 年齢
		age = 24;

		// 身長
		height = 168.5;

		// 体重
		weight = 64.2;

		// 好きな食べ物
		food = "オムライス";

		// BMI
		bmi = 22.6;

	
		// 名前を出力
		System.out.println("初めまして" + name + "です");

		// 年齢を出力
		System.out.println("年齢は" + age + "歳です");

		// 身長を出力
		System.out.println("身長は" + height + "cmです");

		// 体重を出力
		System.out.println("体重は" + weight + "kgです");

		// 好きな食べ物を出力
		System.out.println("好きな食べ物は" + food + "です");

		// BMIを出力
		System.out.println("BMIは" + bmi + "です" + "\n");

	
		//9,8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、
		//下記の通りコンソールに出力してください			

		System.out.println("問9");

		// 年齢
		age = age + 24;

		// 身長
		height = height + 168.5;

		// 体重
		weight = weight + 64.2;

		// BMI
		bmi = weight /((height / 100) * (height / 100));

	
		// 名前を出力
		System.out.println("初めまして" + name + "です");

		// 年齢を出力
		System.out.println("年齢は" + age + "歳です");

		// 身長を出力
		System.out.println("身長は" + String.format("%.1f", height) + "cmです");

		// 体重を出力
		System.out.println("体重は" + String.format("%.1f", weight) + "kgです");

		// 好きな食べ物を出力
		System.out.println("好きな食べ物は" + food + "です");

		// BMIを出力
		System.out.println("BMIは" + String.format("%.2f", bmi) + "です" + "\n");

	
		//10,8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。
		//ただしif文は使いません

		System.out.println("問10");

		// 年齢を変数に代入
		age = 24;

		// 年齢が25歳以上かどうかを判断
		System.out.println(age >= 25 ? "true\n" : "false\n");

	
		//11,8で使用した【年齢・身長・体重】を
		//文字列型に型変換し繋げて出力してください

		System.out.println("問11");

		// 問題８の身長
		height = 168.5;

		// 問題８の体重
		weight = 64.2;

		// ageを文字列型に変換
		String ageStr = String.valueOf(age);

		// heightを文字列型に変換
		String heightStr = String.valueOf(height);

		// weightを文字列型に変換
		String weightStr = String.valueOf(weight);

		// 繋げて出力
		String result = "年齢は" + ageStr + "歳です。" + " " +
		                "身長は" + heightStr + "cmです。" + " " +
		                "体重は" + weightStr + "kgです。";

		// 結果を出力
		System.out.println(result + "\n");

	
		//12,11で変換した【年齢・身長】を整数型に変換して出力してください

		System.out.println("問12");

		// 年齢をint型に変換
		int ageInt = Integer.parseInt(ageStr);

		// 身長をDouble型に変換(小数点変換)
		double heightDouble = Double.parseDouble(heightStr);

	
		// 年齢を出力
		System.out.println("年齢は" + ageInt + "歳です。");

		// 身長を出力
		System.out.println("身長は" + heightDouble + "cmです。" + "\n");

	
		//13,12で変換した【年齢・身長】で
		//【年齢が25もしくは身長が160以上】であればtrueを出力してください
		//ただしif文は使わないでください

		System.out.println("問13");

		// 年齢が25際、または身長が160cm以上の場合
		boolean isConditionTrue =(ageInt == 25)||(heightDouble >= 160);

		// result2の値を出力
		System.out.println(result + "\n");
	}
}