package curriculum.g;

public class Main {
	public static void main(String[] args) {

		// ① オブジェクト作成
		Employee emp = new Employee();

		// ② 値をセット
		emp.setEmployeeId("E002");
		emp.setName("田中花子");

		// ③ 値を取得して出力
		System.out.println("社員ID: " + emp.getEmployeeId()
				+ ", 名前: " + emp.getName());
	}
}