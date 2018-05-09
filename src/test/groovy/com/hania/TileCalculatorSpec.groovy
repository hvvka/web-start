package com.hania

import com.hania.Calculator
import com.hania.model.Size
import javafx.util.Pair
import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
class TileCalculatorSpec extends Specification {

    @Unroll("Room #roomWidth*#roomLength with tiles #tileWidth*#tileLength each \$#price requires #expectedTiles tiles for \$#expectedPrice")
    def "CreateTileCalculatorSpec"() {
        given:
        def tile = new Size(tileWidth, tileLength)
        def room = new Size(roomWidth, roomLength)

        when:
        Calculator calculator = new Calculator()
        Pair result = calculator.createTileCalculator(tile, room, price)

        then:
        result.getKey() == expectedTiles
        result.getValue() == expectedPrice

        where:
        tileWidth | tileLength | roomWidth | roomLength | price  || expectedTiles | expectedPrice
        30        | 40         | 300       | 400        | 12.34f || 100           | 1234f
        12        | 34         | 25        | 69         | 0.1f   || 9             | 0.9f
        54        | 1          | 56        | 32         | 123.0f || 64            | 7872f
        128       | 64         | 32        | 16         | 8.421f || 1             | 8.42f
    }
}
