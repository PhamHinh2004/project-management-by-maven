package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.InterfaceNumber;

public class ContollFetures implements ActionListener{
	private InterfaceNumber ctv;
	
	public ContollFetures(InterfaceNumber ctv) {
		this.ctv = ctv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("Ban da nhan nut!");
		
		String src = e.getActionCommand();
		System.out.println("Ban da nhan nut: "+ src);
		
		if(src.equals("UP")) {
			this.ctv.increment();
		}else if(src.equals("DOWN")) {
			this.ctv.decrement();
		}
	}

}
