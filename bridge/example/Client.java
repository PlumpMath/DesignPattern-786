package zjj.dp.bridge.example;
/*
 * author: zjj
 * date: 2015/5/15
 * func: 桥接模式示例，不同操作系统和不同图像格式两个维度的分割
 */
public class Client {

	public static void main(String[] args) {
		IImageImpl iImageImpl1 = new WindowsImageImpl();
		IImageImpl iImageImpl2 = new LinuxImageImpl();
		AbstractImage absImage = new BMPImage();
		absImage.setiImageImpl(iImageImpl2);
		absImage.parseFile("AB.BMP");
	}

}
