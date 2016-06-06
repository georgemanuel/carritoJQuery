package smart.capacitacion.modelo;

public class Usuario {
	private Integer idUsuario;
	private String nombreUsuario;
	private String apellidoPaternoUsuario;
	private String apellidoMeternoUsuario;
	private String sexoDelUsuario;
	private String calleUsuario;
	private String coloniaUsuario;
	private String numeroUsuario;
	private String delegacionUsuario;
	private Integer telUsuario;
	private Integer celUsuario;
	private String rfcUsuario;
	private String emailUsuario;
	private String passwordUsuario;
	private String fechaNacimiento;
	
	
	public Usuario() {
		super();
	}


	public Usuario(Integer idUsuario, String nombreUsuario, String apellidoPaternoUsuario,
			String apellidoMeternoUsuario, String sexoDelUsuario, String calleUsuario, String coloniaUsuario,
			String numeroUsuario, String delegacionUsuario, Integer telUsuario, Integer celUsuario, String rfcUsuario,
			String emailUsuario, String passwordUsuario, String fechaNacimiento) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoPaternoUsuario = apellidoPaternoUsuario;
		this.apellidoMeternoUsuario = apellidoMeternoUsuario;
		this.sexoDelUsuario = sexoDelUsuario;
		this.calleUsuario = calleUsuario;
		this.coloniaUsuario = coloniaUsuario;
		this.numeroUsuario = numeroUsuario;
		this.delegacionUsuario = delegacionUsuario;
		this.telUsuario = telUsuario;
		this.celUsuario = celUsuario;
		this.rfcUsuario = rfcUsuario;
		this.emailUsuario = emailUsuario;
		this.passwordUsuario = passwordUsuario;
		this.fechaNacimiento = fechaNacimiento;
	}


	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoPaternoUsuario() {
		return apellidoPaternoUsuario;
	}

	public void setApellidoPaternoUsuario(String apellidoPaternoUsuario) {
		this.apellidoPaternoUsuario = apellidoPaternoUsuario;
	}

	public String getApellidoMeternoUsuario() {
		return apellidoMeternoUsuario;
	}

	public void setApellidoMeternoUsuario(String apellidoMeternoUsuario) {
		this.apellidoMeternoUsuario = apellidoMeternoUsuario;
	}

	public String getSexoDelUsuario() {
		return sexoDelUsuario;
	}

	public void setSexoDelUsuario(String sexoDelUsuario) {
		this.sexoDelUsuario = sexoDelUsuario;
	}

	public String getCalleUsuario() {
		return calleUsuario;
	}

	public void setCalleUsuario(String calleUsuario) {
		this.calleUsuario = calleUsuario;
	}

	public String getColoniaUsuario() {
		return coloniaUsuario;
	}

	public void setColoniaUsuario(String coloniaUsuario) {
		this.coloniaUsuario = coloniaUsuario;
	}

	public String getNumeroUsuario() {
		return numeroUsuario;
	}

	public void setNumeroUsuario(String numeroUsuario) {
		this.numeroUsuario = numeroUsuario;
	}

	public String getDelegacionUsuario() {
		return delegacionUsuario;
	}

	public void setDelegacionUsuario(String delegacionUsuario) {
		this.delegacionUsuario = delegacionUsuario;
	}

	public Integer getTelUsuario() {
		return telUsuario;
	}

	public void setTelUsuario(Integer telUsuario) {
		this.telUsuario = telUsuario;
	}

	public Integer getCelUsuario() {
		return celUsuario;
	}

	public void setCelUsuario(Integer celUsuario) {
		this.celUsuario = celUsuario;
	}

	public String getRfcUsuario() {
		return rfcUsuario;
	}

	public void setRfcUsuario(String rfcUsuario) {
		this.rfcUsuario = rfcUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
	
}
