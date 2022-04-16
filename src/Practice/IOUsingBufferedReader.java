package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUsingBufferedReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

//        int n = Integer.parseInt(br.readLine());
//        System.out.println(n);

//        char s = (char)(br.read());
//        System.out.println(s);

        String s = br.readLine();
        String[] input = new String[2];
        input = s.split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(x + y);

        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            String str = br.readLine();
            String[] in = str.trim().split(" ");
            for (int j = 0; j < y; j++) {
                arr[i][j] = Integer.parseInt(in[j]);
            }
        }
//1 2 3
//4 5 6
//7 8 9

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
