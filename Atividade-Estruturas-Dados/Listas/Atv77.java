package Listas;

import java.util.ArrayList;
import java.util.List;

public class Atv77 {
    public static void main(String[] args) {
        List<Integer> v = new ArrayList<>();
        v.add(5);
        v.add(1);
        v.add(4);
        v.add(2);
        v.add(7);
        v.add(8);
        v.add(3);
        v.add(6);
        
        for (int i = 8; i >= 5; i--) {
            int aux = v.get(i);
            v.set(i, v.get(8 - i + 1));
            v.set(8 - i + 1, aux);
        }
        
        v.set(3, v.get(1));
        v.set(v.get(3), v.get(v.get(2)));
        
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
    }
}
