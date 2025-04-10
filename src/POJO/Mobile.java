package POJO;

public class Mobile {
private int mid;
private String mname;
private int mprice;
private Battery battery;


public Mobile() {
	
}


public Mobile(int mid, String mname, int mprice, Battery battery) {
	super();
	this.mid = mid;
	this.mname = mname;
	this.mprice = mprice;
	this.battery = battery;
}


public int getMid() {
	return mid;
}


public void setMid(int mid) {
	this.mid = mid;
}


public String getMname() {
	return mname;
}


public void setMname(String mname) {
	this.mname = mname;
}


public int getMprice() {
	return mprice;
}


public void setMprice(int mprice) {
	this.mprice = mprice;
}


public Battery getBattery() {
	return battery;
}


public void setBattery(Battery battery) {
	this.battery = battery;
}


@Override
public String toString() {
	return "Mobile [mid=" + mid + ", mname=" + mname + ", mprice=" + mprice + ", battery=" + battery + "]";
}


}
