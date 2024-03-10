// https://www.acmicpc.net/problem/31428
// 엘리스 트랙 매칭
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array = new String[size];
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            array[i] = sArray[i];
        }
        String key = bf.readLine();
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(key)){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
