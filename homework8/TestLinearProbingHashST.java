package hmJava3.GrokaemAlgoritms.dz.homework8;

public class TestLinearProbingHashST {

    public static void main(String[] args){

        LinearProbingHashST lphst = new LinearProbingHashST(7,-1);
        lphst.put(1,"один");
        lphst.put(2,"два");
        lphst.put(3,"три");
        lphst.put(8,"восемь");

        System.out.println(lphst.get(3));
        lphst.delete(2);
        System.out.println(lphst.get(2));
        System.out.println(lphst.get(8));

    }

}
