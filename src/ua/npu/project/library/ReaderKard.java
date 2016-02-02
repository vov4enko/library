package ua.npu.project.library;

// читацкий квиток


import java.util.ArrayList;

public class ReaderKard extends Reader,{

    public int number;
    private ArrayList<Publication> list;

    public ReaderKard(int number) {
        this.number = number;
        list = new ArrayList<Publication>();

    }

    public ArrayList<Publication> getList() {
        return list;
    }

    public void setList(ArrayList<Publication> list) {
        this.list = list;
    }

    public int getNumber() {
        return number;
    }
}