// https://www.acmicpc.net/problem/25703
// 포인터 공부
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        bw.write("int a;\n");
        bw.write("int *ptr = &a;\n");
        int count = 2;
        for (int i = 0; i < size - 1; i++) {
            StringBuilder answer = new StringBuilder();
            answer.append("int ");
            for (int j = 0; j < count; j++) {
                answer.append("*");
            }
            answer.append("ptr" + count + " = ");
            if(count == 2){
                answer.append("&ptr;");
            } else {
                answer.append("&ptr"+(count - 1)+";");
            }
            bw.write(answer.toString() + "\n");
            count++;
        }
        bw.flush();
        bw.close();
    }

}
