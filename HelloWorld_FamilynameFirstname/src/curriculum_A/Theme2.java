package curriculum_A;

public class Theme2 {

	public static void main(String[] args) {
		/*

		下記がコンソールに出力されるように作成してください

			こんにちは！ここは日本です！
			この寿司はうまい
			寿司は和食です
			今の現在日時は2023/03/09 10:23:39です

		【条件】
			・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
			・適切なファイルにフィールドで変数を必要な数作ってください。
			・thisを使って作成してください。
			・日時は今日の日付を取得してください。

		 */

		// 日本の挨拶を表示
		System.out.println("こんにちは！ここは日本です！");

		// 寿司オブジェクトの作成と味の表示
		Sushi sushi = new Sushi();
		sushi.setTaste("うまい");
		System.out.println("この寿司は" + sushi.getTaste());

		// 寿司の種類を表示
		System.out.println("寿司は" + Sushi.CUISINE + "です");

		// 現在の日時を取得して表示
		System.out.println("今の現在日時は" + sushi.getCurrentDateTime() + "です");

	}
}
