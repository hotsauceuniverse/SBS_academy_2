package Day06;

import java.util.function.Consumer;

//	Consumer가 사용될 수 있는 예제

class Machine {
	private String Color;
	private String ModelName;
	private String Type;
	
	public Machine(String color, String modelName, String type) {
		super();
		Color = color;
		ModelName = modelName;
		Type = type;
	}
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
}

class MachineInformation {
	private Machine machine;

	public MachineInformation(Machine machine) {
		this.machine = machine;
	}
	
//	기계의 상세 정보 확인
	public void Info() {
//		기계가 가지고 있는 필드 값에 대한 출력
		System.out.println(machine.getColor());
		System.out.println(machine.getModelName());
		System.out.println(machine.getType());
	}
	
//	필요에 따라 기계의 상세 정보를 확인 한 뒤, 기타 정보를 추가적으로 확인할 수 있음
	public void Info(Consumer<Machine> machineConsumer) {
		Info();
		machineConsumer.accept(machine);
	}	
}

class MachineConsumerServie {
	private Machine machine;
	private MachineInformation machine_information;
	
	public MachineConsumerServie() {
		machine = new Machine("Black", "BlackNine", "A");
		machine_information = new MachineInformation(machine);
	}
	public void consume() {
		//	기계에 대한 출력 진행
	}
}

public class Ex19 {

	public static void main(String[] args) {
		
		
		
	}
	
}
