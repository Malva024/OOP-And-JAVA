package Practice;

import java.util.Queue;

public class InvoiceItem {
    private String Id;
    private String Desc;
    private int Qty;
    private double Unit_Price;

    public InvoiceItem(String Id, String Desc,int Qty,double Unit_Price)
    {
        this.Id = Id;
        this.Desc= Desc;
        this.Qty = Qty;
        this.Unit_Price = Unit_Price;

    }

    public String getId()
    {return Id;}

    public String getDesc()
    {return Desc;}

    public int getQty()
    {return Qty;}

    public void setQty(int Qty)
    {this.Qty = Qty;}

    public double getUnit_Price()
    {return Unit_Price;}

    public void setUnit_Price(double unit_Price)
    {this.Unit_Price = Unit_Price;}

    public double getTotal()
    {return Unit_Price * Qty;}

    public String toString()
    {
        return "Invoice[Id: "+Id+" Desc: "+Desc+" Qyt: "+Qty+" Unite Price: "+Unit_Price+"]";
    }



}
