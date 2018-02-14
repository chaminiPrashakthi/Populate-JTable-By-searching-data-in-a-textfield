package se.cambiosys.medicalRecord;

public class BindData {
	String definition;
	String name;

	
	public BindData(String name, String definition) {
		super();
		this.definition = definition;
		this.name = name;
	}


	public String getDefinition() {
		return definition;
	}


	public String getName() {
		return name;
	}

}
