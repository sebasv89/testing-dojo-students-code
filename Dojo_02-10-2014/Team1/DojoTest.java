import junit.framework.Assert;

import org.junit.Test;


public class DojoTest {

	@Test
	public void test() {
		int resultado = StringCalculator.add("");
		Assert.assertEquals(0, resultado);
	}
	
	@Test
	public void testReturn1() {
		int resultado = StringCalculator.add("1");
		Assert.assertEquals(1, resultado);
	}
	
	@Test
	public void testReturn1sum2(){
		int resultado = StringCalculator.add("1,2");
		Assert.assertEquals(3, resultado);
	}
	
	@Test
	public void testUnknownSum() {
		int resultado = StringCalculator.add("1,1,1,1,1");
		Assert.assertEquals(5, resultado);
	}
	
	@Test
	public void testNewLineSum() {
		int resultado = StringCalculator.add("1,1,1,1\n2");
		Assert.assertEquals(6, resultado);
	}
	
	@Test
	public void testNewSeparadores() {
		int resultado = StringCalculator.add("//;\n1;1;1;1;2");
		Assert.assertEquals(6, resultado);
	}
	
	@Test(expected=Throwable.class)
	public void testNumerosNegativos() {
		int resultado = StringCalculator.add("//;\n1;1;1;1;-2");
	}
	
	@Test
	public void testNumerosMayores1000() {
		int resultado = StringCalculator.add("//;\n1;1;1;1;2000");
		Assert.assertEquals(4, resultado);
	}
	
	@Test
	public void testSeparadorCualquierLongitud() {
		int resultado = StringCalculator.add("//[;;]\n1;;1;;1;;1;;2");
		Assert.assertEquals(6, resultado);
	}
	
	@Test
	public void testVariosSeparadoresCualquierLongitud() {
		int resultado = StringCalculator.add("//[;;][,,]\n1,,1;;1;;1,,2");
		Assert.assertEquals(6, resultado);
	}

	@Test
	public void testVariosSeparadoresCualquierLongitud2() {
		int resultado = StringCalculator.add("//[%%%%%][,,][;;]\n1,,1%%%%%1;;1%%%%%2");
		Assert.assertEquals(6, resultado);
	}

	@Test
	public void testVariosSeparadoresCualquierLongitud3() {
		int resultado = StringCalculator.add("//[@@@][,,][;;]\n1,,1@@@1;;1@@@2");
		Assert.assertEquals(6, resultado);
	}
	
	@Test
	public void testVariosSeparadoresPuntos() {
		int resultado = StringCalculator.add("//[...][,,][;;]\n1,,1...1;;1...2");
		Assert.assertEquals(6, resultado);
	}

}
