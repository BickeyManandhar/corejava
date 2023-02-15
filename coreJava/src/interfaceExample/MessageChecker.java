package interfaceExample;

public interface MessageChecker {
	// we cannot instantiate an interface
	// an interface does not contain any constructor
	// all of the methods in an interface are abstract
	// an interface cannot contain instance fields. the only fields that can appear
	// in an interface must be declared both static and final
	// an interface is not extended by a class, it is implemented by a class
	// an interface can extend multiple interface
	
	public boolean check (String msg); //by default it is abstract method in interface
}
