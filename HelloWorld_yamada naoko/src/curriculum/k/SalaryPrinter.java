package curriculum.k;

// 結果の表示
public class SalaryPrinter {

	// 表示処理
	public void print(Employee e) {
		System.out.println(
				e.getName() + " の給料は "
						+ e.calculateSalary() + " 円");
	}
}