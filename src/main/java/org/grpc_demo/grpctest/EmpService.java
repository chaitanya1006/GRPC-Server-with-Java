package org.grpc_demo.grpctest;

import org.grpc_demo.grpctest.EmployeeOuterClass.Employee;
import org.grpc_demo.grpctest.EmployeeOuterClass.Employee.Dept;
import org.grpc_demo.grpctest.EmployeeOuterClass.Employee.EmpStatus;
import org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest;
import org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse;
import org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest;
import org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse;
import org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq;
import org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp;
import org.grpc_demo.grpctest.EmployeeServiceGrpc.EmployeeServiceImplBase;

import io.grpc.stub.StreamObserver;

public class EmpService extends EmployeeServiceImplBase {

	@Override
	public void empAdd(EmployeeAddRequest request, StreamObserver<EmployeeAddResponse> responseObserver) {
		
		Employee empObj = request.getEmpObj();
		
		int empId = empObj.getEmpId();
		String empFirstName = empObj.getEmpFirstName();
		String empLastName = empObj.getEmpLastName();
		Dept empDept = empObj.getEmpDept();
		String empJoiningDate = empObj.getEmpJoiningDate();
		EmpStatus empStatus = empObj.getStatus();
		
		System.out.println("\n#######################################");
		System.out.println("empId: " + empId);
		System.out.println("empFirstName: " + empFirstName);
		System.out.println("empLastName: " + empLastName);
		System.out.println("empDept: " + empDept);
		System.out.println("empJoiningDate: " + empJoiningDate);
		System.out.println("empStatus: " + empStatus);
		System.out.println("#######################################");
		
		EmployeeAddResponse.Builder response = EmployeeAddResponse.newBuilder();
		
		if(empFirstName.length() == 0) {
			response.setRespMessage("Employee First Name must not be empty.");
			response.setRespCode(1001);
		} else {
			response.setRespMessage("Employee is successfully added");
			response.setRespCode(0);
		}
		
		/**
		 * Wrap the response obj with responseObserver and send it back to the client.
		 */
		responseObserver.onNext(response.build());
		
		/**
		 * Close the grpc call.
		 */
		responseObserver.onCompleted();
	}
	
	@Override
	public void empFind(EmployeeFindRequest request, StreamObserver<EmployeeFindResponse> responseObserver) {
		int empId = request.getEmpId();
		
		EmployeeFindResponse.Builder response = EmployeeFindResponse.newBuilder();
		
		//response.getRespEmpObjMessage();
		
		
		if(empId == 1200) {			
			Employee.Builder empObj = Employee.newBuilder();
			
			empObj.setEmpId(1200);
			empObj.setEmpFirstName("Praveen");
			empObj.setEmpLastName("Devavarapu");
			
			response.setRespEmpObjMessage(empObj);
			response.setRespMessage("SUCCESS");
			response.setRespCode(200);
		} else {
			response.setRespMessage("NOT_FOUND");
			response.setRespCode(404);
		}
		
		/**
		 * Wrap the response obj with responseObserver and send it back to the client.
		 */
		responseObserver.onNext(response.build());
		
		/**
		 * Close the grpc call.
		 */
		responseObserver.onCompleted();		
	}
	
	@Override
	public void empListAll(EmployeeListAllReq request, StreamObserver<EmployeeListAllResp> responseObserver) {
		
		EmployeeListAllResp.Builder response = EmployeeListAllResp.newBuilder();
		
		Employee.Builder empObj = Employee.newBuilder();		
		empObj.setEmpId(100);
		empObj.setEmpFirstName("Rajkumar");
		empObj.setEmpLastName("Hirwani");		
		response.addEmpObjList(empObj);
		
		Employee.Builder empObj1 = Employee.newBuilder();		
		empObj1.setEmpId(100);
		empObj1.setEmpFirstName("A.R.Rahman");
		empObj1.setEmpLastName("");		
		response.addEmpObjList(empObj1);
		
		/**
		 * Wrap the response obj with responseObserver and send it back to the client.
		 */
		responseObserver.onNext(response.build());
		
		/**
		 * Close the grpc call.
		 */
		responseObserver.onCompleted();	
		
	}
}























