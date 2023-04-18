package daily;

public class Tablice {
    public static void main(String[] args) {
        System.out.println("to ja ");

        //int[] table = new int[4];

        int[] table = new int[]{10, 15, 3, 7};
        int  sum = 17;

        //for (int i = 0; i < 4; i++)
        //    table[i] = i + 1;

       // int zmienna = table[3];

        for (int i = 0; i < 4; i++)
            System.out.println("Kolejna komórka to: " + table[i]);

        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++)
                if (j!=k)
                    if (table[j] + table[k] == sum)
                    {
                        System.out.println("suma się zgadza" + j + k);
                        continue;
                    }
        }


        //table = {10, 15, 3, 7};
        //System.out.println(table[0]);
    }
}
