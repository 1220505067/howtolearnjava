public abstract class BaseCreditManager implements ICreditManager{
    public abstract void Calculate();
    //abstract ortak operasyonları tutar

    public void Save(){
        System.out.println("Kaydedildi");

    }


}
