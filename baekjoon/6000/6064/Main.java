// https://www.acmicpc.net/problem/6064
// 카잉 달력
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
            int m = Integer.parseInt(sArray[0]);
            int n = Integer.parseInt(sArray[1]);
            int x = Integer.parseInt(sArray[2]);
            int y = Integer.parseInt(sArray[3]);
            long result = getAnswer(m, n, x, y);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
    
    private static long getAnswer(int m, int n, int x, int y){
        long result = 0;
        int startX = x;
        int startY = (x) % n;
        int count = x;
        long limit = getLimit(m, n);
        if(startY == 0){
            startY = n;
        }
        while(true){
            if(count > limit){
                result = -1;
                break;
            }
            if(startX == x && startY == y){
                result = count;
                break;
            }
            startY = (startY + m) % n;
            if(startY == 0){
                startY = n;
            }
            count += m;
        }
        return result;
    }

    private static long getLimit(int n1, int n2){
        long result = 0;
        long count = 1;
        while(true){
            if((count * (long)n1) % (long)n2 == 0){
                result = count * (long)n1;
                break;
            }
            count++;
        }
        return result;
    }

}