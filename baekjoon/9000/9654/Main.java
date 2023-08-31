// https://www.acmicpc.net/problem/9654
// 나부 함대 데이터
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n");
        bw.write("N2 Bomber      Heavy Fighter  Limited    21        \n");
        bw.write("J-Type 327     Light Combat   Unlimited  1         \n");
        bw.write("NX Cruiser     Medium Fighter Limited    18        \n");
        bw.write("N1 Starfighter Medium Fighter Unlimited  25        \n");
        bw.write("Royal Cruiser  Light Combat   Limited    4         \n");
        bw.flush();
        bw.close();
    }

}