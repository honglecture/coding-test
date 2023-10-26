// https://www.acmicpc.net/problem/1038
// 감소하는 수
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

    private static boolean[] visitArray;
    private static List<String> answerList;
    private static int[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 9876543210 요게 마지막 수?
        int n = Integer.parseInt(bf.readLine());
        answerList = new ArrayList<>();
        visitArray = new boolean[10];
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        getAnswer(0, 0);
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < answerList.size(); i++) {
            long m = Long.parseLong(answerList.get(i));
            list.add(m);
        }
        Collections.sort(list);
        if(list.size() <= n){
            bw.write("-1\n");
        } else {
            bw.write(list.get(n) + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int count){
        if(count == 11){
            return;
        }
        if(count != 0){
            if(count == 1){
                answerList.add(array[0] + "");
            } else {
                boolean flag = true;
                String str = "";
                for (int i = 0; i < count - 1; i++) {
                    int n1 = array[i];
                    int n2 = array[i + 1];
                    if(n1 <= n2){
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    return;
                } else {
                    for (int i = 0; i < count; i++) {
                        int n1 = array[i];
                        str += n1;
                    }
                    answerList.add(str);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(!visitArray[i]){
                array[index] = i;
                visitArray[i] = true;
                getAnswer(index  + 1, count + 1);
                array[index] = -1;
                visitArray[i] = false;
            }
        }
       
    }
    
}