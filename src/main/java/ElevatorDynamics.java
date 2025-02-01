public class ElevatorDynamics {
    public void runSimulation(Elevator[] evenElevators, Elevator[] oddElevators, Elevator[] staffElevators) throws CallElevatorException {
        CallElevator callElevator = new CallElevator(evenElevators, oddElevators, staffElevators);
        Step elevatorStep = new StepElevator();

        for (int i = 0; i < 10000; i++) {
            if (i % 20 == 0) {
                CallTypeEnum callType = CallTypeEnum.values()[(int) (Math.random() * 3)];
                Integer targetFloor = (int) (Math.random() * 16) + 1;
                try {
                    Elevator elevator = callElevator.callElevator(callType, targetFloor);
                    System.out.println("Лифт вызван: " + elevator.getClass().getSimpleName() + " на этаж " + targetFloor);
                } catch (CallElevatorException e) {
                    System.out.println(e.getMessage());
                }
            }

            // Обновление состояния лифтов
            for (Elevator elevator : evenElevators) {
                elevatorStep.changeState(elevator);
            }
            for (Elevator elevator : oddElevators) {
                elevatorStep.changeState(elevator);
            }
            for (Elevator elevator : staffElevators) {
                elevatorStep.changeState(elevator);
            }
        }
    }
}
