// https://www.acmicpc.net/problem/30272
// Atsitiktinių skaičių generatorius
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder answer = new StringBuilder();
        String[] array = {
            "..#####...##...##.##.....####.....####.....##.##...##...#####..........."
            ,"....##.....####.......##.......##.......##.......##.....######.........."
            ,".#######.##.....##.......##.#######.##.......##.......#########........."
            ,".#######.##.....##.......##.#######........####.....##.#######.........."
            ,"##.......##....##.##....##.##....##.#########......##.......##.........."
            ,".########.##.......##.......#######........##.##....##..######.........."
            ,".#######.##.....####.......########.##.....####.....##.#######.........."
            ,".########.##....##.....##......##......##.......##.......##............."
            ,".#######.##.....####.....##.#######.##.....####.....##.#######.........."
            ,".#######.##.....####.....##.########.......####.....##.#######.........."
        };
        
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                sb.append(bf.readLine());
            }
            for (int j = 0; j < array.length; j++) {
                if(array[j].equals(sb.toString())){
                    answer.append(String.valueOf(j));
                    break;
                }
            }
        }
        System.out.println(answer.toString());
        bw.flush();
        bw.close();
    }


}
