/**
 * バブルソート
 * チェックテスト-Java３章
 *
 */
public class Main{
    public static void main(String[] args){

        int[] data = {3,1,2,7,5};
 
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }

        System.out.println();

            // for (int i = 0; i < data.length-1; i++) {
            //     for (int j = data.length-1; j > i; j--) {
            
            //         if(data[i] > data[j]){
            //           int box = data[j];
            //           data[j] = data[i];
            //           data[i] = box;
            //         }
            //     }
            // }

            //バブルソートはこれ！！
            for(int i=0; i < data.length-1; i++) {
                for (int j = i + 1; j < data.length ; j++) {
                    if (data[i] > data[j]) {
                            int a = data[i];
                            data[i] = data[j];
                            data[j] = a;
                        }
                }
            }
    
            for(int i = 0; i < data.length; i++){
                System.out.print(data[i] + " ");
            }
        }
    }
}