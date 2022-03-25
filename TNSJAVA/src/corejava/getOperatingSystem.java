package corejava;

public class getOperatingSystem {

	public static void main(String[] args) {
		String operatingSystem=System.getProperty("os.name");
		System.out.println(operatingSystem);
		String version=System.getProperty("os.version");
		System.out.println(version);

	}

}
