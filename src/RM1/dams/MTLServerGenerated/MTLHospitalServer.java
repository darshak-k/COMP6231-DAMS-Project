
package RM1.dams.MTLServerGenerated;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import RM1.dams.model.AppointmentType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MTLHospitalServer", targetNamespace = "http://server.dams.RM1/")
public interface MTLHospitalServer {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookAppointment", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.BookAppointment")
    @ResponseWrapper(localName = "bookAppointmentResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.BookAppointmentResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/bookAppointmentRequest", output = "http://server.dams.RM1/MTLHospitalServer/bookAppointmentResponse")
    public String bookAppointment(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        AppointmentType arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "montrealAppointmentScheduleOfPatientId", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.MontrealAppointmentScheduleOfPatientId")
    @ResponseWrapper(localName = "montrealAppointmentScheduleOfPatientIdResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.MontrealAppointmentScheduleOfPatientIdResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/montrealAppointmentScheduleOfPatientIdRequest", output = "http://server.dams.RM1/MTLHospitalServer/montrealAppointmentScheduleOfPatientIdResponse")
    public String montrealAppointmentScheduleOfPatientId(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "montrealCancelAppointmentOfPatientId", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.MontrealCancelAppointmentOfPatientId")
    @ResponseWrapper(localName = "montrealCancelAppointmentOfPatientIdResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.MontrealCancelAppointmentOfPatientIdResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/montrealCancelAppointmentOfPatientIdRequest", output = "http://server.dams.RM1/MTLHospitalServer/montrealCancelAppointmentOfPatientIdResponse")
    public String montrealCancelAppointmentOfPatientId(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "montrealListAppointmenOfType", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.MontrealListAppointmenOfType")
    @ResponseWrapper(localName = "montrealListAppointmenOfTypeResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.MontrealListAppointmenOfTypeResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/montrealListAppointmenOfTypeRequest", output = "http://server.dams.RM1/MTLHospitalServer/montrealListAppointmenOfTypeResponse")
    public String montrealListAppointmenOfType(
        @WebParam(name = "arg0", targetNamespace = "")
        AppointmentType arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "montrealBookAppointment", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.MontrealBookAppointment")
    @ResponseWrapper(localName = "montrealBookAppointmentResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.MontrealBookAppointmentResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/montrealBookAppointmentRequest", output = "http://server.dams.RM1/MTLHospitalServer/montrealBookAppointmentResponse")
    public String montrealBookAppointment(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        AppointmentType arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "swapAppointment", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.SwapAppointment")
    @ResponseWrapper(localName = "swapAppointmentResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.SwapAppointmentResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/swapAppointmentRequest", output = "http://server.dams.RM1/MTLHospitalServer/swapAppointmentResponse")
    public String swapAppointment(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        AppointmentType arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        AppointmentType arg4);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addAppointment", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.AddAppointment")
    @ResponseWrapper(localName = "addAppointmentResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.AddAppointmentResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/addAppointmentRequest", output = "http://server.dams.RM1/MTLHospitalServer/addAppointmentResponse")
    public String addAppointment(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        AppointmentType arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeAppointment", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.RemoveAppointment")
    @ResponseWrapper(localName = "removeAppointmentResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.RemoveAppointmentResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/removeAppointmentRequest", output = "http://server.dams.RM1/MTLHospitalServer/removeAppointmentResponse")
    public String removeAppointment(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        AppointmentType arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addRecordIntoLogFile", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.AddRecordIntoLogFile")
    @ResponseWrapper(localName = "addRecordIntoLogFileResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.AddRecordIntoLogFileResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/addRecordIntoLogFileRequest", output = "http://server.dams.RM1/MTLHospitalServer/addRecordIntoLogFileResponse")
    public void addRecordIntoLogFile(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        List<String> arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        boolean arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAppointmentSchedule", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.GetAppointmentSchedule")
    @ResponseWrapper(localName = "getAppointmentScheduleResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.GetAppointmentScheduleResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/getAppointmentScheduleRequest", output = "http://server.dams.RM1/MTLHospitalServer/getAppointmentScheduleResponse")
    public String getAppointmentSchedule(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listAppointmentAvailability", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.ListAppointmentAvailability")
    @ResponseWrapper(localName = "listAppointmentAvailabilityResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.ListAppointmentAvailabilityResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/listAppointmentAvailabilityRequest", output = "http://server.dams.RM1/MTLHospitalServer/listAppointmentAvailabilityResponse")
    public String listAppointmentAvailability(
        @WebParam(name = "arg0", targetNamespace = "")
        AppointmentType arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cancelAppointment", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.CancelAppointment")
    @ResponseWrapper(localName = "cancelAppointmentResponse", targetNamespace = "http://server.dams.RM1/", className = "rm1.dams.server.CancelAppointmentResponse")
    @Action(input = "http://server.dams.RM1/MTLHospitalServer/cancelAppointmentRequest", output = "http://server.dams.RM1/MTLHospitalServer/cancelAppointmentResponse")
    public String cancelAppointment(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
