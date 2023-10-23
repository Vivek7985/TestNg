package DependsOnMethod;
import org.testng.annotations.Test;

public class dependsOn {

	@Test(dependsOnMethods ="Rocketary")
	public void ImmitationGame() {
		System.out.println("Allen Turing");
		}
	
	@Test
	public void AbeautifulMind() {
		System.out.println("John Nash");
		}
	
	@Test
	public void Rocketary() {
		System.out.println("The Numby Narayanan");
	}
}
