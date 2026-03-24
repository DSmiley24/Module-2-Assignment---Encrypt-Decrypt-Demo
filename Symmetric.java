public class Symmetric {
    
    int num; // Secret Number
    int key;
    int Enum;

    public Symmetric(int number, int encryptionNum) {
        num = number;
        key = encryptionNum;
        Enum = num;
    }

    public void encryptNum() {
        Enum *= key;
    }

    public void decryptNum() {
        if (Enum == num) {
            System.out.println("ERROR: NUMBER NOT ENCRYPTED");
        } else {
            Enum /= key;
        }
    }

    public static void main(String[] args) {
        Symmetric test1 = new Symmetric(27, 92);
        System.out.println("Secret Number: " + test1.Enum);
        
        test1.encryptNum();
        System.out.println("Encrypted Secret Number: " + test1.Enum);

        test1.decryptNum();
        System.out.println("Decrypted Secret Number: " + test1.Enum);

        System.out.println("");

        Symmetric test2 = new Symmetric(12, 50);
        System.out.println("Secret Number: " + test2.Enum);

        test2.decryptNum();
        
        test2.encryptNum();
        System.out.println("Encrypted Secret Number: " + test2.Enum);

        test2.decryptNum();
        System.out.println("Decrypted Secret Number " + test2.Enum);
    }
}
