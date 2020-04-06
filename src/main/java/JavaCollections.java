import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class JavaCollections {
    public static void highestUniNumber(ArrayDeque dequeList) {
        int highestUniquesNumber = 0;
        int x = 0;
        Iterator v = dequeList.iterator();
        while (v.hasNext()) {
            int subArraySize = 3;
            int[] arrayToInt;
            Object[] arrayObject;
            arrayToInt = new int[dequeList.size()];
            arrayObject = dequeList.toArray();
            for (int i = 0; i < arrayObject.length; i++) {
                arrayToInt[i] = (int) arrayObject[i];
            }
            if (!(dequeList.size() < subArraySize)) {
                x = subArraySize;
                for (int i = 0; i < subArraySize; i++) {
                    if (i != 0) {
                        if ((arrayToInt[0] == arrayToInt[i])
                                || (arrayToInt[subArraySize - 1] == arrayToInt[(subArraySize - 1) - i])) {
                            x -= 1;
                        }
                    }
                    System.out.print(arrayToInt[i] + " ");
                }
                System.out.println("   " + x);
                if (highestUniquesNumber <= x) {
                    highestUniquesNumber = x;
                }
            }
            if (dequeList.poll() == null) {
                break;
            }
        }
        System.out.println("Highest unique number = " + highestUniquesNumber);
    }
    public static void main(String[] args) {
        Deque<Integer> dequeList = new ArrayDeque<Integer>();
        dequeList.add(6);
        dequeList.add(2);
        dequeList.add(6);
        dequeList.add(8);
        dequeList.add(3);
        dequeList.add(7);
        dequeList.add(1);
        dequeList.add(4);
        dequeList.add(4);

        highestUniNumber((ArrayDeque) dequeList);
    }
}
