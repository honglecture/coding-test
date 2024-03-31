// https://www.acmicpc.net/problem/29713
// 브실이의 띠부띠부씰 컬렉션
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int[] array = new int[26];
        String key = "BRONZESILVER";
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 65;
            array[n]++;
        }
        while (true) {
            boolean flag = true;
            for (int i = 0; i < key.length(); i++) {
                int n = key.charAt(i) - 65;
                if(array[n] == 0){
                    flag = false;
                    break;
                } else {
                    array[n]--;
                }
            }
            if(!flag){
                break;
            }
            answer++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
