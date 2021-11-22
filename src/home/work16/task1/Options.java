package home.work16.task1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Options {
    public List<String> randomValues(List<String> listLink, int size) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            listLink.add(null);
        }
        while (listLink.contains(null)) {
            int index = (int) (Math.random() * size);
            if (listLink.get(index) == null) listLink.set(index, "li_" + counter++);
        }
        return listLink;
    }

    public List<String> throughOne(List<String> lst, ListIterator<String> arr, ListIterator<String> link) {
        while (arr.hasPrevious() || link.hasNext()) {
            if (lst.size() % 2 == 0) {
                lst.listIterator().add(arr.previous());
            } else {
                lst.listIterator().add(link.next());
            }
        }
        lst = reverse(lst.listIterator(), new LinkedList<>());
        return lst;
    }

    public List<String> throughTwo(ListIterator<String> link, List<String> lst, ListIterator<String> arr) {
        while (arr.hasPrevious() || link.hasNext()) {
            if (lst.size() % 3 != 0 && link.hasNext()) {
                lst.listIterator().add(link.next());
            } else {
                lst.listIterator().add(arr.previous());
            }
        }
        lst = reverse(lst.listIterator(), new LinkedList<>());
        return lst;
    }

    private List<String> reverse(ListIterator<String> it, List<String> lst) {
        while (it.hasNext()) {
            lst.listIterator().add(it.next());
        }

        return lst;
    }
}
