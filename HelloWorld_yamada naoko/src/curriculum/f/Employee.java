package curriculum.f;

public class Employee {

	// 社員IDを保持するフィールド
	String employeeId;

	// 社員の名前を保持するフィールド
	String name;

	//「社員ID: ○○, 名前: ○○」で出力する
	void showInfo() {
		System.out.println("社員ID: " + employeeId + ", 名前: " + name);
	}
}