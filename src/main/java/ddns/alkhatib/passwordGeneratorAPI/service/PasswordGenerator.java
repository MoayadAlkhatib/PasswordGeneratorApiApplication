package ddns.alkhatib.passwordGeneratorAPI.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PasswordGenerator {
    private int length = 8;


    public String getPass(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<length; i++){
          sb.append(getRandomChar());
        }
        String str = sb.toString();
        return str;
    }

    private static char getRandomChar(){
        Random rn = new Random();
        return(char)(33+ rn.nextInt(63));
    }

    public String getPass(int length){
        this.length = length;
        return getPass();
    }
}
