package csc370hwpt1;

public class CSC370HWpt1 
{
public static String encode(String input) 
        {
            if (input.isEmpty()) 
            {
                return "";
            }
        

        StringBuilder output = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) 
        {
            char c = input.charAt(i);
            if (c == currentChar) 
            {
                count++;
            } 
            else 
            {
                if (count > 4) 
                {
                    output.append("/").append(String.format("%02d", count)).append(currentChar);
                } 
                else 
                {
                    for (int j = 0; j < count; j++) 
                    {
                        output.append(currentChar);
                    }
                }
            currentChar = c;
            count = 1;
      }
    }

    if (count > 4)  
    {
      output.append("/").append(String.format("%02d", count)).append(currentChar);
    } 
    else 
    {
      for (int i = 0; i < count; i++) 
      {
        output.append(currentChar);
      }
    }

    return output.toString();
  }

    public static void main(String[] args) {
        System.out.println(encode("nnnnasdhjnnnnn"));
    }
    
}
