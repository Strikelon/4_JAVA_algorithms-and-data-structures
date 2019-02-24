package hmJava3.GrokaemAlgoritms.dz.homework5;

public class BackpackRecursion {

    public static void main(String[] args){

        final int BACK_PACK_WEIGHT = 4;
        final int THIGNS_COUNT = 3;

        Thing[] things = new Thing[THIGNS_COUNT+1];

        things[0] = new Thing(0,0);
        things[1] = new Thing(3000, 4);
        things[2] = new Thing(2000, 3);
        things[3] = new Thing(1500, 1);

        System.out.println("Answer:" + calculateValue(things, BACK_PACK_WEIGHT));
        System.out.println();

        final int BACK_PACK_WEIGHT_FIVE = 5;
        final int THIGNS_COUNT_SIX = 5;

        Thing[] things2 = new Thing[THIGNS_COUNT_SIX + 1];

        things2[0] = new Thing(0,0);
        things2[1] = new Thing(3000, 4);
        things2[2] = new Thing(4000, 5);
        things2[3] = new Thing(2000, 3);
        things2[4] = new Thing(1500, 1);
        things2[5] = new Thing(2000,2);

        System.out.println("Answer:" + calculateValue(things2, BACK_PACK_WEIGHT_FIVE));

    }

    public static int calculateValue(Thing[] things, int maxWeight){

        return calculateValue(things,
                things.length - 1, maxWeight);

    }

    public static int calculateValue(Thing[] things, int i, int j){

        if(i == 0){

            return 0;

        }else if(things[i].getWeight()>j){

            return calculateValue(things,i-1, j);

        }else {

            return Integer.max(
                    calculateValue(things,i-1, j),
                    calculateValue(things,i-1, j - things[i].getWeight()) + things[i].getValue()
            );

        }

    }

}
