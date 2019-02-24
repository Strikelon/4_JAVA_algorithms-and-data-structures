package hmJava3.GrokaemAlgoritms.dz.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringStack {

    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = null;

        try {
            string = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        NewStack<Character> stack = new NewStack<>();

        for(int i=0; i<string.length(); i++){
            stack.push(string.charAt(i));
        }
        for(int i=0; i<string.length();i++){
            System.out.print(stack.pop());
        }

    }

}
