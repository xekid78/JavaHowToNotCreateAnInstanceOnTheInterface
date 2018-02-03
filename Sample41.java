/**
 *
 * @author xekid78
 *
 */
public class Sample41 {

	public static void main(String[] args) {
		Calc3.method1();
		Calc3.method2();

	}

}

interface Calc3 {
	public String STR = "足し算";
	public int A = 7;
	public int B = 8;

	public static void method1() {
		System.out.println(STR + "をします");
	};

	public static void method2() {
		System.out.println(A + " + " + B + " は " + (A + B) + " です。");
	}
}
