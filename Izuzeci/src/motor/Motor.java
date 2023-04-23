package motor;

import java.text.*;

public class Motor {

	String marka;
	double kubikaza;

	DecimalFormat df = new DecimalFormat("#.##");

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) throws IzuzetakMotor {
		if (marka.isBlank() || marka.isEmpty())
			throw new IzuzetakMotor("Marka ne sme biti null!");
		this.marka = marka;
	}

	public double getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(double kubikaza) throws IzuzetakMotor {
		if (kubikaza > 50 && kubikaza < 2000)
			this.kubikaza = kubikaza;
		else
			throw new IzuzetakMotor("Kubikaza mora biti u opsegu 50 - 2000 kubika!");

	}

	public void ispisi() {
		System.out.println("Marka: " + marka + "\nKubikaza: " + df.format(getKubikaza()));
	}

}
