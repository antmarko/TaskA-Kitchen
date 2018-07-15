
public abstract class Tool {
	protected ToolType toolType;
	protected String name;
	public Tool(ToolType toolType, String name) {
		super();
		this.toolType = toolType;
		this.name = name;
	}
	
}
