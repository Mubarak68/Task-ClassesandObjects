package University;
public class Course {
    String coursename;
    String instractor;
    int numofstu;

    public Course(String cn,String inst,int nfs){
        coursename = cn;
        instractor = inst;
        numofstu = nfs;
    }

    public String getcoursename(){
        return coursename;
    }

    public String getinstractor(){
        return instractor; 
    }

    public int getnumofstu(){
        return numofstu;
    }

    public void setcoursename(String cn){
        coursename = cn;
    }

    public void setIstructor(String inst){
        instractor = inst;
    }

    public void setNof(int nfs){
        numofstu = nfs;
    }

    public String toString(){
    return "Name: " + coursename + "\n" + "Instructor: "  + instractor+"\n" + "Number of Student enrooled: " + numofstu;

    }
    public static void main(String[] args) throws Exception {
        
    }
}
