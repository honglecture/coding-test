// https://www.acmicpc.net/problem/14542
// Outer Triangle Sum
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int index = 1;
        while (true) {
            int size = Integer.parseInt(bf.readLine().trim());
            if(size == 0){
                break;
            }
            int answer = 0;
            for (int i = 0; i < size; i++) {
                if(i == 0){
                    answer += Integer.parseInt(bf.readLine().trim());
                } else if(i == size - 1){
                    String[] sArray = bf.readLine().trim().split(" ");
                    for (int j = 0; j < sArray.length; j++) {
                        answer += Integer.parseInt(sArray[j]);
                    }
                } else {
                    String[] sArray = bf.readLine().trim().split(" ");
                    answer += Integer.parseInt(sArray[0]);
                    answer += Integer.parseInt(sArray[sArray.length - 1]);
                }
            }
            bw.write("Case #"+index+":"+answer+"\n");
            index++;
        }
        bw.flush();
        bw.close();
    }

    
}

