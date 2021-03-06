package examenrefactcod;

/**
 *
 * @author mgonzalezlorenzo
 */
public class ExamenRefactCOD {

    public static boolean variableBooleana = false;

    public static void main(String[] args) {
        int digitos = 3;
        int numdigitos = 0;
        MetodoIntroducir(digitos);
        for (int j = 1; j <= 99999; j++) {
            int aux = j;

            int cont = 0;

            cont = MetodoWhileCont(aux, cont);
            numdigitos = cont;

            MetodoIfs(numdigitos, digitos, j);
        }
    }

    public static int MetodoWhileCont(int aux, int cont) {
        while (aux != 0) {
            aux = aux / 10;
            cont++;
        }
        return cont;
    }

    public static void MetodoIntroducir(int digitos) {
        if (digitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
    }

    public static void MetodoIfs(int numdigitos, int digitos, int j) {
        if (numdigitos == digitos) {
            if (j < 4) {
                variableBooleana = true;
            } else {
                if (j % 2 == 0) {
                    variableBooleana = false;
                } else {
                    int cont1 = 0;
                    int i1 = 1;
                    int z = (j - 1) / 2;
                    if (z % 2 == 0) {
                        z--;
                    }

                    while (i1 <= z) {
                        if (j % i1 == 0) {
                            cont1++;
                        }
                        i1 += 2;
                        if (cont1 == 2) {
                            i1 = z + 1;
                        }
                    }

                    if (cont1 == 1) {
                        variableBooleana = true;
                    }
                }
            }

            if (variableBooleana == true) {
                System.out.println(j);
            }
        }
    }

}
