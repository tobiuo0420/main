package leesion_java25;

import java.util.Random;
import java.util.Scanner;

import leesion_java25_2.Person;

public class Main {

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
		
		 Random random = new Random();

		// ステータスをランダムに生成する
        int hp = random.nextInt(1000) + 1;
        int mp = random.nextInt(1000) + 1;
        int attack = random.nextInt(500) + 1;
        int agility = random.nextInt(1000) + 1;
        int defense = random.nextInt(50) + 1;

        // 生成されたステータスを使ってPersonオブジェクトを作成する
        Person person = new Person(name, hp, mp, attack, agility, defense);

        System.out.println("こんにちは「 " + person.getName() + " 」さん");
        System.out.println("ステータス");
        System.out.println("HP: " + person.getHp());
        System.out.println("MP: " + person.getMp());
        System.out.println("攻撃力: " + person.getAttack());
        System.out.println("素早さ: " + person.getAgility());
        System.out.println("防御力: " + person.getDefense());
        System.out.println("\nさあ冒険に出かけよう！");
	}
}