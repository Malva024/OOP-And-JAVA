package DiscountSystem;

public class Customer {
    private String Name;
    private boolean member;
    private String memberType;

    public Customer(String name) {this.setName(name);}

    public String getName() {return Name;}

    public void setName(String name) {this.Name = name;}
    public boolean isMember() {return member;}

    public void setMember(boolean member) {this.member = member;}

    public String getMemberType() {return memberType;}

    public void setMemberType(String memberType) {this.memberType = memberType;}

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + getName() + '\'' +
                ", member=" + isMember()+
                ", memberType='" + getMemberType()+ '\'' +
                '}';
    }
}
