package curriculum.h;

public abstract class Employee {

	// フィールド（社員IDと名前）
	private String employeeId;
	private String name;

	// コンストラクタ
	public Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}

	// 社員ID取得
	public String getEmployeeId() {
		return employeeId;
	}

	// 名前取得
	public String getName() {
		return name;
	}

	// 抽象メソッド
	public abstract int calculateDailyWage(int hoursWorked);
}