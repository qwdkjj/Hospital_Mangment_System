import java.util.*;
public class Main
{
    public static void print()
    {
        System.out.println("************ Welcome to aur hospital mangment system ***********");
        System.out.println("if you want to add doctor enter : (1)");
        System.out.println("if you want to delete doctor entre : (2)");
        System.out.println("if you want to Fix any doctor entre : (3)");
        System.out.println("if you want to calculate the number of dealings doctors entre : (4)");
        System.out.println("if you want to display all the doctors in hospital entre : (5)");
        System.out.println("if you want to add patient entre : (6)");
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        DoctorDeal d1 = new DoctorDeal();
        Patiants p1=new Patiants();


        print();
        int chois=in.nextInt();
        switch (chois)
        {
            case 1:
                System.out.println("  if you want to add deal doctor press : (1)");
                System.out.println("  if you want to add train doctor press : (2)");
                int c=in.nextInt();
                System.out.println("add the doctor details please :");
                if(c==1||c==2)
                {
                    d1.addDoctorDeal(c);
                }
                else
                    d1.addDoctor();
            case 2:
                d1.deleteDoctor();
            case 3:
                d1.FixDoctor();
            case 4:
                System.out.println("the NUMBER of the dealings doctors is :" + d1.countOf_DealingDoctor());
            case 5:
                d1.displayAllDoctorsInHospital();
            case 6:
                p1.addPatient();










            case 7:
                System.exit(0);


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