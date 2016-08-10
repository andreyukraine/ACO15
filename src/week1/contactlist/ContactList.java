package week1.contactlist;

/**
 * Created by IT on 08.08.2016.
 */
public class ContactList {
    String name;
    Contact[] contacts;
    int i = 0;

    public void initContactList(String name, int countContact){
        this.name = name;
        contacts = new Contact[countContact];
    }

    public ContactList addContact(Contact contact){
        ContactList list = new ContactList();

        if (contact.name.matches("^\\D*$")){
            contacts[i++] = contact;
        }

        return list;
    }

    public void removeContact(String cont){

        for (int j = 0; j < contacts.length ; j++) {
            if (cont == (contacts[j].name)){
                contacts[j].name = null;
                contacts[j].tel = null;
                break;
            }
        }
    }
    public void findContact(String name){
        for (int i = 0; i < contacts.length; i++) {
            if (name == (contacts[i].name)){
                System.out.println(contacts[i].name);
                System.out.println(contacts[i].tel);
                break;
            }
        }
    }

    public void removeLast(){
        for (int j = contacts.length-1; j < contacts.length ; j++) {
            if (contacts[j] != null) {
                contacts[j].name = null;
                contacts[j].tel = null;
                break;
            }
        }
    }

    public void updateContactInfo(String name, String newName, String newTel){
        for (int i = 0; i < contacts.length; i++) {
            if (name == contacts[i].name){
                contacts[i].name = newName;
                contacts[i].tel = newTel;
                break;
            }
        }
    }

    public void showAllContacts(){

        for (int j = 0; j < contacts.length ; j++) {
            if (contacts[j] != null) {
                System.out.println(String.format("name: %s, tel: %s", contacts[j].name, contacts[j].tel));
            }
        }
    }

    public void showFirstFiveContacts() {
        for (int j = 0; j < contacts.length; j++) {
            if (j < 5 && contacts[j] != null){
                System.out.println(String.format("name: %s, tel: %s", contacts[j].name, contacts[j].tel));
            }
        }
    }


    public void showLastFiveContacts() {
        for (int j = contacts.length - 5; j < contacts.length ; j++) {
            if ( contacts[j] != null){
                System.out.println(String.format("name: %s, tel: %s", contacts[j].name, contacts[j].tel));
            }
        }
    }

    public void showLifeContacts() {
        for (int j = 0; j < contacts.length; j++) {
            if (contacts[j].tel.substring(0,3).equals("063")){
                System.out.println(String.format("name: %s, tel: %s", contacts[j].name, contacts[j].tel));
            }
        }
    }

    public void showKievstarContacts() {
        for (int j = 0; j < contacts.length; j++) {
            if (contacts[j].tel.substring(0,3).equals("067") || contacts[j].tel.substring(0,3).equals("097")){
                System.out.println(String.format("name: %s, tel: %s", contacts[j].name, contacts[j].tel));
            }
        }
    }
}
