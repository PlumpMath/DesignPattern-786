package zjj.dp.bridge.example;

public class BMPImage extends AbstractImage {

	@Override
	public void parseFile(String filename) {
		//BMP��������
		Matrix m = new Matrix();
		this.iImageImpl.doPaint(m);
		System.out.println(filename+"��ʽΪBMP");

	}

}
