package uvsq;

import java.util.List;




public class Plan {
	private int langeur;
	private int largeur;
	private List<Robot> robotList;
	private List<Robot_Statique> STATIQUEList;
	
	public void avancerTous() {
		for (Robot_Statique robotS : STATIQUEList) {
			robotS.avance();
		}
		}

}
