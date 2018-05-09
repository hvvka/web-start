package com.hania;

import com.hania.model.Efficiency;
import javafx.util.Pair;

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
class WallPaintCalculator {

    Pair<Integer, Float> createWallPaintCalculator(Efficiency paint, float area) {
        float requiredPaintVolume = paint.getLitersPerSquareMeter() * area;
        int totalCansOfPaint = (int) Math.ceil(requiredPaintVolume / paint.getVolume());
        float totalPrice = Math.round(totalCansOfPaint * paint.getPrice() * 100f) / 100f;

        return new Pair<>(totalCansOfPaint, totalPrice);
    }
}
