package 接口;

public class Camera implements Usb {
	public void start() {
		System.out.println("打开照相机");
	}

	public void stop() {
		System.out.println("关闭照相机");
	}

}
