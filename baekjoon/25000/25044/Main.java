// https://www.acmicpc.net/problem/25044
// 에어컨
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int count = 0;
        int answer = 0;
        int dateCount = 0;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        while (true) {
            if(count == 3){

            } else {
                
            }
            if(dateCount == n){
                break;
            }
        }
        bw.flush();
        bw.close();
    }

}
