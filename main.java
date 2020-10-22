import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student;

        int c = 8;
        Student[] All_Students = new Student[100];
        SchoolYear[] schoolYears = new SchoolYear[100];
        Teacher[] All_Teachers= new Teacher[100];
        All_Teachers[0] = new Teacher("a1","Γρηγορης Γρηγοριου","0303921142");
        All_Teachers[1] = new Teacher("a2","Βασιλης Βασιλειου","0209882324");
        All_Teachers[2] = new Teacher("a3","Νικος Νικου","2508911290");
        All_Teachers[3] = new Teacher("a3","Γεωργιος Γεωργιου","0612889099");
        Student []table1=new Student[100];
        Student []table2 = new Student[100];
        Student []table3 = new Student[100];
        Student []table4 = new Student[100];

        Student student2;
        schoolYears[0]=new SchoolYear("2019-2020",All_Teachers[0],All_Teachers[1],table1,table2);
        schoolYears[1]=new SchoolYear("2018-2019",All_Teachers[2],All_Teachers[3],table3,table4);

        student2 = new Student("Αριστοτέλης Γκιθκόπουλος","30/10/01");
        All_Students[0]=student2;
        schoolYears[0].setNipio_Students_year(student2);
        student2 = new Student ("Αθανάσιος Αντωνόπουλος","20/11/01");
        All_Students[1]=student2;
        schoolYears[0].setNipio_Students_year(student2);
        student2 = new Student("Νικόλαος Νικολαόυ","06/02/01");
        All_Students[2]=student2;
        schoolYears[1].setNipio_Students_year(student2);
        student2 = new Student("Κώσταντινος Κωνσταντίνου","19/04/01");
        All_Students[3]=student2;
        schoolYears[1].setNipio_Students_year(student2);
        student2 = new Student("Μάριος Λαζάρου","20/09/02");
        All_Students[4]=student2;
        schoolYears[0].setPronipio_Students_year(student2);
        student2 = new Student("Γεώργιος Γεωργίου","30/11/02");
        All_Students[5]=student2;
        schoolYears[0].setPronipio_Students_year(student2);
        student2 = new Student("Δημήτρης Δημητρίου","01/01/02");
        All_Students[6]=student2;
        schoolYears[1].setPronipio_Students_year(student2);
        student2 = new Student("Αλέξανδρος Αλεξάνδρου","17/10/02");
        All_Students[7]=student2;
        schoolYears[1].setPronipio_Students_year(student2);

        for (; ; ) {

            System.out.println("~~~~~~~~~~ Μενού Επιλογών ~~~~~~~~~~\n" +
                    "1. Εκτύπωση όλων των μαθητών που έχουν φοιτήσει στο σχολείο\n" +
                    "2. Εγγραφή νέου μαθητή στην τρέχουσα σχολική χρονιά\n" +
                    "3. Διαγραφή μαθητή από την τρέχουσα σχολική χρονιά\n" +
                    "4. Αναζήτηση στοιχείων σχολικής χρονιάς\n" +
                    "5. Αναζήτηση τάξεων που έχει αναλάβει κάθε δάσκαλος του σχολείου \n6. Αναζήτηση στοιχείων δασκάλου μέσω ΑΜΚΑ\n" +
                    "Εισάγετε επιλογή [1-6] :");
            String choice = sc.next();

            switch (choice) {

                case "1":
                    for (int a = 0; a <= 99; a++) {
                        if (All_Students[a] != null)
                            System.out.println(All_Students[a]);
                    }
                    break;

                case "2":

                    System.out.println("Νήπιο η Προνήπιο");
                    String option = sc.next();
                    boolean flag = false;
                    for (int i = 0; i <= 99; i++) {
                        if (option.equals("Νήπιο")) {
                            if (schoolYears[0].getNipio_Students_year()[i] == null) {
                                System.out.println("Δώστε ονοματεπώνυμο και ημερομηνία γέννησης");
                                String fullname = sc.next() + " " + sc.next();
                                String birth_date = sc.next();
                                student = new Student(fullname, birth_date);
                                All_Students[c] = student;
                                c ++;
                                System.out.println("Η εγγραφή έγινε επιτυχώς");
                                schoolYears[0].setNipio_Students_year(student);
                                flag=true;
                                break;
                            }
                        }
                    }
                    if (option.equals("Προνήπιο")) {
                        for (int i = 0; i <= schoolYears[0].getPronipio_Students_year().length; i++) {
                            if (schoolYears[0].getPronipio_Students_year()[i] == null) {
                                System.out.println("Δώσε ονοματεπώνυμο και ημερομηνία γέννησης");
                                String fullname = sc.next() + " " + sc.next();
                                String birth_date = sc.next();
                                student = new Student(fullname, birth_date);
                                All_Students[c] = student;
                                c ++;
                                flag=true;
                                schoolYears[0].setPronipio_Students_year(student);
                                System.out.println("Η εγγραφή έγινε επιτυχώς");
                                break;
                            }
                        }
                    }
                    if(flag==false){
                        System.out.println("Βαλατε λάθος στοιχεία. Προσπαθήστε ξανά.");
                    }
                    break;

                case "3":

                    System.out.println("Εισάγετε το id του μαθητή προς διαγραφή.");
                    String id_find = sc.next();
                    boolean flag1 = false;
                    for (int y = 0; y < 99; y++) {
                        if (schoolYears[0].getNipio_Students_year()[y] != null) {
                            if (schoolYears[0].getNipio_Students_year()[y].getId().equals(id_find)) {
                                System.out.println("Είστε σίγουροι για την διαγραφή;ΝΑΙ/ΟΧΙ");
                                String check = sc.next();
                                if (check.equals("ΝΑΙ")) {
                                    System.out.println("Η διαγραφή έγινε επιτυχώς.");
                                    schoolYears[0].setNUllNipio_Students_year(y);
                                } else {
                                    System.out.println("Η διαγραφή ακυρώθηκε.");
                                }
                                flag1 = true;
                                break;
                            }
                        }
                        if (schoolYears[0].getPronipio_Students_year()[y] != null) {
                            if (schoolYears[0].getPronipio_Students_year()[y].getId().equals(id_find)) {
                                System.out.println("Είστε σίγουροι για την διαγραφή;ΝΑΙ/ΟΧΙ");
                                String check = sc.next();
                                if (check.equals("ΝΑΙ")) {
                                    System.out.println("Η διαγραφή έγινε επιτυχώς");
                                    schoolYears[0].setNUllPronipio_Students_year(y);
                                } else {
                                    System.out.println("Η διαγραφή ακυρώθηκε");
                                }
                                flag1 = true;
                                break;
                            }
                        }
                    }
                    if (flag1 == false) {
                        System.out.println("Το id δεν βρέθηκε.");
                    }
                    break;


                case "4":

                    System.out.println("Για ποιας χρονιάς τα στοιχεία θέλετε να δείτε(2018-2019 η 2019-2020)");
                    String year = sc.next();
                    if (!(year.equals("2018-2019") || year.equals("2019-2020"))) {
                        System.out.println("Δεν υπάρχουν στοιχεία για την χρονιά που επιλέξατε.");
                        break;
                    }
                    System.out.println("Νήπιο η Προνήπιο");
                    String classLevel = sc.next();
                    if (!(classLevel.equals("Νήπιο") || classLevel.equals("Προνήπιο"))) {
                        System.out.println("Έχετε δώσει λάθος στοιχείο ξαναπροσπαθήστε");
                        break;
                    }
                    if (year.equals("2019-2020")) {
                        if (classLevel.equals("Νήπιο")) {
                            System.out.println(schoolYears[0].getDaskalos_nipiou().getFullname());

                            for (int y = 0; y <= 99; y++) {
                                if (schoolYears[0].getNipio_Students_year()[y] != null) {
                                    System.out.println(schoolYears[0].getNipio_Students_year()[y].toString());
                                }
                            }
                        }
                        if (classLevel.equals("Προνήπιο")) {

                            System.out.println(schoolYears[0].getDaskalos_pronipiou().getFullname());
                            for (int y = 0; y <= 99; y++) {
                                if (schoolYears[0].getPronipio_Students_year()[y] != null) {
                                    System.out.println(schoolYears[0].getPronipio_Students_year()[y].toString());
                                }
                            }
                        }
                    }
                    if (year.equals("2018-2019")) {
                        if (classLevel.equals("Νήπιο")) {
                            schoolYears[1].getNipio_Students_year();
                            System.out.println(schoolYears[1].getDaskalos_nipiou().getFullname());
                            for (int y = 0; y <= 99; y++) {
                                if (schoolYears[1].getNipio_Students_year()[y] != null) {
                                    System.out.println(schoolYears[1].getNipio_Students_year()[y].toString());
                                }
                            }
                        }
                        if (classLevel.equals("Προνήπιο")) {
                            System.out.println(schoolYears[1].getDaskalos_pronipiou().getFullname());
                            for (int y = 0; y <= 99; y++) {
                                if (schoolYears[1].getPronipio_Students_year()[y] != null) {
                                    System.out.println(schoolYears[1].getPronipio_Students_year()[y].toString());
                                }
                            }
                        }
                    }
                    break;



                case "5":



                    for (int i = 0; i <= 99; i++) {
                        if (All_Teachers[i] != null) {
                            for (int y = 0; y <= 99; y++) {
                                if (schoolYears[y] != null) {
                                    /*στις μονες θεσεις εχουμε τους δασκαλους προνηπιου και στις ζυγες του νηπιου αρα*/
                                    if (All_Teachers[i].equals(schoolYears[y].getDaskalos_nipiou())) {
                                        System.out.println(schoolYears[y].getYear() + " " + schoolYears[y].getDaskalos_nipiou().getFullname());
                                        if (i % 2 == 1) {
                                            System.out.println(" προνήπιο");
                                        } else {
                                            System.out.println(" νήπιο");
                                        }
                                    }
                                    if (All_Teachers[i].equals(schoolYears[y].getDaskalos_pronipiou())) {
                                        System.out.println(schoolYears[y].getYear() + " " + schoolYears[y].getDaskalos_pronipiou().getFullname());
                                        if (i % 2 == 1) {
                                            System.out.println(" προνήπιο");
                                        } else {
                                            System.out.println(" νήπιο");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;

                case "6":

                    System.out.println("Παρακαλώ εισάγετε το ΑΜΚΑ του δασκάλου.");
                    String AMKA = sc.next();
                    int flag2 = 0;
                    for (int i=0;i<=99;i++) {
                        if (All_Teachers[i]!=null) {
                            if (All_Teachers[i].getAMKA().equals(AMKA)) {
                                System.out.println(All_Teachers[i]);
                                flag2 = 1;
                            }
                        }
                    }
                    if (flag2==0) {
                        System.out.println("Δεν υπάρχει δάσκαλος με αυτό το ΑΜΚΑ.");
                    }
                    break;
                default:
                    System.out.println("Μη έγκυρος αριθμός. Παρακαλώ ξαναπροσπαθήστε.");
            }
        }
    }
}
