package HomeWork16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        new Test().run();
    }

    private void run() {

        Contact contact1 = new Contact("Олефир", "306322589745",
                LocalDate.of(1993, 5, 12));
        Contact contact2 = new Contact("Яковенко", "380957493216",
                LocalDate.of(1967, 7, 30));
        Contact contact3 = new Contact("Сидоренко", "380735557634",
                LocalDate.of(1995, 12, 21));
        Contact contact4 = new Contact("Яковенко", "380957493216",
                LocalDate.of(1967, 7, 30));
        Contact contact5 = new Contact("Сидоренко", "380735557634",
                LocalDate.of(1995, 12, 21));


        CallLog callLog1 = new CallLog("Донченко", "306322589745",
                LocalDateTime.of(2021, 11, 5, 14, 33),
                356, CallStatus.MISSED);
        CallLog callLog2 = new CallLog("Толстой", "380957493216",
                LocalDateTime.of(2021, 11, 5, 6, 28),
                66, CallStatus.INCOMING);
        CallLog callLog3 = new CallLog("Тищенко", "380957493216",
                LocalDateTime.of(2021, 11, 3, 16, 14),
                128, CallStatus.OUTGOING);
        CallLog callLog4 = new CallLog("Толстой", "380957493216",
                LocalDateTime.of(2021, 11, 5, 6, 28),
                66, CallStatus.INCOMING);
        CallLog callLog5 = new CallLog("Тищенко", "306322589745",
                LocalDateTime.of(2021, 11, 3, 16, 14),
                128, CallStatus.INCOMING);


        Message message1 = new Message("Онищенко", "306322589745",
                "\"Перезвони\"", LocalDateTime.of(2021, 10, 28, 14, 14));

        Message message2 = new Message("Судейченко", "380957493216",
                "\"Доброе утро\"", LocalDateTime.of(2021, 11, 14, 8, 27));

        Message message3 = new Message("Каменсикх", "380957493216",
                "\"Вы выиграли в лотерею\"", LocalDateTime.of(2021, 9, 3, 13, 45));
        Message message4 = new Message("Судейченко", "306322589745",
                "\"Доброе утро\"", LocalDateTime.of(2021, 11, 14, 8, 27));

        Message message5 = new Message("Каменсикх", "380735557634",
                "\"Вы выиграли в лотерею\"", LocalDateTime.of(2021, 9, 3, 13, 45));

        List<Contact> contacts = new ArrayList<>();

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);

        System.out.println("Все контакты : ");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " " +
                    contact.getPhoneNumber() + " " +
                    contact.getBirthDay());
        }
        Set<Contact> uniqueContacts = new HashSet<>(contacts);

        System.out.println("\nУникальные контакты : ");
        for (Contact uniqueContact : uniqueContacts) {
            System.out.println(uniqueContact.getName() + " " +
                    uniqueContact.getPhoneNumber() + " " +
                    uniqueContact.getBirthDay());

        }

        List<CallLog> callLogs = new ArrayList<>();
        callLogs.add(callLog1);
        callLogs.add(callLog2);
        callLogs.add(callLog3);
        callLogs.add(callLog4);
        callLogs.add(callLog5);

        System.out.println("\nВсе вызовы : ");
        for (CallLog callLog : callLogs) {
            System.out.println(callLog.getNameSubscriber() + " "
                    + callLog.getPhoneNumber() + " "
                    + callLog.getCallTime() + " "
                    + callLog.getCallDuration() + " "
                    + callLog.getCallStatus());
        }

        Set<CallLog> uniqueCallLogs = new HashSet<>(callLogs);

        System.out.println("\nУникальные вызовы : ");
        for (CallLog uniqueCallLog : uniqueCallLogs) {
            System.out.println(uniqueCallLog.getNameSubscriber() + " "
                    + uniqueCallLog.getPhoneNumber() + " "
                    + uniqueCallLog.getCallTime() + " "
                    + uniqueCallLog.getCallDuration() + " "
                    + uniqueCallLog.getCallStatus());
        }

        List<Message> messages = new ArrayList<>();

        messages.add(message1);
        messages.add(message2);
        messages.add(message3);
        messages.add(message4);
        messages.add(message5);

        System.out.println("\nВсе сообщения : ");
        for (Message message : messages) {
            System.out.println(message.getMessageTime() + " "
                    + message.getPhoneNumber() + " "
                    + message.getNameSubscriber() + " "
                    + message.getText());
        }

        Set<Message> uniqueMessages = new HashSet<>(messages);

        System.out.println("\nУникальные сообщения : ");
        for (Message uniqueMessage : uniqueMessages) {
            System.out.println(uniqueMessage.getMessageTime() + " "
                    + uniqueMessage.getPhoneNumber() + " "
                    + uniqueMessage.getNameSubscriber() + " "
                    + uniqueMessage.getText());
        }


        Collection<Contact> foundContacts = findContactsText(contacts, "ен");
        Collection<CallLog> foundCallLogs = findCallLogsText(callLogs, "Д");
        Collection<Message> foundMessages = findMessageText(messages, "ре");

        System.out.println("--------doTask5-------------");
        doGroupsOfMessages(contacts, messages);
        printGroupsOfMessages(doGroupsOfMessages(contacts, messages));

        System.out.println("--------doTask6-------------");
        doGroupOfCallLogs(contacts, callLogs);
        printGroupsOfCallLogs(doGroupOfCallLogs(contacts, callLogs));

        List<Pair<Contact, Integer>> connection = new ArrayList<>();
        for (Contact contact : contacts) {
            connection.add(new Pair<>(contact, findCallLog(callLogs, contact).size()));
        }


    }

    private Collection<Contact> findContactsText(Collection<Contact> contacts, String text) {
        List<Contact> result = new ArrayList<>();

        for (Contact contact : contacts) {
            if (contact.getName().contains(text) ||
                    contact.getPhoneNumber().contains(text)) {
                result.add(contact);
            }
        }
        return result;
    }

    private Collection<CallLog> findCallLogsText(Collection<CallLog> callLogs, String text) {
        List<CallLog> result = new ArrayList<>();

        for (CallLog callLog : callLogs) {
            if (callLog.getNameSubscriber().contains(text) ||
                    callLog.getPhoneNumber().contains(text)) {
                result.add(callLog);
            }
        }
        return result;
    }

    private Collection<Message> findMessageText(Collection<Message> messages, String text) {
        List<Message> result = new ArrayList<>();

        for (Message message : messages) {
            if (message.getNameSubscriber().contains(text) ||
                    message.getPhoneNumber().contains(text) ||
                    message.getText().contains(text)) {
                result.add(message);
            }
        }
        return result;
    }

    private Collection<Message> findMessage(Collection<Message> messages, Contact contact) {
        Collection<Message> foundMessages = new ArrayList<>();
        for (Message message : messages) {
            if (message.getPhoneNumber().equals(contact.getPhoneNumber())) {
                foundMessages.add(message);
            }
        }
        return foundMessages;
    }

    private Map<Contact, Collection<Message>>
    doGroupsOfMessages(Collection<Contact> contacts, Collection<Message> messages) {
        Map<Contact, Collection<Message>> groupsOfMessages = new HashMap<>();

        for (Contact contact : contacts) {

            Collection<Message> groupMessages = findMessage(messages, contact);
            groupsOfMessages.put(contact, groupMessages);
        }
        return groupsOfMessages;
    }

    private Collection<CallLog> findCallLog(Collection<CallLog> callLogs, Contact contact) {
        Collection<CallLog> foundCallLogs = new ArrayList<>();
        for (CallLog callLog : callLogs) {
            if (callLog.getPhoneNumber().equals(contact.getPhoneNumber())) {
                foundCallLogs.add(callLog);
            }
        }
        return foundCallLogs;
    }

    private Map<Contact, Collection<CallLog>> doGroupOfCallLogs
            (Collection<Contact> contacts, Collection<CallLog> callLogs) {
        Map<Contact, Collection<CallLog>> groupsOfCallLogs = new HashMap<>();
        for (Contact contact : contacts) {
            Collection<CallLog> groupCallLogs = findCallLog(callLogs, contact);
            groupsOfCallLogs.put(contact, groupCallLogs);
        }
        return groupsOfCallLogs;
    }

    private void printGroupsOfMessages(Map<Contact, Collection<Message>> groupsOfMessages) {
        for (Contact contact : groupsOfMessages.keySet()) {
            Collection<Message> messages = groupsOfMessages.get(contact);
            System.out.println("Контакт : " + contact.getPhoneNumber());
            System.out.println("Кол-во сообщений контакта : " + messages.size());
            System.out.println("Сообщения контакта : ");
            int count = 1;
            for (Message message : messages) {
                System.out.println(count + ". " + message.getText());
                count++;
            }
        }
    }

    private void printGroupsOfCallLogs(Map<Contact, Collection<CallLog>> groupOfCallLogs) {
        for (Contact contact : groupOfCallLogs.keySet()) {
            Collection<CallLog> callLogs = groupOfCallLogs.get(contact);
            System.out.println("Контакт : " + contact.getPhoneNumber());
            System.out.println("Кол-во вызовов контакта : " + callLogs.size());
            System.out.println("Статус вызова : ");
            int count = 1;
            for (CallLog callLog : callLogs) {
                System.out.println(count + ". " + callLog.getCallStatus());
                count++;
            }
        }
    }

}
