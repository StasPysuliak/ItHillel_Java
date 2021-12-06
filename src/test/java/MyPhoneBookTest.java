import home.work19.MyPhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class MyPhoneBookTest {
    private MyPhoneBook myPhoneBook;

    @BeforeEach
    void setUp() {
        myPhoneBook = new MyPhoneBook();
    }

    @Test
    void testPhoneBookIsEmptyIfNoContactsAdded() {
        List<MyPhoneBook.PhoneRecord> book = myPhoneBook.getPhoneNumbers();
        assertTrue(book.isEmpty());
    }

    @Test
    void addPhoneNumberTest() {
        int exp = 4;
        myPhoneBook.addPhoneNumber("Btest1","111");
        myPhoneBook.addPhoneNumber("Atest0","000");
        myPhoneBook.addPhoneNumber("Dtest3","333");
        myPhoneBook.addPhoneNumber("Cdest2","222");
        List<MyPhoneBook.PhoneRecord> book = myPhoneBook.getPhoneNumbers();
        assertFalse(book.isEmpty());
        assertEquals(exp,book.size());
    }

    @Test
    void sortByNameTest() {
        List<MyPhoneBook.PhoneRecord> notSorted = myPhoneBook.getPhoneNumbers();
        List<MyPhoneBook.PhoneRecord> sortedByName = notSorted.stream()
                .sorted(Comparator.comparing(MyPhoneBook.PhoneRecord::getName))
                .collect(Collectors.toList());
        myPhoneBook.sortByName();
        List<MyPhoneBook.PhoneRecord> sortByOunMethod = myPhoneBook.getPhoneNumbers();
        assertEquals(sortedByName,sortByOunMethod);
    }

    @Test
    void sortByPhoneNumberTest() {
        List<MyPhoneBook.PhoneRecord> notSorted = myPhoneBook.getPhoneNumbers();
        List<MyPhoneBook.PhoneRecord> sortedByPhoneNumber = notSorted.stream()
                .sorted(Comparator.comparing(MyPhoneBook.PhoneRecord::getPhone))
                .collect(Collectors.toList());
        myPhoneBook.sortByPhoneNumber();
        List<MyPhoneBook.PhoneRecord> sortByOunMethod = myPhoneBook.getPhoneNumbers();
        assertEquals(sortedByPhoneNumber,sortByOunMethod);
    }

}
