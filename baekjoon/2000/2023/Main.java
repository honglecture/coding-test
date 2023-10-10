// https://www.acmicpc.net/problem/2023
// 신기한 소수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static int[] array;
    private static int n;
    private static List<Integer> answerList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(bf.readLine());
        array = new int[n];
        getAnswer(0, 0);
        Collections.sort(answerList);
        for (int i = 0; i < answerList.size(); i++) {
            int m = answerList.get(i);
            bw.write(m + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index){
        if(count > 0){
            if(array[0] != 0){
                String str = "";
                for (int i = 0; i < count; i++) {
                    str += array[i];
                }
                if(!isPrime(str)){
                    return;
                } 
            } else {
                return;
            }
        }
        if(count == n){
            String str = "";
            for (int i = 0; i < count; i++) {
                str += array[i];
            }
            int num = Integer.parseInt(str);
            answerList.add(num);
            return;
        }
        for (int i = 0; i <= 9; i++) {
            array[index] = i;
            getAnswer(count + 1, index + 1);
            array[index] = 0;
        }

    }

    private static boolean isPrime(String n){
        boolean flag = true;
        for (int i = 0; i < n.length(); i++) {
            String str = n.substring(0, i + 1);
            int key = Integer.parseInt(str);
            if(key == 1){
                flag = false;
                break;
            }
            for (int j = 2; j <= Math.sqrt(key); j++) {
                if(key % j == 0){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        return flag;
    }


}