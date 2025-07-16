public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10 ){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void lastAdded(){
        if (this.size > 0){
            int last = this.grades[this.size - 1];
            System.out.println(last);
        }else {
            System.out.println("No grades have been added yet.");
        }
    }

    public void averageGrade(){
        if (this.size > 0){
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum += this.grades[i];
        }
        int avg = sum / this.size;
        System.out.println(avg);
        }
    }
}
