package com.hania

import com.hania.model.Efficiency
import javafx.util.Pair
import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
class WallPaintCalculatorSpec extends Specification {

    @Unroll("To cover #area m^2 with paint(#litersPerSquareMeter l/m^2, #volume l, \$#price) it requires #expectedCansOfPaint cans for \$#expectedPrice")
    def "CreateWallPaintCalculatorSpec"() {
        given:
        def paint = new Efficiency(litersPerSquareMeter, volume, price)

        when:
        Calculator calculator = new Calculator()
        Pair result = calculator.createWallPaintCalculator(paint, area)

        then:
        result.getKey() == expectedCansOfPaint
        result.getValue() == expectedPrice

        where:
        litersPerSquareMeter | volume | price | area   || expectedCansOfPaint | expectedPrice
        1                    | 1      | 1f    | 1      || 1                   | 1f
        3.4f                 | 2.3f   | 12.3f | 20.1f  || 30                  | 369f
        0.1101f              | 0.1f   | 10.1f | 10.01f || 12                  | 121.2f
        10.01f               | 1.1f   | 11.1f | 0f     || 0                   | 0f
        1.28f                | 6.4f   | 16.8f | 4.21f  || 1                   | 16.8f
    }
}
