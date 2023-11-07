import Services.ServicioA;
import Services.ServicioB;
import Services.impl.ServicioAImpl;
import Services.impl.ServicioBImpl;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TestServicioB {

    @Test
    public void  testMultiplicar(){
        ServicioB servicioB = new ServicioBImpl();
        assertEquals(servicioB.multiplicar(2,3),6);
    }

    @Test
    public void testMultiplicarSumar(){
        ServicioA servicioA = new ServicioAImpl();

        ServicioB servicioB = new ServicioBImpl();
        servicioB.setServicioA(servicioA);
        Assert.assertEquals(servicioB.multiplicarSumar(2,3,2),10);
    }

    @Test
    public void testMultiplicarSumarMockito(){
        ServicioA servicioA = Mockito.mock(ServicioA.class);
        Mockito.when(servicioA.sumar(2,3)).thenReturn(5);

        ServicioB servicioB = new ServicioBImpl();
        servicioB.setServicioA(servicioA);
        Assert.assertEquals(servicioB.multiplicarSumar(2,3,2),10);

    }
}
