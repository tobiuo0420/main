package leesion_java30;

public class Person {
	 // インスタンスフィールドを定義
    String name;
    int age;
    double height;
    double weight;

    // コンストラクタを定義しインスタンスフィールドに値をセット
    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // インスタンスメソッド「bmi」を定義
    public double bmi() {
        // BMIの計算式は体重（kg） / 身長（m）の2乗
        return weight / (height * height);
    }

    // インスタンスメソッド「print」を定義
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "才です");
        System.out.printf("BMIは%.1fです%n", bmi());
    }
}