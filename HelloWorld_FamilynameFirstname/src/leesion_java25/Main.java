package leesion_java25;

import java.util.Scanner;

import leesion_java25_2.Person;

public class Main extends Person {

	public Main(String name, int hp, int mp, int attack, int agility, int defense) {
		super(name, hp, mp, attack, agility, defense);
	}

	public static void main(String[] args) {

		/*

		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください

			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24

			さあ冒険に出かけよう！

		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("名前を入力して下さい: ");
		String name = scanner.nextLine();

		scanner.close();

		// Mainクラスを使用してPersonオブジェクトを作成
		Main main = new Main(name, 849, 862, 375, 937, 24);

		System.out.println("こんにちは 「 " + main.getName() + " 」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + main.getHp());
		System.out.println("MP：" + main.getMp());
		System.out.println("攻撃力：" + main.getAttack());
		System.out.println("素早さ：" + main.getAgility());
		System.out.println("防御力：" + main.getDefense());
		System.out.println("\nさあ冒険に出かけよう！");
	}
}