// https://www.acmicpc.net/problem/10202
// Longest Subsequence
import java.io.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int answer = 0;
            int currentCount = 0;
            ArrayList<String> sequence = new ArrayList<>();
            for (int j = 1; j < sArray.length; j++) {
                String str = sArray[j];
                sequence.add(str);
                if(str.equals("X")){
                    currentCount++;
                } else {
                    answer = Integer.max(answer, currentCount);
                    currentCount = 0;
                }
            }
            for (int j = 0; j < sequence.size(); j++) {
                String str = sequence.get(j);
                if(str.equals("X")){
                    currentCount++;
                } else {
                    answer = Integer.max(answer, currentCount);
                    currentCount = 0;
                }
            }
            answer = Integer.max(answer, currentCount);
            bw.write("The longest contiguous subsequence of X's is of length " + answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}


