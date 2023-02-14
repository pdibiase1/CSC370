package directorysort;

import java.util.Arrays;
import java.util.Comparator;

public class DirectorySort 
{
    
    public static void main(String[] args) 
    {
        String[] dirs = {"/","/usr/","/usr/local/","/usr/local/bin/","/games/","/games/snake/","/homework/","/temp/downloads/"};

        sortFiles(dirs);
        for (String dir : dirs) 
        {
            System.out.println(dir);
        }
    }

    public static void sortFiles(String[] dirs) 
    {
        Arrays.sort(dirs, new FileComparator());
    }

    static class FileComparator implements Comparator<String> 
    {
        @Override
        public int compare(String dir1, String dir2) 
        {
            int depth1 = dir1.split("/").length - 1;
            int depth2 = dir2.split("/").length - 1;
            if (depth1 == depth2) 
            {
                return dir1.compareTo(dir2);
            }
            return depth1 - depth2;
        }
    }
}

