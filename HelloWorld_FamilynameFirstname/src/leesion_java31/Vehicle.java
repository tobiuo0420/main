package leesion_java31;

//Vehicleクラス
public class Vehicle {

	// 問題1：Vehicleクラスを作成し、
	// String型のprivateなインスタンスフィールド「owner」を定義しましょう。
	private String owner;

	// 問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」
	// とセッター「setOwner」を定義しましょう。
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}