// https://www.acmicpc.net/problem/30032
// 알파벳 뒤집기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        for (int i = 0; i < n1; i++) {
            String str = bf.readLine();
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'd'){
                    if(n2 == 1){
                        result.append("q");
                    } else {
                        result.append("b");
                    }
                } else if(c == 'b'){
                    if(n2 == 1){
                        result.append("p");
                    } else {
                        result.append("d");
                    }
                } else if(c == 'q'){
                    if(n2 == 1){
                        result.append("d");
                    } else {
                        result.append("p");
                    }
                } else if(c == 'p'){
                    if(n2 == 1){
                        result.append("b");
                    } else {
                        result.append("q");
                    }
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}
