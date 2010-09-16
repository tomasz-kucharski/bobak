/**
 * @author tomekk
 * @since 2010-09-16, 18:22:51
 */
public class Bobak {
    public static final String HELLO_BOBAK = "I'm Bobak";
    public static final String ARGH = "Arghhh!!!";

    private int countOfSayHello;

    public String sayHello() {
        countOfSayHello++;
        if (countOfSayHello < 3) {
            return HELLO_BOBAK;
        } else {
            return ARGH;
        }
    }
}
