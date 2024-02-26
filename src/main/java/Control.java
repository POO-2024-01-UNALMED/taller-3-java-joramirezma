package taller3.televisores;

public class Control {
	private TV tv;
	
	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public void turnOn() {
		this.tv.estado=true;
	}
	
	public void turnOff() {
		this.tv.estado=false;
	}
	
	public void canalUp() {
		if (this.tv.canal != 120 && this.tv.estado==true) {
			this.tv.canal++;
		}
	}
	
	public void canalDown() {
		if (this.tv.canal != 0 && this.tv.estado==true) {
			this.tv.canal--;
		}
	}
	
	public void volumenUp() {
		if (this.tv.volumen != 7 && this.tv.estado==true ) {
			this.tv.volumen++;
		}
	}
	public void volumenDown() {
		if (this.tv.volumen != 0 && this.tv.estado==true) {
			this.tv.volumen--;
		}
	}
	
	public void setCanal(int canal) {
		if (1 <= canal && canal <= 120 && this.tv.estado==true) {
			this.tv.canal=canal;
		}
	}
	
	public void setVolumen(int volumen) {
		if (0 <= volumen && volumen <= 7 && this.tv.estado==true) {
			this.tv.volumen=volumen;
		}
	}
	
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.control = this;
	}
}
