package Module_1Project;

public abstract class Cryptography {
    abstract String encrypt(String text, int shiftKey);
    abstract String decrypt(String text, int shiftKey);
}
