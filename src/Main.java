import java.util.*;
public class Main
{
    public static void print()
    {
        System.out.println("************ Welcome to our hospital mangment system ***********");
        System.out.println("1- if you want to add doctor enter ");
        System.out.println("2- if you want to delete doctor entre ");
        System.out.println("3- if you want to Fix any doctor entre ");
        System.out.println("4- if you want to calculate the number of dealings doctors entre ");
        System.out.println("5- if you want to display all the doctors in hospital entre ");
        System.out.println("6- if you want to add patient entre ");
        System.out.println("7- if you want to delete patient entre ");
        System.out.println("8- if you want to display ALL the patient in HOSPITAL entre ");
        System.out.println("9- if you want to add a new Treatment Record entre ");
        System.out.println("10- if you want to display the internal treatment record entre ");
        System.out.println("11- if you want to display the external treatment record entre ");
        System.out.println("12- if you want to display ALL the treatment records for any particular patient entre ");
        System.out.println("13- if you want to EXIT ");
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        boolean end=true;

        DoctorDeal d1 = new DoctorDeal();
        Patiants p1=new Patiants();
        TreatmentRecord t1=new TreatmentRecord();



        while(end)
        {
            print();
            int chois=in.nextInt();

            switch (chois)
            {
                case 1:
                    System.out.println("  if you want to add DEAL doctor press : (1)");
                    System.out.println("  if you want to add TRAINEE doctor press : (2)");
                    System.out.println("  if you want to add GENERAL doctor press : (3)");
                    int c = in.nextInt();
                    if (c == 1 || c == 2) {
                        System.out.println("add the doctor details please :");
                        t1.addDoctorDeal(c);
                    } else if(c==3) {
                        System.out.println("add the doctor details please :");
                        t1.addDoctor();
                    }
                    break;
                case 2:
                    t1.deleteDoctor();
                    break;
                case 3:
                    t1.FixDoctor();
                    break;
                case 4:
                    System.out.println("the NUMBER of the dealings doctors is :" + t1.countOf_DealingDoctor());
                    break;
                case 5:
                    t1.displayAllDoctorsInHospital();
                    break;
                case 6:
                    t1.addPatient();
                    break;
                case 7:
                    t1.deletePatient();
                    break;
                case 8:
                    t1.displayAllPatients();
                    break;
                case 9:
                    t1.addNewTreatmentRecord();
                    break;
                case 10:
                    t1.displayTreatmentInternal();
                    break;
                case 11:
                    t1.displayTreatmentExternal();
                    break;
                case 12:
                    t1.displayTreatmentRecordsForParticularPatient();
                    break;


                case 13:
                    System.exit(0);
                    end=false;
                    break;


            }

        }

























    }
}








































/*

*
*
*

*

*
* // كلاسات الأقسام
public class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // الجيترز والسيترز
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}










public class OphthalmologyDepartment extends Department {
    public OphthalmologyDepartment(int id, String name) {
        super(id, name);
    }
}










public class PulmonologyDepartment extends Department {
    public PulmonologyDepartment(int id, String name) {
        super(id, name);
    }
}







public class GeneralSurgeryDepartment extends Department {
    public GeneralSurgeryDepartment(int id, String name) {
        super(id, name);
    }
}






public class EmergencyDepartment extends Department {
    public EmergencyDepartment(int id, String name) {
        super(id, name);
    }
}




// كلاسات العيادات
public class Clinic {
    private int id;
    private String name;
    private String doctorName;

    public Clinic(int id, String name, String doctorName) {
        this.id = id;
        this.name = name;
        this.doctorName = doctorName;
    }

    // الجيترز والسيترز
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}








public class OphthalmologyClinic extends Clinic {
    public OphthalmologyClinic(int id, String name, String doctorName) {
        super(id, name, doctorName);
    }
}






public class GastroenterologyClinic extends Clinic {
    public GastroenterologyClinic(int id, String name, String doctorName) {
        super(id, name, doctorName);
    }
}





public class InternalMedicineClinic extends Clinic {
    public InternalMedicineClinic(int id, String name, String doctorName) {
        super(id, name, doctorName);
    }
}





// كلاس المريض
public class Patient {
    private int id;
    private String name;
    private String address;
    private String birthDate;
    private List<TreatmentRecord> internalTreatments;
    private List<TreatmentRecord> externalTreatments;
    private boolean isDischarged;
    private String dischargeDate;

    public Patient(int id, String name, String address, String birthDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.internalTreatments = new ArrayList<>();
        this.externalTreatments = new ArrayList<>();
        this.isDischarged = false;
        this.dischargeDate = null;
    }

    // الجيترز والسيترز وطرق إضافة المعالجات
    // ...
}

// كلاس سجل المعالجة
public class TreatmentRecord {
    private int treatmentId;
    private String treatmentDate;
    private double treatmentCost;
    private int departmentId;
    private int clinicId;
    private String doctorName;

    public TreatmentRecord(int treatmentId, String treatmentDate, double treatmentCost, int departmentId, int clinicId, String doctorName) {
        this.treatmentId = treatmentId;
        this.treatmentDate = treatmentDate;
        this.treatmentCost = treatmentCost;
        this.departmentId = departmentId;
        this.clinicId = clinicId;
        this.doctorName = doctorName;
    }

    // الجيترز والسيترز
    // ...
}
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*/