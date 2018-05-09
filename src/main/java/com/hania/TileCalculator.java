package com.hania;

import com.hania.model.Size;
import javafx.util.Pair;

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
class TileCalculator {

    Pair<Integer, Float> createTileCalculator(Size tile, Size room, float price) {
        int tilesForRoomWidth = (int) Math.ceil(room.getWidth() / tile.getWidth());
        int tilesForRoomLength = (int) Math.ceil(room.getLength() / tile.getLength());

        int totalTiles = tilesForRoomLength * tilesForRoomWidth;
        float totalPrice = Math.round(totalTiles * price * 100f) / 100f;

        return new Pair<>(totalTiles, totalPrice);
    }
}
