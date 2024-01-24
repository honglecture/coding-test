// https://www.acmicpc.net/problem/16943
// 숫자 재배치
import java.io.*;
public class Main {

    private static int answer = -1;
    private static int[] array;
    private static boolean[] visitArray;
    private static int n1;
    private static int n2;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        n1 = Integer.parseInt(sArray[0]);
        n2 = Integer.parseInt(sArray[1]);
        String str = String.valueOf(n1);
        array = new int[str.length()];
        visitArray = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        getAnswer(0, "");
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, String result){
        if(count == array.length){
            int n = Integer.parseInt(result);
            if(n < n2){
                if(answer < n){
                    answer = n;
                }
            }
            return;
        }
        if(!result.equals("")){
            if(result.charAt(0) == '0'){
                return;
            }
            int n = Integer.parseInt(result);
            if(n > n2){
                return;
            }
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                getAnswer(count + 1, result + array[i]);
                visitArray[i] = false;
            }
        }
    }

}
