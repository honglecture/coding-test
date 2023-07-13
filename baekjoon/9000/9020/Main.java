// https://www.acmicpc.net/problem/9020
// 골드바흐의 추측
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array =  new int[size];
        List<Integer> list = new ArrayList<>();
        list.add(2);
        String[] answerArray = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 3; i <= 10000; i++) {
            if(i % 2 == 0){
                continue;
            }
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            int startIndex = 0;
            int endIndex = 0;
            for (int j = 0; j < list.size(); j++) {
                int prime = list.get(j);
                if(prime == n / 2){
                    startIndex = j;
                    endIndex = j;
                    break;
                }
                if(prime > n / 2){
                    startIndex = j - 1;
                    endIndex = j;
                    break;
                }
            }
            if(startIndex == endIndex){
                answerArray[i] = list.get(startIndex) + " " + list.get(endIndex);
                continue;
            } 

            while(true){
                int n1 = list.get(startIndex);
                int n2 = list.get(endIndex);
                if(n1 + n2 == n){
                    answerArray[i] = n1 + " " + n2;
                    break;
                }
                if(n1 + n2 > n){
                    startIndex--;
                } else {
                    endIndex++;
                }
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}