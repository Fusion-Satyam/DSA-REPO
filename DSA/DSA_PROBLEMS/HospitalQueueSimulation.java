package DSA_PROBLEMS;

import java.util.PriorityQueue;
import java.util.Comparator;

// Represents a patient with a name and a severity level
class Patient {
    String name;
    int severity; // Lower number indicates higher priority (e.g., 1 is critical)

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Patient{" +
               "name='" + name + '\'' +
               ", severity=" + severity +
               '}';
    }
}

// Custom comparator for Patient objects based on severity
class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        // Sorts by severity in ascending order (lower severity = higher priority)
        return Integer.compare(p1.severity, p2.severity);
    }
}

public class HospitalQueueSimulation {
    public static void main(String[] args) {
        // Create a PriorityQueue with a custom comparator for Patient objects
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>(new PatientComparator());

        // Add patients to the queue
        patientQueue.add(new Patient("Alice", 3)); // Less severe
        patientQueue.add(new Patient("Bob", 1));   // Most severe
        patientQueue.add(new Patient("Charlie", 2)); // Medium severe
        patientQueue.add(new Patient("David", 1));  // Most severe, same as Bob

        System.out.println("Patients in the queue (order of arrival for same severity):");
        // Process patients from the queue
        while (!patientQueue.isEmpty()) {
            Patient nextPatient = patientQueue.poll(); // Retrieves and removes the highest priority patient
            System.out.println("Treating: " + nextPatient);
        }
    }
}