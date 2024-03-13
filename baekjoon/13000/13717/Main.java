// https://www.acmicpc.net/problem/13717
// 포켓몬 GO
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] nameArray = new String[size];
        int[] sumArray = new int[size];
        int sum = 0;
        int maxNum;
        String answer;
        for (int i = 0; i < size; i++) {
            String name = bf.readLine();
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int result = getAnswer(n1, n2);
            sum += result;
            nameArray[i] = name;
            sumArray[i] = result;
        }
        maxNum = sumArray[0];
        answer = nameArray[0];
        for (int i = 1; i < sumArray.length; i++) {
            if(sumArray[i] > maxNum){
                maxNum = sumArray[i];
                answer = nameArray[i];
            }
        }
        System.out.println(sum);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int n1, int n2){
        int result = 0;
        while (true) {
            if(n2 < n1){
                 break;
            }
            result++;
            n2 -= n1;
            n2 += 2;
        }
        return result;
    }

}