package ch08.sec10;

public class Test {

	public static void main(String[] args) {
//		IFC ifc = new Impl();
//		
//		IFB ifb = new Impl();
////		ifb.mc();
//		
//		if(ifb instanceof IFC) {
//			IFC ifc2 = (IFC) ifb;
//			ifc.mc();
//		}
		
		IFC ifc = new Impl();
		ifc.mb();
		
		IFC ifc2 = new SubImpl();
		ifc2.mb();
		
	}

}
