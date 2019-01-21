import java.util.Scanner;

public class Etoile {
    public static void main(String[] args) {

        int n, i,j,k;
        n = 10;
        String espace = " ";

        /**
         * n = nombre de tour
         * la 1ere boucle for permet de faire un nombre de tours
         * la 2eme boucle for permet d'ajouter 1 etoile en plus apres le debut du 1er tour de la 1ere boucle
         * et de revenir a la ligne
         */
        for(i=0; i<n ; i++){
            for (j=0 ; j<i; j++)
                System.out.print("*");
            System.out.println();

        }
        /**
         * la 1ere boucle for permet de faire un nombre de tours
         * la 2eme boucle for permet d'ajouter le nombre d'espace (inverse du nombre d'étoile)
         * la 3eme boucle permet d'ajouter le nombre d'étoile de façon a faire un triangle (si i = 0
         * donc i*2 = 0 , 0+1 =1, donc 1er tour 1 etoile).
         */
        for(i=0;i<n; i++) {
            for(j=0;j<n-i;j++)
                System.out.print(espace);
            for(k=0; k<(i*2+1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
