package com.javarush.games.moonlander;

import com.javarush.engine.cell.*;

public class MoonLanderGame extends Game {
    public int width = 64;
    public int height = 64;

    @Override
    public void initialize() {
        setScreenSize(width, height);

        setCellColor(0, 0, Color.RED);
        setCellColor(3, 6, Color.BLACK);
        setCellColor(6, 8, Color.NONE);

    }

}
