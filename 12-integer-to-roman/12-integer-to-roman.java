class Solution { 
    // 0,1000,2000,3000
    private static final String[] thousands = {"", "M", "MM", "MMM"};
    //0,100.,200,300,400,500,600,700,800,900
    private static final String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    //0,10,20,30,40,50,60,0,80,90
    private static final String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    //0,1,2,3,4,5,6,7,8,9
    private static final String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    
    public String intToRoman(int num) { 
        return thousands[num / 1000] + hundreds[num % 1000 / 100] + tens[num % 100 / 10] + ones[num % 10];
    }
}