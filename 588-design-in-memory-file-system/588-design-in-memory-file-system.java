public class FileSystem {
    
    Directory root;
    public FileSystem() {
        root = new Directory();
    }
    public List < String > ls(String path) {
        Directory t = root;
        List < String > files = new ArrayList < > ();
        if (!path.equals("/")) {
            String[] d = path.split("/");
            for (int i = 1; i < d.length - 1; i++) {
                t = t.dirs.get(d[i]);
            }
            if (t.files.containsKey(d[d.length - 1])) {
                files.add(d[d.length - 1]);
                return files;
            } else {
                t = t.dirs.get(d[d.length - 1]);
            }
        }
        //get all the sun dirs and files at that directory level
        files.addAll(new ArrayList < > (t.dirs.keySet()));
        files.addAll(new ArrayList < > (t.files.keySet()));
        Collections.sort(files);
        return files;
    }

    public void mkdir(String path) {
        Directory t = root;
        String[] d = path.split("/");
        
        for (int i = 1; i < d.length; i++) {
            //if directory doesnt exist then create one
            if (!t.dirs.containsKey(d[i]))
                t.dirs.put(d[i], new Directory());
            
            //else just navigate to it
            t = t.dirs.get(d[i]);
        }
    }

    public void addContentToFile(String filePath, String content) {
        Directory t = root;
        String[] d = filePath.split("/");
        for (int i = 1; i < d.length - 1; i++) {
            t = t.dirs.get(d[i]);
        }
        
        //add contents to the file and if file doesnt exit then create one and add contents to it
        t.files.put(d[d.length - 1], t.files.getOrDefault(d[d.length - 1], "") + content);
    }

    public String readContentFromFile(String filePath) {
        Directory t = root;
        String[] d = filePath.split("/");
        for (int i = 1; i < d.length - 1; i++) {
            t = t.dirs.get(d[i]);
        }
        //return the file contents
        return t.files.get(d[d.length - 1]);
    }
}
class Directory {
        HashMap < String, Directory > dirs = new HashMap < > ();
        HashMap < String, String > files = new HashMap < > ();
    }
/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * List<String> param_1 = obj.ls(path);
 * obj.mkdir(path);
 * obj.addContentToFile(filePath,content);
 * String param_4 = obj.readContentFromFile(filePath);
 */