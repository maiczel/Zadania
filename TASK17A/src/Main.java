public class Main {
    public static void main(String[] args){

        int [] tab = new int [10];// pierwszy sposób przypisania wartości do tablicy
        tab[0] = 0;
        tab[1] = 1;
        tab[2] = 2;
        tab[3] = 3;
        tab[4] = 4;
        tab[5] = 5;
        tab[6] = 6;
        tab[7] = 7;
        tab[8] = 8;
        tab[9] = 9;


        int [] tab1  = {0,1,2,3,4,5,6,7,8,9}; // drugi sposób przypisania wartosci do tablicy

        System.out.println(tab1);

        int[] tab2 = new int [10];

        for(int i = 0; i < tab2.length; i ++){ // trzeci sposób przypisania wartości do tablicy
            tab2[i] = i;
            System.out.println(tab[i]);

        }
    }
}
