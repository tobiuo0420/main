package curriculum.c;

import java.util.Scanner;

public class Player {

	// ユーザーのじゃんけんの手を取得
	public int getHand() {

		// Scannerを作成
		Scanner scanner = new Scanner(System.in);

		// 入力案内を表示
		System.out.print("グー(0), チョキ(1), パー(2) を入力: ");

		// ユーザーが入力した値を取得
		int hand = scanner.nextInt();

		// 入力された手を呼び出し元に返す
		return hand;
	}
}