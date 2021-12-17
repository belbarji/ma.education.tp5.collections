package ma.education.tp5.collections;

public class Client implements Comparable {
Integer code;
String name;
public  Client (Integer code , String name) {
	this.code=code;
	this.name =name;
	}

	public String toString() {
	return "Client [code=" + code + ", name=" + name + "]";
}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
		

}
