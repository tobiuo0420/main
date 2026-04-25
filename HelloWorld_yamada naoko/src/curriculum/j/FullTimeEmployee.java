package curriculum.j;

// 正社員クラス
public class FullTimeEmployee extends Employee {

	// 社員IDと名前を受け取る
	public FullTimeEmployee(String id, String name) {
		super(id, name); // 親クラスのコンストラクタを呼び出す
	}

	// 1日の人件費を計算
	@Override
	public int costForDay(int hoursWorked) {

		// 時給
		int hourlyRate = 1250;

		// 残業時間を計算
		int overtime = Math.max(0, hoursWorked - 8);

		// 通常労働時間
		int regular = hoursWorked - overtime;

		// 計算式
		return (regular * hourlyRate)
				+ (int) (overtime * hourlyRate * 1.5);
	}
}