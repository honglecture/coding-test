// https://www.acmicpc.net/problem/24347
// КАРТИ
import java.io.*;

public class Main {

    private static int[] array;
    private static boolean[] visitArray;
    private static long answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        array = new int[sArray.length];
        visitArray = new boolean[array.length];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        getAnswer(0, "");
        System.out.println(answer);

        bw.flush();
        bw.close();
    }


    private static void getAnswer(int count, String str){
        if(count == 4){
            long result = Long.parseLong(str);
            answer = Long.max(answer, result);
            return;
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                getAnswer(count + 1, str + array[i]);
                visitArray[i] = false;
            }
        }
    }

}
