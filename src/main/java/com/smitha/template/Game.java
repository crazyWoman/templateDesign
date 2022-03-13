package com.smitha.template;

public class Game {
    public static void main(String[] args) {
        Loader loader = new MindCraftRunner();
        loader.loadAndRunGame();
        Loader loader1 = new NintendoRunner();
        loader1.loadAndRunGame();
    }
}
;

