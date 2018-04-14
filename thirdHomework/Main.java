package equinox;


public class Main {

    public static void main(String[] args) {
        arrayInput.input();
        //first
        TaskOne task = new TaskOne();
        task.sortArray();
        //second
        TaskTwo taskTwo = new TaskTwo();
        taskTwo.mirrorArray();
        //third
        TaskThree taskThree = new TaskThree();
        taskThree.sortingArray();
        //fourth
        TaskFourth taskFourth = new TaskFourth();
        taskFourth.findingArithmetic();
        //fifth,(1)
        TaskFive taskFive = new TaskFive();
        taskFive.mirrorArray();
        //fifth(2)
        taskFive.findingItems();
        }
        }

