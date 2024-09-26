package practisequestions;
import java.util.HashMap;
import java.util.Map;

public class MostRepetitiveElement {

    public static Object findMostRepetitiveElement(Object[] arr) {
        Map<Object, Integer> frequencyMap = new HashMap<>();
        for (Object element : arr) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        Object mostRepetitiveElement = null;
        int maxCount = 0;

        for (Map.Entry<Object, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRepetitiveElement = entry.getKey();
            }
        }

        return mostRepetitiveElement;
    }

    public static void main(String[] args) {
        Object[] arr = {1, 3, 4, 'a', 9, 7, 9, 9,'a','a',9};
        Object result = findMostRepetitiveElement(arr);
        System.out.println("The most repetitive element is: " + result);
        
        
        
        
        
        
        
    }
}
