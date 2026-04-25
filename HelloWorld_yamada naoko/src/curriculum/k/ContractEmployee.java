package curriculum.k;

// 契約社員の給与計算
public class ContractEmployee extends Employee {

	public ContractEmployee(String name, int hours) {
		super(name, hours);
	}

	// 契約社員の計算
	@Override
	public int calculateSalary() {
		return hours * 1000;
	}
}