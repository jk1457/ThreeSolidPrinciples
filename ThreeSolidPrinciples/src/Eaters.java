package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;

class Worker implements IWorkable, IFeedable{
	public void work() {
		// ....working
	}

	public void eat() {
		//.... eating in lunch break
	}
}

class SuperWorker implements IWorkable, IFeedable{
	public void work() {
		// ....working much more
	}

	public void eat() {
		//.... eating in lunch break
	}
}

class Manager {
	Worker worker;
	
	public void Manager() {
	
	}
	public void setWorker(Worker w) {
		worker = w;
	}
	
	public void manager() {
		worker.work();
	}
}