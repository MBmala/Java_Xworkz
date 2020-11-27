

public class CameraTester {

	public static void main(String[] args) {
		Camera camera=new Camera();
		System.out.println("camera color "+camera.color);
		camera.color="gray";
		System.out.println("camera color after "+camera.color);
		System.out.println("camera type "+camera.type);
		System.out.println("weight of camera "+camera.weight);
		
		System.out.println("camera brand "+Camera.brand);
		System.out.println("founder"+Camera.founder);
		
		Camera camera1=new Camera();
		camera1.color="red";
		System.out.println(camera1.color);
		System.out.println(camera1.manualFocus);

	}

}