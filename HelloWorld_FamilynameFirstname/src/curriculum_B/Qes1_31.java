package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_31 {

	public static void main(String[] args) {
		// ログイン時の入力チェックシステムを下記条件で作成してください
		// コンソールにユーザー名を入力できるようにしてください
		// ユーザー名の文字数が10文字より大きい場合
		// 「名前を10文字以内にしてください」と出力してください
		// ユーザー名の文字数が0文字以下もしくはnullの場合
		// 「名前を入力してください」と出力してください
		// ユーザー名が正常な値だった場合
		// 「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください

		// 正しいnameを入力するまでの処理
		Scanner scanner = new Scanner(System.in);

		System.out.print("ユーザー名を入力してください: ");

		String name = scanner.nextLine();

		// 名前の文字数が10を超える場合の処理
		if (name.length() > 10) {

			System.out.println("「名前を10文字以内にしてください」");

			scanner.close();

			return;

		}

		// 名前が空の場合の処理
		else if (name == null || name.isEmpty()) {

			System.out.println("「名前を入力してください」");

			scanner.close();

			return;

		}

		// ユーザー名が半角英数字以外の場合
		// 「半角英数字のみで名前を入力してください」と出力してください

		// ユーザー名が半角英数字以外の場合の処理
		if (!name.matches("[a-zA-Z0-9]+")) {

			System.out.println("「半角英数字のみで名前を入力してください」");

			scanner.close();

			return;

		}

		System.out.println("ユーザー名「" + name + "」を登録しました");

		//じゃんけんのシステムを下記の条件で作成してください
		// 「0はグー、1：チョキ、2：パー」とすること
		// じゃんけんに勝つまでループすること
		// 一回ごとに自分の手と相手の手を下記の通り出力してください
		// ユーザー名「name」を登録しました
		// nameの手は「パー」
		// 相手の手は「グー」

		// 条件分岐の設定
		// 自分がじゃんけんに勝った場合、
		// 下記が出力されるようにしてください
		// やるやん。
		// 次は俺にリベンジさせて

		// 自分がじゃんけんでグーに負けた場合、
		// 下記が出力されるようにしてください
		// 俺の勝ち！
		// 負けは次につながるチャンスです！
		// ネバーギブアップ！

		// 自分がじゃんけんでチョキに負けた場合、
		// 下記が出力されるようにしてください
		// 俺の勝ち！
		// たかがじゃんけん、そう思ってないですか？
		// それやったら次も、俺が勝ちますよ

		// 自分がじゃんけんでパーに負けた場合、
		// 下記が出力されるようにしてください
		// 俺の勝ち！
		// なんで負けたか、明日まで考えといてください。
		// そしたら何かが見えてくるはずです

		// あいこの場合、下記が出力されるようにしてください
		// DRAW あいこ もう一回しましょう！

		// じゃんけんを行った回数を表示してください
		// 勝つまでにかかった合計回数は1回です

		// ユーザー名が正常の場合
		// じゃんけんのシステムが起動するようにしてください

		//じゃんけんのループ
		int totalRounds = 0;

		int winCount = 0;

		while (true) {

			System.out.println(name + "の手は？");

			System.out.println("0: グー, 1: チョキ, 2: パー");

			int playerHand = scanner.nextInt();

			// 相手の手をランダムに選択
			Random random = new Random();

			int enemyHand = random.nextInt(3);

			System.out.println(name + "の手は「" 
					+ handToString(playerHand) + "」");

			System.out.println("相手の手は「" 
					+ handToString(enemyHand) + "」\n");

			if (playerHand == enemyHand) {

				System.out.println("DRAW あいこ もう一回しましょう！\n");

				totalRounds++;

			}

			// 自分がじゃんけんに勝った場合の処理
			else if ((playerHand == 0 && enemyHand == 1) ||

					(playerHand == 1 && enemyHand == 2) ||

					(playerHand == 2 && enemyHand == 0)) {

				System.out.println("やるやん。\n次は俺にリベンジさせて\n\n");

				winCount++;

				totalRounds++;


				break;

			}

			// 自分がじゃんけんで負けた場合の処理
			else {

				System.out.println("俺の勝ち！\n");

				if (playerHand == 0) {

					System.out.println("負けは次につながるチャンスです！\n"
							+ "ネバーギブアップ！\n");

				} else if (playerHand == 1) {

					System.out.println("たかがじゃんけん、そう思ってないですか？\n"
							+ "それやったら次も、俺が勝ちますよ\n");

				} else if (playerHand == 2) {

					System.out.println("なんで負けたか、明日まで考えといてください。\n"
							+ "そしたら何かが見えてくるはずです\n");

				}

				totalRounds++;

			}

		}

		System.out.println("じゃんけんを行った回数は"
				+ totalRounds + "回です");

		System.out.println("勝つまでにかかった合計回数は"
				+ winCount + "回です");

		scanner.close();

	}

	// 手の数字を文字列に変換するメソッド
	public static String handToString(int hand) {

		if (hand == 0) {

			return "グー";

		} else if (hand == 1) {

			return "チョキ";

		} else if (hand == 2) {

			return "パー";

		} else {

			return "不正な手";

		}
	}
}