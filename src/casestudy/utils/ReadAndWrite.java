package casestudy.utils;

import casestudy.models.Booking;
import casestudy.models.Contract;
import casestudy.models.facility.Facility;
import casestudy.models.facility.House;
import casestudy.models.facility.Room;
import casestudy.models.facility.Villa;
import casestudy.models.person.Customer;
import casestudy.models.person.Employee;

import java.io.*;
import java.util.*;


public class ReadAndWrite {

        public static void writeListStringToCSV( List<String> string, String path, boolean append){
           File file = new File(path);
           try {
               FileWriter fileWriter = new FileWriter(file,append);
              BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
              for (String line: string){
                   bufferedWriter.write(line);
               }
              bufferedWriter.close();
            } catch (IOException e) {
             e.printStackTrace();

         }
       }
    public static void writeListEmpCSV(List<Employee> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Employee employee : list){
            stringList.add(employee.toString());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static void writeListCusCSV(List<Customer> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Customer cusList : list){
            stringList.add(cusList.toString());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static void writeListHoCSV(List<House> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (House house : list){
            stringList.add(house.toString());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static void writeListRoCSV(List<Room> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Room room : list){
            stringList.add(room.toString());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static void writeListVilCSV(List<Villa> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Villa villa : list){
            stringList.add(villa.toString());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static void writeListFacCSV(Map<Facility,Integer> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Facility facility : list.keySet()){
            String key = facility.getIdService() +","+ facility.getNameService() + "," + list.get(facility);

            stringList.add(key);
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static  void writeListBookingCSV(Set<Booking> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Booking booking : list){
            stringList.add(booking.toString());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static void writeQueueBookingCSV(Queue<Booking> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Booking booking : list){
            stringList.add(booking.toString());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static void writeListContractCSV(List<Contract> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Contract contract : list){
            stringList.add(contract.toString());
        }
        writeListStringToCSV(stringList,path,append);
    }

    public static List<String> readCSV(String path){
        File file = new File(path);
        List<String> listString = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                listString.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reader file");
        }
        return listString;
    }
    public static List<Employee> getListEmpFromCSV(String path){
        List<Employee> employees =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Employee employee = new Employee(array[1],array[2],array[3],(array[4]),
                    (array[5]),array[6],array[0],array[7],Double.parseDouble(array[8]));
            employees.add(employee);
        }
        return employees;
    }
    public static List<Customer> getListCusFromCSV(String path){
        List<Customer> customers =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Customer customer = new Customer(array[1],array[2],array[3],array[4],
                    array[5],array[6],array[0],array[7],array[8]);
            customers.add(customer);
        }
        return customers;
    }
    public static List<House> getListHoFromCSV(String path) {
        List<House> houses = new ArrayList<>();
        List<String> stringList = readCSV(path);
        for (String line : stringList) {
            String[] array = line.split(",");
            House house = new House(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                    Integer.parseInt(array[4]), array[5], array[6], Integer.parseInt(array[7]));
            houses.add(house);
        }
        return houses;
    }
    public static List<Room> getListRoFromCSV(String path) {
        List<Room> rooms = new ArrayList<>();
        List<String> stringList = readCSV(path);
        for (String line : stringList) {
            String[] array = line.split(",");
            Room room = new Room(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                    Integer.parseInt(array[4]), array[5], array[6]);
            rooms.add(room);
        }
        return rooms;
    }
    public static List<Villa> getListVilFromCSV(String path) {
        List<Villa> villas = new ArrayList<>();
        List<String> stringList = readCSV(path);
        for (String line : stringList) {
            String[] array = line.split(",");
            Villa villa = new Villa(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                    Integer.parseInt(array[4]), array[5], array[6],Double.parseDouble(array[7]),Integer.parseInt(array[8]));
            villas.add(villa);
        }
        return villas;
    }
    public static Set<Booking> getListBookingFromCSV(String path) {
        Set<Booking> bookings = new TreeSet<>();
        List<String> stringList = readCSV(path);
        for (String line : stringList) {
            String[] array = line.split(",");
            Booking booking = new Booking(array[0], array[1], array[2], array[3], array[4], array[5]);
            bookings.add(booking);
        }
        return bookings;
    }
    public static Queue<Booking> getQueueBookingFromCSV(String path) {
        Queue<Booking> bookings = new LinkedList<>();
        List<String> stringList = readCSV(path);
        for (String line : stringList) {
            String[] array = line.split(",");
            Booking booking = new Booking(array[0], array[1], array[2], array[3], array[4], array[5]);
            bookings.add(booking);
        }
        return bookings;
    }
    public static List<Contract> getListContractFromCSV(String path) {
        List<Contract> contracts = new ArrayList<>();
        List<String> stringList = readCSV(path);
        for (String line : stringList) {
            String[] array = line.split(",");
            Contract contract = new Contract(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), array[4]);
            contracts.add(contract);
        }
        return contracts;
    }

}
