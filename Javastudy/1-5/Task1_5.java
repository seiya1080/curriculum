/** 
 * Task1-5 : 課題内容
 *
 * 本課題では、ルーブ文に記述に慣れていきましょう。
 * 問①〜問④まであります。
 * for文・while文の仕組みを意識しながらコーディングしていきましょう！
 */
public class Task1_5 {

    public static void main(String[] args) {

        // ① 「みかん」、「りんご」、「ぶどう」、「メロン」の値を設定した配列 fluits を作成してください。
        String[] fluits = new String[4];
        fluits[0] = "みかん";
        fluits[1] = "りんご";
        fluits[2] = "ぶどう";
        fluits[3] = "メロン";

        // ② for文を使って①で作成した配列を出力しなさい。
        for (int i = 0; i < fluits.length; i++) { 
            System.out.println(fluits[i]); 
            }


        // // ③ 以下のwhile文の処理について、何をしているのかコメントを記入してください。
        // /*
        // *  数値の変数iを宣言後、iに1を足していったものを出力（改行なし）。iが100以下である限りその処理を続け、iが100を超えたら空白で出力
        // */
        int i = 1;
        while(i <= 100) {
          System.out.print(i);
          i++;
        }
        System.out.println();

        /* ④ Wikiに掲載されている【多重ループのプログラム例 （九九表を表示）】を参考に、
        *    行の最初に「段数」と「||」を追加したものを表示させるプログラムを作成しなさい。
        
        *     1 || 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
        *     2 || 2 | 4 | 6 | 8 | 10 | 12 | 14 | 16 | 18 |
        *     3 || 3 | 6 | 9 | 12 | 15 | 18 | 21 | 24 | 27 |
        *     4 || 4 | 8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 |
        *     5 || 5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 |
        *     6 || 6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 |
        *     7 || 7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 |
        *     8 || 8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 |
        *     9 || 9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 |
        */
        for (int y = 1; y <= 9; y++) { 
            System.out.print(y + "||");
            // １つの段を表示 
                for (int j = 1; j <= 9; j++) { 
                    System.out.print((y * j) + "|"); 
                } 
   // １つの段を表示し終わったところで、改行する 
                System.out.println(); 
            }
    }
}