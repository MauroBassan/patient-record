package base;

public class Paziente {
	public static int Storico = 0;
	private int caseNumber = Storico;
	private String nome;
	private String bloodType;
	private String coronaVirus;
	private String exposure;
	
	public Paziente(String nome, String bloodType, String coronaVirus, String exposure) {
		super();
		this.nome = nome;
		this.bloodType = bloodType;
		this.coronaVirus = coronaVirus;
		this.exposure = exposure;
		Storico++;
	
	}

	/**
	 * @return the caseNumber
	 */
	public int getCaseNumber() {
		return caseNumber;
	}

	/**
	 * @param caseNumber the caseNumber to set
	 */
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the bloodType
	 */
	public String getBloodType() {
		return bloodType;
	}

	/**
	 * @param bloodType the bloodType to set
	 */
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	/**
	 * @return the coronaVirus
	 */
	public String getCoronaVirus() {
		return coronaVirus;
	}

	/**
	 * @param coronaVirus the coronaVirus to set
	 */
	public void setCoronaVirus(String coronaVirus) {
		this.coronaVirus = coronaVirus;
	}

	/**
	 * @return the exposure
	 */
	public String getExposure() {
		return exposure;
	}

	/**
	 * @param exposure the exposure to set
	 */
	public void setExposure(String exposure) {
		this.exposure = exposure;
	}
	
	
	
}
