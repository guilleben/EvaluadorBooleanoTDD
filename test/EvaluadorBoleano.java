
public class EvaluadorBoleano {

	public boolean evalua(String expresion) {
		
		if ("verdadero".equals(expresion)) {
		
		return true;
	}else {
		return false;
	}
	}

	public boolean eval(String expresion) {
		if (expresion.startsWith("(") && expresion.endsWith(")")){
			expresion = expresion.substring(1,expresion.length()-1);
		}
		return "verdadero".equals(expresion);
	}

}
