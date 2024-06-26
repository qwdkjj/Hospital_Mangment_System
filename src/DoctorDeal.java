import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
public class DoctorDeal extends Doctor
{
    private int countOfDealingDoctors = 0;
    private int salaryOfTranings;
    private int cost;
    private String dateOfBeginning;
    private String dateOfDecade;
    private String dateOfEnd;
    ArrayList <DoctorDeal> DoctorDeal=new ArrayList();
    ArrayList <DoctorDeal> DoctorTrains=new ArrayList();


    public DoctorDeal(int cost , String dateOfDecade,String name, int id, String speciality, String address,String birth,int salary ,int departmentId)
    {
        super(name, id, speciality, address,birth,salary,departmentId);
        this.cost = cost;
        this.dateOfDecade=dateOfDecade;
    }
    public DoctorDeal( String name, int id, String speciality, String address,String birth,int salaryOfTranings,String dateOfBeginning,String dateOfEnd,int departmentId)
    {
        super(name, id, speciality, address,birth,salaryOfTranings,departmentId);
        this.dateOfBeginning=dateOfBeginning;
        this.dateOfEnd=dateOfEnd;
    }
    public DoctorDeal(){}

    public void addDoctorDeal(int t)
    {
        Scanner in=new Scanner(System.in);
        if(t==1)
        {
            System.out.println("entre the name  of the doctorDealing");
            name = in.next();
            System.out.println("entre the id of the doctorDealing");
            id = in.nextInt();
            System.out.println("entre the department id of the doctorDealing");
            departmentId=in.nextInt();
            System.out.println("entre the specialization of the doctorDealing you want to add it");
            speciality = in.next();
            System.out.println("entre the address of the doctorDealing");
            address = in.next();
            System.out.println("entre the birth date of the doctorDealing");
            birth = in.next();
            System.out.println("entre the date of Beginning of the doctorDealing");
            dateOfDecade = in.next();
            System.out.println("entre the cost of the doctorDealing");
            cost= in.nextInt();
            DoctorDeal.add(new DoctorDeal(cost/2, dateOfDecade, name, id, speciality, address, birth, salary / 2,departmentId));
            countOfDealingDoctors++;
            System.out.println("the doctor who has name : " + name + " is added successfully !");
        }
        else
        {
            System.out.println("entre the name  of the trainingDoctor");
            name = in.next();
            System.out.println("entre the id of the trainingDoctor");
            id = in.nextInt();
            System.out.println("entre the department ID of the trainingDoctor");
            departmentId=in.nextInt();
            System.out.println("entre the specialization of the trainingDoctor you want to add it");
            speciality = in.next();
            System.out.println("entre the address of the trainingDoctor");
            address = in.next();
            System.out.println("entre the birth date of the trainingDoctor");
            birth = in.next();
            System.out.println("entre the date of the beginning");
            dateOfBeginning=in.next();
            System.out.println("entre the date of the end");
            dateOfEnd = in.next();
            DoctorTrains.add(new DoctorDeal(name , id,speciality,address,birth, DoctorTrainingSalary() ,dateOfBeginning,dateOfEnd,departmentId));
            System.out.println("the doctor who has name : " + name + " is added successfully !");
        }
    }





    public int DoctorTrainingSalary()
    {
        cost=getSalary()/2;
        return salaryOfTranings;
    }
    public void displayDoctorsDealing()
    {
        for (DoctorDeal deals: DoctorDeal)
        {
            deals.displayD();
        }
    }

    public void displayDoctorsTraining()
    {
        for (DoctorDeal trains: DoctorTrains)
        {
            trains.displayT();  // انتبه يجب عمل تابع لعرض معلومات الدكاترة المقيمون
        }
    }






