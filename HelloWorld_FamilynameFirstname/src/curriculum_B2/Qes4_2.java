package curriculum_B2;

public class Qes4_2 {

     public static void main(String[] args) {
     // for文を使用して下記の通りに出力してください

     // 1から9までの九九の段を処理するループ
     for (int i = 1; i <= 9; i++) {

     // 1から9までの九九の掛ける数を処理するループ
     for (int j = 1; j <= 9; j++) {

     int result = i * j;

     // 九九の式と結果を表示
     System.out.print(String.format("%02d * %02d = %02d", i, j, result));

     // 掛け算の式ごとに区切り文字「||」を表示
     if (j < 9) {

     System.out.print(" || ");

         }
     }

     // 九九の段ごとに改行
     System.out.println();

        }
     }
  }