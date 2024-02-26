package taller3.televisores;

public class TV {
	private Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	private static int numTV;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (0 <= canal && canal <= 120) {
			this.canal=canal;
		} else {
			return;
		}
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if (0 <= volumen && volumen <= 7) {
			this.volumen=volumen;
		} else {
			return;
		}
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public void turnOn() {
		this.estado=true;
	}
	
	public void turnOff() {
		this.estado=false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if (this.canal >= 120 || this.canal < 0) {
			return;
		}
		else if (this.estado=true){
			this.canal++;
		}
	}
	
	public void canalDown() {
		if (this.canal > 120 || this.canal <= 0) {
			return;
		}
		else if (this.estado=true){
			this.canal--;
		}
	}
	
	public void volumenUp() {
		if (this.volumen >= 7 || this.volumen < 0) {
			return;
		}
		else if (this.estado=true){
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		if (this.volumen > 7 || this.volumen <= 0) {
			return;
		}
		else if (this.estado=true){
			this.volumen--;
		}
	}
	
	
}
