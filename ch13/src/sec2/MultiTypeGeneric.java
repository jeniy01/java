package sec2;
import java.util.Map;	//Map은 키(key)와 값(value)를 쌍으로 저장하고 있는 컬렉션프레임웨크 자료구조이다.
//(key:value); => 예) (name:"변백현"); name은 key이고, "변백현"은 value임
public class MultiTypeGeneric<K, V> implements Map.Entry<K,V> {
	private K key;
	private V value;
	
	@Override
	public K getKey() {	//key는 항목이름 즉, 클래스이름이므로 set이 없음
		return this.key;
	}
	@Override
	public V getValue() {
		return this.value;
	}
	@Override
	public V setValue(V value) {
		this.value = value;
		return value;
	}
}
