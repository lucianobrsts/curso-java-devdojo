package br.com.devdojo.collections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("meza", "mesa");

        //Chave
        for(String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("--------------------");

        //Valor
        for(String key : map.values()) {
            System.out.println(key);
        }
        System.out.println("--------------------");

        //Chave e Valor
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
