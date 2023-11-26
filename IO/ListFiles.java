import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File f = new File(args[0]);
        String[] list = f.list();
        // File[] list = f.listFiles();

        // for(File item : list) {
        //     System.out.println(item.getPath() + (item.isDirectory() ? " is a directory" : " is a file"));
        // }

        for(String item : list) {
            File f1 = new File(args[0], item);
            System.out.println(f1.getPath() + (f1.isDirectory() ? " is a directory" : " is a file"));
        }

        // for(int i = 0; i < list.length; i++) {
        //     File item = new File(args[0] , list[i]);
        //     System.out.println(item.getPath()+ (item.isDirectory()? " is a Directory": " is a file"));
        // }


    }
}
