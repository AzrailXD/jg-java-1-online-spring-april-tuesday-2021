package students.eriks_jaloveckis.lesson_3.level_5.task_19;

class Dog {
    String name;
    int age;


    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void voice(){
        System.out.println(name);
        System.out.println(age);
    }

    void happyBD(){
        System.out.println("HAPPY BD");
        this.age = age+1;

    }


}


