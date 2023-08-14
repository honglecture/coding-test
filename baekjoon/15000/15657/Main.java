// https://www.acmicpc.net/problem/15657
// N과 M (5)
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static int[] array;
    private static int select;
    private static int[] visitArray;
    private static BufferedReader bf;
    private static BufferedWriter bw;
    private static Set<String> set;

    public static void main(String[] args) throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        select = Integer.parseInt(sArray[1]);
        array = new int[size];
        visitArray = new int[select];
        set = new HashSet<>();
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        getAnswer(0, 0);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int count) throws IOException {
        if(select == count){
            String result = "";
            boolean flag = true;;
            for (int i = 0; i < visitArray.length; i++) {
                result += visitArray[i] + " ";
                if(i != 0){
                    if(visitArray[i - 1] > visitArray[i]){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                result = result.substring(0, result.length() - 1);
                bw.write(result + "\n");
            }
            return;
        }
        for (int i = 0; i < array.length; i++) {
            visitArray[index] = array[i];
            getAnswer(index + 1, count + 1);
        }
        
    }


}
