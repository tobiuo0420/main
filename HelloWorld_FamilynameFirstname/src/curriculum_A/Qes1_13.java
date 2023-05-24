package curriculum_A;

public class Qes1_13 {

   public static void main(String[] args) {

	// バイト型（byte） 1,2,3
	byte b = 10;
	System.out.println("バイト型：" + b);

	// 短整数型（short）
	short s = 100;
	System.out.println("短整数型：" + s);

	// 整数型（int）
	int i = 1000;
	System.out.println("整数型：" + i);

	// 長整数型（long）
	long l = 10000L;
	System.out.println("長整数型：" + l);

	// 単精度浮動小数点数型（float）
	float f = 9.5f;
	System.out.println("単精度浮動小数点数型：" + f);

	// 倍精度浮動小数点数型（double）
	double d = 10.5d;
	System.out.println("倍精度浮動小数点数型：" + d);

	// 文字型（char）
	char c = 'a';
	System.out.println("文字型：" + c);

	// 文字列型（String）
	String str = "ハロー";
	System.out.println("文字列型：" + str);

	// ブーリアン型（boolean）
	boolean bool = true;
	System.out.println("ブーリアン型：" + bool);

	//4
	System.out.println(b + s + i + l);
	System.out.println(f + d);
	System.out.println(c + str + bool);
	System.out.println(b + s + i + l + f + d);
	System.out.println(b * s * i * l);
	System.out.println(d / s);
	System.out.println(b - s);

	//5
	String num = "20";
	int num1 = 23;
	System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));

	//6
	String info = "山田太郎 18歳 170.5cm 62.2kg 寿司";
	String[] splitInfo = info.split(" ");

	String name = splitInfo[0];
	int age = Integer.parseInt(splitInfo[1].replace("歳", ""));
	double height = Double.parseDouble(splitInfo[2].replace("cm", ""));
	double weight = Double.parseDouble(splitInfo[3].replace("kg", ""));
	String food = splitInfo[4];

	System.out.println(String.format("初めまして%sです", name));
	System.out.println(String.format("年齢は%d歳です", age));
	System.out.println(String.format("身長は%.1fcmです", height));
	System.out.println(String.format("体重は%.1fkgです", weight));
	System.out.println(String.format("好きな食べ物は%sです", food));

	//7
	double heightInMeter = height / 100.0;
	double bmi = weight / (heightInMeter * heightInMeter);
    System.out.println(String.format("BMIは%.1fです", bmi));

	//8
	String name2 = "鈴木一郎";
	int age2 = 24;
	double height2 = 168.5;
	double weight2 = 64.2;
	String favoriteFood = "オムライス";
	double BMI = weight2 / Math.pow(height2 / 100, 2);

	System.out.println("初めまして" + name2 + "です");
	System.out.println("年齢は" + age2 + "歳です");
	System.out.println("身長は" + height2 + "cmです");
	System.out.println("体重は" + weight2 + "kgです");
	System.out.println("好きな食べ物は" + favoriteFood + "です");
	System.out.println("BMIは" + String.format("%.2f", BMI) + "です");

	//9 
	String name21 = "鈴木一郎";
	int age21 = 48;
	double height21 = 337.0;
	double weight21 = 128.4;
	String favoriteFood1 = "オムライス";
	double BMI1 = weight21 / Math.pow(height21 / 100, 2);

	System.out.println("初めまして" + name21 + "です");
	System.out.println("年齢は" + age21 + "歳です");
	System.out.println("身長は" + String.format("%.1f", height21) + "cmです");
	System.out.println("体重は" + String.format("%.1f", weight21) + "kgです");
	System.out.println("好きな食べ物は" + favoriteFood1 + "です");
	System.out.println("BMIは" + String.format("%.2f", BMI1) + "です");

	//10
	int age211 = 33;
	System.out.println(age211 >= 25);

	//11
	String ageStr = String.valueOf(age2);
	String heightStr = String.valueOf(height2);
	String weightStr = String.valueOf(weight2);

	System.out.println("年齢は" + age2 + "歳です");
	System.out.println("身長は" + height2 + "cmです");
	System.out.println("体重は" + weight2 + "kgです");

	//12
	System.out.println("年齢は" + age2 + "歳です");
	System.out.println("身長は" + height2 + "cmです");

	//13
	boolean result = ((age2 == 25 ? 1 : 0) | (height2 >= 160 ? 1 : 0)) == 1;
	System.out.println(result);
			

		}



}
