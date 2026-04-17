package curriculum.b;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 Q1 int型の変数scoreに75を代入
		 scoreが60以上なら「合格です！」と表示
		*/

		int score = 75;
		if (score >= 60) {
			System.out.println("合格です！");
		}

		/*
		 Q2 int型の変数ageに25を代入
		 ageが20以上30以下なら「適正年齢です」と表示
		 それ以外の場合は「対象外です」と表示
		*/

		int age = 25;
		if ((age >= 20) && (age <= 30)) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}

		/*
		 Q3 int型の変数ageに18を代入
		 age が 20 以上なら "成人です" と表示
		 age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
		 age が 12 以下なら "子供です" と表示
		*/

		age = 18;
		if (age >= 20) {
			System.out.println("成人です");
		} else if ((age >= 13) && (age <= 19)) {
			System.out.println("ティーンエイジャーです");
		} else {
			System.out.println("子供です");
		}

		/*
		  Q4 int型の変数x, y, zに30, 15, 50を代入
		  一番大きい数値を判定して表示
		*/

		int x = 30, y = 15, z = 50;

		int max = x;
		if (y > max) {
			max = y;
		}
		if (z > max) {
			max = z;
		}
		System.out.println("最大値: " + max);

		/*
		  Q5  int 型の変数 num を用意　コンソール入力でいずれかの値を代入し
		  num の値が 0 より大きければ "正の数です" と表示
		  num の値が 0 なら "0 です" と表示
		  num の値が 0 より小さければ "負の数です" と表示
		  
		*/

		System.out.print("Q5 数字を入力してください: ");
		
		int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("正の数です");
        } else if (num == 0) {
            System.out.println("0です");
        } else {
            System.out.println("負の数です");
        }

		/*
		  Q6  int 型の変数 value を用意　コンソール入力でいずれかの値を代入し
		  value が 偶数 なら "偶数です" と表示
		  value が 奇数 なら "奇数です" と表示
		
		*/

		System.out.print("Q6 偶数か奇数か？: ");
        
        int value = scanner.nextInt();

        if (value % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

		/*
		  Q7 int 型の変数 score にコンソール入力で 0 から 100 のいずれかの数値を代入し
		  90 以上なら "優"
		  70 以上はら "良"
		  50 以上なら "可"
		  50 未満なら "不可"　を表示
		*/

        System.out.print("Q7 0から100のいずれかの数値を入力してください: ");
        
        int score2 = scanner.nextInt();

        if (score2 >= 90) {
            System.out.println("優");
        } else if (score2 >= 70) {
            System.out.println("良");
        } else if (score2 >= 50) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }

		/*
		  Q8 コンソール入力がnullまたは空文字（""）のときに
		 「入力が無効です」と表示する処理を作成してください
		*/

        scanner.nextLine();
        
        System.out.print("Q8 入力してください: ");
        
        String input = scanner.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("入力が無効です");
        } else {
            System.out.println("入力値: " + input);
        }

		/*
		  Q9 int 型の変数 day を用意（コンソール入力で1～7 のいずれかの数値を代入）
		  day の値に応じて曜日を表示
		  1 → "月曜日"
		  2 → "火曜日"
		  3 → "水曜日"
		  4 → "木曜日"
		  5 → "金曜日"
		  6 → "土曜日"
		  7 → "日曜日"
		  それ以外の値なら "無効な入力です" と表示
		  ※Switch文を使用してください
		
		*/

        System.out.print("Q9 1～7のいずれかの数値を入力してください: ");
        
        int day = scanner.nextInt();

        switch (day) {
            case 1: System.out.println("月曜日"); break;
            case 2: System.out.println("火曜日"); break;
            case 3: System.out.println("水曜日"); break;
            case 4: System.out.println("木曜日"); break;
            case 5: System.out.println("金曜日"); break;
            case 6: System.out.println("土曜日"); break;
            case 7: System.out.println("日曜日"); break;
            default: System.out.println("無効な入力です");
        }
        
		/*
		  Q10  int 型の変数 month を用意（コンソール入力で1～12 のいずれかの数値を代入）
		  month の値に応じて季節を表示
		  12, 1, 2 → "冬"
		  3, 4, 5 → "春"
		  6, 7, 8 → "夏"
		  9, 10, 11 → "秋"
		  それ以外の値なら "無効な月です" と表示
		  ※Switch文を使用してください		  
		*/

        System.out.print("Q10 1～12のいずれかの数値を入力してください: ");
        
        int month = scanner.nextInt();

        switch (month) {
            case 12: case 1: case 2:
                System.out.println("冬"); break;
            case 3: case 4: case 5:
                System.out.println("春"); break;
            case 6: case 7: case 8:
                System.out.println("夏"); break;
            case 9: case 10: case 11:
                System.out.println("秋"); break;
            default:
                System.out.println("無効な月です");
        }

        scanner.close();
    }

	}
