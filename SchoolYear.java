public class SchoolYear {
        private Teacher daskalos_pronipiou;
        private Teacher daskalos_nipiou;
        public Student[] nipio_Students_year = new Student[100];
        public Student[] pronipio_Students_year = new Student[100];
        private String year;


        public SchoolYear(String year, Teacher daskalos_nipiou, Teacher daskalos_pronipiou, Student[] nipia, Student[] pronipia) {
                this.year = year;
                this.daskalos_nipiou = daskalos_nipiou;
                this.daskalos_pronipiou = daskalos_pronipiou;
                this.nipio_Students_year = nipia;
                this.pronipio_Students_year=pronipia;

        }

        public void setPronipio_Students_year(Student pronipio_Students_year) {
                for(int i=0;i<this.pronipio_Students_year.length;i++) {
                        if (this.pronipio_Students_year[i]==null) {
                                this.pronipio_Students_year[i] = pronipio_Students_year;
                                break;
                        }
                }
        }

        public void setNipio_Students_year(Student nipio_Students_year) {
                for(int y=0;y<this.nipio_Students_year.length;y++) {
                        if (this.nipio_Students_year[y]==null) {
                                this.nipio_Students_year[y] = nipio_Students_year;
                                break;
                        }
                }
        }

        public void setNUllNipio_Students_year(int i) {
                this.nipio_Students_year[i] = null;
        }

        public void setNUllPronipio_Students_year(int i) {
                this.pronipio_Students_year[i] = null;
        }

        public String toString() {
                String a = "μαθητες προνηπιου \n";
                String b = "μαθητες νηπιου \n";

                for (int y = 0; y <= 99; y++) {
                        if (nipio_Students_year[y] != null) {
                                a = a + nipio_Students_year[y].toString();
                        }
                        if (pronipio_Students_year[y] != null) {
                                b = b + pronipio_Students_year[y].toString();
                        }


                }
                return "School year:" + year + "\n" +
                        "Δασκαλος νηπιου" + daskalos_pronipiou.toString() + "\n" +
                        "Δασκαλος πρπνηπιου:" + daskalos_nipiou.toString() + "\n" + a + "\n" + b;


        }

        public Student[] getNipio_Students_year() {
                return nipio_Students_year;
        }

        public Student[] getPronipio_Students_year() {
                return pronipio_Students_year;
        }

        public Teacher getDaskalos_nipiou() {
                return daskalos_nipiou;
        }

        public Teacher getDaskalos_pronipiou() {
                return daskalos_pronipiou;
        }

        public String getYear() {
                return year;
        }
}






