package ch08.sec09;

public class Test {

	public static void main(String[] args) {
		IFC ifc = new Impl();
		ifc.ma();
		ifc.mb();
		ifc.mc();
		
		IFB ifb = new Impl();
		ifb.ma();
		ifb.mb();
//		ifb.mc(); X
	}

}
