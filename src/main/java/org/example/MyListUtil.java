package org.example;

import java.util.ArrayList;

public class MyListUtil {

    ArrayList<Integer> listaNumeri = new ArrayList<>();

    ArrayList<Integer> ordinaCrescente(ArrayList<Integer> listaNumeri){
        ArrayList<Integer> crescente = listaNumeri;
        Integer temp = 0;
        for (int i = 0; i < crescente.size(); i++){
            for (int j = 0; j < crescente.size(); j++){
                if (crescente.get(i) < crescente.get(j)) {
                    temp = crescente.get(i);
                    crescente.set(i, crescente.get(j));
                    crescente.set(j, temp);
                }
            }
        }
        return crescente;
    }

    ArrayList<Integer> ordinaDecrescente(ArrayList<Integer> listaNumeri){
        ArrayList<Integer> decrescente = listaNumeri;
        Integer temp = 0;
        for (int i = 0; i < decrescente.size(); i++){
            for (int j = 0; j < decrescente.size(); j++){
                if (decrescente.get(i) > decrescente.get(j)) {
                    temp = decrescente.get(i);
                    decrescente.set(i, decrescente.get(j));
                    decrescente.set(j, temp);
                }
            }
        }
        return decrescente;
    }


}


