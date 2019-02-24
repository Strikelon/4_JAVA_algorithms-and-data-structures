package hmJava3.GrokaemAlgoritms.dz.homework3;

public class TestStack {

    public static void main(String[] args){

        NewStack<Integer> stack = new NewStack<>(5);
        System.out.println(stack);

        stack.push(1);
        stack.push(2);
        System.out.println(stack);

        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        stack.push(5);
        System.out.println(stack);

        stack.push(6);
        stack.push(7);
        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);

        NewStack<Integer> stack2 = new NewStack<>(3);
        for(int i=0; i<15; i++){
            stack2.push(i);
        }
        System.out.println(stack2);
        for(int i=0; i<11; i++){
            stack2.pop();
        }
        System.out.println(stack2);

    }

}
