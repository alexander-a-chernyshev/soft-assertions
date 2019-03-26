package sample;

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

public abstract class DummyAPITestBase {

    @Rule
    public final JUnitSoftAssertions softly = new JUnitSoftAssertions();

    private void doSoftAssertions(CustomObject object1, CustomObject object2, CustomObject object3) {
        softly.assertThat(object1).isEqualTo(object2);
        softly.assertThat(object2).isEqualTo(object3);
        softly.assertThat(object3).isEqualTo(object1);
    }
    private void doAssertions(CustomObject object1, CustomObject object2, CustomObject object3) {
        Assert.assertThat(object1, equalTo(object2));
        Assert.assertThat(object2, equalTo(object3));
        Assert.assertThat(object3, equalTo(object1));
    }

    void unitOfWork(int i) {
        // Arrange
        CustomObject object1 = getList1().get(i);
        CustomObject object2 = getList2().get(i);
        CustomObject object3 = getList3().get(i);

        // Act
        DummyAPI.dummyMethod();

        // Assert
        doAssertions(object1, object2, object3); // 16.23
        //doSoftAssertions(object1, object2, object3); // 13.62
    }

    protected abstract List<CustomObject> getList1();

    protected abstract List<CustomObject> getList2();

    protected abstract List<CustomObject> getList3();

    @Test
    public void testUOW0() {
        unitOfWork(0);
    }

    @Test
    public void testUOW1() {
        unitOfWork(1);
    }

    @Test
    public void testUOW2() {
        unitOfWork(2);
    }

    @Test
    public void testUOW3() {
        unitOfWork(3);
    }

    @Test
    public void testUOW4() {
        unitOfWork(4);
    }

    @Test
    public void testUOW5() {
        unitOfWork(5);
    }

    @Test
    public void testUOW6() {
        unitOfWork(6);
    }

    @Test
    public void testUOW7() {
        unitOfWork(7);
    }

    @Test
    public void testUOW8() {
        unitOfWork(8);
    }

    @Test
    public void testUOW9() {
        unitOfWork(9);
    }

    @Test
    public void testUOW10() {
        unitOfWork(10);
    }

    @Test
    public void testUOW11() {
        unitOfWork(11);
    }

    @Test
    public void testUOW12() {
        unitOfWork(12);
    }

    @Test
    public void testUOW13() {
        unitOfWork(13);
    }

    @Test
    public void testUOW14() {
        unitOfWork(14);
    }

    @Test
    public void testUOW15() {
        unitOfWork(15);
    }

    @Test
    public void testUOW16() {
        unitOfWork(16);
    }

    @Test
    public void testUOW17() {
        unitOfWork(17);
    }

    @Test
    public void testUOW18() {
        unitOfWork(18);
    }

    @Test
    public void testUOW19() {
        unitOfWork(19);
    }

    @Test
    public void testUOW20() {
        unitOfWork(20);
    }

    @Test
    public void testUOW21() {
        unitOfWork(21);
    }

    @Test
    public void testUOW22() {
        unitOfWork(22);
    }

    @Test
    public void testUOW23() {
        unitOfWork(23);
    }

    @Test
    public void testUOW24() {
        unitOfWork(24);
    }

    @Test
    public void testUOW25() {
        unitOfWork(25);
    }

    @Test
    public void testUOW26() {
        unitOfWork(26);
    }

    @Test
    public void testUOW27() {
        unitOfWork(27);
    }

    @Test
    public void testUOW28() {
        unitOfWork(28);
    }

    @Test
    public void testUOW29() {
        unitOfWork(29);
    }

    @Test
    public void testUOW30() {
        unitOfWork(30);
    }

    @Test
    public void testUOW31() {
        unitOfWork(31);
    }

    @Test
    public void testUOW32() {
        unitOfWork(32);
    }

    @Test
    public void testUOW33() {
        unitOfWork(33);
    }

    @Test
    public void testUOW34() {
        unitOfWork(34);
    }

    @Test
    public void testUOW35() {
        unitOfWork(35);
    }

    @Test
    public void testUOW36() {
        unitOfWork(36);
    }

    @Test
    public void testUOW37() {
        unitOfWork(37);
    }

    @Test
    public void testUOW38() {
        unitOfWork(38);
    }

    @Test
    public void testUOW39() {
        unitOfWork(39);
    }

    @Test
    public void testUOW40() {
        unitOfWork(40);
    }

