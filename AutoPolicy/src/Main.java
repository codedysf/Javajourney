public class Main {
    public static void main(String[] args)
    {
        Auto policy1 = new Auto(1111111, "Toyota Camry", "OJ");
        Auto policy2 = new Auto(222222,"Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState (Auto policy)
    {
        System.out.println("The auto policy");
        System.out.printf(
                "Account #: %d; Car: %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(),
                policy.getMakeAndMode(),policy.getState(), (policy.isNoFaultState() ? "is": "is not"));
    }
}// end class AutoPolicytest