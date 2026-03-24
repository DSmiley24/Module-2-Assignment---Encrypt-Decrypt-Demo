import java.math.BigInteger;

class Asymmetric {
    BigInteger p, q; // prime numbers
    BigInteger n, phi;
    BigInteger e, d; // keys

    public Asymmetric(int pVal, int qVal, int eVal) {
        p = BigInteger.valueOf(pVal);
        q = BigInteger.valueOf(qVal);
        e = BigInteger.valueOf(eVal);
        n = p.multiply(q);
        phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        d = e.modInverse(phi);
    }

    // Encrypt method
    public BigInteger encryptNum(BigInteger message) {
        return message.modPow(e, n);
    }

    // Decrypt method
    public BigInteger decryptNum(BigInteger ciphertext) {
        return ciphertext.modPow(d, n);
    }

    // Print method
    public void printKeys() {
        System.out.println("Public key:" + e);
        System.out.println("Private key:" + d);
    }

    public static void main(String[] args) {

        BigInteger myNum = BigInteger.valueOf(2314);

        Asymmetric test1 = new Asymmetric(61, 53, 17);
        test1.printKeys();
        
        System.out.println("");
        System.out.println("Secret Number: " + myNum);

        myNum = test1.encryptNum(myNum);
        System.out.println("Encrypted Number: " + myNum);

        myNum = test1.decryptNum(myNum);
        System.out.println("Decrypted Number: " + myNum);

        System.out.println("");
        myNum = BigInteger.valueOf(1596);

        Asymmetric test2 = new Asymmetric(47, 59, 13);
        test2.printKeys();

        System.out.println("");
        System.out.println("Secret Number: " + myNum);

        myNum = test2.encryptNum(myNum);
        System.out.println("Encrypted Number: " + myNum);

        myNum = test2.decryptNum(myNum);
        System.out.println("Decrypted Number: " + myNum);
    }
}