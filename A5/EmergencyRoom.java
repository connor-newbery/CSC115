/*

Connor Newbery
V00921506

*/


/*
 * represents an emergency room in a hospital
 */

public class EmergencyRoom {

	private PriorityQueue patients;

	/*
 	 * constructor that initializes patients to a default-sized priority queue
	 */
	public EmergencyRoom() {
patients = new HeapPriorityQueue();
	}

	/*
	 * constructor that initializes patients to a priority queue of given size
	 */
	public EmergencyRoom(int size) {
		patients = new HeapPriorityQueue(size);
	}



	/* Purpose: add given Patient p to patients or prints
	 *          a notification message if patients is full
	 * Parameters: Patient p - the patient who just arrived at
	 *             the emergency room and needs to be added
	 * Returns: void - nothing
	 */
	public void addPatient(Patient p) {
		try{
			patients.insert(p);
		}
		catch(HeapFullException e){
			System.out.println("Patients is full");
		}
		}


	/* Purpose: gets the number of patients waiting to be helped
	 * Parameters: none
	 * Returns: int - number of patients waiting to be helped
	 */
	public int numPatientsWaiting() {
		// TODO: implement this
		return patients.size(); // so it compiles
	}


	/* Purpose: removes and returns the next patient from patients
	 * Parameters: none
	 * Returns: Patient - the next patient, null if there is no more patients.
	 */
	public Patient nextPatient() {
		try{
			return (Patient) patients.removeMin();
			}
		catch(HeapEmptyException e){
			return null; // so it compiles
			}
	}
}
