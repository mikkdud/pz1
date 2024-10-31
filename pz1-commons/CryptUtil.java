package pz1.pok_lab02;

import org.apache.commons.codec.digest.DigestUtils;

public class CryptUtil {

    /**
     * Generuje hash SHA-512 dla podanego tekstu.
     *
     * @param input Tekst, dla którego generujemy hash
     * @return Hash SHA-512 w formie ciągu znaków hex
     */
    public static String generateSHA512(String input) {
        return DigestUtils.sha512Hex(input);
    }
}
