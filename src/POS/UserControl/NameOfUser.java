package POS.UserControl;

import POS.Main;

public class NameOfUser extends Main
{
    private String name;  ///Name of the user

    public NameOfUser(String nextLine)
    {
    this.name=nextLine;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer Name:" + name;
    }
}
