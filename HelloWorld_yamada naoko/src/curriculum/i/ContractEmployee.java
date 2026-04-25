package curriculum.i;

// 契約社員　処理
public class ContractEmployee extends Employee {

	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	// 契約社員　給料計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * 1000;
	}
}