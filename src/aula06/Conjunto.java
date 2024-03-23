package aula06;

import java.util.Arrays;

public class Conjunto {
    private int count = 0;
    private int[] elementos = new int[1];

    public void insert(int n) {
        if (count == elementos.length) {
            increaseCapacity();
        }
        elementos[count] = n;
        count++;
    }

    private void increaseCapacity() {
        int[] novoArray = new int[elementos.length * 2];
        System.arraycopy(elementos, 0, novoArray, 0, elementos.length);
        elementos = novoArray;
    }

    public boolean contains(int n) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == n) {
                return true;
            }
        }
        return false;
    }

    public void remove(int n) {
        int count = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == n) {
                count++;
            }
        }

        if (count == 0) {
            return;
        }

        int[] copy = new int[elementos.length - count];
        int j = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] != n) {
                copy[j] = elementos[i];
                j++;
            }
        }

        elementos = copy;
    }

    public void empty() {
        this.elementos = new int[1];
    }

    public int size() {
        return this.elementos.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.elementos);
    }

    public Conjunto unir(Conjunto c2) {

        Conjunto c = new Conjunto();

        for (int i = 0; i < this.elementos.length; i++) {
            c.insert(this.elementos[i]);
        }

        for (int i = 0; i < c2.elementos.length; i++) {

            if (!c.contains(c2.elementos[i])) {

                c.insert(c2.elementos[i]);
            }
        }

        return c;

    }

    public Conjunto interset(Conjunto c2) {
        Conjunto c = new Conjunto();
        for (int i = 0; i < c2.elementos.length; i++) {
            if (this.contains(c2.elementos[i])) {
                if (!(c.contains(c2.elementos[i]))) {
                    c.insert(c2.elementos[i]);
                }
            }
        }

        return c;
    }

    public Conjunto subtrair(Conjunto c2) {

        Conjunto diff = new Conjunto();

        for (int i = 0; i < this.elementos.length; i++) {

            if (!c2.contains(this.elementos[i])) {

                if (!(diff.contains(c2.elementos[i]))) {
                    diff.insert(this.elementos[i]);
                }
            }
        }

        return diff;

    }

    public static void main(String[] args) {
        Conjunto c1 = new Conjunto();
        c1.insert(4);
        c1.insert(7);
        c1.insert(6);
        c1.insert(5);
        System.out.println(c1);
        Conjunto c2 = new Conjunto();
        int[] test = { 7, 3, 2, 5, 4, 6, 7 };
        for (int el : test)
            c2.insert(el);
        c2.remove(3);
        c2.remove(5);
        c2.remove(6);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Número de elementos em c1: " + c1.size());
        System.out.println("Número de elementos em c2: " + c2.size());
        System.out.println("c1 contém 6?: " + ((c1.contains(6) ? "sim" : "não")));
        System.out.println("c2 contém 6?: " + ((c2.contains(6) ? "sim" : "não")));
        System.out.println("União:" + c1.unir(c2));
        System.out.println("Interseção:" + c1.interset(c2));
        System.out.println("Diferença:" + c1.subtrair(c2));
        c1.empty();
        System.out.println("c1:" + c1);
    }

}
