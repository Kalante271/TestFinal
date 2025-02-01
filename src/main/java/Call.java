public interface Call {
    Elevator callElevator(CallTypeEnum callType, Integer targetFloor) throws CallElevatorException;
}
