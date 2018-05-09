package com.hania;

import com.hania.model.Efficiency;
import com.hania.model.Size;
import javafx.util.Pair;

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
public class Calculator {

    private TileCalculator tileCalculator;

    private WallPaintCalculator wallPaintCalculator;

    public Calculator() {
        tileCalculator = new TileCalculator();
        wallPaintCalculator = new WallPaintCalculator();
    }

    public Pair createTileCalculator(Size tile, Size room, float price) {
        return tileCalculator.createTileCalculator(tile, room, price);
    }

    public Pair createWallPaintCalculator(Efficiency paint, float area) {
        return wallPaintCalculator.createWallPaintCalculator(paint, area);
    }
}
