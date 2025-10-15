package week3day2.polymorphism;

public class APIClient {

	//one input method
	public String sendRequest(String endPoint) {
		System.out.println("Endpoint only : " + endPoint);
		return endPoint;
	}

	//3 inputs method
	public String sendRequest(String requestBody, String endPoint, boolean requestStatus) {
		
		System.out.println("RequestBody : " + requestBody);
		System.out.println("EndPoint : " + endPoint);
		System.out.println("Request Status: " + requestStatus);

		return requestBody + endPoint + requestStatus;

	}

	public static void main(String[] args) {
		
		
		APIClient client=new APIClient();
		client.sendRequest("www.google.com");
		client.sendRequest("Hello", "www.example.com", true);

	}

}
