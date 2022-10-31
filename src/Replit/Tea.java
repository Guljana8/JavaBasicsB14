package Replit;

abstract class Tea{
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();
}
class LemonTea extends Tea {
    LemonTea(String teaType) {
        super(teaType);
    }
    @Override
    void addSugar() {
        System.out.println("For " + teaType + " we need 2 spoons of sugar");
    }
}
    class ChaiTea extends Tea {
        ChaiTea(String teaType) {
            super(teaType);
        }
        @Override
        void addSugar() {
            System.out.println("For " + teaType + " we need 1 spoon of sugar");
        }
    }

        class Main2  {
            public static void main(String[] args) {
                LemonTea obj = new LemonTea("Lemon Tea");
                obj.addSugar();
                ChaiTea obj2 = new ChaiTea("Chai Tea");
                obj2.addSugar();
            }
        }
