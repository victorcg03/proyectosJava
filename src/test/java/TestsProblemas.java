import org.junit.jupiter.api.Test; // para la anotación @test
import programaMe.Problema100;
import programaMe.Problema466;

import static org.junit.jupiter.api.Assertions.*; // para las aserciones

public class TestsProblemas {
    @Test
    public void testProblema466() {
        assertEquals("1652", Problema466.solucion("423 424"));
        assertEquals("026", Problema466.solucion("12 123"));
        assertEquals("166", Problema466.solucion("123 82"));
        assertEquals("149", Problema466.solucion("123 123"));
        assertEquals("111", Problema466.solucion("111 111"));
        assertEquals("8991", Problema466.solucion("999 999"));
        assertEquals("000000000000000000000000", Problema466.solucion("1234567890 100000000000000000000000"));
    }
    @Test
    public void testProblema100(){
        assertEquals(3, Problema100.solucion(3524));
        assertEquals(8, Problema100.solucion(1111));
        assertEquals(5, Problema100.solucion(1121));
        assertEquals(0, Problema100.solucion(6174));
        assertEquals(7, Problema100.solucion(1893));
        assertEquals(7, Problema100.solucion(2476));
        assertEquals(7, Problema100.solucion(4579));
        assertEquals(4, Problema100.solucion(2323));
        assertEquals(4, Problema100.solucion(3232));
        assertEquals(4, Problema100.solucion(9));
    }
}
