package Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneContacts {
    private Map<String, List<Contact>> groups = new HashMap<>();

    public PhoneContacts() {
    }

    public void groupsAdd (String name){
        groups.put(name, new ArrayList<Contact>());
    }

    public boolean checkGroup(String name){
        return groups.containsKey(name);
    }

    List<Contact> contacts = new ArrayList<>();

    public void contactsAdd(Contact cont){
        contacts.add(cont);
    }

    public boolean checkAddContactsToGroup(String groupeName, Contact contact){
        if (checkGroup(groupeName)) {
            List<Contact> contacts = groups.get(groupeName);
            contacts.add(contact);
            return true;
        }else {
            return false;
        }
    }

    public void showContacts(){
        int i = 1;
        for (Contact contact: contacts) {
            System.out.println(i + ".\t" + contact.getName());
        }
    }

    public void showAllContacts(){
        System.out.println("######################################");
        System.out.println("###       Спровочник контактов      ##");
        System.out.println("######################################");
        for (Map.Entry<String, List<Contact>> entry : groups.entrySet()) {
            System.out.println("-" + entry.getKey() + ":");

            for (Contact c: entry.getValue()){
                System.out.println("\t" + c.toString());
            }

        }
    }

}

