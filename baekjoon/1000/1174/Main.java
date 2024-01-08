// https://www.acmicpc.net/problem/1174
// 줄어드는 수
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

    private static int[] array = {9,8,7,6,5,4,3,2,1,0};
    private static List<Long> answerList = new ArrayList<>();
    private static boolean[] visitArray = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int key = Integer.parseInt(bf.readLine());
        getAnswer(0, 0);
        Collections.sort(answerList);
        if(key <= answerList.size()){
            System.out.println(answerList.get(key - 1));
        } else {
            System.out.println("-1");
        }
        
        bw.flush();
        bw.close();
    }
    private static void getAnswer(int count, int index){
        if(count == array.length){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < visitArray.length; i++) {
                if(visitArray[i]){
                    sb.append(String.valueOf(array[i]));
                }
            }
            if(!sb.toString().equals("")){
                answerList.add(Long.parseLong(sb.toString()));
            }
            return;
        }
        visitArray[index] = true;
        getAnswer(count + 1, index + 1);
        visitArray[index] = false;
        getAnswer(count + 1, index + 1);
    }
    
}