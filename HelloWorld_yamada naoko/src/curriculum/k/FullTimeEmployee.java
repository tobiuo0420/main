package curriculum.k;

// 正社員の給与計算
public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String name, int hours) {
		super(name, hours);
	}

	// 正社員の計算
	@Override
	public int calculateSalary() {
		return hours * 1200;
	}
}