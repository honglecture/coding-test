// https://www.acmicpc.net/problem/15664
// N과 M (10)
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static int[] array;
    private static boolean[] visitArray;
    private static int[] selectArray;
    private static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int select = Integer.parseInt(sArray[1]);
        array = new int[size];
        visitArray = new boolean[size];
        selectArray = new int[select];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        // 1 7 9 9
        getAnswer(0, 0);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index){
        if(count == selectArray.length){
            StringBuilder sb  = new StringBuilder("");
            for (int i = 0; i < selectArray.length; i++) {
                if(i != 0){
                    if(selectArray[i - 1] > selectArray[i]){
                        return;
                    }
                }
                sb.append(selectArray[i] + " ");
            }
            String str = sb.toString().substring(0, sb.length() - 1);
            if(!set.contains(str)){
                set.add(str);
                System.out.println(str);
            }
            return;
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                selectArray[index] = array[i];
                getAnswer(count + 1, index + 1);
                visitArray[i] = false;
                selectArray[index] = 0;
            }
        }
    }

}
