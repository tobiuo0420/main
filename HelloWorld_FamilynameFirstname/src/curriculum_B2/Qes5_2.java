package curriculum_B2;

public class Qes5_2 {

    public static void main(String[] args) {
    // for文を使用して下記の通りに出力してください

    for (int i = 1; i <= 9; i++) {

    // 1から20までの数値でループ
    for (int j = 1; j <= 20; j++) {

    // 九九の計算結果を求める
    int result = i * j;

    // 計算結果をフォーマットして表示
    System.out.printf("%03d * %03d = %03d || ", j, i, result);

    }
    // 1行分の計算結果を表示し、改行する
    System.out.println();

          }
    }
}