package curriculum.c;

import java.util.Random;

public class CPU {

	// CPUのじゃんけんの手をランダムで決定
	public int getHand() {

		// ランダムな数値を生成するクラス
		Random rand = new Random();

		// 0〜2のランダムな整数を返す
		return rand.nextInt(3);
	}
}