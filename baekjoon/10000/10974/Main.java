// https://www.acmicpc.net/problem/10974
// 모든 순열
import java.io.*;
public class Main {

    private static int[] array;
    private static boolean[] visitArray;
    private static int[] selectArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        visitArray = new boolean[n];
        selectArray = new int[n];
        array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i - 1] = i;
        }
        getAnswer(0, 0);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index){
        if(count == array.length){
            String result = "";
            for (int i = 0; i < selectArray.length; i++) {
                result += selectArray[i] + " ";
            }
            System.out.println(result);
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if(!visitArray[i]){
                selectArray[index] = array[i];
                visitArray[i] = true;
                getAnswer(count + 1, index + 1); 
                visitArray[i] = false;
                selectArray[index] = 0;
            }
        }
    }

}