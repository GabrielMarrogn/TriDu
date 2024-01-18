import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String entrada = br.readLine();
        String[] arr = entrada.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if(b > a){
            System.out.println(b);
        }else{
            System.out.println(a);
        }

    }
}
