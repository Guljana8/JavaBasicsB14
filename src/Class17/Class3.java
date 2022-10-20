package Class17;

public class Class3 {
    //Write a java class that have 4 constructors with 4 different access levels of
    // constructors(private,public,default,protected)
    // and create 4 objects of this class:
    // 1 - inside same class; 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.

    public String bankName;
    String bankBranch;
    protected int accountNumber;
    private String holderInfo;
    Class3(){

    }
    public Class3(String Name , String Branch){
        bankName=Name;
        bankBranch=Branch;
}

    protected Class3(int account){
    accountNumber=account;
}

    private Class3(String holderDetails) {
    holderInfo=holderDetails;

    }

    public static void main(String[] args) {
        Class3 obj1=new Class3("PNC BANK", "Sunny Island");
        Class3 obj2=new Class3(12345677);
        Class3 obj3=new Class3("Anna Smith");

    }

}


