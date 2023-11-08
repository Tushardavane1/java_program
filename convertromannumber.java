public class convertromannumber {
  public static void main(String[] args) {
    String str="DCCVII";
    int len = str.length();
    str= str+" ";
    int result=0;
    for(int i=0;i<len;i++)
    {
        char ch = str.charAt(i);
        char next_char = str.charAt(i+1);
        if(ch == 'M')
        {
            result+=100;

        } 
        else if(ch == 'C'){
                  if(next_char == 'M')
                  {
                    result+=900;
                    i++;
                  }
                  else if(next_char =='D')
                  {
                    result+=100;
                    i++;
                  }
                  else{
                    result+=100;
                  }
        }
        else if(ch == 'D')
        {
            result+=500;

        }
        else if(ch == 'X')
        {
            if(ch == 'C')
            {
                result+=90;
                i++;
            }
            else if(next_char == 'L')
            {
                result+=40;
                i++;
            }
            else{
                result+=10;
            }
        }
        else if(ch == 'L')
        {
            if(next_char == 'X')
            {
                result+=9;
                i++;
            }
            else if(next_char == 'V'){
                result+=4;
                i++;

            }
            else{
                result++;
            }
        }
        else{
            result+=5;
        }
    }
    System.out.println("Roman number is the "+str);
    System.out.println("Equvalant Integer is the "+result+"\n");


  }    
}
