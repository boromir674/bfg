
public abstract class MyPrototype {
	
	protected int v1;
	protected String s1;
	
	public abstract Object clone() throws CloneNotSupportedException;
	
	/**
	 * @return the v1
	 */
	public int getV1() {
		return v1;
	}


	/**
	 * @param v1 the v1 to set
	 */
	public void setV1(int v1) {
		this.v1 = v1;
	}


	/**
	 * @return the s1
	 */
	public String getS1() {
		return s1;
	}


	/**
	 * @param s1 the s1 to set
	 */
	public void setS1(String s1) {
		this.s1 = s1;
	}

}
