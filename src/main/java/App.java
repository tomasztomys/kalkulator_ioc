import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.behaviors.Caching;
import org.picocontainer.containers.SystemPropertiesPicoContainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by inf117182 on 02.06.2017.
 */
public class App {

    public static void main(String[] arg) {
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(Kalkulator.class);
        pico.addComponent(Dodawanie.class);
        pico.addComponent(Odejmowanie.class);

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Wprowadź pierwsza liczbę: ");
        int first = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Wprowadź drugą liczbę: ");
        int second = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Wprowadź operator: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String operator = null;
        try {
            operator = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Kalkulator kalkulator = pico.getComponent(Kalkulator.class);
        System.out.println(kalkulator.calculate(first, second, String.valueOf(operator.charAt(0))));

    }
}
