// https://www.acmicpc.net/problem/4540
// Q
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(bf.readLine());
        for (int i = 0; i < tc; i++) {
            String[] sArray = bf.readLine().split(" ");
            int size1 = Integer.parseInt(sArray[0]);
            int size2 = Integer.parseInt(sArray[1]);
            String[] array = new String[size1];
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[j] = sArray[j];
            }
            String[] answerArray = new String[size1];
            Set<String> set = new HashSet<>();
            for (int j = 0; j < size2; j++) {
                sArray = bf.readLine().split(" ");
                int start = Integer.parseInt(sArray[0]) - 1;
                int end = Integer.parseInt(sArray[1]) - 1;
                answerArray[end] = array[start];
                set.add(array[start]);
            }
            for (int j = 0; j < array.length; j++) {
                String str = array[j];
                if(set.contains(str)){
                    continue;
                }
                for (int k = 0; k < answerArray.length; k++) {
                    if(answerArray[k] == null){
                        answerArray[k] = str;
                        break;
                    }
                }
            }
            for (int j = 0; j < answerArray.length; j++) {
                bw.write(answerArray[j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    
}