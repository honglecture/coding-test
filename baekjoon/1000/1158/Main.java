// https://www.acmicpc.net/problem/1158
// 요세푸스 문제
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> answerList = new ArrayList<>();
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int[] array = new int[n1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int count = 1;
        int index = 0;
        while(true){
            if(answerList.size() == n1){
                break;
            }
            if(count == n2){
                if(array[index] != 0){
                    answerList.add(array[index]);
                    array[index] = 0;
                    count = 1;
                    index = (index + 1) % n1;
                } else {
                    index = (index + 1) % n1;
                }
            } else if(array[index] == 0){
                index = (index + 1) % n1;
            } else {
                count++;
                index = (index + 1) % n1;
            }
        }
        String result = answerList.toString().replaceAll("\\[", "<").replaceAll("]", ">");
        bw.write(result+"\n");
        bw.flush();
        bw.close();
    }
}