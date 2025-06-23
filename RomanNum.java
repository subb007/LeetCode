class Solution {
    public int romanToInt(String s) {
        int n = 0;
        int l = s.length();
        for(int i=l-1; i>-1; i--){
            if(s.charAt(i)=='I'){
                n+=1;
            }
            if(s.charAt(i)=='V'){
                n+=5;
                if(i>0 && s.charAt(i-1)=='I'){
                    n=n-1;
                    i--;
                }
            }
            if(s.charAt(i)=='X'){
                n+=10;
                if(i>0 && s.charAt(i-1)=='I'){
                    n-=1;
                    i--;
                }
            }
            if(s.charAt(i)=='L'){
                n+=50;
                if(i>0 && s.charAt(i-1)=='X'){
                    n-=10;
                    i--;
                }
            }
            if(s.charAt(i)=='C'){
                n+=100;
                if(i>0 && s.charAt(i-1)=='X'){
                    n-=10;
                    i--;
                }
            }
            if(s.charAt(i)=='D'){
                n+=500;
                if(i>0 && s.charAt(i-1)=='C'){
                    n-=100;
                    i--;
                }
            }
            if(s.charAt(i)=='M'){
                n+=1000;
                if(i>0 && s.charAt(i-1)=='C'){
                    n-=100;
                    i--;
                }
            }
        }
        return n;
    }
}
