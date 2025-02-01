public class Main {
    public static void main(String[] args) throws CallElevatorException {

        Elevator[] evenElevators = {new ElevatorEvenFloor(ElevatorStateEnum.STAYING_STILL), new ElevatorEvenFloor(ElevatorStateEnum.STAYING_STILL), new ElevatorEvenFloor(ElevatorStateEnum.OUT_OF_ORDER)};
        Elevator[] oddElevators = {new ElevatorOddFloor(ElevatorStateEnum.STAYING_STILL), new ElevatorOddFloor(ElevatorStateEnum.OUT_OF_ORDER), new ElevatorOddFloor(ElevatorStateEnum.STAYING_STILL)};
        Elevator[] staffElevators = {new ElevatorStaff(ElevatorStateEnum.STAYING_STILL)};

        ElevatorDynamics dynamics = new ElevatorDynamics();
        dynamics.runSimulation(evenElevators, oddElevators, staffElevators);

    }
}