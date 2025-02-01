public class StepElevator implements Step{

    @Override
    public void changeState(Elevator elevator) {
        if (elevator.state() == ElevatorStateEnum.MOVING_UP) {
            elevator.currentFloor++;
            if (elevator.currentFloor == elevator.getTargetFloor()) {
                elevator.setState(ElevatorStateEnum.STAYING_STILL);
            }
        } else if (elevator.state() == ElevatorStateEnum.MOVING_DOWN) {
            elevator.currentFloor--;
            if (elevator.currentFloor == elevator.getTargetFloor()) {
                elevator.setState(ElevatorStateEnum.STAYING_STILL);
            }
        }
    }
}
