package oopsdemo3;

import com.ey.training.microsoft.*;
import com.ey.training.oracle.*;

//demonstrate the use of packages
public class SoftwareaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystem os1=new OperatingSystem();
		os1.listSoftware();
		System.out.println("************************************");
		Database d1=new Database();
		d1.printSoftware();

	}

}
