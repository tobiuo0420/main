package curriculum.h;

public class Main {
    public static void main(String[] args) {

        // 正社員
        FullTimeEmployee full = new FullTimeEmployee("E001", "山田太郎");

        // パート社員
        PartTimeEmployee part = new PartTimeEmployee("E002", "田中花子");

        // 9時間勤務の給与を出力
        System.out.println("正社員の給与: " + full.calculateDailyWage(9) + " 円");
        System.out.println("パート社員の給与: " + part.calculateDailyWage(9) + " 円");
    }
}