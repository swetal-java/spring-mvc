package constructorinjection;

public class userdata {
	private int id;
	private String name;
	private long contact;
	
	public userdata(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "userdata [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

	
	

}
