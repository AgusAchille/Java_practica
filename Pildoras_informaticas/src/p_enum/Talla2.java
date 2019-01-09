package p_enum;

public enum Talla2 {
	MINI("S"),
	MEDIANO("M"),
	GRANDE("L"),
	MUY_GRANDE("XL");

	private String abreviatura;

	private Talla2(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	public String getAbreviatura() {
		return abreviatura;
	}

}
