package curriculum.e;

public class Main {

	public static void main(String[] args) {

		// Employeeのインスタンス作成
		Employee emp = new Employee();

		// nameに値を設定
		emp.name = "山田太郎";

		// workを呼び出し動作を確認
		emp.work();
	}
}