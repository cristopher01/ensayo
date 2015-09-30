
package ensayo;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ensayo {

    public static void main(String[] args) {
    Random r = new Random();
        int AprobacionHombres = 0, DesaprobacionMujeres = 0, Aprobacion = 0;
        int Votos = r.nextInt(200) + 50;
        char[][] Votantes = new char[2][Votos];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < Votos; j++) {
                Votantes[i][j] = (char) (r.nextInt(3) + 'a');
                if (String.valueOf(Votantes[0][j]).equals("a")) {
                    AprobacionHombres++;
                }
                if (String.valueOf(Votantes[1][j]).equals("b")) {
                    DesaprobacionMujeres++;
                }
                if (String.valueOf(Votantes[i][j]).equals("a")) {
                    Aprobacion++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "el numero de hombres que aprueban la gestion del gobierno es: " + AprobacionHombres
                + "\n" + "El numero de mujeres que desaprueban la gestion del gobierno es :" + DesaprobacionMujeres
                + "\n" + "El Porcentaje de aprobacion es :" + (Aprobacion * 100 / (Votos*2)) + "%"
                + "\n" + "El total de votantes es: " + Votos);
    }
}

