package zjj.dp.bridge.example;

public class LinuxImageImpl implements IImageImpl {

	@Override
	public void doPaint(Matrix m) {
		System.out.println("Linux系统下绘制：");
	}

}
