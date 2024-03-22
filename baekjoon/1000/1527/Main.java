// https://www.acmicpc.net/problem/1527
// 금민수의 개수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;  

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int size1 = sArray[0].length();
        int size2 = sArray[1].length();
        int answer = 0;
        for (int i = size1; i <= size2; i++) {
            if(i == size1){

            } else if(i == size2){

            } else {
                int result = 1;
                for (int j = 0; j < i; j++) {
                    result *= 2;
                }
                answer += result;
            }
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int size){
        if(count == size){
            return;
        }
    }

}
