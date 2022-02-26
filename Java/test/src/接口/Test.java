package ½Ó¿Ú;

public class Test {

	public static void main(String[] args) {
		Usb u=new UsbDiskWriter();
		u.start();
		u.stop();
		System.out.println("-------------");
		Usb c=new Camera();
		c.start();
		c.stop();
		System.out.println("-------------");
		Usb m=new Mobile();
		m.start();
		m.stop();
	}

}
