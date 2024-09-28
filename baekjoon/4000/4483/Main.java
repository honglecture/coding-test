// https://www.acmicpc.net/problem/4483
// “Robot Roll Call – Cambot...Servo...Gypsy...Croooow”
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
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            String[] array = new String[size];
            boolean[] answerArray = new boolean[size];
            for (int j = 0; j < size; j++) {
                array[j] = bf.readLine();
            }
            size = Integer.parseInt(bf.readLine());
            Set<String> set = new HashSet<>();
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                for (int k = 0; k < sArray.length; k++) {
                    String str = sArray[k];
                    set.add(str);
                }
            }
            for (int j = 0; j < array.length; j++) {
                if(set.contains(array[j])){
                    answerArray[j] = true;
                }
            }
            bw.write("Test set " + (i + 1) + ":\n");
            for (int j = 0; j < answerArray.length; j++) {
                if(answerArray[j]){
                    bw.write(array[j] + " is " + "present\n");
                } else {
                    bw.write(array[j] + " is " + "absent\n");
                }
            }
            if(i != testCase - 1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
