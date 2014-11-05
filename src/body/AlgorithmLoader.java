package body;

import algorithms.IArrayProviderAlgorithm;
import algorithms.IModifyArrayAlg;

import java.io.File;
import java.util.ArrayList;

public class AlgorithmLoader  {

    public static final AlgorithmLoader algorithmLoader = new AlgorithmLoader();

    private AlgorithmLoader(){
    };


    public ArrayList<IArrayProviderAlgorithm> getArrayProviders(){
        ArrayList<IArrayProviderAlgorithm> arrayProviderArrayList = new ArrayList<IArrayProviderAlgorithm>();
        File file = new File("C:\\Users\\blaze.fun\\Desktop\\Lab\\out\\production\\Lab\\algorithms\\arrayFilling");
        String[] fileNames = file.list();
        for (String s :fileNames) {
            try {
                Class aClass = Class.forName("algorithms.arrayFilling." + s.split("\\.")[0]);
                IArrayProviderAlgorithm IArrayProviderAlgorithm = (IArrayProviderAlgorithm) aClass.newInstance();
                arrayProviderArrayList.add(IArrayProviderAlgorithm);
                System.out.println("Class loaded " + aClass.getName());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }catch (ClassCastException e){
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return arrayProviderArrayList;
    }
    public ArrayList<IModifyArrayAlg> getSortingAlgorithms(){
        ArrayList<IModifyArrayAlg> IModifyArrayAlgs = new ArrayList<IModifyArrayAlg>();
        File file = new File("C:\\Users\\blaze.fun\\Desktop\\Lab\\out\\production\\Lab\\algorithms\\arrayModifying");
        String[] fileNames = file.list();
        for (String s :fileNames) {
            try {
                Class aClass = Class.forName("algorithms.arrayModifying." + s.split("\\.")[0]);
                IModifyArrayAlg IModifyArrayAlg = (IModifyArrayAlg) aClass.newInstance();
                IModifyArrayAlgs.add(IModifyArrayAlg);
                System.out.println("Class loaded " + aClass.getName());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }catch (ClassCastException e){
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return IModifyArrayAlgs;
    }
}
