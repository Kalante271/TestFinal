public abstract class Elevator implements ElevatorState{
    ElevatorStateEnum state;
    int currentFloor;
    Integer targetFloor;

    public Elevator(ElevatorStateEnum state) {
        this.state = state;
        this.currentFloor = 1;
        this.targetFloor = null;
    }

    @Override
    public ElevatorStateEnum state() {
        return this.state;
    }

    public Integer getTargetFloor() {
        return targetFloor;
    }

    public void setState(ElevatorStateEnum state) {
        this.state = state;
    }

    public void setTargetFloor(Integer targetFloor) {
        this.targetFloor = targetFloor;
    }
}
