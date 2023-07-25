package leesion_java27;

import java.util.Scanner;

/*

	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50

	コンソール出力結果

	コンソールに文字を入力してください
	動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明


 */

class Animal {
	private String name;
	private double length;
	private int speed;
	private String scientificName;

	// コンストラクタ
	public Animal(String name, double length, int speed, String scientificName) {
		this.name = name;
		this.length = length;
		this.speed = speed;
		this.scientificName = scientificName;
	}

	// 動物情報を表示するメソッド
	public void printDetails() {
		System.out.println("動物名：" + name);
		System.out.println("体長：" + length + "m");
		System.out.println("速度：" + speed + "km/h");
		System.out.println("学名：" + (scientificName != null ? scientificName : "不明"));
		System.out.println();
	}
}

public class Theme {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");

		String inputData = scanner.nextLine();
		String[] animalDetails = inputData.split(",");

		for (String animalDetail : animalDetails) {
			String[] details = animalDetail.split(":");
			if (details.length == 3) {
				String name = details[0];
				double length = Double.parseDouble(details[1]);
				int speed = Integer.parseInt(details[2]);
				Animal animal = getAnimalData(name);
				if (animal != null) {
					animal.printDetails();
				} else {
					System.out.println("該当する動物名ではありません");
				}
			}
		}

		scanner.close();
	}

	public static Animal getAnimalData(String name) {
		switch (name) {
		case "ライオン":
			return new Animal("ライオン", 2.1, 80, "パンテラ レオ");
		case "ゾウ":
			return new Animal("ゾウ", 3.2, 40, "ロキソドンタ・サイクロティス");
		case "パンダ":
			return new Animal("パンダ", 1.9, 30, "アイルロポダ・メラノレウカ");
		case "チンパンジー":
			return new Animal("チンパンジー", 0.94, 25, "パン・トゥログロディテス");
		case "シマウマ":
			return new Animal("シマウマ", 2.4, 65, "チャップマンシマウマ");
		case "インコ":
			return new Animal("インコ", 0.1, 50, "不明");
		default:
			return null;
		}
	}
}	