// https://www.acmicpc.net/problem/15655
// N과 M (5)
import java.io.*;
import java.util.Arrays;

public class Main {

    private static int[] array;
    private static boolean[] visitArray;
    private static int select;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        select = Integer.parseInt(sArray[1]);
        array = new int[size];
        visitArray = new boolean[size];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        getAnswer(0, 0);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int count){
        if(count == select){
            String result = "";
            for (int i = 0; i < visitArray.length; i++) {
                if(visitArray[i]){
                    result += array[i] + " ";
                }
            }
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
            return;
        }
        for (int i = index; i < array.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                getAnswer(i + 1, count + 1);
                visitArray[i] = false;
            }
        }
    }

}
