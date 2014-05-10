package unipic;


/**
 * Super Classe abstrata que sera referencia para toda instrucao
 */
public abstract class Instrucao{
	private String match;
	private int d;
	private int f;
	
	/**
	 * Metodo que verifica atravez de uma expressao regular se
	 * o comando de entrada se refere a instrucao filha dessa classe
	 * 
	 * @param comando String - String contendo a instrucao do .hex em Binario
	 * 
	 * @return boolean - verdadeiro caso a instrucao seja a testada e falso caso contrario
	 */
	public static boolean matcher(String input, String match){
		return input.matches(match);
	}
	
	/**
	 * Metodo que retorna a instrucao filha dessa classe
	 * 
	 * @param comando String - String contendo a instrucao do .hex em Binario
	 * 
	 * @ rucao - Objeto Instrucao ja iniciado com valores de 'd' e 'f'
	 */
	public abstract void setup(String comando);
	
	public void setD(int d){
		this.d = d;
	}
	public void setF(int f){
		this.f = f;
	}
	
	public String toString(){
		return super.toString()+" d:"+d+" f:"+f;
	}
}
