 
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;


public class Lamb4b {
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }	
	
	public static void main(String[] args) {
	
		List<Lamb4> employees = new ArrayList<>();
		
		employees.add(new Lamb4("Prashant dubey", 200L, "delhi"));
	    employees.add(new Lamb4("Sonali Raghuwanshi", 300L, "delhi"));
	    employees.add(new Lamb4("Sarika Gupta", 20000L, "Lucknow"));
	    employees.add(new Lamb4("Raj Shobit", 200L, "delhi"));
	    employees.add(new Lamb4("Hardik taneja", 20000L, "Kolkata"));
	    employees.add(new Lamb4("sumit kumar", 20000L, "delhi"));
	    employees.add(new Lamb4("Raj sharma", 2000L, "Pune"));
	    
	    employees.stream()
	    	.filter(emp -> emp.salary<5000 && emp.city.equals("delhi"))
	    	.filter(distinctByKey(emp -> emp.name.split(" ")[0]))
	    	.forEach(System.out::println);
	
	}
}