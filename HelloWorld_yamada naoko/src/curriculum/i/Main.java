package curriculum.i;

// 【必要】Listを使用
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// Employee型のリスト
		List<Employee> employees = new ArrayList<>();

		// 社員を追加
		employees.add(new FullTimeEmployee("E001", "山田太郎"));
		employees.add(new ContractEmployee("E002", "田中花子"));
		employees.add(new FullTimeEmployee("E003", "佐藤一郎"));

		// for-eachで全員処理
		for (Employee emp : employees) {

			// 給料計算
			int wage = emp.calculateDailyWage(9);

			// 出力
			System.out.println(
					"社員ID: " + emp.id +
							", 名前: " + emp.name +
							", 給料: " + wage + " 円");
		}
	}
}