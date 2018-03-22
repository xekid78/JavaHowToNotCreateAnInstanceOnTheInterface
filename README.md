# JavaNotCreateInstance
インターフェースでインスタンスを作らない方法

## 処理
[JavaInterface](https://github.com/xekid78/JavaInterface)のインタフェースを使った足し算の処理でインスタンスを生成せずにメソッドを使って処理を行う。

## コード
```
public class Notinstance {

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
```

## 出力結果  
```
足し算をします
7 + 8 は 15 です。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
