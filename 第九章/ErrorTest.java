import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class ErrorTest{
	//声明一个泛型方法，该泛型方法中带一个T类型形参
	static <T> void test(Collection<? extends T> from, Collection<T> to){
		for(T ele : from){
			to.add(ele);
		}
	}
	
	public static void main(String[] args){
		List<Object> ao = new ArrayList<>();
		List<String> as = new ArrayList<>();
		//下面代码将产生编译错误
		test(as, ao);
	}
}