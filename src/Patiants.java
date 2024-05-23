import java.util.Scanner;
import java.util.*;

public class Patiants
{
    Scanner in=new Scanner(System.in);
    private String name_of_patient;
    private int id_of_patient;
    private String address_of_patient;
    private String birth_date_of_patient;
    private String date_of_graduation;
    private String date_of_accept;
    ArrayList <Patiants>enternal_patiants = new ArrayList<Patiants>();
    ArrayList<Patiants> external_patiants = new ArrayList<Patiants>();
    public Patiants(){}

    public Patiants(String name_of_patient , int id_of_patient , String address_of_patient  , String birth_date_of_patient , String date_of_graduation)
    {
        this.name_of_patient = name_of_patient;
        this.id_of_patient = id_of_patient;
        this.address_of_patient = address_of_patient;
        this.birth_date_of_patient = birth_date_of_patient;
        this.date_of_graduation=date_of_graduation;
    }
    public Patiants(int id_of_patient , String name_of_patient  , String address_of_patient  , String birth_date_of_patient , String date_of_accept)
    {
        this.name_of_patient = name_of_patient;
        this.id_of_patient = id_of_patient;
        this.address_of_patient = address_of_patient;
        this.birth_date_of_patient = birth_date_of_patient;
        this.date_of_accept=date_of_accept;

    }



    public String getName_of_patient() {
        return name_of_patient;
    }

    public int getId_of_patient() {
        return id_of_patient;
    }

    public String getAddress_of_patient() {
        return address_of_patient;
    }

    public String getBirth_date_of_patient() {
        return birth_date_of_patient;
    }

    public String getDate_of_graduation() {
        return date_of_graduation;
    }

    public String getDate_of_accept() {
        return date_of_accept;
    }

    public void addPatient()
    {
        System.out.println("if you want to add INTERNAL patient press 1");
        System.out.println("if you want to add EXTERNAL patient press 2");
        int chois =in.nextInt();

        if(chois==1)
        {
            System.out.println("Please entre the name of the ENTERNAL patient you want to add it :");
            name_of_patient = in.next();
            System.out.println("Please entre the adress of the ENTERNAL patient you want to add it :");
            address_of_patient = in.next();
            System.out.println("Please entre the birth date of the ENTERNAL patient you want to add it :");
            birth_date_of_patient = in.next();
            System.out.println("Please entre the id of the ENTERNAL patient you want to add it :");
            id_of_patient = in.nextInt();
            System.out.println("Please enter the graduation of the ENTERNAL patient you want to add :");
            date_of_graduation=in.next();
            enternal_patiants.add(new Patiants(name_of_patient , id_of_patient , address_of_patient , birth_date_of_patient , date_of_graduation));

        }
        else
        {
            System.out.println("Please entre the name of the EXTERNAL patient you want to add it :");
            name_of_patient = in.next();
            System.out.println("Please entre the adress of the EXTERNAL patient you want to add it :");
            address_of_patient = in.next();
            System.out.println("Please entre the birth date of the EXTERNAL patient you want to add it :");
            birth_date_of_patient = in.next();
            System.out.println("Please entre the id of the EXTERNAL patient you want to add it :");
            id_of_patient = in.nextInt();
            System.out.println("Please enter the accept date of the EXTERNAL patient you want to add it :");
            date_of_accept=in.next();
            external_patiants.add(new Patiants(id_of_patient , name_of_patient , address_of_patient , birth_date_of_patient , date_of_accept));

        }

    }








}