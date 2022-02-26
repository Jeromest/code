package 接口;

public class Mobile implements Usb {
	public void start() {
		System.out.println("开始连接手机");
	}

	public void stop() {
		System.out.println("停止连接手机");
	}

}
