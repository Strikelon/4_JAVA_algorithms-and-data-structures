package hmJava3.GrokaemAlgoritms.dz.homework6;

import java.util.Random;

// Решал задачу по вычислению сбалансированность деревьев
// исходя из определения:
// Дерево называется сбалансированным, если высоты двух поддеревьев каждого из его узлов
// отличаются не более чем на единицу.
// взял от сюда: https://studfiles.net/preview/6128951/page:22/
// просто я проверял высоты получившихся деревьев, там никогда не получается 6 уровней, всегда больше

public class Main {

    final static int NUMBERS_OF_TREES = 20;

    public static void main(String[] args){

        Random random = new Random();

        Tree[] treeArray = new Tree[NUMBERS_OF_TREES];

        double countOfBalacedTrees = 0;

        for(int k = 0; k < NUMBERS_OF_TREES; k++) {

            treeArray[k] = new Tree();


            for (int i = 0; i < 63; i++) {

                Integer randomInt = random.nextInt(100);

                treeArray[k].put(randomInt, randomInt);

            }

            System.out.println(treeArray[k]);
            boolean isTreeBalanced = treeArray[k].isBalanced();
            System.out.println("Is balanced: " + isTreeBalanced);
            if(isTreeBalanced){
                countOfBalacedTrees++;
            }

        }

        System.out.println("Количество сбалансированных деревьев: " + countOfBalacedTrees);
        System.out.println("Это: " + (countOfBalacedTrees/NUMBERS_OF_TREES)*100 + "%");


    }



}
