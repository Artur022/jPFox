/**
	класс реализует калькулятор	
*/
public class Calculator {
	/**
		Результат вычислений
	*/
	private int result;

	/**
		Сумммируем аргументы
		@param params аргументы суммирования.
	*/
	public void add(int arg1, int arg2) {
			this.result = arg1+arg2;
	}

	public void sub(int arg1, int arg2) {
			this.result = arg1-arg2;
	}

	public void mul(int arg1, int arg2) {
			this.result = arg1*arg2;
	}

	public void div(int arg1, int arg2) {
			this.result = arg1/arg2;
	}

	public void mod(int arg1, int arg2) {
			this.result = arg1%arg2;
	}

	public void rem(int arg1, int arg2) {		
			this.result = (int)Math.pow(arg1,arg2);
	}					
	/**
		Получить результат.
		@return результат вычисления.
	*/
	public int getResult(){
		return this.result;
	}

	public void cleanResult(){
		this.result = 0;
	}
}