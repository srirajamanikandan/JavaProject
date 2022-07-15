package org.transport;

public class WireLess {
private void wirelessName() {
System.out.println("Wireless Name : Any");
}
public static void main(String[] args) {
	WireLess x = new WireLess();
	x.wirelessName();
	
	Wifi q = new Wifi();
	q.wifiName();
	
	MobileData w = new MobileData();
	w.dataName();
	
	Lan e = new Lan();
	e.lanName();
}
}
