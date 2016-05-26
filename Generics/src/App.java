import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start() {
		System.out.println( "I am starting machine");
		
	}
	
}
	
class Camera extends Machine {
	
	
		@Override
		public String toString() {
			return "I am a Camera";
		}
		
		public void start() {
			System.out.println( "I am starting camera");
			
		}
		
		public void snap() {
			System.out.println( "I am snapping camera");
			
		}
	
}
	
interface Plant {
	public void grow();
}

	
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine machine0 = new Machine() {

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println( "I am starting machine0");
			}
			
			
		};
		
		machine0.start();
		
		Plant plant = new Plant() {

			public void grow() {
				System.out.println("Plant Growing");
				
			}
			
			
		};
		
		plant.grow();
		
		Machine machine1 = new Machine();
		Machine machine2 = new Machine();
		Machine machine3 = new Machine();
		
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(machine1);
		list1.add(machine2);
		list1.add(machine3);
		showList1(list1);
		
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());
		list2.add(new Camera());
		showList1(list2);

		
		

	}
		
				
	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			
			System.out.println(value.toString());
			value.start();
		}
	}
	
	public static void showList1(ArrayList<? super Camera> list) {
		for (Object value : list) {
			
			System.out.println(value.toString());
			((Machine) value).start();
			
		}
	}

}
