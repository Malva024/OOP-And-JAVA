package Assignment;

public class Library {
    private String name;
    private int dob;
    private String passwords;

    public String getName(){return name;}
    public int dob(){return dob;}
    public String getpassword(){return passwords;}

    public void setName(String name)
    {
        if(!name.isEmpty() && ! name.trim().isEmpty())
        {this.name =name;}
        else
        {System.out.println("Invalid name");}
    }
    public void setPasswords(String passwords)
    {
        if(passwords.length()>8 && passwords.length()<12)
        {
            this.passwords =passwords;
            System.out.println("Your passwords is save");
        }
        else
        {
            System.out.println("The passwords should be of 8 characters");
        }
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public void verification(String enterpasswords)
    {
        if(enterpasswords == this.passwords)
        {
            System.out.println("Password verified");
            System.out.println("Details");
            System.out.println("Name: "+this.name);
            System.out.println("Dob "+this.dob);
            for(int i=0 ; i< this.passwords.length(); i++){
            System.out.print("*");}


        }
        else
        {
            System.out.println("Password not verified");

        }
    }
}
