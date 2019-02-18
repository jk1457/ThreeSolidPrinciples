package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;

class Worker extends BaseWorker implements IEat, ISick {
}

class SuperWorker extends BaseWorker implements IEat, ISick{
	public void work() {
		// ....working much more
	}

}

class TempWorker extends BaseWorker implements IEat, ISick {
	public void work() {
		// ....working much more
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
