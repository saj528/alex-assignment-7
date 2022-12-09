import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayListTest {

    @Test
    void should_add_one_item_to_list() {

        CustomArrayList<Integer> customList = new CustomArrayList<>();

        customList.add(5);
        Integer expectedResult = customList.get(0);
        Integer expectedSize = customList.getSize();

        assertEquals(5, expectedResult);
        assertEquals(1, expectedSize);

    }

    @Test
    void should_get_list_size() {

        CustomArrayList<Integer> customList = new CustomArrayList<>();

        for (int i = 0; i <= 10; i++) {
            customList.add(i);
        }

        Integer expectedSize = 11;

        assertEquals(expectedSize, customList.getSize());

    }

    @Test
    void should_get_one_item_from_list() {

        CustomArrayList<Integer> customList = new CustomArrayList<>();

        for (int i = 0; i <= 10; i++) {
            customList.add(i);
        }

        Integer expectedElement = 5;

        assertEquals(expectedElement, customList.get(5));

    }

    @Test
    void should_add_one_item_to_list_at_index() {

        CustomArrayList<Integer> customList = new CustomArrayList<>();

        for (int i = 0; i <= 10; i++) {
            customList.add(i);
        }

        customList.add(5, 100);

        Integer expectedElement = customList.get(5);
        Integer expectedSize = customList.getSize();

        assertEquals(100, expectedElement);
        assertEquals(12, expectedSize);
    }


    @Test
    void should_remove_one_item_from_list() {

        CustomArrayList<Integer> customList = new CustomArrayList<>();

        for (int i = 0; i <= 10; i++) {
            customList.add(i);
        }

        customList.remove(3);

        Integer expectedElement = customList.get(3);
        Integer expectedSize = customList.getSize();

        assertEquals(4, expectedElement);
        assertEquals(10, expectedSize);

    }


}
