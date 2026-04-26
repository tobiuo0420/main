package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();

		// Player作成
		System.out.print("プレイヤー名を入力：");
		String playerName = scanner.nextLine();

		int hp = rand.nextInt(50) + 50; // 50〜99
		int at = rand.nextInt(10) + 10; // 10〜19
		int sp = rand.nextInt(10) + 5; // 5〜14

		Character player = new Character(playerName, hp, at, sp);

		// Daemon読み込み
		Character daemon = loadDaemon("daemon_status.txt");

		// 先攻決定
		Character first;
		Character second;

		if (player.sp > daemon.sp) {
			first = player;
			second = daemon;
		} else if (player.sp < daemon.sp) {
			first = daemon;
			second = player;
		} else {
			if (rand.nextBoolean()) {
				first = player;
				second = daemon;
			} else {
				first = daemon;
				second = player;
			}
		}

		System.out.println("先攻は " + first.name);

		// バトル開始
		StringBuilder log = new StringBuilder();
		log.append("=== バトル開始 ===\n");

		while (player.isAlive() && daemon.isAlive()) {

			first.attack(second);
			log.append(first.name + " → " + second.name + " HP:" + second.hp + "\n");

			if (!second.isAlive())
				break;

			second.attack(first);
			log.append(second.name + " → " + first.name + " HP:" + first.hp + "\n");
		}

		// 勝敗判定
		String result;
		if (player.isAlive()) {
			result = "Playerの勝利！";
		} else {
			result = "Daemonの勝利！";
		}

		System.out.println(result);
		log.append(result);

		// ファイル出力
		try (FileWriter fw = new FileWriter("battle_log.txt")) {
			fw.write(log.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		scanner.close();
	}

	// Daemon読み込みメソッド
	public static Character loadDaemon(String fileName) {
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String name = br.readLine();
			int hp = Integer.parseInt(br.readLine());
			int at = Integer.parseInt(br.readLine());
			int sp = Integer.parseInt(br.readLine());

			return new Character(name, hp, at, sp);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}