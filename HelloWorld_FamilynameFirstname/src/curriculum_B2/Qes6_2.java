package curriculum_B2;

import java.util.Random;
import java.util.Scanner;

public class Qes6_2 {

    public static void main(String[] args) {
    // 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
    // 拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
    // Switch文内でテレビとディスプレイは続けて書くようにしてください、
    // 条件演算子で出力される値を変更してください
    // テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は
    // 最大個数の11個からランダムで出た数字を引いて出力してください 
    // 例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」
    // ※〇〇はランダムで出た数字
    // 入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
    // 入力された値は「、」区切りで指定してください
    // そのほかの値が入力された場合下記を出力されるようにしてください
    //『受け取った値』は指定の商品ではありません
    // 残り台数は0〜11までのランダムな値が出力されるようにしてください

    Scanner scanner = new Scanner(System.in);

    // 商品の入力をユーザーに促す
    System.out.print("商品を入力してください: ");

    // ユーザーからの入力を受け取る
    String input = scanner.nextLine();

    scanner.close();

    // 入力された商品をカンマで分割し、配列に格納
    String[] products = input.split("、");

    // テレビとディスプレイの在庫数を初期化
    int tvAndDisplayStock = 11;

    // 扇風機の在庫数をランダムに設定
    int fanStock = getRandomNumberInRange(0, 11);

    // 入力された商品ごとに処理を実行
    for (String product : products) {

    switch (product) {

    // テレビとディスプレイの場合
    case "テレビ":

    case "ディスプレイ":

    // ランダムな残り台数を計算
    int randomNum = getRandomNumberInRange(0, tvAndDisplayStock);

    // テレビとディスプレイの在庫数から引き、出力
    tvAndDisplayStock -= randomNum;

    System.out.println(product + "の残り台数は"
                       + randomNum + "台です");

     break;

    // その他の商品の場合
    case "パソコン":

    case "冷蔵庫":

    case "扇風機":

    case "洗濯機":

    case "加湿器":

    // ランダムな残り台数を計算し、出力
    System.out.println(product + "の残り台数は" 
                       + getRandomNumberInRange(0, 11) + "台です");

    break;

    // 指定された商品以外の場合
    default:

    System.out.println("『" + product + "』は指定の商品ではありません");

    }
  }
}
    // 指定された範囲内のランダムな整数を返す。
    private static int getRandomNumberInRange(int min, int max) {

    if (min >= max) {

    throw new IllegalArgumentException("Max must be greater than min");

    }

    Random random = new Random();

    return random.nextInt(max - min + 1) + min;

    }
}