package curriculum.i;

// 全社員の共通部分
public abstract class Employee {

	// 共通データ
	protected String id;
	protected String name;

	// 共通処理
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// 給与計算
	public abstract int calculateDailyWage(int hoursWorked);
}