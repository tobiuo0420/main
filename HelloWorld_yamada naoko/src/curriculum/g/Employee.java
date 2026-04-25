package curriculum.g;

public class Employee {

	// ① フィールド private
	private String employeeId;
	private String name;

	// ② セッター 値を入れる
	public void setEmployeeId(String id) {
		this.employeeId = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ③ ゲッター 値を取り出す
	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}
}