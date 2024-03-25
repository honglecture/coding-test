// https://www.acmicpc.net/problem/5344
//  GCD
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            long n1 = 0;
            long n2 = 0;
            int count = 1;
            for (int j = 0; j < sArray.length; j++) {
                if(!sArray[j].equals("")){
                    if(count == 1){
                        n1 = Long.parseLong(sArray[j]);
                        count++;
                    } else {
                        n2 = Long.parseLong(sArray[j]);
                        break;
                    }
                }
            }
            long result = getAnswer(n1, n2);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static long getAnswer(long n1, long n2){
        long result = 1;
        long min = Long.min(n1, n2);
        for (int i = 1; i <= min; i++) {
            if(n1 % i == 0 && n2 % i == 0){
                result = i;
            }
        }
        return result;
    }
}