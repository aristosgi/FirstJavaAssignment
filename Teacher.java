public class Teacher {

    private String id;
    private String fullname;
    private String AMKA;

    public Teacher(String id, String fullname, String AMKA){

        this.id = id;
        this.fullname = fullname;
        this.AMKA = AMKA;
    }
    public String toString(){

        return "Ονομα δασκάλου: " + fullname + "\nid δασκάλου: " + id +"\nAMKA δασκάλου: " + AMKA;
    }

    public String getFullname() {

        return "Ονομα δασκαλο: " + fullname;
    }

    public String getAMKA() {

        return AMKA;
    }
}


