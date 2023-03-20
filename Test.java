import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		/*
		// Para probar la clase Ejecutor:
		
		Ejecutor e = new Ejecutor("calc", 1);

		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe un comando para ejecutar");
		e.setComando(leer.next()); 

		// e.ejecutarTarea();

		// Para probar la clase Reloj:

		Reloj r = new Reloj();

		if (r.necesitaEjecucion()) {
			r.ejecutarTarea();
		} */
		
		new Thread(new Reloj()).start();
		new Thread(new Ejecutor("calc", 0)).start();
	}
}