    @Test
    public void testUOW41() {
        unitOfWork(41);
    }

    @Test
    public void testUOW42() {
        unitOfWork(42);
    }

    @Test
    public void testUOW43() {
        unitOfWork(43);
    }

    @Test
    public void testUOW44() {
        unitOfWork(44);
    }

    @Test
    public void testUOW45() {
        unitOfWork(45);
    }

    @Test
    public void testUOW46() {
        unitOfWork(46);
    }

    @Test
    public void testUOW47() {
        unitOfWork(47);
    }

    @Test
    public void testUOW48() {
        unitOfWork(48);
    }

    @Test
    public void testUOW49() {
        unitOfWork(49);
    }

    @Test
    public void testUOW50() {
        unitOfWork(50);
    }

    @Test
    public void testUOW51() {
        unitOfWork(51);
    }

    @Test
    public void testUOW52() {
        unitOfWork(52);
    }

    @Test
    public void testUOW53() {
        unitOfWork(53);
    }

    @Test
    public void testUOW54() {
        unitOfWork(54);
    }

    @Test
    public void testUOW55() {
        unitOfWork(55);
    }

    @Test
    public void testUOW56() {
        unitOfWork(56);
    }

    @Test
    public void testUOW57() {
        unitOfWork(57);
    }

    @Test
    public void testUOW58() {
        unitOfWork(58);
    }

    @Test
    public void testUOW59() {
        unitOfWork(59);
    }

    @Test
    public void testUOW60() {
        unitOfWork(60);
    }

    @Test
    public void testUOW61() {
        unitOfWork(61);
    }

    @Test
    public void testUOW62() {
        unitOfWork(62);
    }

    @Test
    public void testUOW63() {
        unitOfWork(63);
    }

    @Test
    public void testUOW64() {
        unitOfWork(64);
    }

    @Test
    public void testUOW65() {
        unitOfWork(65);
    }

    @Test
    public void testUOW66() {
        unitOfWork(66);
    }

    @Test
    public void testUOW67() {
        unitOfWork(67);
    }

    @Test
    public void testUOW68() {
        unitOfWork(68);
    }

    @Test
    public void testUOW69() {
        unitOfWork(69);
    }

    @Test
    public void testUOW70() {
        unitOfWork(70);
    }

    @Test
    public void testUOW71() {
        unitOfWork(71);
    }

    @Test
    public void testUOW72() {
        unitOfWork(72);
    }

    @Test
    public void testUOW73() {
        unitOfWork(73);
    }

    @Test
    public void testUOW74() {
        unitOfWork(74);
    }

    @Test
    public void testUOW75() {
        unitOfWork(75);
    }

    @Test
    public void testUOW76() {
        unitOfWork(76);
    }

    @Test
    public void testUOW77() {
        unitOfWork(77);
    }

    @Test
    public void testUOW78() {
        unitOfWork(78);
    }

    @Test
    public void testUOW79() {
        unitOfWork(79);
    }

    @Test
    public void testUOW80() {
        unitOfWork(80);
    }

    @Test
    public void testUOW81() {
        unitOfWork(81);
    }

    @Test
    public void testUOW82() {
        unitOfWork(82);
    }

    @Test
    public void testUOW83() {
        unitOfWork(83);
    }

    @Test
    public void testUOW84() {
        unitOfWork(84);
    }

    @Test
    public void testUOW85() {
        unitOfWork(85);
    }

    @Test
    public void testUOW86() {
        unitOfWork(86);
    }

    @Test
    public void testUOW87() {
        unitOfWork(87);
    }

    @Test
    public void testUOW88() {
        unitOfWork(88);
    }

    @Test
    public void testUOW89() {
        unitOfWork(89);
    }

    @Test
    public void testUOW90() {
        unitOfWork(90);
    }

    @Test
    public void testUOW91() {
        unitOfWork(91);
    }

    @Test
    public void testUOW92() {
        unitOfWork(92);
    }

    @Test
    public void testUOW93() {
        unitOfWork(93);
    }

    @Test
    public void testUOW94() {
        unitOfWork(94);
    }

    @Test
    public void testUOW95() {
        unitOfWork(95);
    }

    @Test
    public void testUOW96() {
        unitOfWork(96);
    }

    @Test
    public void testUOW97() {
        unitOfWork(97);
    }

    @Test
    public void testUOW98() {
        unitOfWork(98);
    }

    @Test
    public void testUOW99() {
        unitOfWork(99);
    }
}
