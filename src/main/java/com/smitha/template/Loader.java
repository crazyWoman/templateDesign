package com.smitha.template;

public abstract class Loader {

    public void loadAndRunGame(){
        readFiles();
        loadFiles();
        runApp();

    }

    public void readFiles(){
        System.out.println("Reading files");
    }
    public abstract void loadFiles();

    public int runApp(){
        return 1;
    }
}
