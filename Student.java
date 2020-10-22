public class Student {

    private String id;
    private String name;
    private String birth_date;
    static int c=0;
    private String toString;

    public Student( String name, String birth_date) {
        c++;
        toString = String.valueOf(c);
        this.id = toString;
        this.name = name;
        this.birth_date = birth_date;
    }

    public String toString(){

        return "Όνομα μαθητή: " + name + "\nid μαθητή: " + id +"\nΗμερομηνία γέννησης του μαθητή: " + birth_date;
    }

    public String getId() {

        return id;
    }

    public String getName() {
        return name;
    }
}



