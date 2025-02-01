public class CallElevator implements Call{
    private Elevator[] evenElevators;
    private Elevator[] oddElevators;
    private Elevator[] staffElevators;


    public CallElevator(Elevator[] evenElevators, Elevator[] oddElevators, Elevator[] staffElevators) {
        this.evenElevators = evenElevators;
        this.oddElevators = oddElevators;
        this.staffElevators = staffElevators;
    }

    @Override
    public Elevator callElevator(CallTypeEnum callType, Integer targetFloor) throws CallElevatorException {
        Elevator[] availableElevators = null;
        switch (callType) {
            case EVEN:
                availableElevators = evenElevators;
                break;
            case ODD:
                availableElevators = oddElevators;
                break;
            case STAFF:
                availableElevators = staffElevators;
                break;
        }

        for (Elevator elevator: availableElevators) {
            if (elevator.state() == ElevatorStateEnum.STAYING_STILL) {
                elevator.setTargetFloor(targetFloor);
                elevator.setState(ElevatorStateEnum.MOVING_UP);
                return elevator;
            }
        }

        throw new CallElevatorException("Все лифты заняты или неисправны");

    }
}

