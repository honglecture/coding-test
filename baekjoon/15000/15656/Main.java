// https://www.acmicpc.net/problem/15656
// N과 M (5)
import java.io.*;
import java.util.Arrays;

public class Main {

    private static int[] array;
    private static int[] selectArray;
    private static int n2;
    private static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        n2 = Integer.parseInt(sArray[1]);
        array = new int[n1];
        sArray = bf.readLine().split(" ");
        selectArray = new int[n2];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        getAnswer(0, 0);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index) throws IOException {
        if(count == n2){
            String result = "";
            for (int i = 0; i < selectArray.length; i++) {
                result += array[selectArray[i]] + " ";
            }
            result = result.substring(0, result.length() - 1);
            bw.write(result + "\n");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            selectArray[index] = i;
            getAnswer(count + 1, index + 1);
        }
    }

}
