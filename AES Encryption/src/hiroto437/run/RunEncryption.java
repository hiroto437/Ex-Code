package hiroto437.run;

import hiroto437.api.AESEncryption;

public class RunEncryption {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        final String strToEncrypt = "noppong";
        final String strPssword = "hiroto437";
                
       String strToDecrypts =  AESEncryption.Encrypt(strToEncrypt,strPssword);
       System.out.println("Encrypted String: " + strToDecrypts);
    }
}
