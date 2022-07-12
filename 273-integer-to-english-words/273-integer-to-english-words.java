class Solution {
    
        
    public String numberToWords(int num) {
        
        if(num==0) return "Zero";
        
        int billions = num / 1000000000;
        int millions = (num - billions *1000000000 ) / 1000000;
        int thousands = (num - billions *1000000000 - millions *1000000 ) /1000;
        int rest = (num - billions *1000000000 - millions *1000000 - thousands *1000);
        
        StringBuilder word = new StringBuilder();
        
        //has billion in the word
        if(billions!=0){
            word.append(threeDigits(billions)+ " Billion");
        }if(millions!=0){
            if(!word.isEmpty())
                word.append(" ");
            word.append(threeDigits(millions) + " Million");
        }if(thousands!=0){
            if(!word.isEmpty())
                word.append(" ");
            word.append(threeDigits(thousands) + " Thousand");
        }if(rest!=0){
            if(!word.isEmpty())
                word.append(" ");
            word.append(threeDigits(rest));
        }
        
        return word.toString();
        
    }
    
    public String threeDigits(int num){
        //123
        int hundreds = num /100;
        int rest = num - hundreds*100;
        StringBuilder word =new StringBuilder();
        
        if(hundreds!=0 && rest!=0){
            word.append(one(hundreds)+" Hundred "+twoDigits(rest) );
        }
        if(hundreds ==0 && rest !=0)
            word.append(twoDigits(rest));
        if(rest==0 && hundreds!=0){
            word.append(one(hundreds)+" Hundred");
        }
        return word.toString();
    }
    
    public String twoDigits(int num){
        //12
        int tens = num /10;
        int rest = num - tens*10;
        StringBuilder word =new StringBuilder();
        
        if(num<10)
            return word.append(one(num)).toString();
        
        else if(num<20)
            return word.append(tenToTwenty(num) ).toString();
        
        else if(tens!=0 && rest!=0){
            word.append(ten(tens)+" "+one(rest) );
        }
        if(tens ==0 && rest !=0)
            word.append(" "+one(rest));
        
        if(tens!=0 && rest==0) 
             word.append(ten(tens));
        
        return word.toString();
    }
    
    public String one(int num){
        
        switch(num) {
      case 1: return "One";
      case 2: return "Two";
      case 3: return "Three";
      case 4: return "Four";
      case 5: return "Five";
      case 6: return "Six";
      case 7: return "Seven";
      case 8: return "Eight";
      case 9: return "Nine";
    }
    return "";
        
    }
    
    public String tenToTwenty(int num){
        
        switch(num) {
      case 10: return "Ten";
      case 11: return "Eleven";
      case 12: return "Twelve";
      case 13: return "Thirteen";
      case 14: return "Fourteen";
      case 15: return "Fifteen";
      case 16: return "Sixteen";
      case 17: return "Seventeen";
      case 18: return "Eighteen";
      case 19: return "Nineteen";
    }
    return "";
        
    }
    
    
     public String ten(int num) {
    switch(num) {
      case 2: return "Twenty";
      case 3: return "Thirty";
      case 4: return "Forty";
      case 5: return "Fifty";
      case 6: return "Sixty";
      case 7: return "Seventy";
      case 8: return "Eighty";
      case 9: return "Ninety";
    }
    return "";
  }
    
}