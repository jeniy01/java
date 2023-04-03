package sec1;

public class Member<T, E> {
	private T no;
	private E id;
	public T getNo(){
		return no;
	}
	public void setNo(T no){
		this.no = no;
	}
	public E getId(){
		return id;
	}
	public void setId(E id){
		this.id = id;
	}
}
