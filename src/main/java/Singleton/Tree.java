package Singleton;

public class Tree {

    private static Tree treeInstance = null;

    private Tree(){

    }

    public Tree getTreeInstance(){
        if(treeInstance == null){
            synchronized (Tree.class){
                if(treeInstance == null){
                    treeInstance = new Tree();
                }
            }
        }
        return treeInstance;
    }
}
