package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// 社員まとめ
		List<Employee> list = new ArrayList<>();

		list.add(new FullTimeEmployee("山田太郎", 8));
		list.add(new ContractEmployee("田中花子", 8));

		// 表示クラス
		SalaryPrinter printer = new SalaryPrinter();

		// 繰り返し処理
		for (Employee e : list) {
			printer.print(e);
		}
	}
}