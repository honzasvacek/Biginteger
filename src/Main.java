import javax.swing.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        //vytvořím si objekt síto
        EratestenovoSito sito = new EratestenovoSito();

        //vytvořím limit
        int limit =  Integer.MAX_VALUE/2;
        boolean[] isPrime = sito.Sito(limit);

        for (int j = limit; j > 0; j--) {
            if(isPrime[j-1])
            {
                System.out.println("Nejvetsi provocislo od 0 do "+ limit + " je: " + j);
                break;
            }
        }

        int pocet = 0;

        for (int i = 0; i < limit; i++) {
            if(isPrime[i])
            {
                pocet++;
            }
        }

        System.out.println("Celkem jich je: " + pocet);
    }
    public static int nejvetsiPrvocislo(int limit)
    {
        boolean jePrv = false;
        for (int i = limit; i > 0; i--)
        {
            int num = i;
            System.out.println(i);

            for (int j = 2; j < i-1; j++)
            {
                if (i % j != 0)
                {
                    jePrv = false;
                }
                else
                {
                    jePrv = true;
                }
            }
            if (jePrv)
            {
                return num;
            }
        }
        return 0;
    }
}