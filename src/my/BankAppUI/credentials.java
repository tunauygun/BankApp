/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.BankAppUI;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author uygun
 */
public class credentials {
    public static String verifiedUsername;
    public static String verifiedPassword;
    public static int accountNumber;
    public static ArrayList<String[]> userCredentials = new ArrayList<String[]>();
    
    public static void addNewUser(String userID,String password){
        String[] newCredentials = {userID,password,"0"};
        userCredentials.add(newCredentials);
    };
    
    public static boolean checkForUser(String userID,String password){
        String[] inputCredentials = {userID, password};
        boolean isValidUser = false;
        for(int i=0; i<userCredentials.size(); i++){
            //String[] validUserCredentials = Arrays.copyOf(userCredentials.get(i), userCredentials.get(i).length-1);
            String[] validUserCredentials = {userCredentials.get(i)[0], userCredentials.get(i)[1]};
            
            if( Arrays.equals(validUserCredentials, inputCredentials)){
                isValidUser = true;
                verifiedUsername = userID;
                verifiedPassword = password;
                accountNumber = i;
                break;
            } else {
                isValidUser = false;   
            }
        }
        
        return isValidUser;
    }

}
