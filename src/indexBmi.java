public class indexBmi {
    private double weight; // cân nặng
    private double height; // chiều cao

    public indexBmi(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public indexBmi(){

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // bmi = (canNang) / (chieuCao*chieuCao)
    public double caculateBmi(){
        return (this.weight)/(height*height);
    }
    // phân loại
    public void classify(){
        double index = caculateBmi();
        if(index<18.5 ) {
            System.out.println("Cân nặng thấp");
        }else if(index >= 18.5 && index < 23){
            System.out.println(" Bình thường");
        }else if(index >= 23 && index < 25){
            System.out.println("Tiền Béo phì ");
        }else if(index>=25){
            System.out.println("Béo phì");
        }
    }

}
