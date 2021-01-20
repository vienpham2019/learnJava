public class Classes {
	public void inClassWork () {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		allClassesExtendObject(); 
		
		System.out.println();
	}
	
	private void allClassesExtendObject() {
		System.out.println("1. All classes extend Object and inherit Object methods.");
		Object obj = new Animal(); 
		Object obj2 = obj; 
		Object obj3 = new Animal(); 
		
		Animal animal = new Animal(); 
		animal.setAge(12); 
		obj2 = animal; 
//		Object methods: 
		System.out.println("obj.toString(): " + obj.toString());
		System.out.println("obj.getClass(): " + obj.getClass());
		System.out.println("obj.hashCode(): " + obj.hashCode());
		
		System.out.println("obj2.toString(): " + obj2.toString());
		System.out.println("obj3.toString(): " + obj3.toString());
		
		System.out.println("obj.equals(obj2): " + obj.equals(obj2));
		System.out.println("obj.equals(obj3): " + obj.equals(obj3));
	}
}