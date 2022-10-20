package Class23;

public interface InterFaceTester {
    public static void main(String[] args) {
        IDataBase iDataBase=new IBM();
        iDataBase.openDatabase();
        iDataBase.readData();
        iDataBase.writeData();

    }
}