    public void displayD()
    {
        System.out.print("DOCTOR DEAL{ NAME='" + name + "' , ");
        System.out.print("ID='" + id + "' , ");
        System.out.print("SPECIALIZATION='" + speciality + "' , ");
        System.out.print("ADDRESS='" + address + "' , ");
        System.out.print("BIRTH='" + birth + "' , ");
        System.out.print("DATE_OF_BEG='" + dateOfDecade + "' , ");
        System.out.print("COST='" + cost + "' , ");
        System.out.print("DEPARTMENT_ID='" + departmentId + "' }");
        System.out.println();
    }
    public void displayT()
    {
        System.out.print("DOCTOR TRAIN{ NAME='" + name + "' , ");
        System.out.print("ID='" + id + "' , ");
        System.out.print("SPECIALIZATION='" + speciality + "' , ");
        System.out.print("ADDRESS='" + address + "' , ");
        System.out.print("BIRTH='" + birth + "' , ");
        System.out.print("dateOfBeginning='" + dateOfBeginning+ "' , ");
        System.out.print("dateOfEnd='" + dateOfEnd + "' , ");
        System.out.print("salaryOfTraning='" + salaryOfTranings + "' , ");
        System.out.print("DEPARTMENT_ID='" + departmentId + " }");
        System.out.println();
    }

    public void deleteDoctor()
    {
        System.out.println("please can you Entre the ID of the doctor you want to delete");
        int ID=in.nextInt();
        int count=0;

        DoctorDeal DO_delete=null;
        for(DoctorDeal deals: DoctorDeal)
        {
            if(ID==deals.getId())
            {
                DO_delete=deals;
                String name=deals.getName();
                DoctorDeal.remove(DO_delete);
                count++;
                System.out.println("doctor who has name :" + name + " is deleted successfully");
                countOfDealingDoctors--;
                break;
            }
        }
        //--------------------------------
        DoctorDeal DO_delete1=null;
        if(count==0)
            for(DoctorDeal trains: DoctorTrains)
            {
                if(ID==trains.getId())
                {
                    DO_delete1=trains;
                    String name=trains.getName();
                    DoctorTrains.remove(DO_delete1);
                    count++;
                    System.out.println("doctor who has name :"+ name + " is deleted successfully");

                    break;
                }
            }
        //----------------------------------
        Doctor DO_delete2=null;
        if(count==0)
            for(Doctor d : docs)
            {
                if(ID==d.getId())
                {
                    DO_delete2 = d;
                    String name=d.getName();
                    docs.remove(DO_delete2);
                    System.out.println("doctor who has name '"+ name + "' is deleted successfully");
                    break;
                }
            }
        //------------------------------------
    }

    public void FixDoctor()
    {
        System.out.println("entre the ID of the doctor you want to FIX it");
        int ID=in.nextInt();
        int count=0;

        for(DoctorDeal deals: DoctorDeal)
        {
            if(ID==deals.getId())
            {
                System.out.println("entre the department ID of the new general doctor");
                int departId=in.nextInt();
                System.out.println("entre the SALARY of the new general doctor");
                int salary=in.nextInt();
                Doctor k=new Doctor(deals.getName(),deals.getId(),deals.getSpeciality(),deals.getAddress(),deals.getBirth(),salary,departId);
                DoctorDeal.remove(deals);
                docs.add(k);
                System.out.println("the doctor is FIXED SUCCESSFUL");
                countOfDealingDoctors--;
                count++;
                break;

            }
        }
        if (count==0)
            for (DoctorDeal trains : DoctorTrains)
            {
                if(ID==trains.getId())
                {
                    System.out.println("entre the department ID of the new general doctor ");
                    int departId = in.nextInt();
                    System.out.println("entre the SALARY of the new general doctor");
                    int salary=in.nextInt();
                    Doctor l=new Doctor(trains.getName(),trains.getId(),trains.getSpeciality(),trains.getAddress(),trains.getBirth(),salary,departId);
                    DoctorTrains.remove(trains);
                    docs.add(l);
                    System.out.println("the doctor is FIXED SUCCESSFUL");
                    break;
                }
            }
    }

    public int countOf_DealingDoctor()
    {
        if(countOfDealingDoctors!=0)
            return countOfDealingDoctors;
        else
        {
            System.out.println("WE DONT HAVE ANY DEALING DOCTOR IN our hospital manegment system");
        }
        return 0;
    }

    public void displayAllDoctorsInHospital()
    {
        System.out.println("*** the dealings doctors in our hospital ***" + "\n");
        displayDoctorsDealing();
        System.out.println();
        System.out.println("*** the trainings doctors in our hospital ***"+ "\n");
        displayDoctorsTraining();
        System.out.println();
        System.out.println("*** the General Fixed doctors in our hospital ***"+ "\n");
        displayDoctorsFixed();
        System.out.println();
    }


}
