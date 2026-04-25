package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// Billable型で統一
		List<Billable> list = new ArrayList<>();

		list.add(new FullTimeEmployee("E001", "山田太郎"));
		list.add(new ContractEmployee("E002", "田中花子"));
		list.add(new FullTimeEmployee("E003", "佐藤一郎"));

		// 処理
		for (Billable b : list) {
			System.out.println(b.costForDay(9) + " 円");
		}
	}
}