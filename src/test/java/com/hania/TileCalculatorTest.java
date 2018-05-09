package com.hania;

import com.hania.model.Size;
import javafx.util.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
public class TileCalculatorTest {

    @Test
    public void createTileCalculator() {
        // given
        Size tile = new Size(30, 40);
        Size room = new Size(300, 400);
        float price = 12.34f;

        // when
        Calculator calculator = new Calculator();
        Pair result = calculator.createTileCalculator(tile, room, price);

        // then
        int expectedTiles = 100;
        float expectedPrice = 1234f;
        assertEquals(result.getKey(), expectedTiles);
        assertEquals(result.getValue(), expectedPrice);
    }
}