package suppliers2;

	public  interface DaoInterface {
		public void patientRegistartion(patient p) ;
		public void showAllPatient();
		public void searchPatientById(int id);
		public void searchPatientByCity(String city);
		public void searchPatientByAge(int age);
		public void recoveryStatus(String status);
		public void deletePatientById(int id);
}
