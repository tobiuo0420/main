package curriculum.h;

// Employeeを継承
public class PartTimeEmployee extends Employee {

	// 時給
	private static final int HOURLY_RATE = 1000;

	// コンストラクタ
	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}

	// 給与計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;
	}
}