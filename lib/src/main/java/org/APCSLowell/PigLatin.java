package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord){
 for(int i = 0; i<sWord.length(); i++){
    
    if(sWord.charAt(i) == 'a' || sWord.charAt(i) == 'e' || sWord.charAt(i) == 'i'|| sWord.charAt(i) == 'o'|| sWord.charAt(i) == 'u'){
      return i;
    }
  }
  return -1;
}



    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        int p = findFirstVowel(sWord);

        
        if( p==0 ){
            return sWord + "way";
        }
        if( sWord.length()>=2 && sWord.substring(0,2).equals("qu")){
            return sWord.substring(2) + "quay";
        }
        if (p==-1){
            return sWord +"ay";
        }

        return sWord.substring(p) + sWord.substring(0,p) + "a";

        
        
    }
}
