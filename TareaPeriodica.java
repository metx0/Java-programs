import java.util.*;

public abstract class TareaPeriodica implements Runnable {
	protected int periodo;
	protected Date ultimaEjecucion;
	protected boolean activa;
	
	public TareaPeriodica(int periodo){
		this.periodo = periodo;
		actualizar();
		activa = true;
	}
	
	public TareaPeriodica() { this(1); }
	
	public void actualizar(){
		ultimaEjecucion = new Date(); // Hora actual
	}
	
	public void activar() { activa = true; }
	public void desactivar() { activa = false; }
	
	public abstract boolean necesitaEjecucion();
	
	public abstract int ejecutarTarea();
}
