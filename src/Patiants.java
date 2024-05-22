import java.util.ArrayList;
import java.util.Scanner;

public class Patiants
{

    private int id;
    private String name_of_patient;
    private String birthDate;
    private String adress;
    private String date_of_gradute_the_internal_patiant;
    private ArrayList <TreatmentRecord> treatmentRecords;

    private ArrayList <Patiants> patiants=new ArrayList<Patiants>();


    Scanner in=new Scanner(System.in);
    public Patiants(int id, String name_of_patient , String adress , String birthDate, ArrayList<TreatmentRecord> treatmentRecords)
    {
        this.id = id;
        this.adress=adress;
        this.name_of_patient = name_of_patient;
        this.birthDate = birthDate;
        this.treatmentRecords = treatmentRecords;
    }
    public Patiants(int id, String name_of_patient , String adress , String birthDate)
    {

        this.id = id;
        this.adress=adress;
        this.name_of_patient = name_of_patient;
        this.birthDate = birthDate;
    }
    public Patiants(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_of_patient() {
        return name_of_patient;
    }

    public void setName_of_patient(String name_of_patient) {
        this.name_of_patient = name_of_patient;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    //---------------------------------------------------------------------------------------------

    public void addPatiant()
    {
        System.out.println("IF YOU WANT TO ADD INTERNAL PATIENT ENTRE (1)");
        System.out.println("IF YOU WANT TO ADD EXTERNAL PATIENT ENTRE (2)");
        int chois=in.nextInt();

        System.out.println("Please entre the name of the patient");
        name_of_patient=in.next();
        System.out.println("Please enter the ID of the patient");
        id=in.nextInt();
        System.out.println("Please enter the Adress of the patient");
        adress=in.next();
        System.out.println("Please enter the BIRTH DATE of the patient");
        birthDate=in.next();

        if(chois==1)
        {

            System.out.println("Please enter the date_of_gradute_the_internal_patiant ");
            date_of_gradute_the_internal_patiant=in.next();

            TreatmentRecord ot=new TreatmentRecord();
            ot.eturnInternalTreatmentRecordsList();

            System.out.println(" *** THE DETAILS OF INTERNAL PATIANT ***");
            for (TreatmentRecord t:treatmentRecords)
            {
                System.out.println(t);
            }

        }







        //patiants.add(new Patiants(id , name_of_patient,adress,birthDate));

    }








}
