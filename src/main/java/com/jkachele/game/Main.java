/******************************************
 *Project-------Engine2D-LWJGL
 *File----------Main.java
 *Author--------Justin Kachele
 *Date----------9/22/2022
 *License-------Mozilla Public License Version 2.0
 ******************************************/
package com.jkachele.game;

import com.jkachele.game.engine.Engine;
import com.jkachele.game.util.Color;

public class Main {

    public static void main(String[] args) {
        final int DEFAULT_WIdtH = 1920;
        final int DEFAULT_HEIGHT = (DEFAULT_WIdtH / 16) * 9;    // 16 x 9 aspect ratio
        final String DEFAULT_TITLE = "Java Game";
        final Color backgroundColor = Color.BLACK;
        final boolean resetLevels = false;

        Engine engine = new Engine(DEFAULT_WIdtH, DEFAULT_HEIGHT, DEFAULT_TITLE, backgroundColor, resetLevels);
        engine.start();
    }
}