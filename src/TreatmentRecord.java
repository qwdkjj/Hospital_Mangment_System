import java.util.*;
public class TreatmentRecord extends Patiants
{
    Scanner in=new Scanner(System.in);

    private String nam;
    private int treatment_id;
    private int clinical_id;
    private double treatment_cost;
    private String treatment_date;
    private int department_id_of_internal_treatment;


    Doctor treating_doctor = new Doctor();
    ArrayList<Doctor> doctor_internal_respons=new ArrayList<>();

    ArrayList<TreatmentRecord> internalRecords=new ArrayList<TreatmentRecord>();
    ArrayList<TreatmentRecord> externalRecords=new ArrayList<TreatmentRecord>();

    TreatmentRecord(){}

    public TreatmentRecord(int treatment_id, double treatment_cost, String treatment_date, int department_id_of_internal_treatment ,ArrayList<Doctor> doctor_internal_respons , String nam_patient) {
        this.treatment_id = treatment_id;
        this.treatment_cost = treatment_cost;
        this.treatment_date = treatment_date;
        this.department_id_of_internal_treatment = department_id_of_internal_treatment;
        this.doctor_internal_respons=doctor_internal_respons;
        this.nam=nam_patient;
    }
//--------------------------------------------
    public TreatmentRecord(int treatment_id, double treatment_cost, String treatment_date , int clinical_id , Doctor treating_doctor,String nam_patient)
    {
        this.treatment_id = treatment_id;
        this.treatment_cost = treatment_cost;
        this.treatment_date = treatment_date;
        this.clinical_id = clinical_id;
        this.treating_doctor=treating_doctor;
        this.nam=nam_patient;

    }
//-------------------------------------------
    public int getTreatment_id() {
        return treatment_id;
    }

    public double getTreatment_cost() {
        return treatment_cost;
    }

    public String getTreatment_date() {
        return treatment_date;
    }

    public int getDepartment_id_of_internal_treatment() {
        return department_id_of_internal_treatment;
    }




    public void addNewTreatmentRecord()
    {
        System.out.println("if you want to add new treatment INTERNAL record press 1");
        System.out.println("if you want to add new treatment EXTERNAL record press 2");
        int chois =in.nextInt();
        if(chois==1)
        {
            System.out.println("Please entre the name of the patient you want to add new Treatment for him ");
            nam=in.next();
            System.out.println("Please entre the Treatment ID");
            treatment_id=in.nextInt();
            System.out.println("Please enter the treatment cost");
            treatment_cost=in.nextDouble();
            System.out.println("Please enter the treatment date");
            treatment_date=in.next();
            System.out.println("Please enter the department_id_of_internal_treatment");
            department_id_of_internal_treatment=in.nextInt();

            for(Doctor d : docs)
            {
                if(department_id_of_internal_treatment==d.getDepartmentId())
                {
                    System.out.println("entre the responsiple Doctor name of the patient");
                    String n=in.next();
                    if(n.equals(d.getName()))
                        doctor_internal_respons.add(d);
                }
            }

            for(DoctorDeal deals: DoctorDeal)
            {
                if(department_id_of_internal_treatment==deals.getDepartmentId())
                {
                    System.out.println("entre the responsiple Doctor name of the patient");
                    String n=in.next();
                    if(n.equals(deals.getName()))
                        doctor_internal_respons.add(deals);
                }
            }
            for(DoctorDeal trains: DoctorTrains)
            {
                if(department_id_of_internal_treatment==trains.getDepartmentId())
                {
                    System.out.println("entre the responsiple Doctor name of the patient");
                    String n=in.next();
                    if(n.equals(trains.getName()))
                        doctor_internal_respons.add(trains);
                }
            }




            for(Patiants p:enternal_patiants)
            {
                if(nam.equals(p.getName_of_patient()))
                {
                    internalRecords.add(new TreatmentRecord(treatment_id, treatment_cost, treatment_date, department_id_of_internal_treatment, doctor_internal_respons, nam));
                    break;
                }
            }


        }
        else
        {
            System.out.println("Please entre the name of the patient you want to add new Treatment for him :");
            nam=in.next();
            System.out.println("Please entre the Treatment ID");
            treatment_id=in.nextInt();
            System.out.println("Please enter the treatment cost");
            treatment_cost=in.nextDouble();
            System.out.println("Please enter the treatment date");
            treatment_date=in.next();
            System.out.println("entre the clinical_id");
            clinical_id=in.nextInt();


            System.out.println("Please enter the name and the ID of the doctor who will treat the EXTERNAL patient");
            String n=in.next();
            int i=in.nextInt();
            int c=0;
            for(DoctorDeal deals: DoctorDeal)
            {
                if(n.equals(deals.getName()) && i==deals.getId())
                {
                    treating_doctor = deals;
                    c++;
                    break;
                }
            }
            if(c==0)
                for(Doctor d: docs)
                {
                    if(n.equals(d.getName()) && i==d.getId())
                    {
                        treating_doctor = d;
                        c++;
                        break;
                    }
                }
            if(c==0)
                for(DoctorDeal trains: DoctorTrains)
                {
                    if(n.equals(trains.getName()) && i==trains.getId())
                    {
                        treating_doctor = trains;
                        break;
                    }
                }
            for(Patiants p:external_patiants)
            {
                if(nam.equals(p.getName_of_patient()))
                {
                    externalRecords.add(new TreatmentRecord(treatment_id, treatment_cost, treatment_date, clinical_id, treating_doctor, nam));
                    break;
                }
            }


        }

    }



    public void displayInternal()
    {
        System.out.println("the name of the patient is :" + nam);
        System.out.println("the Treatment ID is :" + treatment_id);
        System.out.println("the treatment cost is :" + treatment_cost);
        System.out.println("the treatment date is :" + treatment_date);
        System.out.println("the department_id is :" + department_id_of_internal_treatment);
        System.out.println("the DOCTORS responsiple of the internal patient who has name :" + nam);
        for(Doctor d : doctor_internal_respons)
          System.out.println(d.toString());
    }

    public void displayExternal()
    {
        System.out.println("the name of the patient is :" + nam);
        System.out.println("the Treatment ID is :" + treatment_id);
        System.out.println("the treatment cost is :" + treatment_cost);
        System.out.println("the treatment date is :" + treatment_date);
        System.out.println("the clinical_id" + clinical_id);
        System.out.println("the details of doctor who will treat the patient :" +nam+ " is :" + treating_doctor.getName() + " and his specialized is :" + treating_doctor.getSpeciality());

    }

    public void displayTreatmentInternal()
    {
        for (TreatmentRecord t:internalRecords)
        {
            t.displayInternal();
        }
    }

    public void displayTreatmentExternal()
    {
        for (TreatmentRecord t:externalRecords)
        {
            t.displayExternal();
        }
    }







    public void displayTreatmentRecordsForParticularPatient()
    {
        System.out.println("Please entre the Name of the patient :");
        String i=in.next();

        for (TreatmentRecord t:externalRecords)
        {

            if(i.equals(t.nam))
            {
                t.displayExternal();

            }

        }

        for (TreatmentRecord t:internalRecords)
        {
            if(i.equals(t.nam))
            {
                t.displayInternal();
            }
        }

    }


   /* public void numberOfPatientsInParticularDepartment()
    {
        System.out.println("PLEASE ENTRE THE DEPARTMENT ID TO CALCULATE THE NUMBER Of PATIENT IN THIS DEPARTMENT");
        int d=in.nextInt();
        for (TreatmentRecord t:internalRecords)
        {

        }




    }*/





}