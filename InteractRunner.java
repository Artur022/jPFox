import java.util.Scanner;

/**
	Класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner {
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("y")) {
				System.out.println("argument 1 : ");
				String first = reader.next();
				System.out.println("argument 2 : ");
				String second = reader.next();

				boolean checkOperation = false;
				String exitOperation = "yes";
				while ((!checkOperation) || (exitOperation == "y")){
					System.out.println("Select operation : ");
					System.out.print("(+) (-) (*) (/) (%) (^)");
					String operation = reader.next();

					switch (operation) {
						case "+": 
							calc.add(Integer.valueOf(first), Integer.valueOf(second));
							System.out.print(first + " + " + second);
							checkOperation = true;
							break;
						case "-":
							calc.sub(Integer.valueOf(first), Integer.valueOf(second));
							System.out.print(first + " - " + second);
							checkOperation = true;
							break;
						case "*":
							calc.mul(Integer.valueOf(first), Integer.valueOf(second));
							System.out.print(first + " * " + second);
							checkOperation = true;
							break;
						case "/":
							calc.div(Integer.valueOf(first), Integer.valueOf(second));
							System.out.print(first + " / " + second);
							checkOperation = true;
							break;
						case "%":
							calc.mod(Integer.valueOf(first), Integer.valueOf(second));
							System.out.print(first + " % " + second);
							checkOperation = true;
							break;
						case "^":
							calc.rem(Integer.valueOf(first), Integer.valueOf(second));
							System.out.print(first + " ^ " + second);
							checkOperation = true;
							break;
						default : 
							System.out.println("Операция введена неверно! Повторить? y/n");
							exitOperation = reader.next();
							checkOperation = false;
					}

				}
				System.out.println(" = " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit : y/n");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}	