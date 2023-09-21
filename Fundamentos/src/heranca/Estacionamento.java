/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Aluno
 */
public class Estacionamento {

    public static void main(String[] args) throws UnsupportedEncodingException {
     System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Carro gol = new Carro("Gol bolinha muito conservado", 1999, "Azul", "G2", "Volkswagem",
                13999.00, false, false, 3, CambioEnum.MANUAL,
                CombustivelEnum.GASOLINA);
        System.out.println(gol);
        System.out.println("--------------------------");

        Moto hornet = new Moto("Moto hornet 600C rãndãndãn", 2014, "Preto", "Hornet", "Honda", 40000, true, true, CombustivelEnum.GASOLINA, PartidaEnum.ELETRICA);
        System.out.println(hornet);
        System.out.println("--------------------------");

        Scooter scooter = new Scooter(2200, "Scooter elétrica", 2023, "Cinza", "Elektra", "Honda", 10000, true, false);
        System.out.println(scooter);
        System.out.println("--------------------------");
    }
}
