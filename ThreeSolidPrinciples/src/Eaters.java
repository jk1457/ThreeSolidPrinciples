package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;

class Worker extends BaseWorker implements IEat, ISick {
	public void eat()
	{
		System.out.format("Welcome to Earth.\n");
	}

	public void sick()
	{
		System.out.format("Welcome to Earth.\n");
	}
}

class SuperWorker extends BaseWorker implements IEat, ISick{
	public void work() {
		// ....working much more
	}
	public void eat()
	{
		System.out.format("Welcome to Earth.\n");
	}

	public void sick()
	{
		System.out.format("Welcome to Earth.\n");
	}

}

class TempWorker extends BaseWorker implements IEat, ISick {
	public void work() {
	System.out.format("Welcome to Earth.\n");
	}

	public void eat()
	{
		System.out.format("Welcome to Earth.\n");
	}

	public void sick()
	{
		System.out.format("Welcome to Earth.\n"); 
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
