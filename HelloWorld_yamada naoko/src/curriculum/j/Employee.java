package curriculum.j;

// Billableを実装
public abstract class Employee implements Billable {

	protected String id;
	protected String name;

	// コンストラクタ
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public abstract int costForDay(int hoursWorked);
}