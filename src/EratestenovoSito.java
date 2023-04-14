public class EratestenovoSito {
    public EratestenovoSito() {
    }
    public static boolean[] Sito(int limit){;

        // získání horní meze prvočísel
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ceiling of the prime numbers: "); // horní mez = ceiling
        int n = sc.nextInt();
        sc.close();*/

        // init numbers array, type boolean - where ture denotes primality
        boolean[] isPrime = new boolean[limit];

        // initialze all elements to true because in default the are all false
        isPrime[0] = false;
        for (int i = 1; i < limit; i+=2) { // začínám 1, protože 0 není prvočíslo tak nechám false
            isPrime[i] = true;
        }

        // check every number >= 2 for primality
        double limitOd = Math.sqrt(limit);
        for (int j = 2; j <= limitOd; j++) {

            // i is prime if it hasnt been crossed off yet

            if(isPrime[j*2 + 1])
            { // není potřeba isPrime[j - 1] == true, protože samo osobě isPrime[j - 1] bude platit jestlo je true

                // crossing of all the subsequent multiples of j
                for (int k = 2*j; k <= limit; k += j)
                {
                    if (j % 2 != 0)
                    {
                        isPrime[(k+1)/2] = false;
                    }
                }

            }


        }
        return isPrime;
    }
}
