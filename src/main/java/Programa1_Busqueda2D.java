public class Programa1_Busqueda2D {
    
    public static void main(String[] args) {
        // Declarar una matriz 3x3 de enteros
        int[][] matriz = {
            {15, 20, 9},
            {16, 22, 14},
            {7, 32, 21}
        };
        
        // Mostrar la matriz
        System.out.println("Matriz 3x3:");
        mostrarMatriz(matriz);
        System.out.println();
        
        // Buscar varios valores para demostrar el funcionamiento
        int[] valoresBuscar = {20, 32, 88, 15, 75};
        
        for (int valor : valoresBuscar) {
            int[] posicion = buscarEnMatriz(matriz, valor);
            
            if (posicion[0] == -1 && posicion[1] == -1) {
                System.out.println("El valor " + valor + " NO se encontró en la matriz.");
            } else {
                System.out.println("El valor " + valor + " se encontró en la posición [" + 
                                 posicion[0] + ", " + posicion[1] + "]");
            }
        }
    }
    
    /**
     * Busca un valor específico en una matriz 2D
     * @param matriz La matriz donde buscar
     * @param valor El valor a buscar
     * @return Un arreglo con la posición [fila, columna] o [-1, -1] si no se encuentra
     */
    public static int[] buscarEnMatriz(int[][] matriz, int valor) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == valor) {
                    return new int[]{fila, columna};
                }
            }
        }
        // Si no se encuentra, retornar [-1, -1]
        return new int[]{-1, -1};
    }
    
    /**
     * Método auxiliar para mostrar la matriz en consola
     * @param matriz La matriz a mostrar
     */
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}

       
     



