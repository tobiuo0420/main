package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//1,バイト型（byte）,短整数型（short）,整数型（int）,長整数型（long）			
		//単精度浮動小数点数型（float）,倍精度浮動小数点数型（double）			
		//文字型（char）,文字列型（String）,ブーリアン型（boolean）			
		
		
		byte ten; // バイト型（byte）宣言
		
		short onehundred; // 短整数型（short）宣言
		
		int onethousand; // 整数型（int）宣言
		
		long tenthousand; // 長整数型（long）宣言
		
		float f; // 単精度浮動小数点数型（float）宣言
		
		double d; // 倍精度浮動小数点数型（double）宣言
		
		char c; // 文字型（char）宣言
		
		String str; // 文字列型（String）宣言
		
		boolean bool; // ブーリアン型（boolean)宣言
		
		
		//2,それぞれのローカル変数をローカル内でそれぞれの初期値を代入し、
		//初期化してください			

		
		// バイト型（byte） 
		ten = 0; // 初期化

		// 短整数型（short）
		onehundred = 0; // 初期化

		// 整数型（int）
		onethousand = 0; // 初期化

		// 長整数型（long）
		tenthousand = 0L; // 初期化
		
		// 単精度浮動小数点数型（float）
		f = 0.0f; // 初期化

		// 倍精度浮動小数点数型（double）
		d = 0.0d; // 初期化
		
		// 文字型（char）
		c = '\u0000'; // 初期化
		
		// 文字列型（String）
		str = null; // 初期化

		// ブーリアン型（boolean）
		bool = false; // 初期化

		//3,初期化をしたそれぞれの変数に下記の値を代入してください			

		
		System.out.println("問3");
		
		
		// バイト型（byte）
		ten = 10;   // tenに10を代入
		
		System.out.println("バイト型：" + ten); 
		// 変数tenの値を表示(バイト型;10)

		
		// 短整数型（short）
		onehundred = 100;  // onehundredに100を代入
		
		System.out.println("短整数型：" + onehundred); 
		// 変数onehundredの値を表示(短整数型:100)

		
		// 整数型（int）
		onethousand = 1000;  // onethousandに1000を代入
		
		System.out.println("整数型：" + onethousand); 
		// 変数onethousandの値を表示(整数型:1000)

		
		// 長整数型（long）
		tenthousand = 10000L;  // tenthousandに10000Lを代入
		
		System.out.println("長整数型：" + tenthousand); 
		// 変数tenthousandの値を表示(長整数型:10000)

		
		// 単精度浮動小数点数型（float）
		f = 9.5f;  // fに9,5を代入
		
		System.out.println("単精度浮動小数点数型：" + f); 
		// 変数fの値を表示(単精度浮動小数点数型:9.5)

		
		// 倍精度浮動小数点数型（double）
		d = 10.5d;  // dに10,5を代入
		
		System.out.println("倍精度浮動小数点数型：" + d); 
		// 変数dの値を表示(倍精度浮動小数点数型:10.5)

		
		// 文字型（char）
		c = 'a';  // cにaを代入
		
		System.out.println("文字型：" + c); 
		// 変数cの値を表示(文字型:a)

		
		// 文字列型（String）
		str = "ハロー";  // strにハローを代入
		
		System.out.println("文字列型：" + str); 
		// 変数strの値を表示(文字列型:ハロー)

		
		// ブーリアン型（boolean）
		bool = true;  // boolにtrueを代入
		
		System.out.println("ブーリアン型：" + bool); 
		// 変数boolの値を表示(ブーリアン型:true)

		
		String br = System.getProperty("line.separator");
		System.out.println(br); // 改行コード
		
		
		//4,下記の通りにコンソール出力されるようにしてください			
		//上記で作成した変数を必ず使用すること	
		
		
		System.out.println("問4");

		
		System.out.println(ten + onehundred + onethousand 
				           + tenthousand); // 10足す100足す1000足す10000
		
		System.out.println(f + d); 
		// 9.5足す10.5
		
		
		System.out.println(c + " " + str + " " + bool); 
		// 文字並べ
		
		
		System.out.println(ten + onehundred + onethousand 
				           + tenthousand + f + d); // 数字を全て足す
		
		System.out.println(ten * onehundred * onethousand 
				           * tenthousand); // 少数点以外の数字を全てかける
		
		System.out.println(d / onehundred); 
		// 10.5割る100
		
		
		System.out.println(ten - onehundred); // 10引く100
		
		
		String br = System.getProperty("line.separator");
		System.out.println(br); // 改行コード

		
		//5,次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。			
		//「ハローJAVA43」と表示とさせたいのですが、
		//意図通りに動きません。正しく動作するように修正してください。
		
		
		System.out.println("問5");
		
		
		String num = "20";  // 変数numに20の値を代入
		
		int num1 = 23; // 変数num1に23を代入 
		
		System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1)); 
		// 変数numの値を整数型に変換、num1と足した値を出力

		
		String br = System.getProperty("line.separator");
		System.out.println(br); // 改行コード
		
		
		//6,『』で囲われた人の情報を変数にして、
		//formatの通りコンソールに出力してください			
		//ローカル変数に代入し○○に入れてください			

		
		System.out.println("問6");
		
		
		String name = "山田太郎"; // 名前
		  
		int age = 18; // 年齢
		  
		double height = 170.5; // 身長
		  
		double weight = 62.2; // 体重
		  
		String food = "寿司"; // 好きな食べ物
		  
		double BMI = weight / Math.pow(height / 100, 2); // BMI

		
		System.out.println
		("初めまして" + name + "です"); // 名前を出力
		  
		System.out.println
		("年齢は" + age + "歳です"); // 年齢を出力
		  
		System.out.println
		("身長は" + height + "cmです"); // 身長を出力
		  
		System.out.println
		("体重は" + weight + "kgです"); // 体重を出力
		  
		System.out.println
		("好きな食べ物は" + food + "です"); // 好きな食べ物を出力
		  
			
		String br = System.getProperty("line.separator");
		System.out.println(br); // 改行コード
		
		
		//7,6で作成した自己紹介に続いてBMIが出力されるようにしてください			
		//ただし計算は数値を直書きせず、全て変数を使ってすること			

		
		System.out.println("問7");
		
		
		double heightInMeter = 
				height / 100.0; // 身長を入力
		
		double bmi = weight 
				/ (heightInMeter * heightInMeter); // 体重を入力
		
		System.out.println
		(String.format("BMIは%.1fです", bmi)); // BMIを出力

		
		String br = System.getProperty("line.separator");
		System.out.println(br); // 改行コード
		
		//8,6で宣言した変数に再代入し下記の通りコンソールに出力してください			

		
		System.out.println("問8");
		
		
		name = "鈴木一郎"; // 名前
		
		age = 24; // 年齢
		
		height = 168.5; // 身長
		
		weight = 64.2; // 体重
		
		food = "オムライス"; // 好きな食べ物
		
		double BMI2 = weight 
				/ Math.pow(height / 100, 2); // BMI

		
		System.out.println
		("初めまして" + name + "です"); // 名前を出力
		
		System.out.println
		("年齢は" + age + "歳です"); // 年齢を出力
		
		System.out.println
		("身長は" + height + "cmです"); // 身長を出力
		
		System.out.println
		("体重は" + weight + "kgです"); // 体重を出力
		
		System.out.println
		("好きな食べ物は" + food + "です"); // 好きな食べ物を出力
		
		System.out.println
		("BMIは" + String.format("%.2f", BMI2) + "です"); // BMIを出力

		
		String br = System.getProperty("line.separator");
		System.out.println(br); // 改行コード
		
		//9,8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、
		//下記の通りコンソールに出力してください			
        
		
		System.out.println("問9");
		
		
		age = age + 24; // 年齢
		
		height = height + 168.5; // 身長
		
		weight = weight + 64.2; // 体重
		
		BMI = weight 
				/ Math.pow(height / 100, 2); // BMI
		
		
		System.out.println
		("初めまして" + name + "です"); // 名前を出力
		
		System.out.println
		("年齢は" + age + "歳です"); // 年齢を出力
		
		System.out.println
		("身長は" + String.format("%.1f", height) + "cmです"); // 身長を出力
		
		System.out.println
		("体重は" + String.format("%.1f", weight) + "kgです"); // 体重を出力
		
		System.out.println
		("好きな食べ物は" + food + "です"); // 好きな食べ物を出力
		
		System.out.println
		("BMIは" + String.format("%.2f", BMI) + "です"); // BMIを出力

		
		String br = System.getProperty("line.separator");
		System.out.println(br); // 改行コード
		
		
		//10,8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません			

		
		System.out.println("問10");
		
		
		age = 24; // 年齢を変数に代入
		
		System.out.println(age >= 25); // 年齢が25歳以上かどうかを判断

		
		String br = System.getProperty("line.separator");
		System.out.println(br); // 改行コード
		
		
		//11,8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください			
        
		
		System.out.println("問11");
		
        
		height = 168.5; // 問題８の身長
        
		weight = 64.2; // 問題８の体重
		
		String ageStr =
				String.valueOf(age); // ageを文字列型に変換
		
		String heightStr =
				String.valueOf(height); // heightを文字列型に変換
		
		String weightStr =
				String.valueOf(weight); // weightを文字列型に変換
		
		
		String result ="年齢は" + ageStr +  "歳です。" + " " + 
		               "身長は" + heightStr + "cmです。" +  " " + 
				       "体重は" + weightStr + "kgです。"; // 繋げて出力
		
		System.out.println(result); // 結果を出力

		
		String br = System.getProperty("line.separator");
		System.out.println(br); // 改行コード
		
		
		//12,11で変換した【年齢・身長】を整数型に変換して出力してください			

		
		System.out.println("問12");
		
		int ageInt =
				Integer.parseInt(ageStr); // 年齢をint型に変換
		
		double heightDouble =
				Double.parseDouble(heightStr); // 身長をint型に変換
		
		
		System.out.println
		("年齢は" + ageInt + "歳です。"); // 年齢を出力
		
		
		System.out.println
		("身長は" + heightDouble + "cmです。"); // 身長を出力

		
		String br = System.getProperty("line.separator");
		System.out.println(br); // 改行コード
		
		
		//13,12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください			
		//ただしif文は使わないでください			

		
		System.out.println("問13");
		
		
		boolean result2 = ((age == 25) ||
				(height >= 160)); // 年齢が25際、または身長が160cm以上の場合
		
		System.out.println(result2); // result2にtrueを代入
		\r\n;
		
		
	}

}
