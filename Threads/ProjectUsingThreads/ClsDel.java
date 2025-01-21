import java.util.*;
import java.io.File;

enum Type
{
    CLASS(".class");
    private final String val;
    private Type(String type)
    {
        this.val=type;
    }
    public String getFileType()
    {
        return this.val;
    }
}
class Directory implements Runnable
{
    public String currDirectory="";
    public List<String> AccessDeniedDirectoriesAndFiles=null;
    Directory(String drive)
    {
        this.currDirectory=drive;
        AccessDeniedDirectoriesAndFiles=new LinkedList<String>();
        // Add Folders or Directories or Files that you Don't want to Delete and Access
        AccessDeniedDirectoriesAndFiles.add("Top-Secret");
        AccessDeniedDirectoriesAndFiles.add("Ember.js");
        AccessDeniedDirectoriesAndFiles.add("Others");
    }

    public void run()
    {

        File drive = new File(currDirectory);
        Type type=Type.CLASS;
        //Collecting Only Class file
        File[] files = drive.listFiles((dir, name)->name.endsWith(type.getFileType()));
        //Deleting Class files
        for(File file:files)
        {
            if(!(AccessDeniedDirectoriesAndFiles.contains(file.getName())))
            {
            file.delete();
            }
           
        }
   
        // Collecting All Directory
        File[] contents = drive.listFiles();
        if(contents==null)
        {
            System.err.println("No contents");
            System.exit(0);
        }
        for (File directory : contents) {
            if(directory.isDirectory() && !((directory.getName()).startsWith(".")) && !AccessDeniedDirectoriesAndFiles.contains(directory.getName()))
            {
                Directory thread = new Directory(""+directory);
                Thread thd = new Thread(thread);
                thd.start();
            }   
        }
    }
}


public class ClsDel {

    public static void main(String[] args) {
        File[] roots = File.listRoots();
        List<String> drives = new LinkedList<>();

        for(File r:roots)
        {
            drives.add(""+r);
        }
        // Remove the Drives that You Don't Want to Scan and Remove Class File
        drives.remove("C:\\");

        for(String drive:drives)
        {
            Directory thread = new Directory(drive);
            Thread thd = new Thread(thread);
            // Threads Start From Here
            thd.start();
        }
    }
}