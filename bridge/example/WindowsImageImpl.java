package zjj.dp.bridge.example;

public class WindowsImageImpl implements IImageImpl {

	@Override
	public void doPaint(Matrix m) {
		System.out.println("Windows系统下绘制：");
	}

}
