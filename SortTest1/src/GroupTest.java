import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class GroupTest {
    class Apple {
        public String color;
        public int weight;
        public Apple(String color, int weight) {
            super();
            this.color = color;
            this.weight = weight;
        }

        public String toString() {
            return "Apple [color=" + color + ", weight=" + weight + "]";
        }
    }

    public static <T>List <List<T>> divider(Collection<T> datas, Comparator<? super T> c) {
        List<List<T>> result = new ArrayList<List<T>>();
        for (T t : datas) {
            boolean isSampleGroup = false;

            for (int j=0; j<result.size(); j++){
                if (c.compare(t, result.get(j).get(0))==0) {
                    isSampleGroup = true;
                    result.get(j).add(t);
                    break;
                }
            }

            if (!isSampleGroup) {
                List<T> innerList = new ArrayList<T>();
                result.add(innerList);
                innerList.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();
        list.add(new GroupTest().new Apple("红", 205));
        list.add(new GroupTest().new Apple("红", 131));
        list.add(new GroupTest().new Apple("绿", 248));
        list.add(new GroupTest().new Apple("绿", 153));
        list.add(new GroupTest().new Apple("黄", 119));
        list.add(new GroupTest().new Apple("黄", 224));

        List<List<Apple>> byColors = divider(list, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.color.compareTo(o2.color);
            }
        });
        System.out.println("Divide the group by different colors" + byColors);
        List<List<Apple>> byWeight = divider(list, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return (o1.weight / 100 == o2.weight / 100) ? 0 : 1;
            }
        });
        System.out.println("Divide the group by its weight" + byWeight);
    }
}
