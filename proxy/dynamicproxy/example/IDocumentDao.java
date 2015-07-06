package zjj.dp.proxy.dynamicproxy.example;

public interface IDocumentDao {
	public Boolean findDocumentById(String docid);
	public Boolean deleteDocumentById(String docid);
}
