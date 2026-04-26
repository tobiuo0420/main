package curriculum.c;

public class Question6 {

	public static void main(String[] args) {

		// プレイヤーオブジェクトを生成
		Player player = new Player();

		// CPUオブジェクトを生成
		CPU cpu = new CPU();

		// 勝つまで繰り返す無限ループ
		while (true) {

			// プレイヤーの手を取得
			int playerHand = player.getHand();

			// CPUの手を取得（ランダム）
			int cpuHand = cpu.getHand();

			// プレイヤーの手を文字列で表示
			System.out.println("あなたの手: " + getHandName(playerHand));

			// CPUの手を文字列で表示
			System.out.println("CPUの手: " + getHandName(cpuHand));

			// あいこの場合
			if (playerHand == cpuHand) {
				System.out.println("あいこです！");

				// プレイヤーが勝つ条件
			} else if ((playerHand == 0 && cpuHand == 1) || // グー vs チョキ
					(playerHand == 1 && cpuHand == 2) || // チョキ vs パー
					(playerHand == 2 && cpuHand == 0)) { // パー vs グー

				System.out.println("あなたの勝ち！");

				// 勝ったらループ終了
				break;

				// それ以外は負け
			} else {
				System.out.println("あなたの負け！");
			}
		}
	}

	// 数値をじゃんけんの手に変換するメソッド
	public static String getHandName(int hand) {

		// 0の場合はグー
		if (hand == 0) {
			return "グー";

			// 1の場合はチョキ
		} else if (hand == 1) {
			return "チョキ";

			// それ以外（2）はパー
		} else {
			return "パー";
		}
	}
}