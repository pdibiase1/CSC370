package accesslevel;


public class AccessLevel 
{
  public static String checkAccess(int[] rights, int minPermission) {
    StringBuilder output = new StringBuilder();
    for (int right : rights) 
    {
      if (right >= minPermission) 
      {
        output.append("A");
      } 
      else if (right <= minPermission)
      {
        output.append("D");
      }
      else
      {
          output.append("");
      }
    }
    
    return output.toString();
  }

  public static void main(String[] args) 
  {
    int[] example1 = {0, 1, 2, 3, 4, 5};
    int minPermission1 = 2;
    System.out.println(checkAccess(example1, minPermission1));
    
    /*int[] example2 = {5, 3, 2, 10, 0};
    int minPermission2 = 20;
    System.out.println(checkAccess(example2, minPermission2));
    
    int[] example3 = {};
    int minPermission3 = 20;
    System.out.println(checkAccess(example3, minPermission3));
    
    int[] example4 = {34, 78, 9, 52, 11, 1};
    int minPermission4 = 49;
    System.out.println(checkAccess(example4, minPermission4));*/
  }
}
