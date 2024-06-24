package adapter;

public class Test {

	public static void main(String[] args) {
		// Legacy system 처리
//		LegacyFunc legacyFunc = new LegacyFuncImpl();
//		System.out.println(legacyFunc.calc(10));

		// New system 처리
		LegacyFunc legacyFunc = new LegacyFuncImpl();
		LegacyFuncAdapter legacyFuncAdapter = new LegacyFuncAdapterImpl(legacyFunc);
		System.out.println(legacyFuncAdapter.calc(10));
	}

}
