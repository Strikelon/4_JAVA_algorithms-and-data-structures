package hmJava3.GrokaemAlgoritms.dz.homework5;

public class BackpackDinamic {

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

        int[][] valueMatrix = new int[things.length][maxWeight+1];

        for(int i=1; i<valueMatrix.length; i++){
            for(int j=0; j<valueMatrix[0].length; j++){

                if (things[i].getWeight()>j){

                    valueMatrix[i][j] = valueMatrix[i-1][j];

                }else {

                    valueMatrix[i][j] = Integer.max(
                            valueMatrix[i-1][j],
                            valueMatrix[i-1][j - things[i].getWeight()] + things[i].getValue()
                    );

                }

            }
        }

        for(int i=0; i<valueMatrix.length; i++) {
            for (int j = 0; j < valueMatrix[0].length; j++) {
                System.out.print(valueMatrix[i][j] + " ");
            }
            System.out.println();
        }

        return valueMatrix[valueMatrix.length-1][valueMatrix[0].length-1];
    }
}
