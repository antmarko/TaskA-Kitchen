import java.util.List;
import java.util.ArrayList;

//We only have one object of Kitchen class so Singleton is used
public final class Kitchen extends Room{
	private Burner aBurner;
	private Oven aOven;
	private Sink aSink;
	private List<Counter> counters;
	
    public Burner getaBurner() {
		return aBurner;
	}

	public void setaBurner(Burner aBurner) {
		this.aBurner = aBurner;
	}

	public Oven getaOven() {
		return aOven;
	}

	public void setaOven(Oven aOven) {
		this.aOven = aOven;
	}

	public Sink getaSink() {
		return aSink;
	}

	public void setaSink(Sink aSink) {
		this.aSink = aSink;
	}

	public List<Counter> getCounters() {
		return counters;
	}

	public void setCounters(List<Counter> counters) {
		this.counters = counters;
	}

	private static final Kitchen INSTANCE = new Kitchen();

    private Kitchen() {
    	aBurner = new Burner();
    	aOven = new Oven();
    	aSink = new Sink();
    	counters = new ArrayList<Counter>();
    }

    public static Kitchen getInstance() {
        return INSTANCE;
    }
}