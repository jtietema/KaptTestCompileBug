package net.tietema.kaptestcompilebug

import net.tietema.testing.helpMyTest
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Jeroen.Tietema on 3/01/2017.
 */

class NoGoodTest {

    @Test
    fun testing() {
        val someValue = helpMyTest()
        assertEquals("done", someValue)
    }
}
