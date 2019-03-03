package hmJava3.GrokaemAlgoritms.dz.homework8;

public class TestChainingHash {

    public static void main(String[] args){

        ChainingHashST<Integer, String> chst = new ChainingHashST(7);

        chst.put(1,"один");
        chst.put(2,"два");
        chst.put(3,"три");
        chst.put(8,"восемь");
        chst.put(71,"семьдесят один");
        chst.put(72,"семьдесят два");

        System.out.println(chst);
        System.out.println(chst.get(71));

        chst.delete(71);
        System.out.println(chst);
        System.out.println(chst.get(71));

        chst.delete(2);
        System.out.println(chst);
        System.out.println(chst.get(2));

    }

}
