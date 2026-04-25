package curriculum.f;

public class Main {

	public static void main(String[] args) {

		// Employeeのインスタンスを作成
		Employee emp = new Employee();

		// フィールドに値を設定
		emp.employeeId = "E001";
		emp.name = "佐藤太郎";

		// showInfoを呼び出して出力
		emp.showInfo();
	}
}