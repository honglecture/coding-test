// https://www.acmicpc.net/problem/5339
//  콜센터
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("     /~\\\n");
        bw.write("    ( oo|\n");
        bw.write("    _\\=/_\n");
        bw.write("   /  _  \\\n");
        bw.write("  //|/.\\|\\\\\n");
        bw.write(" ||  \\ /  ||\n");
        bw.write("============\n");
        bw.write("|          |\n");
        bw.write("|          |\n");
        bw.write("|          |\n");
        bw.flush();
        bw.close();
    }
}