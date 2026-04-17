package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
	/* Q1 各型に変数を宣言し、初期値を設定してください。*/
	
	/* byte 変数byteNumの初期値を設定*/
	byte byteNum = 10;
	
	/*short 変数shortNumの初期値を設定 */
	short shortNum = 22;
	
	/*int 変数intNumの初期値を設定*/
	int intNum = 25;
	
	/*long 変数longNumの初期値を設定*/
	long longNum = 6L;
	
	/*float 変数floatNumの初期値を設定*/
	float floatNum = 3.9f;
	
	/*double 変数doubleNumの初期値を設定*/
	double doubleNum = 9.7;
	
	/*char 変数letterの初期値を設定*/
	char letter = 'B';
	
	/*String 変数lettersの初期値を設定*/
	String letters = "apple";
	
	/*boolean 変数isBooleanの初期値を設定*/
	boolean isBoolean = false;
	
	
	/* Q2 1で宣言した各型の変数に指定された値を代入してください*/
	
	/*変数byteNumに10を代入*/
	byteNum = 10;
	
	/*変数shortNumに100を代入*/
	shortNum = 100;
	
	/*変数intNumに1000を代入*/
	intNum = 1000;
	
	/*変数longNumに10000を代入*/
	longNum = 10000;
	
	/*変数floatNumに9.5fを代入*/
	floatNum = 9.5f;
	
	/*変数doubleNumに10.5を代入*/
	doubleNum = 10.5;
	
	/*変数letterに"a"を代入*/
	letter = 'a';
	
	/*変数lettersに"ハロー"を代入*/
	letters = "ハロー";
	
	/*変数isBooleanにtrueを代入*/
	isBoolean = true;
	
	/* Q3 値を代入した変数を用いて出力をしてください*/
	
	/*11110を出力*/
	System.out.println(longNum + intNum + shortNum + byteNum); 
	
	/*20を出力*/
	System.out.println(byteNum + byteNum); 
    
	/*a ハロー trueを出力*/
    System.out.println(letter + " " + letters + " " + isBoolean);
    
	/*数字を全て足して出力*/
    System.out.println((int)(byteNum + shortNum + intNum + longNum + floatNum + doubleNum));
    
	/*小数点以外の数字を全てかけて出力*/
    System.out.println(byteNum * shortNum * intNum * longNum);
    
	/*割る100をして出力*/
    System.out.println(doubleNum / shortNum);

    /*10引く100をして出力 */
    System.out.println(byteNum - shortNum);
	
	
	/* Q4 nameというString型の変数を宣言し*/
    String name;
	
	/*その変数に "山田太郎"という値を代入してください*/
    name = "山田太郎";
    
	/*name変数を使用してコンソールに こんにちは、山田太郎さん！と表示してください。*/
    System.out.println("こんにちは、" + name + "さん！");
	
	
	/* Q5 ageというint型の変数を宣言し*/
    int age;
	
	/*その変数に25を代入してください。*/
	age = 25;
    
	/*age変数を使用してコンソールに  年齢: 25歳 という表示してください。*/
	System.out.println("年齢: " + age + "歳");
	
	
	/* Q6 num1というint型の変数を宣言し、10を代入*/
	int num1 = 10;
	
	/*num2というint型の変数を宣言し、5を代入*/
	int num2 = 5;
	
	/*num1 と num2 を足した結果を sum という変数に代入し、コンソールに表示してください。*/
	int sum = num1 + num2;
	System.out.println(sum);

	
	/* Q7 scoreというint型の変数を宣言し、80を代入*/
	int score = 80;
	
	/*scoreに20を加えて、更新する*/
	score = score + 20;
	
	/*最終スコア: 100をscoreを使用してコンソールに表示してください。*/
	System.out.println("最終スコア: " + score);
	
	
	/* Q8 priceというdouble型の変数を宣言し、99.99 を代入*/
	double price = 99.99;
	
	/*priceをint型に変換し、整数価格: 99とコンソールに表示してください。*/
	int intPrice = (int)price;
	System.out.println("整数価格: " + intPrice);
	
	
	/* Q9 String型の変数numStrに"123"を代入*/
	String numStr = "123";
	
	/*numStrをint型に変換し、*/
	int um = Integer.parseInt(numStr);
	
	/*変換後の値:の後ろにnumStr + 10 した結果をコンソールに表示してください*/
	System.out.println("変換後の値: " + (um + 10));
	
	
	/* Q10 int型の変数numに 50を代入*/
	int num = 50;
	
	/*numをString型に変換し、"得点: 50点"の形で表示*/
	String str = String.valueOf(num);
	System.out.println("得点: " + str + "点");
	
	
	/* Q11 次の条件を満たすプログラムを条件演算子を使用して作成してください。*/
	
	/*int型の変数 aに 10を代入*/
	int a = 10;
	
	/*int型の変数 bに 20を代入*/
	int b = 20;
	
	/*a が b より小さいかどうかをboolean変数resultに代入*/
	boolean result = (a < b) ? true : false;
	
	/*resultの値を表示*/
	System.out.println(result);
	
	
	/* Q12 条件演算子（三項演算子）を使用してください。*/
	
	/*int型の変数 x に15を代入*/
	int x = 15;
	
	/*x が 10 以上なら "OK"、そうでなければ "NG" を表示*/
	String result2 = (x >= 10) ? "OK" : "NG";
	System.out.println(result2);
	
	
	/* Q13 String text = "私はJavaが好きです。Javaは楽しい！";という*/
	/*文章の中にある 「Java」 を 「Python」 に置き換えて表示させてください*/
	String text = "私はJavaが好きです。Javaは楽しい！";

	/*Java → Python に置き換え*/
	String resultText = text.replace("Java", "Python");

	/*表示*/
	System.out.println(resultText);
	
	}

}