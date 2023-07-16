package curriculum_A;

public class Person {
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int agility;
	private int defense;

	public Person(String name, int hp, int mp, int attack, int agility, int defense) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.agility = agility;
		this.defense = defense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
}
