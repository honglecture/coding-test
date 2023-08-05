// https://www.acmicpc.net/problem/13305
// 주유소
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int citySize = Integer.parseInt(bf.readLine());
        int[] cityArray = new int[citySize];
        int[] dArray = new int[citySize - 1];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            dArray[i] = Integer.parseInt(sArray[i]);
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            cityArray[i] = Integer.parseInt(sArray[i]);
        }
        int currentIndex = 0;
        long answer = 0;
        while(true){
            int sum = 0;
            int nextIndex = 0;
            for (int i = currentIndex + 1; i < cityArray.length - 1; i++) {
                if(cityArray[i] < cityArray[currentIndex]){
                    nextIndex = i;
                    for (int j = currentIndex; j < i; j++) {
                        sum += dArray[j];
                    }
                    break;
                }
            }
            if(nextIndex == 0){
                for (int i = currentIndex; i < dArray.length; i++) {
                    sum += dArray[i];
                }
                answer += (long)sum * (long)cityArray[currentIndex];
                break;
            }
            answer += (long)sum * (long)cityArray[currentIndex];
            currentIndex = nextIndex;
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}