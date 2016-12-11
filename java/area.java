/* 練習_変数宣言及び代入 */
/* 入力:四角形の幅と高さ */
/* 出力:四角形の面積     */
/* 作成日:2016/12/11 　*/

public class area{
    public static void main(String[] args){
        /* 幅の入力 */
        System.out.println("四角形の幅を入力してください．");
        int width = new java.util.Scanner(System.in).nextInt();
        
        /* 高さの入力 */
        System.out.println("四角形の高さを入力してください．");
        int height = new java.util.Scanner(System.in).nextInt();
        
        /* 結果の出力 */
        int area = width * height;
        System.out.println("入力された四角形の面積は" + area + "です．");
    }
}