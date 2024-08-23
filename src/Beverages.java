public abstract class Beverages {
    boolean wantsExtras;

    final void finalTemplateMethod(){

        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras){
            addExtras();
        }
    }

    void addCondiments() {
    }

    void brew() {
    }

    void addExtras() {

    }

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){

        System.out.println("Pouring into cup");

    }

    void setWantsExtras(boolean wantsExtras){
        this.wantsExtras = wantsExtras;
    }


}
