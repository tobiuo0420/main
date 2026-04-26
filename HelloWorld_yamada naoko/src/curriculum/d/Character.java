package curriculum.d;

public class Character {
	String name;
	int hp;
	int at;
	int sp;

	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}

	// 攻撃処理
	public void attack(Character opponent) {
		opponent.hp -= this.at;
		System.out.println(this.name + "の攻撃！ " + opponent.name + "に" + this.at + "ダメージ！");
	}

	// 生存チェック
	public boolean isAlive() {
		return hp > 0;
	}
}