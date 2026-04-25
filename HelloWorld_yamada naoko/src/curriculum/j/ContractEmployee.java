package curriculum.j;

// 契約社員クラス
public class ContractEmployee extends Employee {

	// 社員IDと名前を受け取る
	public ContractEmployee(String id, String name) {
		super(id, name); // 親クラスのコンストラクタを呼び出す
	}

	// 1日の人件費を計算
	@Override
	public int costForDay(int hoursWorked) {
		
		// 契約社員の残業計算・時給は1000円固定
		return hoursWorked * 1000;
	}
}