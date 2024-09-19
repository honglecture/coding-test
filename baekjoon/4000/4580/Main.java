// https://www.acmicpc.net/problem/4580
// Mad Scientist
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String temp = bf.readLine();
            if(temp.equals("0")){
                break;
            }
            String[] sArray = temp.split(" ");
            int[] array = new int[sArray.length - 1];
            for (int i = 1; i < sArray.length; i++) {
                array[i - 1] = Integer.parseInt(sArray[i]);
            }
            StringBuilder answer = new StringBuilder();
            int key = 1;
            for (int i = 0; i < array.length; i++) {
                if(i == 0){
                    int n = array[i];
                    for (int j = 0; j < n; j++) {
                        answer.append(key + " ");
                    }
                } else {
                    int n1 = array[i];
                    int n2 = array[i - 1];
                    int n3 = n1 - n2;
                    for (int j = 0; j < n3; j++) {
                        answer.append(key + " ");
                    }
                }
                key++;
            }
            answer.deleteCharAt(answer.length() - 1);
            bw.write(answer.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }

   
}