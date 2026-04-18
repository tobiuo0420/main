package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/* Q1 int 型の配列 を作成し、1, 2, 3, 4, 5 を格納する
		配列の全要素を 順番に表示 */

		int[] q1 = { 1, 2, 3, 4, 5 };
		System.out.println("Q1");
		for (int i = 0; i < q1.length; i++) {
			System.out.print(q1[i] + " ");
		}
		System.out.println("\n");

		/* Q2 int 型の配列 {10, 20, 30, 40, 50} を用意する
		配列の要素を 逆順 に表示 */

		int[] q2 = { 10, 20, 30, 40, 50 };
		System.out.println("Q2");
		for (int i = q2.length - 1; i >= 0; i--) {
			System.out.print(q2[i] + " ");
		}
		System.out.println("\n");

		/* Q3 int 型の配列 {3, 5, 7, 9, 11} を用意する
		配列の全要素の 合計値 を計算し、表示 */

		int[] q3 = { 3, 5, 7, 9, 11 };
		int sum = 0;
		for (int num : q3) {
			sum += num;
		}
		System.out.println("Q3 合計: " + sum + "\n");

		/* Q4 int 型の配列 {12, 7, 9, 21, 5, 18} を用意する
		配列の 最大値と最小値 を求めて表示 */

		int[] q4 = { 12, 7, 9, 21, 5, 18 };
		int max = q4[0];
		int min = q4[0];

		for (int num : q4) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("Q4 最大値: " + max + "\n");
		System.out.println("   最小値: " + min + "\n");

		/* Q5 int 型の配列 {1, 2, 3, 4, 5} を用意する
		配列のすべての要素を 2 倍 し、結果を表示
		結果を表示する際の処理に拡張for文を使用してください */

		int[] q5 = { 1, 2, 3, 4, 5 };
		System.out.println("Q5");
		for (int num : q5) {
			System.out.print(num * 2 + " ");
		}
		System.out.println("\n");

		/* Q6 int 型の配列 {4, 7, 10, 15, 20} を用意する
		ユーザーがコンソール入力した数が 配列に含まれているか を判定し、結果を表示
		結果：（”入力した値”は配列に含まれています／含まれていません）*/

		int[] q6 = { 4, 7, 10, 15, 20 };
		Scanner sc = new Scanner(System.in);

		System.out.print("Q6 数字を入力してください: ");
		int input = sc.nextInt();

		boolean found = false;
		for (int num : q6) {
			if (num == input) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(input + " は配列に含まれています\n");
		} else {
			System.out.println(input + " は配列に含まれていません\n");
		}

		// Scannerは最後に1回だけ閉じる
		sc.close();

		/* Q7 2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意する
		配列の すべての要素を表示 */

		int[][] q7 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		System.out.println("Q7");
		for (int[] row : q7) {
			for (int num : row) {
				System.out.print(num + " ");
			}
		}
		System.out.println("\n");

		/* Q8 2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意する
		配列の すべての要素の合計値を表示 */

		int[][] q8 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		};

		int total = 0;
		for (int[] row : q8) {
			for (int num : row) {
				total += num;
			}
		}
		System.out.println("Q8 合計: " + total + "\n");

		/* Q9 2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意する
		配列内の 最大値と最小値 を求めて表示 */

		int[][] q9 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};

		int max2 = q9[0][0];
		int min2 = q9[0][0];

		for (int[] row : q9) {
			for (int num : row) {
				if (num > max2) {
					max2 = num;
				}
				if (num < min2) {
					min2 = num;
				}
			}
		}

		System.out.println("Q9 最大値: " + max2 + "\n");
		System.out.println("   最小値: " + min2 + "\n");

		/* Q10 3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意する
		配列内のすべての要素を 表示 */

		int[][][] q10 = {
				{ { 1, 2 }, { 3, 4 } },
				{ { 5, 6 }, { 7, 8 } }
		};

		System.out.println("Q10");
		for (int[][] arr2D : q10) {
			for (int[] arr1D : arr2D) {
				for (int num : arr1D) {
					System.out.print(num + " ");

				}

			}

		}
	}
}