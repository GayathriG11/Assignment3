package assignment.week3.day2;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		
		System.out.println("Sending request to end point :" + endpoint);
		
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		
		System.out.println("Sending request to end point :" + endpoint);
		
		System.out.println("Request Body :" + requestBody);
		
		if(requestStatus) {
			
			System.out.println("request status success");
		}
		
		else {
			
			System.out.println("request status failed");
		}
		
		System.out.println("request sent and recorded");
	}
	
	

	public static void main(String[] args) {
		
		APIClient client = new APIClient();
		
		client.sendRequest("https://api.rexam.com/v1/resource");
		
		client.sendRequest("https://api.rexam.com/v1/resource", "{\"name\":\"Gayathri\",}", true);
		
		
	}

}
