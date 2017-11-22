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

}
