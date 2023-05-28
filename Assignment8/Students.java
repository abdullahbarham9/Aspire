package Assignment8;

public class Students{
    private final String name;
    private final int age;



    private final int id;



    public Students(String name, int age, int id){

        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }



    public static Students of(String name,int age,int Id){
        return new Students( name, age, Id);
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Id=" + id +
                '}';
    }
}
