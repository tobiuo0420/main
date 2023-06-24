package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// N人の生徒の成績を管理するプログラムを下記条件で作成してください
		// N人の生徒の成績を入力できるようにしてください 
		// 入力値は上から英語・数学・理科・社会の点数としてください
		// 各生徒の科目平均点、全体の科目平均点、
		// そして各教科の平均点を出力してください
		// このプログラムの実行は必ず1回以上行われるようにしてください
		// 出力例を参考にプログラミングを作成してください
		 Scanner scanner = new Scanner(System.in);

	        // 生徒の人数を入力
	        System.out.print("生徒の人数を入力してください: ");
	        int numStudents = scanner.nextInt();

	        // 成績を格納する多次元配列を作成
	        int[][] scores = new int[numStudents][4];

	        // 成績の入力
	        for (int i = 0; i < numStudents; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print((i + 1) + "人目の『" + getSubjectName(j) + "』の点数を入力してください :");
	                scores[i][j] = scanner.nextInt();
	            }
	            System.out.println();
	        }

	        scanner.close();

	        // 各生徒の科目平均点を計算
	        double[] studentAverages = calculateStudentAverages(scores);

	        // 各教科の平均点を計算
	        double[] subjectAverages = calculateSubjectAverages(scores);

	        // 全体の科目平均点を計算
	        double overallAverage = calculateOverallAverage(scores);

	        // 各生徒の平均点を出力
	        for (int i = 0; i < numStudents; i++) {
	            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAverages[i]);
	        
	        }

	        System.out.println();
	        
	        // 各教科の平均点を出力
	        for (int i = 0; i < 4; i++) {
	            System.out.printf("%sの平均点は%.2f点です。\n", getSubjectName(i), subjectAverages[i]);
	        }
	        
	        // 全体の科目平均点を出力
	        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);
	    
	        System.out.println();
	}
	
	    // 科目名を取得
	    private static String getSubjectName(int subjectIndex) {
	        String[] subjects = {"英語", "数学", "理科", "社会"};
	        return subjects[subjectIndex];
	    }

	    // 各生徒の科目平均点を計算
	    private static double[] calculateStudentAverages(int[][] scores) {
	        int numStudents = scores.length;
	        int numSubjects = scores[0].length;
	        double[] studentAverages = new double[numStudents];

	        for (int i = 0; i < numStudents; i++) {
	            int sum = 0;
	            for (int j = 0; j < numSubjects; j++) {
	                sum += scores[i][j];
	            }
	            studentAverages[i] = (double) sum / numSubjects;
	        }

	        return studentAverages;
	    }

	    // 各教科の平均点を計算
	    private static double[] calculateSubjectAverages(int[][] scores) {
	        int numStudents = scores.length;
	        int numSubjects = scores[0].length;
	        double[] subjectAverages = new double[numSubjects];

	        for (int i = 0; i < numSubjects; i++) {
	            int sum = 0;
	            for (int j = 0; j < numStudents; j++) {
	                sum += scores[j][i];
	            }
	            subjectAverages[i] = (double) sum / numStudents;
	        }

	        return subjectAverages;
	    }

	    // 全体の科目平均点を計算
	    private static double calculateOverallAverage(int[][] scores) {
	        int numStudents = scores.length;
	        int numSubjects = scores[0].length;
	        int sum = 0;

	        for (int i = 0; i < numStudents; i++) {
	            for (int j = 0; j < numSubjects; j++) {
	                sum += scores[i][j];
	            }
	        }

	        return (double) sum / (numStudents * numSubjects);
	    }
	}