package sample;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class DummyAPITest39 extends DummyAPITestBase {

    private static List<CustomObject> list1 = new ArrayList<>();
    private static List<CustomObject> list2 = new ArrayList<>();
    private static List<CustomObject> list3 = new ArrayList<>();

    static {
        for (int i = 0; i < 100; i++) {
            list1.add(new CustomObject(i));
            list2.add(new CustomObject(i));
            list3.add(new CustomObject(i));
        }
    }

    protected List<CustomObject> getList1() {
        return list1;
    }

    protected List<CustomObject> getList2() {
        return list2;
    }

    protected List<CustomObject> getList3() {
        return list3;
    }
}