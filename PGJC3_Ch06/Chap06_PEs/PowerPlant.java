/** A PowerPlant with a reactor core. */
public class PowerPlant {
  /** Each power plant has a reactor core. This has package
      accessibility so that the Control class that is defined in
      the same package can access it. */
  Reactor core;

  /** Initializes the power plant, creates a reactor core. */
  PowerPlant() {
    core = new Reactor();
  }

  /** Sound the alarm to evacuate the power plant. */
  public void soundEvacuateAlarm() {
    // ... implementation unspecified ...
  }

  /** Get the level of reactor output that is most desirable at this time.
      (Units are unspecified.) */
  public int getOptimalThroughput() {
    // ... implementation unspecified ...
    return 0;
  }

  /** The main entry point of the program: sets up a PowerPlant
      object and a Control object and lets the Control object run the
      power plant. */
  public static void main(String[] args) {
    PowerPlant plant = new PowerPlant();
    Control ctrl = new Control(plant);
    ctrl.runSystem();
  }
}

/** A reactor core that has a throughput that can be either decreased or
    increased. */
class Reactor {
  /** Get the current throughput of the reactor. (Units are unspecified.) */
  public int getThroughput() {
    // ... implementation unspecified ...
    return 0;
  }

  /** @returns true if the reactor status is critical, false otherwise. */
  public boolean isCritical() {
    // ... implementation unspecified ...
    return false;
  }

  /** Ask the reactor to increase throughput. */
  void increaseThroughput() throws ReactorCritical {
    // ... implementation unspecified ...
  }

  /** Ask the reactor to decrease throughput. */
  void decreaseThroughput() {
    // ... implementation unspecified ...
  }
}

/** This exception class should be used to report that the reactor status is
    critical. */
class ReactorCritical extends Exception {}

/** A controller that will manage the power plant and make sure that the reactor
    runs with optimal throughput. */
class Control {

  PowerPlant thePlant;

  final static int TOLERANCE = 10;

  public Control(PowerPlant p) {
    thePlant = p;
  }

  /** Run the power plant by continuously monitoring the
      optimalThroughput and the actual throughput of the reactor. If
      the throughputs differ by more than 10 units, i.e. tolerance,
      adjust the reactor throughput.
      If the reactor status becomes critical, the evacuate alarm is
      sounded and the reactor is shut down.
      <p>The runSystem() method can handle the reactor core directly
      but calls methods needAdjustment(), adjustThroughput(), and shutdown()
      instead. */
  public void runSystem() {
    // ... provide implementation here ...
  }

  /** Reports whether the throughput of the reactor needs adjusting,
      given the target throughput.
      This method should also monitor and report if the reactor status becomes
      critical.
      @return true if the optimal and actual throughput values
      differ by more than 10 units. */
  public boolean needAdjustment(int target) {
    // ... provide implementation here ...
    return true;
  }

  /** Adjust the throughput of the reactor by calling increaseThroughput() and
      decreaseThroughput() methods until the actual throughput is within 10
      units of the target throughput. */
  public void adjustThroughput(int target) {
    // ... provide implementation here ...
  }

  /** Shut down the reactor by lowering the throughput to 0. */
  public void shutdown() {
    // ... provide implementation here ...
  }
}