package in.akshit.service;


import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Service
public class BaseEncoder {
	
    public static String base64Encoder(String fileName) throws IOException{
    	File file = new File(fileName);
    	String encodedFileString = "";
    	BufferedInputStream reader = null;
    	if(file.exists()){
    		int length = (int) file.length();
    		try{
    			reader = new BufferedInputStream(new FileInputStream(file));
                byte[] bytes = new byte[length];
                reader.read(bytes, 0, length);
                reader.close();
                
                byte[] encoded = Base64.encodeBase64(bytes);
                encodedFileString = new String(encoded);
    		}
    		finally{
    			if(reader!=null){
    				reader.close();
    			}
    		}
        	
        	
    	}
    	return encodedFileString;	
    }
}

