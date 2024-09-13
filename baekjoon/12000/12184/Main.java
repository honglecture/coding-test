// https://www.acmicpc.net/problem/12184
// GBus count (Small)
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            StringBuilder answer = new StringBuilder();
            answer.append("Case #"+(i + 1)+": ");
            int size1 = Integer.parseInt(bf.readLine());
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            int size2 = Integer.parseInt(bf.readLine());
            for (int j = 0; j < size2; j++) {
                int n = Integer.parseInt(bf.readLine());
                int count = 0;
                for (int k = 0; k < array.length; k+=2) {
                    int start = array[k];
                    int end = array[k + 1];
                    if(start <= n && end >= n){
                        count++;
                    }
                }
                answer.append(count + " ");
            }
            answer.deleteCharAt(answer.length() - 1);
            bw.write(answer.toString() + "\n");
            if(i != testCase - 1){
                bf.readLine();
            }
        }
        bw.flush();
        bw.close();
    }

}
