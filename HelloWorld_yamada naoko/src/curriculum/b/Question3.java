package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// Q1 for 文を使って 1 から 10 までの数字を 1 つずつ表示
		System.out.println("Q1 for 文を使って 1 から 10 までの数字を 1 つずつ表示");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println(); // 空行

		// Q2 for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示
		System.out.println("Q2 for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示");

		for (int i = 2; i <= 20; i++) {
			// 偶数の判定
			if (0 == (i % 2))
				System.out.println(i);
		}
		System.out.println(); // 空行

		// Q3 for 文を使って 10 から 1 まで カウントダウンして表示
		System.out.println("Q3 for 文を使って 10 から 1 まで カウントダウンして表示");

		for (int i = 10; i >= 1; i--) {
			System.out.println("カウント: " + i);
		}
		System.out.println(); // 空行

		// Q4 for 文を使って 1 から 100 までの合計 を表示
		System.out.println("Q4 for 文を使って 1 から 100 までの合計 を表示");
		
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
		    sum += i;
		}

		System.out.println(sum);

		System.out.println(); // 空行

		// Q5 for 文を使って 以下のような三角形を出力
		System.out.println("Q5 for 文を使って 以下のような三角形を出力");

		int max = 5;
        String star = "*";

        for (int i = 0; i < max; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println("\n");
        }

		// Q6 while 文を使って 1 から 10 まで を 1 つずつ表示
		System.out.println("Q6 while 文を使って 1 から 10 まで を 1 つずつ表示");
		
		int count = 1; 
		
		while (count <= 10) {
		   System.out.println(count);
		   count++; 
		}

		System.out.println(); // 空行

		// Q7 while 文を使って 2 から 20 までの偶数 を 1 つずつ表示
		System.out.println("Q7 while 文を使って 2 から 20 までの偶数 を 1 つずつ表示");

		int num = 1;

		while (num <= 20) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		}

		System.out.println(); // 空行

		// Q8 while 文を使って 10 から 1 まで のカウントダウンを表示
		System.out.println("Q8 while 文を使って 10 から 1 まで のカウントダウンを表示");
		
		int counter = 10;

		while (counter >= 1) {
		    System.out.println(counter);
		    counter--;
		}

		System.out.println(); // 空行

		// Q9 while 文を使って 1 から 100 までの合計 を表示
		System.out.println("Q9 while 文を使って 1 から 100 までの合計 を表示");
		
		int i = 1;
		int total = 0;

		while (i <= 100) {
		    total += i;
		    i++;
		}

		System.out.println(total);
		
		System.out.println(); // 空行

		/* Q10 ユーザーから 数値をコンソール入力 してもらう
		   入力が 0 になるまで 何度でも入力を受け付ける
		   0が入力されたら「終了しました」と表示 */
		System.out.println("Q10 入力が 0 になるまで 何度でも入力を受け付ける");
		
		Scanner scanner = new Scanner(System.in);
        int input = -1; // 初期値（0以外なら何でもOK）

        while (input != 0) {
            System.out.print("数値を入力してください：");
            input = scanner.nextInt();
        }

        System.out.println("終了しました");
        
        System.out.println(); // 空行

		// Q11 for文を使用して下記の通りに出力してください
		System.out.println("Q11 for文を使用して下記の通りに出力してください");
		
		for (int row = 1; row <= 9; row++) {
		    for (int col = 1; col <= 9; col++) {
		        System.out.printf("%02d * %02d = %02d", row, col, row * col);

		        if (col < 9) {
		            System.out.print(" || ");
		        }
		    }
		    System.out.println();
		}

		System.out.println(); // 空行

		// Q12 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		System.out.println("Q12 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください");
		
		Random random = new Random();

		System.out.print("商品を入力：");

		scanner.nextLine();

		String input2 = scanner.nextLine();

		String[] items = input2.split("、");

		int tvStock = random.nextInt(12);

		for (String item : items) {

		    item = item.trim();

		    switch (item) {

		        case "パソコン":
		        case "冷蔵庫":
		        case "扇風機":
		        case "洗濯機":
		        case "加湿器":
		            int stock = random.nextInt(12);
		            System.out.println(item + "の残り台数は " + stock + "台です");
		            break;

		        case "テレビ":
		        case "ディスプレイ":
		            int result = item.equals("テレビ") ? tvStock : (11 - tvStock);
		            System.out.println(item + "の残り台数は " + result + "台です");
		            break;

		        default:
		            System.out.println("『 " + item + " 』は指定の商品ではありません");
		            break;
		    }
		}
		scanner.close();

}
	
}
