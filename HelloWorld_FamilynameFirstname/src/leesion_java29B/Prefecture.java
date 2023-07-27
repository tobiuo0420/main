package leesion_java29B;

import java.util.Arrays;
import java.util.Scanner;

import leesion_java29.Theme29; // Theme29 クラスをインポート

public class Prefecture {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("0～10の数字をカンマ区切りで入力して下さい");
		String input = scanner.nextLine();

		System.out.println("昇順、降順どちらにしますか");
		System.out.println("昇順なら0、降順なら1を入力してください");
		int sortOrder = scanner.nextInt();

		String[] prefIds = input.split(",");
		int[] sortedIds = sortIds(prefIds, sortOrder);

		for (int id : sortedIds) {
			Theme29 theme29 = getTheme29Data(id); // Theme29 クラスのインスタンスを取得
			if (theme29 != null) {
				theme29.printDetails(); // インスタンスメソッドを呼び出す
			} else {
				System.out.println("該当する都道府県が存在しません。");
			}
		}

		scanner.close();
	}

	// 都道府県IDの配列をソートする
	public static int[] sortIds(String[] prefIds, int sortOrder) {
		int n = prefIds.length;
		int[] ids = new int[n];
		for (int i = 0; i < n; i++) {
			ids[i] = Integer.parseInt(prefIds[i]);
		}

		if (sortOrder == 0) {
			Arrays.sort(ids); // 昇順にソート
		} else if (sortOrder == 1) {
			int left = 0;
			int right = n - 1;
			while (left < right) {
				int temp = ids[left];
				ids[left] = ids[right];
				ids[right] = temp;
				left++;
				right--;
			}
		} else {
			System.out.println("無効な選択です。昇順なら0、降順なら1を入力してください。");
		}

		return ids;
	}

	// 都道府県IDに対応する Theme29 クラスのインスタンスを取得する
	public static Theme29 getTheme29Data(int id) {
		switch (id) {
		case 0:
			return new Theme29("北海道", "札幌市", 83424);
		case 1:
			return new Theme29("青森県", "青森市", 9646);
		case 2:
			return new Theme29("岩手県", "盛岡市", 15275);
		case 3:
			return new Theme29("宮城県", "仙台市", 7282);
		case 4:
			return new Theme29("秋田県", "秋田市", 11638);
		case 5:
			return new Theme29("山形県", "山形市", 9323);
		case 6:
			return new Theme29("福島県", "福島市", 13784);
		case 7:
			return new Theme29("茨城県", "水戸市", 6097);
		case 8:
			return new Theme29("栃木県", "宇都宮市", 6408);
		case 9:
			return new Theme29("群馬県", "前橋市", 6362);
		case 10:
			return new Theme29("埼玉県", "さいたま市", 3798);
		default:
			return null;
		}
	}
}