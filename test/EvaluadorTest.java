import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EvaluadorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTrue() {
		EvaluadorBoleano evaluador = new EvaluadorBoleano();
		assert evaluador.evalua("verdadero") == true;
	}
	
	@Test
	public void testFalse() {
		EvaluadorBoleano evaluador = new EvaluadorBoleano();
		assert evaluador.evalua("falso") == false;
	}

	
	@Test
	public void testParentesis() {
		EvaluadorBoleano evaluador = new EvaluadorBoleano();
		assert evaluador.eval("(verdadero)") ==true;
		assert evaluador.eval("(falso)") ==false;
		
	}
}
