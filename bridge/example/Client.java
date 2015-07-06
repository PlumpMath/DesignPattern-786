package zjj.dp.bridge.example;
/*
 * author: zjj
 * date: 2015/5/15
 * func: �Ž�ģʽʾ������ͬ����ϵͳ�Ͳ�ͬͼ���ʽ����ά�ȵķָ�
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
