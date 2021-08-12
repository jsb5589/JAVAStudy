package InterfaceExamples;

public abstract class SearchFinder implements SearchFindable {

	@Override
	public void find(String text) {
		System.out.printf("SearchFinder:find(%d)\n", text);

	}

	@Override
	public void search(String url) {
		System.out.printf("SearchFinder:search(%d)\n", url);

	}
	public abstract void lookup(String topic);
	
}
