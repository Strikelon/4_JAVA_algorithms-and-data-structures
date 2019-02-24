package hmJava3.GrokaemAlgoritms.dz.homework4.LinkedStack;

public class TestLinkedStack {

    public static void main(String[] args){

        LinkedStack stack = new LinkedStack();

        System.out.println(stack);

        stack.push("Задание1");
        stack.push("Задание2");
        stack.push("Задание3");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

    }

}
