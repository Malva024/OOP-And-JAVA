package Encap;

public class Member {

    private String Name;
    private String MemeberID;

    public String getMemeberID() {
        return MemeberID;
    }

    public void setMemeberID(String memeberID) {
        MemeberID = memeberID;
    }

    public Member(String name, String memeberID) {setName(name);setMemeberID(memeberID);}

    public String getName() {return Name;}

    public void setName(String name) {
        Name = name;
    }
}
