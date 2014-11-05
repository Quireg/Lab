package body;


import algorithms.IArrayProviderAlgorithm;
import algorithms.IModifyArrayAlg;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCycle {

    public static final MainCycle mainCycle = new MainCycle();

    private MainCycle(){

    }
    IModifyArrayAlg currentSortingAlgorithm;
    IArrayProviderAlgorithm currentArrayProvidingAlgorithm;
    public void setMainCycle(){
        ArrayList<IModifyArrayAlg> sortingAlgorithms = AlgorithmLoader.algorithmLoader.getSortingAlgorithms();
        ArrayList<IArrayProviderAlgorithm> arrProviderAlgorithms = AlgorithmLoader.algorithmLoader.getArrayProviders();

        while (true) {

            System.out.println("Welcome!");
            System.out.println("Choose arrayModifying algorithm");
            System.out.println();
            int counter = 0;
            for (IModifyArrayAlg o :sortingAlgorithms) {
                counter++;
                System.out.println(counter + " " +o.getClass().getSimpleName());
            }
            System.out.println();
            System.out.println("Press 0 to exit");


            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();

            // MENU LEVEL NUMBER ONE
            if(str.equals("0")){
                System.exit(0);
            }else if(Integer.parseInt(str) > 0 && Integer.parseInt(str) <= sortingAlgorithms.size()){
                // MENU LEVEL NUMBER TWO
                currentSortingAlgorithm = sortingAlgorithms.get(Integer.parseInt(str)-1);
                System.out.println("Good! Now choose the way to fill our array");
                int counter1 = 0;
                for (IArrayProviderAlgorithm o :arrProviderAlgorithms) {
                    counter1++;
                    System.out.println(counter1 + " " +o.getClass().getSimpleName());
                }
                Scanner scanner1 = new Scanner(System.in);
                String str1 = scanner1.next();
                if(Integer.parseInt(str1) > 0 && Integer.parseInt(str1) <= arrProviderAlgorithms.size()){
                    currentArrayProvidingAlgorithm = arrProviderAlgorithms.get(Integer.parseInt(str1)-1);
                    System.out.println("Now enter arr size and we will sort it out");
                    Scanner scanner2 = new Scanner(System.in);
                    String str2 = scanner2.next();
                    int arrSize = 0;
                    try{
                        arrSize = Integer.parseInt(str2);
                    }catch (NumberFormatException e){
                        System.out.println("Not a number");
                    }

                    int[] unsortedArray = currentArrayProvidingAlgorithm.getArray(arrSize);
                    int[][] finalArray = new int[unsortedArray.length][2];
                    for (int i = 0; i < finalArray.length; i++) {
                        finalArray[i][0] = unsortedArray[i];

                    }
                    int[] sortedArray = currentSortingAlgorithm.modifyArray(unsortedArray);
                    for (int i = 0; i < finalArray.length; i++) {
                        finalArray[i][1] = sortedArray[i];

                    }
//                    for (int i = 0; i < unsortedArray.length ; i++) {
//                        System.out.print(unsortedArray[i] + " ");
//                    }
//                    System.out.println();


//                    for (int i = 0; i < sortedArray.length ; i++) {
//                        System.out.print(sortedArray[i] + " \n" );
//                    }
//                    System.out.println();


                    for (int i = 0; i < unsortedArray.length; i++) {
                        System.out.println(finalArray[i][0] +"\t" + finalArray[i][1]);
                    }
                    System.out.println("Done!");
                }else if(Integer.parseInt(str1) == 0){
                    break;
                }else{
                    System.out.println("Invalid option");
                }
            }else{
                System.out.println("Invalid option");
            }


        }
    }

}
