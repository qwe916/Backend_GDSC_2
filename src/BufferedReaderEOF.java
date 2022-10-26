import java.io.*;

/**
 * BufferedReader, BufferedWriter
 */
public class BufferedReaderEOF {
    public static void main(String[] args) throws IOException {
        //BufferedReader & BufferedWriter
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        /**
         * br로 읽어온 후 bw로 쓰기
         */
        while ((str = br.readLine()) != null) {
            bw.write(str + "\n");
        }
        bw.write("BufferedReader EOF");
        bw.flush();//^d 후 출력
        //br, bw 종료
        bw.close();
        br.close();
    }
}
