package com.seliniumexpress.di.objects;

public class Student {

    int id ;
    MathCheat mathCheat;

    public Student() {
        System.out.println("student called...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MathCheat getMathCheat() {
        return mathCheat;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public Student(int id, MathCheat mathCheat) {
        this.id = id;
        this.mathCheat = mathCheat;
    }

    public void Cheating(){
        mathCheat.mathCheating();
    }
}
