import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {
    private String[] palabra;


    @BeforeEach
    public void init() {
        palabra = new String[]{"200", "", "aaabccbaaa", "ahabccbaaa", "la tele letal"};
    }

    @Test
    public void Test() {
        Palindromo a = new Palindromo();
        for (int i = 0; i < palabra.length; i++) {
            boolean b = a.Validador(palabra[i].replace(" ",""));
            if (b == true) {
                System.out.println("Palindromo");
            } else {
                System.out.println("No es palindromo");
            }
        }
    }

    @AfterEach
    void tearDown() {
        palabra = null;
    }
}