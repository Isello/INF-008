/**
 *
 * @author Isello
 */
public class ConversaoDeUnidadesDeArea {

	// metros quadrados para pés quadrados
	public static double metro2ToPe2(double metro2) {
		return 10.76 * metro2;
	}
	
	// metros quadrados para acres
	public static double metro2ToAcre(double metro2) {
		return metro2 / 4047;
	}
	
	// metros quadrados para centimetros quadrados
	public static double metro2ToCm2(double metro2) {
		return metro2 * 10000;
	}
	
	// pes quadrados para centimetros quadrados
	public static double pe2ToCm2(double pe2) {
		return 929 * pe2;
	}
	
	// milhas quadradas para acres
	public static double milha2ToAcre(double milha2) {
		return 640 * milha2;
	}
	
	// acres para pés quadrados
	public static double acreToPes2(double acre) {
		return 43560 * acre;
	}
}
