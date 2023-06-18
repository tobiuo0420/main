package curriculum_B;

import java.util.Scanner;

public class Qes7 {

     public static void main(String[] args) {
     // N人の生徒の成績を管理するプログラムを下記条件で作成してください
     // N人の生徒の成績を入力できるようにしてください 
     // 入力値は上から英語・数学・理科・社会の点数としてください
     // 各生徒の科目平均点、全体の科目平均点、
     // そして各教科の平均点を出力してください
     // このプログラムの実行は必ず1回以上行われるようにしてください
     // 出力例を参考にプログラミングを作成してください

     // ユーザーの入力を読み取るためのScannerオブジェクトを作成
     Scanner scanner = new Scanner(System.in);

     System.out.print("生徒の人数を入力してください :");

     int numOfStudents = scanner.nextInt();

     // 各科目の点数を格納するための配列を作成
     int[] englishScores = new int[numOfStudents];

     int[] mathScores = new int[numOfStudents];

     int[] scienceScores = new int[numOfStudents];

     int[] socialScores = new int[numOfStudents];

     // 各生徒の点数を入力
     for (int i = 0; i < numOfStudents; i++) {

     System.out.print((i + 1) + "人目の"
                      + "『英語』の点数を入力してください :");

     englishScores[i] = scanner.nextInt();

     System.out.print((i + 1) + "人目の"
                      + "『数学』の点数を入力してください :");

     mathScores[i] = scanner.nextInt();

     System.out.print((i + 1) + "人目の"
                      + "『理科』の点数を入力してください :");

     scienceScores[i] = scanner.nextInt();

     System.out.print((i + 1) + "人目の"
                      + "『社会』の点数を入力してください :");

     socialScores[i] = scanner.nextInt();

     }

     // 各生徒の平均点を計算して表示
     for (int i = 0; i < numOfStudents; i++) {

     double average = (englishScores[i] + mathScores[i] 
                       + scienceScores[i] + socialScores[i]) / 4.0;

     System.out.println((i + 1)
	                    + "人目の平均点は" + average + "点です。");

     }

     // 各科目の平均点を計算
     double englishAverage = calculateAverage(englishScores);

     double mathAverage = calculateAverage(mathScores);

     double scienceAverage = calculateAverage(scienceScores);

     double socialAverage = calculateAverage(socialScores);

     // 全体の平均点を計算
     double overallAverage = (englishAverage + mathAverage 
                              + scienceAverage + socialAverage) / 4.0;

     System.out.printf("英語の平均点は%.2f点です。\n", englishAverage);

     System.out.printf("数学の平均点は%.2f点です。\n", mathAverage);

     System.out.printf("理科の平均点は%.2f点です。\n", scienceAverage);

     System.out.printf("社会の平均点は%.2f点です。\n", socialAverage);

     System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);

     // Scannerオブジェクトをクローズ
     scanner.close();

     }

     // 平均値を計算するメソッド
     private static double calculateAverage(int[] scores) {

     int sum = 0;

     for (int score : scores) {

          sum += score;

     }

     return sum / (double) scores.length;

   }
}