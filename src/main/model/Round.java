package model;

public interface Round {
    // REQUIRES: inputBytes should have length equal to blockSize of the cipher
    // EFFECTS: returns an encrypted bytearray, depending on the Round type
    Byte[] encryptRound(Byte[] plaintextBytes);

    // REQUIRES: inputBytes should have length equal to blockSize of the cipher
    // EFFECTS: returns a decrypted bytearray, depending on the Round type
    Byte[] decryptRound(Byte[] ciphertextBytes);
}
