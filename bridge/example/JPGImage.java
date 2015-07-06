package zjj.dp.bridge.example;

public class JPGImage extends AbstractImage {

	@Override
	public void parseFile(String filename) {
		//JPG解析过程
		Matrix m = new Matrix();
		this.iImageImpl.doPaint(m);
		System.out.println(filename+"格式为JPG");
	}

}
