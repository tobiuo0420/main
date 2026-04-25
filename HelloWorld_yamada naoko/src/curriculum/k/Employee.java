package curriculum.k;

// 全社員に共通の情報を管理
public abstract class Employee implements Payable {

	// 共通フィールド
	protected String name;
	protected int hours;

	// コンストラクタ
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}

	// メソッド
	public String getName() {
		return name;
	}

	public abstract int calculateSalary();
}