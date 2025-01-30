public class Main {
    public static void main(String[] args) {

        int N = 8;
        int Barcos[] = {4,3,3,2,2,2,1,1,1,1};
        int tablero1[][] = new int[N][N];
        int tablero2[][] = new int[N][N];

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

    }


}