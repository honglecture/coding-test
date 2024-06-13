// https://www.acmicpc.net/problem/2948
// 2009년
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int n1 = Integer.parseInt(sArray[1]);
        int n2 = Integer.parseInt(sArray[0]);
        int sum = n2;
        for (int i = 0; i < n1 - 1; i++) {
            sum += monthArray[i];
        }
        // Thursday
        int reulst = sum % 7 + 2;
        if(reulst > 6){
            reulst -= 7;
        }
        System.out.println(weekArray[reulst]);
        bw.flush();
        bw.close();
    }
}