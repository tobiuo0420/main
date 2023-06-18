package curriculum_A;

import java.util.Random;

public class Curriculum_New_1_18 {

    // Q1：引数に文字列型と整数型をいれてコンソールに
	//「Hello JavaSE 11」と出力するメソッドを作成してください。
    public static void printMessage(String str, int num) {

    System.out.println(str + " " + num);

    }

    // Q2：引数に整数を渡すと渡した値同士を乗算し
    // コンソールに出力するメソッドを作成してください
     public static void multiply(int num1, int num2) {

     int result = num1 * num2;

     System.out.println(result);

     }

    // Q3：引数として整数の配列を渡すと、受け取った値を順番に
    // コンソールに出力するメソッドを作成してください
	public static void printArray(int[] array) {

    for (int num : array) {

    System.out.println(num);

    }
 }

    // Q4：Q2をオーバーロードして引数を小数2つに変更し、
	// 引数同士を和算しコンソールに出力してください。
	public static void add(double num1, double num2) {

    double result = num1 + num2;

    System.out.println(result);
  }

    // Q5：引数に整数を渡すと、1～100までの
    // ランダムな数字を引数の回数分格納して
    // 格納した値を順番にコンソールで出力後、
	// 格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] generateRandomNumbers(int count) {

    int[] numbers = new int[count];

    Random random = new Random();

    for (int i = 0; i < count; i++) {

    int randomNumber = random.nextInt(100) + 1; // 1～100の乱数生成

    numbers[i] = randomNumber;

    System.out.println(randomNumber);

    }

    return numbers;

    }

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、
	// 受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
    public static void calculateAverage(int[] numbers) {

    int sum = 0;

    for (int num : numbers) {

    sum += num;

    }

    double average = (double) sum / numbers.length;

    System.out.println(average);

    }

    // Q7：引数にQ6で作成したメソッドの返り値を受け取り、
    //受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
    public static boolean checkValue(int[] numbers) {

    int sum = 0;

    for (int num : numbers) {

    sum += num;

    }

    double average = (double) sum / numbers.length;

    boolean result = average >= 50;

    System.out.println(result);


    return result;

    }

    // 作成したメソッドをここで呼び出してください
	public static void main(String[] args) {
    
    // Q1
    printMessage("Hello JavaSE", 11);

    // Q2
    multiply(5, 7);

    // Q3
    int[] array = { 1, 2, 3, 4, 5 };
 
    printArray(array);

     // Q4
     add(3.14, 2.71);

     // Q5
     int[] randomNumbers = generateRandomNumbers(3);

     // Q6
     calculateAverage(randomNumbers);

     // Q7
     checkValue(randomNumbers);
     }
}