package leesion_java32;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();

		// 問題3：Main.javaで System.out.printlnを使い
		//「合計〇〇人です」と出力してください。〇〇はcountの値です。
		System.out.print("");
		Person.printCount();
	}
}