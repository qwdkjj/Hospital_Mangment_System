import java.util.Scanner;
import java.util.*;

public class Patiants extends DoctorDeal
{
    Scanner in=new Scanner(System.in);
    protected String name_of_patient;
    protected int id_of_patient;
    private int department_id_of_patient;
    private String address_of_patient;
    private String birth_date_of_patient;
    private String date_of_graduation;
    private String date_of_accept;
    ArrayList <Patiants>enternal_patiants = new ArrayList<Patiants>();
    ArrayList<Patiants> external_patiants = new ArrayList<Patiants>();
    ArrayList<Doctor> doctor_internal_respons=new ArrayList<>();

    public Patiants(){}

    public Patiants(String name_of_patient , int id_of_patient , String address_of_patient  , String birth_date_of_patient , String date_of_graduation )
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
            System.out.println("Please enter the graduation date of the ENTERNAL patient you want to add :");
            date_of_graduation=in.next();

            enternal_patiants.add(new Patiants(name_of_patient , id_of_patient , address_of_patient , birth_date_of_patient , date_of_graduation ));
            //------------------------
            System.out.println("the patient who has name : " + name_of_patient + " added successfully");
            //------------------------
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

            System.out.println("the patient who has name : " + name_of_patient + " added successfully");
        }

    }



    public void deletePatient()
    {
        System.out.println("Please entre the ID of patient you want to delete");
        int chois =in.nextInt();


        int count=0;
        Patiants po_1=null;
        for (Patiants patient :enternal_patiants)
        {
            if(patient.getId_of_patient() == chois)
            {
                po_1=patient;
                System.out.println("the patient who has name : " +  patient.getName_of_patient()  + " is deleted successfully");
                enternal_patiants.remove(po_1);
                count++;
                break;
            }
            else
            {
                System.out.println("WRONG ID !! Please entre valid ID");
                count++;
                break;
            }
        }


        if(count==0)
        {
            Patiants po_2=null;

            for (Patiants patient : external_patiants)
            {
                if (patient.getId_of_patient() == chois)
                {
                    po_2=patient;
                    System.out.println("the patient who has name : " + patient.getName_of_patient() + " is deleted successfully");
                    external_patiants.remove(po_2);
                    break;
                }
                else
                {
                    System.out.println("WRONG ID !! Please entre valid ID");
                    break;
                }

            }
        }

    }


    public void displayAllPatients()
    {
        for (Patiants patient :enternal_patiants)
            patient.displayIn();

        for (Patiants patient: external_patiants)
            patient.displayEx();

    }




    public void displayIn()
    {
        System.out.println("the name of ENTERNAL patient :" + name_of_patient);
        System.out.println("the birth date of ENTERNAL patient :" + birth_date_of_patient);
        System.out.println("the adress of the ENTERNAL patient :" + address_of_patient);
        System.out.println("the id of the ENTERNAL patient :" + id_of_patient);
        System.out.println("the graduation of the ENTERNAL patient :" + date_of_graduation);
    }

    public void displayEx()
    {
        System.out.println("the name of EXTERNAL patient :" + name_of_patient);
        System.out.println("the birth date of EXTERNAL patient :" + birth_date_of_patient);
        System.out.println("the adress of the EXTERNAL patient :" + address_of_patient);
        System.out.println("the id of the EXTERNAL patient :" + id_of_patient);
        System.out.println("the accept date of the EXTERNAL patient :" + date_of_accept);
    }






}