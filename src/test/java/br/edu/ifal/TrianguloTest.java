
package br.edu.ifal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * TrianguloTest
 */
public class TrianguloTest {

    Triangulo triangulo;

    
   
    @Test
    public void deveRetornarEscalenoParaTodosOsLadosDiferentes() {
        triangulo = new Triangulo(2, 3, 4);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Escaleno";
        assertEquals(valorEsperado, valorRetornado);
    }
  
    @Test
    public void deveRetornarIsoscelesQuandoOValorDoLadoAForIgualADoLadoB() {
        triangulo = new Triangulo(8, 8, 4);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Isosceles";
        assertEquals(valorEsperado, valorRetornado);
    }
  @Test
    public void deveRetornarIsoscelesQuandoOValorDoLadoAForIgualADoLadoC() {
        triangulo = new Triangulo(8, 4, 8);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Isosceles";
        assertEquals(valorEsperado, valorRetornado);
    }
    @Test
    public void deveRetornarIsoscelesQuandoOValorDoLadoBForIgualDoLadoC() {
        triangulo = new Triangulo(4, 8, 8);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Isosceles";
        assertEquals(valorEsperado, valorRetornado);

    }
    @Test 
    public void deveRetornarEquilateroParaTodosOsLadosIguais() {
        triangulo = new Triangulo(2, 2, 2);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Equilatero";
        assertEquals(valorEsperado, valorRetornado);

    }
    @Test
    public void deveRetornarIlegalParaLadosIguaisAZero() {
        triangulo = new Triangulo(0, 0, 0);
         String valorRetornado = triangulo.getTipo(triangulo);
         String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }
    @Test
    public void deveRetornarIlegalParaUmDosLadosIgualAZero() {
        triangulo = new Triangulo(0, 1, 2);
         String valorRetornado = triangulo.getTipo(triangulo);
         String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }@Test
    public void deveRetornarIlegalSeDoisDosTresLadosForemIgualAZero() {
        triangulo = new Triangulo(0, 0, 1);
         String valorRetornado = triangulo.getTipo(triangulo);
         String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }
@Test
public void deveRetornarIlegalQuandoOLadoCForMenorQueASubtracaoDoLadoAComOLadoB(){
    triangulo = new Triangulo(8, 4, 2);
     String valorRetornado = triangulo.getTipo(triangulo);
     String valorEsperado = "Ilegal";
    assertEquals(valorEsperado, valorRetornado);
    
}
@Test
public void deveRetornarIlegalQuandoOLadoAForMenorQueASubtracaoDoLadoBComOLadoC(){
    triangulo = new Triangulo(2, 4, 8);
     String valorRetornado = triangulo.getTipo(triangulo);
     String valorEsperado = "Ilegal";
    assertEquals(valorEsperado, valorRetornado);
    
}

@Test
public void deveRetornarIlegalQuandoOLadoBForMenorQueASubtracaoDoLadoAComOLadoC(){
    triangulo = new Triangulo(4, 2, 8);
     String valorRetornado = triangulo.getTipo(triangulo);
     String valorEsperado = "Ilegal";
    assertEquals(valorEsperado, valorRetornado);
    
}
    @Test
    public void deveRetornarIlegalQuandoASubtracaoDosDoisLadosForIgualADoOutroLado(){
        triangulo = new Triangulo(5, 3, 8);
         String valorRetornado = triangulo.getTipo(triangulo);
         String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
        
}

}