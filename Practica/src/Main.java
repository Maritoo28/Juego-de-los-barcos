public class Main {
    public static void main(String[] args) {

        int N = 8;
        int barcos[] = {4,3,3,2,2,2,1,1,1,1};
        int tablero1[][] = new int[N][N];
        int tablero2[][] = new int[N][N];


    ensenartablero(tablero1);
    //ensenartablero(tablero2);
    ponerbarcos(barcos,tablero1);
    ponerbarcos(barcos,tablero2);
    ensenartablero(tablero1);
    ensenartablero(tablero2);

    }
    public static void ensenartablero (int [][] tablero) {
        for (int j = 0;j<tablero.length;j++) {
            for (int i = 0;i<tablero.length;i++) {
                System.out.print(tablero[j][i]);
            }
            System.out.println(" ");

        }
        System.out.println("----------------------------------");

    }
    public static void ponerbarcos ( int [] barcos,int [][] tablero1) {
        int aleatoriox = 0;
        int aleatorioy = 0;
        for (int i = 0; i < barcos.length; i++) {
            if (barcos[i] == 4) {
                aleatoriox = (int) (Math.random() * 8);
                aleatorioy = (int) (Math.random() * 8);

                tablero1[aleatoriox][aleatorioy] = 4;
                if (aleatorioy + 1 < 8 && aleatorioy + 2 < 8 && aleatorioy + 3 < 8) { //DERECHA
                    tablero1[aleatoriox][aleatorioy + 1] = 4;
                    tablero1[aleatoriox][aleatorioy + 2] = 4;
                    tablero1[aleatoriox][aleatorioy + 3] = 4;
                } else if (aleatoriox + 1 < 8 && aleatoriox + 2 < 8 && aleatoriox + 3 < 8) { //ABAJO
                    tablero1[aleatoriox + 1][aleatorioy] = 4;
                    tablero1[aleatoriox + 2][aleatorioy] = 4;
                    tablero1[aleatoriox + 3][aleatorioy] = 4;
                } else if (aleatorioy - 1 >= 0 && aleatorioy - 2 >= 0 && aleatorioy - 3 >= 0) { //IZQUIERDA
                    tablero1[aleatoriox][aleatorioy - 1] = 4;
                    tablero1[aleatoriox][aleatorioy - 2] = 4;
                    tablero1[aleatoriox][aleatorioy - 3] = 4;
                } else if (aleatoriox - 1 >= 0 && aleatoriox - 2 >= 0 && aleatoriox - 3 >= 0) { //ARRIBA
                    tablero1[aleatoriox - 1][aleatorioy] = 4;
                    tablero1[aleatoriox - 2][aleatorioy] = 4;
                    tablero1[aleatoriox - 3][aleatorioy] = 4;
                }
            }

            if (barcos[i] == 3) {
                aleatoriox = (int) (Math.random() * 8);
                aleatorioy = (int) (Math.random() * 8);
                tablero1[aleatoriox][aleatorioy] = 3;

                if (aleatorioy + 1 < 8 && aleatorioy + 2 < 8) { //DERECHA
                    tablero1[aleatoriox][aleatorioy + 1] = 3;
                    tablero1[aleatoriox][aleatorioy + 2] = 3;

                } else if (aleatoriox + 1 < 8 && aleatoriox + 2 < 8) { //ABAJO
                    tablero1[aleatoriox + 1][aleatorioy] = 3;
                    tablero1[aleatoriox + 2][aleatorioy] = 3;

                } else if (aleatorioy - 1 >= 0 && aleatorioy - 2 >= 0) { //IZQUIERDA
                    tablero1[aleatoriox][aleatorioy - 1] = 3;
                    tablero1[aleatoriox][aleatorioy - 2] = 3;

                } else if (aleatoriox - 1 >= 0 && aleatoriox - 2 >= 0) { //ARRIBA
                    tablero1[aleatoriox - 1][aleatorioy] = 3;
                    tablero1[aleatoriox - 2][aleatorioy] = 3;

                }
            }
            if (barcos[i] == 2) {
                aleatoriox = (int) (Math.random() * 8);
                aleatorioy = (int) (Math.random() * 8);
                tablero1[aleatoriox][aleatorioy] = 2;
                if (aleatorioy + 1 < 8) { //DERECHA
                    tablero1[aleatoriox][aleatorioy + 1] = 2;


                } else if (aleatoriox + 1 < 8) { //ABAJO
                    tablero1[aleatoriox + 1][aleatorioy] = 2;


                } else if (aleatorioy - 1 >= 0) { //IZQUIERDA
                    tablero1[aleatoriox][aleatorioy - 1] = 2;


                } else if (aleatoriox - 1 >= 0) { //ARRIBA
                    tablero1[aleatoriox - 1][aleatorioy] = 2;


                }

            }
            if (barcos[i] == 1) {
                aleatoriox = (int) (Math.random() * 8);
                aleatorioy = (int) (Math.random() * 8);
                if (tablero1[aleatoriox][aleatorioy] != 1) {
                    tablero1[aleatoriox][aleatorioy] = 1;
                } else if(tablero1[aleatoriox][aleatorioy + 1] != 1){ //DERECHA
                    tablero1[aleatoriox][aleatorioy + 1] = 1;
                } else if (tablero1[aleatoriox + 1][aleatorioy] != 1) { //ABAJO
                    tablero1[aleatoriox + 1][aleatorioy] = 1;
                } else if (tablero1[aleatoriox][aleatorioy - 1] != 1) { //IZQUIERDA
                    tablero1[aleatoriox][aleatorioy - 1] = 1;
                } else if ( tablero1[aleatoriox - 1][aleatorioy] != 1) { //ARRIBA
                    tablero1[aleatoriox - 1][aleatorioy] = 1;

                }
            }
        }
    }
}