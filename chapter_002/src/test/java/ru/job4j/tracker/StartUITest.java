package ru.job4j.tracker;

public class StartUITest {

//    @Test
//    public void whenAddItem() {
//        String[] answers = {"Fix PC"};
//        Input input = new StubInput(answers);
//        Tracker tracker = new Tracker();
//        StartUI.createItem(input, tracker);
//        Item created = tracker.findAll()[0];
//        Item expected = new Item("Fix PC");
//        assertThat(created.getName(), is(expected.getName()));
//    }
//
//    @Test
//    public void whenAddTwoItem() {
//        String[] answers = {"Fix PC", "Second Element"};
//        Input input = new StubInput(answers);
//        Tracker tracker = new Tracker();
//        StartUI.createItem(input, tracker);
//        StartUI.createItem(input, tracker);
//        Item created = tracker.findAll()[1];
//        Item expected = new Item("Second Element");
//        assertThat(created.getName(), is(expected.getName()));
//    }
//
//    @Test
//    public void whenReplaceItem() {
//        Tracker tracker = new Tracker();
//        Item item = new Item("new item");
//        tracker.add(item);
//        String[] answers = {
//                item.getId(), // id сохраненной заявки в объект tracker.
//                "replaced item"
//        };
//        StartUI.replaceItem(new StubInput(answers), tracker);
//        Item replaced = tracker.findById(item.getId());
//        assertThat(replaced.getName(), is("replaced item"));
//    }
//
//    @Test
//    public void whenDeleteItem() {
//        Tracker tracker = new Tracker();
//        Item item = new Item("Заявка");
//        tracker.add(item);
//        String[] answers = {item.getId()};
//        StartUI.deleteItem(new StubInput(answers), tracker);
//        Item result = tracker.findById(item.getId());
//        assertNull(result);
//    }
}