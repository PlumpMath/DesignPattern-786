package zjj.dp.bridge.example;

public abstract class AbstractImage {
	protected IImageImpl iImageImpl;

	public IImageImpl getiImageImpl() {
		return iImageImpl;
	}

	public void setiImageImpl(IImageImpl iImageImpl) {
		this.iImageImpl = iImageImpl;
	}
	
	public abstract void parseFile(String filename);
}
