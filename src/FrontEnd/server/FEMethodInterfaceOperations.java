package FrontEnd.server;


/**
* server/FEMethodInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from FrontEndMethod.idl
* Saturday, 9 April, 2022 5:09:54 PM EDT
*/

public interface FEMethodInterfaceOperations 
{
  String addAppointment (String adminID, String appointmentID, String appointmentType, int capacity);
  String removeAppointment (String adminID, String appointmentID, String appointmentType);
  String listAppointmentAvailability (String adminID, String appointmentType);
  String bookAppointment (String patientID, String appointmentID, String appointmentType);
  String getAppointmentSchedule (String patientID);
  String cancelAppointment (String patientID, String appointmentID);
  String swapAppointment (String patientID, String oldAppointmentID, String oldAppointmentType, String newAppointmentID, String newAppointmentType);
  void shutdown ();
} // interface FEMethodInterfaceOperations
