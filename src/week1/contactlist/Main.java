package week1.contactlist;

/**
 * Created by IT on 08.08.2016.
 */
public class Main {
    public static void main(String[] args) {

        ContactList list = new ContactList();
        list.initContactList("ContactList",6);

        Contact contact = new Contact();
        contact.create("Andrey","0674677666");

        Contact contact1 = new Contact();
        contact1.create("Sergiy1","0674666666");
        Contact contact2 = new Contact();
        contact2.create("Sergiy2","0634666666");
        Contact contact3 = new Contact();
        contact3.create("Sergiy3","0974666666");
        Contact contact4 = new Contact();
        contact4.create("Sergiy4","0674666666");
        Contact contact5 = new Contact();
        contact5.create("Sergiy5","0674666666");

        list.addContact(contact);
        list.addContact(contact1);
        list.addContact(contact2);
        list.addContact(contact3);
        list.addContact(contact4);
        list.addContact(contact5);

        //list.removeContact("Sergiy");

        //list.findContact("Andrey");

        //list.removeLast();

        //list.updateContactInfo("Andrey", "Vasia", "0674433221");

        //list.showAllContacts();

        //list.showFirstFiveContacts();

        //list.showLastFiveContacts();

        //list.showLifeContacts();

        //list.showKievstarContacts();
    }
}
