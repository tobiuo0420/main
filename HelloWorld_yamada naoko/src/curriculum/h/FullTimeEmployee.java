package curriculum.h;

// Employeeを継承
public class FullTimeEmployee extends Employee {

	// 時給
	private static final int HOURLY_RATE = 1200;

	// コンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	// 給与計算
	@Override
	public int calculateDailyWage(int hoursWorked) {

		// 8時間以内
		if (hoursWorked <= 8) {
			return hoursWorked * HOURLY_RATE;
		}

		// 残業時間
		int overtime = hoursWorked - 8;

		// 通常分 + 残業分
		return (8 * HOURLY_RATE) + (int) (overtime * HOURLY_RATE * 1.25);
	}
}