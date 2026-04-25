package curriculum.i;

// 正社員　処理
public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	// 正社員　給料計算
	@Override
	public int calculateDailyWage(int hoursWorked) {

		int hourlyRate = 1250;

		int overtime = Math.max(0, hoursWorked - 8);
		int regular = hoursWorked - overtime;

		return (regular * hourlyRate)
				+ (int) (overtime * hourlyRate * 1.25);
	}
}